
package ProjectoFinalSalud.AccesoDeDatos;

import ProjectoFinalSalud.Entidades.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioData {
    
    private Connection con = null;

    public UsuarioData() {
        
        con = Conexion.getConnection();
    }
    
    public void guardarUsuario(Usuario usua){
        
        String sql = "INSERT INTO usuario (Nombre, Apellido, Dni, FechaDeNac, Nacionalidad, Email, Password, Activo)" + "VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, usua.getNombre());
            ps.setString(2, usua.getApellido());
            ps.setInt(3, usua.getDni());
            ps.setDate(4, Date.valueOf(usua.getFechaDeNac()));
            ps.setString(5, usua.getNacionalidad());
            ps.setString(6, usua.getEmail());
            ps.setString(7, usua.getPassword());
            ps.setBoolean(8, usua.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                usua.setIdUsuario(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo Usuario exitosamente");     
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar al nuevo Usuario");
        }
    }
        
    public boolean activarUsuario(String Email, String Password, String Nombre) {
        
        boolean a=false;
        String sql = "SELECT * FROM usuario WHERE usuario.Email=? AND usuario.Password=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Email);
            ps.setString(2, Password);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + Nombre);
                return a=true;
            } else {
                JOptionPane.showMessageDialog(null, "El Usuario es incorrecto, por favor vuelva a intentarlo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }return a;
    }
    
    public ArrayList<Usuario> listarUsuario(){
        
        String sql = "SELECT IdUsuario, Nombre, Apellido, Dni, FechaDeNac, Nacionalidad, Email, Password FROM usuario WHERE Activo=1";
        ArrayList<Usuario> usuario = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usua = new Usuario();
                usua.setIdUsuario(rs.getInt("IdUsuario"));
                usua.setNombre(rs.getString("Nombre"));
                usua.setApellido(rs.getString("Apellido"));
                usua.setDni(rs.getInt("Dni"));
                usua.setFechaDeNac(rs.getDate("FechaDeNac").toLocalDate());
                usua.setNacionalidad(rs.getString("Nacionalidad"));
                usua.setEmail(rs.getString("Email"));
                usua.setPassword(rs.getString("Password"));
                usua.setActivo(true);
                usuario.add(usua);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Usuarios");
        }
        return usuario;
    }
}