package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProveedorDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection con;
    Conexion conectar = new Conexion();

    /**
     * Agregar proveedor a la base de datos
     *
     * @param prov
     * @return
     */
    public int agregarProveedor(Proveedor prov) {

        int r = 0;
        String sql = "INSERT into proveedores(nombreProveedor, direccion, nombreEmpresa, telefono, email) VALUES (?,?,?,?,?)";

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, prov.getNombreProveedor());
            ps.setString(2, prov.getDireccion());
            ps.setString(3, prov.getNombreEmpresa());
            ps.setString(4, prov.getTelefono());
            ps.setString(5, prov.getEmail());
            r = ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

        return r;
    }

    /**
     * Actualizar proveedor a la base de datos
     *
     * @param prov
     * @return
     */
    public int actualizarProveedor(Proveedor prov) {

        int r = 0;
        String sql = "UPDATE proveedores SET nombreProveedor=?, direccion=?, nombreEmpresa=?, telefono=?, email=? WHERE idProveedor=?";

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, prov.getNombreProveedor());
            ps.setString(2, prov.getDireccion());
            ps.setString(3, prov.getNombreEmpresa());
            ps.setString(4, prov.getTelefono());
            ps.setString(5, prov.getEmail());
            ps.setInt(6, prov.getIdProveedor());
            r = ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

        return r;
    }

    /**
     * Eliminar proveedor de la base de datos
     *
     * @param id
     * @return
     */
    public int eliminarProveedor(int id) {
        int r = 0;
        String sql = "DELETE FROM proveedores WHERE idProveedor=" + id;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return r;
    }

    /**
     * Filtrar JTable por nombre
     *
     * @param table
     * @param filtro
     */
    public void filtrarTablaPorNombre(JTable table, String filtro) {
        String[] titulos = {"ID", "NOMBRE", "DIRECCION", "EMPRESA", "TELEFONO", "EMAIL"};
        String[] registros = new String[6];
        String sql = "SELECT * FROM proveedores WHERE nombreProveedor LIKE '%" + filtro + "%'";
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("idProveedor");
                registros[1] = rs.getString("nombreProveedor");
                registros[2] = rs.getString("direccion");
                registros[3] = rs.getString("nombreEmpresa");
                registros[4] = rs.getString("telefono");
                registros[5] = rs.getString("email");
                model.addRow(registros);
            }
            table.setModel(model);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    public Proveedor cargarProveedorPorId(int idProveedor) {

        Proveedor p = new Proveedor();

        String sql = "SELECT idProveedor, nombreProveedor FROM proveedores WHERE idProveedor=" + idProveedor;
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                p.setIdProveedor(rs.getInt("idProveedor"));
                p.setNombreProveedor(rs.getString("nombreProveedor"));
            }
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return p;
    }
}
