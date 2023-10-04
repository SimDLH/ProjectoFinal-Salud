/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectoFinalSalud.AccesoDeDatos;

import ProjectoFinalSalud.Entidades.Prestador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class PrestadorData {
    
    private Connection con = null;

    public PrestadorData() {
        
        con = Conexion.getConnection();
    }
    
    public void guardarPrestador(Prestador pres){
        
        String sql = "insert into Prestador(IdPrestador,Nombre,Dni,Domicilio,Telefono,activo,IdEspecialidad)"
                + "values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pres.getIdPrestador());
            ps.setString(2, pres.getNombre());
            ps.setInt(3, pres.getDni());
            ps.setString(4, pres.getDomicilio());
            ps.setInt(5, pres.getTelefono());
            ps.setBoolean(6, pres.isActivo());
            ps.setInt(7, pres.getIdEspecialidad());
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
        
        String sql = "Update Prestador set IdPrestador=?,Nombre=?,Dni=?,Domicilio=?,Telefono=?,IdEspecialidad=?"
                + "Where IdPrestador=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pres.getIdPrestador());
            ps.setString(2, pres.getNombre());
            ps.setInt(3, pres.getDni());
            ps.setString(4, pres.getDomicilio());
            ps.setInt(5, pres.getTelefono());
            ps.setBoolean(6, pres.isActivo());
            ps.setInt(7, pres.getIdEspecialidad());
            int ex = ps.executeUpdate();
            if (ex == 1) {
                JOptionPane.showMessageDialog(null, "Prestador modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Prestadores");
        }
    }
    public void eliminarPrestador(int id) {
        
        String sql = "Update Prestador set estado=0 where IdPrestador=?";
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

        String sql = "SELECT IdPrestador,Nombre,Dni,Domicilio,Telefono,IdEspecialidad FROM Prestador WHERE IdPrestador=? AND estado=1";
        Prestador pres = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pres = new Prestador();
                pres.setIdPrestador(id);
                pres.setNombre(rs.getString("Nombre"));
                pres.setDomicilio(rs.getString("Domicilio"));
                pres.setTelefono(rs.getInt("Telefono"));
                pres.setDni(rs.getInt("Dni"));
                pres.setActivo(true);
                pres.setIdEspecialidad(rs.getInt("IdEspecialidad"));
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

        String sql = "SELECT IdPrestador,Nombre,Dni,Domicilio,Telefono FROM Prestador WHERE IdEspecialidad=? AND estado=1";
        Prestador pres = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, IdE);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pres = new Prestador();
                pres.setIdPrestador(rs.getInt("IdPrestador"));
                pres.setNombre(rs.getString("Nombre"));
                pres.setDni(rs.getInt("Dni"));
                pres.setDomicilio(rs.getString("Domicilio"));
                pres.setTelefono(rs.getInt("Telefono"));
                pres.setActivo(true);
                pres.setIdEspecialidad(rs.getInt("IdEspecialidad"));
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
        
        String sql = "SELECT IdPrestador,Nombre,Dni,Domicilio,Telefono,IdEspecialidad FROM afiliado WHERE estado=1";
        ArrayList<Prestador> prestadores = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Prestador pres = new Prestador();
                pres.setIdPrestador(rs.getInt("IdPrestador"));
                pres.setNombre(rs.getString("Nombre"));
                pres.setDni(rs.getInt("Dni"));
                pres.setDomicilio(rs.getString("Domicilio"));
                pres.setTelefono(rs.getInt("Telefono"));
                pres.setIdEspecialidad(rs.getInt("IdEspecialidad"));
                pres.setActivo(true);
                prestadores.add(pres);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Prestadores");
        }
        return prestadores;
    }
}
