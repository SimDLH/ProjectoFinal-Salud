
package ProjectoFinalSalud.AccesoDeDatos;

import ProjectoFinalSalud.Entidades.Especialidad;
import ProjectoFinalSalud.Entidades.Prestador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PrestadorData {
    
    private Connection con = null;

    public PrestadorData() {
        
        con = Conexion.getConnection();
    }
    
    public void guardarPrestador(Prestador pres){
        
        String sql = "insert into Prestador(Nombre,Dni,Domicilio,Telefono,Activo,IdEspecialidad)"
                + "values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pres.getNombre());
            ps.setInt(2, pres.getDni());
            ps.setString(3, pres.getDomicilio());
            ps.setInt(4, pres.getTelefono());
            ps.setBoolean(5, pres.isActivo());
            ps.setInt(6, pres.getEspecialidad().getIdEspecialidad());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pres.setIdPrestador(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo Prestador exitosamente");     
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar al nuevo Prestador");
        }
    }
    
    public void modificarPrestador(Prestador pres) {
        
        String sql = "Update prestador set Nombre=?,Dni=?,Domicilio=?,Telefono=?,IdEspecialidad=?"
                + "Where IdPrestador=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pres.getNombre());
            ps.setInt(2, pres.getDni());
            ps.setString(3, pres.getDomicilio());
            ps.setInt(4, pres.getTelefono());
            ps.setInt(5, pres.getEspecialidad().getIdEspecialidad());
            ps.setInt(6, pres.getIdPrestador());
            int ex = ps.executeUpdate();
            if (ex == 1) {
                JOptionPane.showMessageDialog(null, "Prestador modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Prestadores");
        }
    }
    
    public void eliminarPrestador(int id) {
        
        String sql = "Update Prestador set Activo=0 where IdPrestador=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int ex = ps.executeUpdate();
            if (ex == 1) {
                JOptionPane.showMessageDialog(null, "Prestador eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Prestadores");
        }
    }
    
    public Prestador buscarPrestador(int id) {

        String sql = "SELECT IdPrestador,Nombre,Dni,Domicilio,Telefono,IdEspecialidad FROM Prestador WHERE IdPrestador=? AND Activo=1";
        Prestador pres = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            EspecialidadData ed=new EspecialidadData();
            if (rs.next()) {
                pres = new Prestador();
                pres.setIdPrestador(id);
                pres.setNombre(rs.getString("Nombre"));
                pres.setDomicilio(rs.getString("Domicilio"));
                pres.setTelefono(rs.getInt("Telefono"));
                pres.setDni(rs.getInt("Dni"));
                pres.setActivo(true);
                Especialidad esp=ed.buscarEspecialidad(rs.getInt("IdEspecialidad"));
                pres.setEspecialidad(esp);
            } else {
                JOptionPane.showMessageDialog(null, "El Prestador no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla del Prestador");
        }
        return pres;
    }
    
    public Prestador buscarIdEspecialidad(int IdE) {

        String sql = "SELECT IdPrestador,Nombre,Dni,Domicilio,Telefono FROM Prestador WHERE IdEspecialidad=? AND Activo=1";
        Prestador pres = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, IdE);

            ResultSet rs = ps.executeQuery();
            EspecialidadData ed=new EspecialidadData();
            if (rs.next()) {
                pres = new Prestador();
                pres.setIdPrestador(rs.getInt("IdPrestador"));
                pres.setNombre(rs.getString("Nombre"));
                pres.setDni(rs.getInt("Dni"));
                pres.setDomicilio(rs.getString("Domicilio"));
                pres.setTelefono(rs.getInt("Telefono"));
                pres.setActivo(true);
                Especialidad esp=ed.buscarEspecialidad(IdE);
                pres.setEspecialidad(esp);
            } else {
                JOptionPane.showMessageDialog(null, "El IdE no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Especialidad");
        }
        return pres;
    }
    
    public ArrayList<Prestador> listarPrestador(){
        
        String sql = "SELECT IdPrestador,Nombre,Dni,Domicilio,Telefono,IdEspecialidad FROM Prestador WHERE Activo=1";
        ArrayList<Prestador> prestadores = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            EspecialidadData ed=new EspecialidadData();
            while (rs.next()) {
                Prestador pres = new Prestador();
                pres.setIdPrestador(rs.getInt("IdPrestador"));
                pres.setNombre(rs.getString("Nombre"));
                pres.setDni(rs.getInt("Dni"));
                pres.setDomicilio(rs.getString("Domicilio"));
                pres.setTelefono(rs.getInt("Telefono"));
                Especialidad ad=ed.buscarEspecialidad(rs.getInt("IdEspecialidad"));
                pres.setEspecialidad(ad);
                pres.setActivo(true);
                prestadores.add(pres);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Prestadores");
        }
        return prestadores;
    }
    
    public ArrayList<Prestador> listarPrestadorPorEspecialidad(int id){
        String sql="SELECT Nombre,Dni,Domicilio,Telefono FROM Prestador WHERE IdEspecialidad=? AND Activo=1";
        ArrayList<Prestador>prestadores=new ArrayList<>();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            EspecialidadData ed=new EspecialidadData();
            while(rs.next()){
                Prestador pres=new Prestador();
                pres.setNombre(rs.getString("Nombre"));
                pres.setDni(rs.getInt("Dni"));
                pres.setDomicilio(rs.getString("Domicilio"));
                pres.setTelefono(rs.getInt("Telefono"));
                pres.setEspecialidad(ed.buscarEspecialidad(id));
                pres.setActivo(true);
                prestadores.add(pres);
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al entrar a la tabla de prestadores");
        }
        return prestadores;
    }
    
}