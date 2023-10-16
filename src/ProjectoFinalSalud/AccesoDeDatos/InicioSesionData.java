
package ProjectoFinalSalud.AccesoDeDatos;

import ProjectoFinalSalud.Entidades.Registro;
import ProjectoFinalSalud.Vistas.IniciarSesion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InicioSesionData {
    
    private Connection con = null;

    public InicioSesionData() {
        
        con = Conexion.getConnection();
    }
    
    /*public IniciarSesion buscarIdUsuario(int IdU) {

        String sql = "SELECT IdUsuario,Nombre,Apellido,Email,Password FROM IniciarSesion WHERE IdUsuario=?";
        IniciarSesion iniSe = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, IdU);

            ResultSet rs = ps.executeQuery();
            RegistroData reIn = new RegistroData();
            if (rs.next()) {
                iniSe = new IniciarSesion();
                iniSe.setIdUsuario(rs.getInt("IdIdUsuario"));
                iniSe.setNombre(rs.getString("Nombre"));
                iniSe.setApellido(rs.getString("Apellido"));
                iniSe.setEmail(rs.getString("Email"));
                iniSe.setPassword(rs.getString("Password"));
                Registro reg = reIn.buscarRegistro(IdU);
                iniSe.setRegistro(reg);
            } else {
                JOptionPane.showMessageDialog(null, "El IdU no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Registro");
        }
        return iniSe;
    }*/
}
