
package ProjectoFinalSalud.AccesoDeDatos;

import ProjectoFinalSalud.Entidades.Usuario;
import ProjectoFinalSalud.Vistas.Inicio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UsuarioData {
    
    private Connection con = null;

    public UsuarioData() {
        
        con = Conexion.getConnection();
    }
    
    public void guardarUsuario(Usuario usua){
        
        String sql = "INSERT INTO usuario (Nombre, Apellido, Dni, FechaDeNac, Nacionalidad, Email, Password, Activo)" + "values (?,?,?,?,?,?,?,?)";
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
    
    public void validarUsuario(JTextField textoNombreIniSes, JTextField textoApellidoIniSes, JTextField textoDireEmailIniSes, JPasswordField textoContraIniSes) {
        
        String sql = "SELECT Nombre, Apellido, Email, Password FROM usuario";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            String contra = String.valueOf(textoContraIniSes.getPassword());
            ps.setString(1, textoNombreIniSes.getText());
            ps.setString(2, textoApellidoIniSes.getText());
            ps.setString(3, textoDireEmailIniSes.getText());
            ps.setString(4, contra);
            ps.executeUpdate();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "El Usuario es correcto");
            } else {
                JOptionPane.showMessageDialog(null, "El Usuario es incorrecto, por favor vuelva a intentarlo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error:" + ex.toString());
        }
    }
        
    public Usuario buscarUsuario(int Dni) {
        
        String sql = "SELECT IdUsuario, Nombre, Apellido, Dni, FechaDeNac, Nacionalidad, Email, Password, Activo FROM usuario WHERE Dni=?";
        Usuario usua = new Usuario();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                usua.setIdUsuario(rs.getInt("IdUsuario"));
                usua.setNombre(rs.getString("Nombre"));
                usua.setApellido(rs.getString("Apellido"));
                usua.setDni(rs.getInt("Dni"));
                usua.setFechaDeNac(rs.getDate("FechaDeNac").toLocalDate());
                usua.setNacionalidad(rs.getString("Nacionalidad"));
                usua.setEmail(rs.getString("Email"));
                usua.setPassword(rs.getString("Password"));
                usua.setActivo(rs.getBoolean("Activo"));
            }else{
                JOptionPane.showMessageDialog(null, "El DNI ingresado no existe en la base de datos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla de Usuarios");
        }
        return usua;
    }
    
    public ArrayList<Usuario> listarUsuario(){
        
        String sql="SELECT IdUsuario, Nombre, Apellido, Dni, FechaDeNac, Nacionalidad, Email, Password FROM usuario WHERE Activo=1";
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