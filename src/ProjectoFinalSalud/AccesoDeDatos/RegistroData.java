
package ProjectoFinalSalud.AccesoDeDatos;

import ProjectoFinalSalud.Entidades.Registro;
import ProjectoFinalSalud.Vistas.IniciarSesion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RegistroData {
    
    private Connection con = null;

    public RegistroData() {
        
        con = Conexion.getConnection();
    }
    
    public void registrarUsuario(Registro regis){
        
        String sql = "insert into Registro (IdUsuario,Nombre,Apellido,Dni,FechaDeNac,Nacionalidad,Email,Password)"
                + "values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, regis.getIdUsuario());
            ps.setString(2, regis.getNombre());
            ps.setString(3, regis.getApellido());
            ps.setInt(4, regis.getDni());
            ps.setDate(5, Date.valueOf(regis.getFechaDeNac()));
            ps.setString(6, regis.getNacionalidad());
            ps.setString(7, regis.getEmail());
            ps.setString(8, regis.getPassword());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                regis.setIdUsuario(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo Usuario exitosamente");     
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar al nuevo Usuario");
        }
    }
}
