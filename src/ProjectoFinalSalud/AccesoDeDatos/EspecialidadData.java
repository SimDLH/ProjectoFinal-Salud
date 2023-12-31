
package ProjectoFinalSalud.AccesoDeDatos;

import ProjectoFinalSalud.Entidades.Especialidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EspecialidadData {
    
    private Connection con = null;

    public EspecialidadData() {
        
        con = Conexion.getConnection();
    }
    
    public void guardarEspecialidad(Especialidad esp){
        
        String sql = "INSERT INTO Especialidad(IdEspecialidad,Especialidad)" + "VALUES (?,?)";
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
            
    public Especialidad buscarEspecialidad(int IdE) {

        String sql = "SELECT IdEspecialidad,Especialidad FROM Especialidad WHERE IdEspecialidad=?";
        Especialidad esp = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, IdE);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                esp = new Especialidad();
                esp.setIdEspecialidad(IdE);
                esp.setEspecialidad(rs.getString("Especialidad"));
            } else {
                JOptionPane.showMessageDialog(null, "La Especialidad no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Especialidad");
        }
        return esp;
    }
    
    public ArrayList<Especialidad> listarEspecialidad(){
        
        String sql = "SELECT * FROM Especialidad";
        ArrayList<Especialidad> especialidades = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Especialidad esp = new Especialidad();
                esp.setIdEspecialidad(rs.getInt("IdEspecialidad"));
                esp.setEspecialidad(rs.getString("Especialidad"));
                especialidades.add(esp);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Prestadores");
        }
        return especialidades;
    }
}