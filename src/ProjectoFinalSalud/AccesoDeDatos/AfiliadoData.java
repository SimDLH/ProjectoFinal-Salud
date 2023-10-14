/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectoFinalSalud.AccesoDeDatos;

import ProjectoFinalSalud.Entidades.Afiliado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author simon
 */
public class AfiliadoData {

    private Connection con = null;

    public AfiliadoData() {
        con = Conexion.getConnection();
    }


    
    
    public void guardarAfiliado(Afiliado a){
        String sql="INSERT INTO afiliado(nombre, dni ,domicilio, telefono, Activo)"

                + "values (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, a.getNombre());
            ps.setInt(2, a.getDni());
            ps.setString(3, a.getDomicilio());
            ps.setInt(4, a.getTelefono());
            ps.setBoolean(5, a.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                a.setIdAfiliado(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se a agregado un nuevo afiliado exitosamente");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el afiliado");
        }
    }


    
    
    
    
    
    public ArrayList<Afiliado> listarAfiliados(){
        String sql="Select idAfiliado ,nombre ,dni ,domicilio ,telefono FROM afiliado WHERE Activo=1";
        ArrayList<Afiliado> afiliados=new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Afiliado af = new Afiliado();
                af.setIdAfiliado(rs.getInt("idAfiliado"));
                af.setNombre(rs.getString("nombre"));
                af.setDni(rs.getInt("dni"));
                af.setDomicilio(rs.getString("domicilio"));
                af.setTelefono(rs.getInt("telefono"));
                af.setActivo(true);
                afiliados.add(af);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de afiliados");
        }
        return afiliados;
    }


    

    
    public void borrarAfiliado(int dni){
        String sql="UPDATE afiliado SET Activo=0 WHERE dni=? AND Activo=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Anulacion completa");
            } else {
                JOptionPane.showMessageDialog(null, "No hay Afiliados activos con este DNI");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla de afiliados");
        }
    }

    public Afiliado buscarAfiliados(int dni) {
        String sql = "Select idAfiliado ,nombre ,dni ,domicilio ,telefono ,Activo  FROM afiliado WHERE dni=?";
        Afiliado afiliado = new Afiliado();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setDni(rs.getInt("dni"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setTelefono(rs.getInt("telefono"));
                afiliado.setActivo(rs.getBoolean("Activo"));
 
            }else{
                JOptionPane.showMessageDialog(null, "El DNI ingresado no existe en la base de datos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla de afiliados");
        }
        return afiliado;
    }

    public void modificarAfiliado(Afiliado afiliado) {
        String sql = "UPDATE afiliado SET nombre=? ,domicilio=? ,telefono=? WHERE dni=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, afiliado.getNombre());
            ps.setString(2, afiliado.getDomicilio());
            ps.setInt(3, afiliado.getTelefono());
            ps.setInt(4, afiliado.getDni());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "La informacion del afiliado ha sido actualisada exitosamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
        }

    }

    
    
    public void reinstituirAfliliado(int dni){
        String sql="UPDATE afiliado set Activo=1 WHERE dni=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "El afiliado ha sido reinscripto exitosamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
        }

    }

    public Afiliado buscarAfiliadoID(int id) {
        Afiliado afiliado = new Afiliado();
        String sql = "SELECT nombre ,dni ,domicilio ,telefono FROM afiliado WHERE idAfiliado=? and Activo=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setDni(rs.getInt("dni"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setTelefono(rs.getInt("telefono"));
                afiliado.setActivo(true);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla de afiliados");
        }
        return afiliado;
    }


        
    
    public Afiliado buscarAfiliadosActivos(int dni){
        String sql="Select idAfiliado ,nombre ,dni ,domicilio ,telefono ,Activo  FROM afiliado WHERE dni=? AND Activo=1";
        Afiliado afiliado=new Afiliado();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setDni(rs.getInt("dni"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setTelefono(rs.getInt("telefono"));
                afiliado.setActivo(rs.getBoolean("Activo"));
                
            }else{
                JOptionPane.showMessageDialog(null, "El DNI ingresado no existe en la base de datos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla de afiliados");
        }
        return afiliado;
    }
    
}
