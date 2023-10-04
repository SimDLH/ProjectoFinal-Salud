/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectoFinalSalud.AccesoDeDatos;

import ProjectoFinalSalud.Entidades.Especialidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class EspecialidadData {
    
     private Connection con = null;

    public EspecialidadData() {
        
        con = Conexion.getConnection();
    }
    public void guardarEspecialidad(Especialidad esp){
        
        String sql = "insert into Especialidad(IdEspecialidad,Especialidad)"
                + "values (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, esp.getIdEspecialidad());
            ps.setString(2, esp.getEspecialidad());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                esp.setIdEspecialidad(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se ha agregado una nueva Especialidad");     
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar una Especialidad nueva");
        }
    }
    public void modificarEspecialidad(Especialidad esp) {
        
        String sql = "Update Especialidad set IdEspecialidad=?,Especialidad=?"
                + "Where IdEspecialidad=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, esp.getIdEspecialidad());
            ps.setString(2, esp.getEspecialidad());
            int ex = ps.executeUpdate();
            if (ex == 1) {
                JOptionPane.showMessageDialog(null, "Especialidad modificada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Especialidades");
        }
    }
    public void eliminarEspecialidad(int id) {
        String sql = "UPDATE Especialidad SET estado=0 WHERE IdEspecialidad=? AND estado=1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Especialidad eliminada");

            } else {
                JOptionPane.showMessageDialog(null, "No existe Especialidad para ese IdE");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Especialidad");
        }
    }
}
