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
    
    private Connection con=null;

    public AfiliadoData() {
        con=Conexion.getConnection();
    }
    
    public void guardarAfiliado(Afiliado a){
        String sql="INSERT INTO afiliado(nombre, dni ,domicilio, telefono, estado)"
                + "values (?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, a.getNombre());
            ps.setInt(2, a.getDni());
            ps.setString(3, a.getDomicilio());
            ps.setInt(4, a.getTelefono());
            ps.setBoolean(5, a.isActivo());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()){
                a.setIdAfiliado(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se a agregado un nuevo afiliado exitosamente");
                        
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el afiliado");
        }
    }
    
    public ArrayList<Afiliado> listarAfiliados(){
        String sql="Select idAfiliado ,nombre ,dni ,domicilio ,telefono FROM afiliado WHERE estado=1";
        ArrayList<Afiliado> afiliados=new ArrayList<>();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()){
                Afiliado af=new Afiliado();
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
}
