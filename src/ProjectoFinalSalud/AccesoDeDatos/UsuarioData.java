
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
        
        String sql = "SELECT * FROM usuario WHERE Nombre=?, Apellido=?, Email=?, Password=?";
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
    
    public boolean activarUsuario(String Email, String Password) {
        boolean a=false;
        String sql = "SELECT * FROM usuario WHERE usuario.Email=? AND usuario.Password=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Email);
            ps.setString(2, Password);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Bienvenido");
                return a=true;
            } else {
                JOptionPane.showMessageDialog(null, "El Usuario es incorrecto, por favor vuelva a intentarlo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }return a;
    }
    
    public void desactivarUsuario(int dni) {
        
        String sql = "UPDATE usuario SET Activo=0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int exi = ps.executeUpdate();
            if (exi == 1) {
                JOptionPane.showMessageDialog(null, "Hasta Pronto " + listarUsuario().get(exi).getNombre());
            }
        } catch (SQLException ex) {
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
        
        String sql = "SELECT IdUsuario, Nombre, Apellido, Dni, FechaDeNac, Nacionalidad, Email, Password FROM usuario WHERE Activo=?";
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
    
    public void identificar(Usuario us){
        
        String sql="SELECT * usuario WHERE Nombre=?, Apellido=?, Email=? ,Password=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, us.getNombre());
            ps.setString(2, us.getApellido());
            ps.setString(3, us.getEmail());
            String contra = String.valueOf(us.getPassword());
            ps.setString(4, contra);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "Bienvenido");
            }else{
                JOptionPane.showMessageDialog(null, "Equivocado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error "+ex.toString());
        }
    }
}