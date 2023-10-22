package ProjectoFinalSalud.AccesoDeDatos;

import ProjectoFinalSalud.Entidades.Afiliado;
import ProjectoFinalSalud.Entidades.Orden;
import ProjectoFinalSalud.Entidades.Prestador;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OrdenData {

    private Connection con = null;

    public OrdenData() {
        con = Conexion.getConnection();
    }

    public void guardarOrden(Orden orden) {
        String sql = " INSERT INTO orden(idAfiliado, idPrestador, fecha, formaPago, importe)"
                + "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, orden.getAfiliado().getIdAfiliado());
            ps.setInt(2, orden.getPrestador().getIdPrestador());
            ps.setDate(3, Date.valueOf(orden.getFecha()));
            ps.setString(4, orden.getFormaPago());
            ps.setDouble(5, orden.getImporte());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                JOptionPane.showMessageDialog(null, "Orden guardada exitosamente!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ordenes");
        }
    }

    public ArrayList<Orden> listarOrdenesPorFecha(LocalDate fecha) {
        ArrayList<Orden> ordenes = new ArrayList<Orden>();
        String sql = "SELECT idOrden,idAfiliado, idPrestador, formaPago,importe FROM orden WHERE fecha=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            Orden orden;
            AfiliadoData ad = new AfiliadoData();
            PrestadorData pd = new PrestadorData();
            while (rs.next()) {
                orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));
                Prestador p = pd.buscarPrestador(rs.getInt("idPrestador"));
                Afiliado a = ad.buscarAfiliadoID(rs.getInt("idAfiliado"));
                orden.setAfiliado(a);
                orden.setPrestador(p);

                ordenes.add(orden);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla de Ordenes");
        }
        return ordenes;
    }

    public ArrayList<Orden> OrdenesPorAfiliado(int dni) {
        ArrayList<Orden> ordenes = new ArrayList<Orden>();

        String sql = "SELECT idOrden ,idPrestador,fecha,formaPago,importe, orden.idAfiliado\n"
                + "FROM orden JOIN afiliado\n"
                + "WHERE orden.idAfiliado=afiliado.idAfiliado AND afiliado.dni=? AND afiliado.Activo=1;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            Orden orden;
            AfiliadoData ad = new AfiliadoData();
            PrestadorData pd = new PrestadorData();
            while (rs.next()) {
                orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                Afiliado a = ad.buscarAfiliadoID(rs.getInt("idAfiliado"));
                orden.setAfiliado(a);
                Prestador p = pd.buscarPrestador(rs.getInt("idPrestador"));
                orden.setPrestador(p);
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));
                ordenes.add(orden);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("error");
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla de Ordenes");
        }
        return ordenes;
    }

    public ArrayList<Orden> OrdenesPorPrestador(int id) {
        ArrayList<Orden> ordenes = new ArrayList<Orden>();
        String sql = "SELECT orden.idOrden ,fecha,formaPago ,importe, orden.idPrestador,orden.idAfiliado"
                + " FROM orden JOIN prestador WHERE orden.idPrestador=prestador.Idprestador"
                + " AND prestador.IdPrestador=? AND prestador.Activo=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Orden orden;
            AfiliadoData ad = new AfiliadoData();
            PrestadorData pd = new PrestadorData();
            Prestador p = pd.buscarPrestador(id);
            while (rs.next()) {
                orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                Afiliado a = ad.buscarAfiliadoID(rs.getInt("idAfiliado"));
                orden.setPrestador(p);
                orden.setAfiliado(a);
                ordenes.add(orden);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla de Ordenes");
        }
        return ordenes;
    }

    public ArrayList<Orden> ListarOrdenes() {
        ArrayList<Orden> ordenes = new ArrayList<Orden>();
        String sql = "SELECT idOrden, idAfiliado,idPrestador, fecha,formaPago,importe FROM orden";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Orden orden;
            AfiliadoData ad = new AfiliadoData();
            PrestadorData pd = new PrestadorData();

            while (rs.next()) {
                orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                Prestador p = pd.buscarPrestador(rs.getInt("idPrestador"));
                Afiliado a = ad.buscarAfiliadoID(rs.getInt("idAfiliado"));
                orden.setPrestador(p);
                orden.setAfiliado(a);
                ordenes.add(orden);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla orden");
        }
        return ordenes;
    }
}
