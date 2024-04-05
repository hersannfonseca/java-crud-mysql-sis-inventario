/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laboratorio
 */
public class ProductoDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection con;
    Conexion conectar = new Conexion();

    /**
     * Agregar usuario a la base de datos
     *
     * @param product
     * @return
     */
    public int agregarProducto(Producto product) {

        int r = 0;
        String sql = "INSERT INTO productos(descripcion, unidades, categoria, precio, activo, fechaCaducidad, idProveedor, idUsuario) VALUES (?,?,?,?,?,?,?,?)";

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, product.getDescripcion());
            ps.setInt(2, product.getUnidades());
            ps.setString(3, product.getCategoria());
            ps.setDouble(4, product.getPrecio());
            ps.setInt(5, product.getActivo());
            ps.setDate(6, product.getFechaCaducidad());
            ps.setInt(7, product.getProveedor().getIdProveedor());
            ps.setInt(8, product.getUsuario().getIdUsuario());
            r = ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

        return r;
    }

    public int actualizarProducto(Producto product) {

        int r = 0;
        String sql = "UPDATE productos SET descripcion=?, unidades=?, categoria=?, precio=?, activo=?, fechaCaducidad=?, idProveedor=?, idUsuario=? WHERE idProducto=?";

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, product.getDescripcion());
            ps.setInt(2, product.getUnidades());
            ps.setString(3, product.getCategoria());
            ps.setDouble(4, product.getPrecio());
            ps.setInt(5, product.getActivo());
            ps.setDate(6, product.getFechaCaducidad());
            ps.setInt(7, product.getProveedor().getIdProveedor());
            ps.setInt(8, product.getUsuario().getIdUsuario());
            ps.setInt(9, product.getIdProducto());
            r = ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

        return r;
    }

    public int eliminarProducto(int idProducto) {

        int r = 0;
        String sql = "DELETE FROM productos WHERE idProducto=" + idProducto;

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

        return r;
    }

    public void filtrarTablaProductos(JTable table, String criterio, String filtro) {

        String[] titulos = {"idProducto", "descripcion", "unidades", "categoria", "precio", "activo", "fechaCaducidad", "idProveedor", "nombreProveedor", "idUsuario", "nombreUsuario"};
        String[] registros = new String[11];
        String sql = "SELECT productos.idProducto, productos.descripcion, productos.unidades, productos.categoria, productos.precio, productos.activo, productos.fechaCaducidad, productos.idProveedor, proveedores.nombreProveedor, productos.idUsuario, usuarios.nombreUsuario "
                + "FROM productos "
                + "INNER JOIN proveedores "
                + "ON productos.idProveedor = proveedores.idProveedor "
                + "INNER JOIN usuarios "
                + "ON productos.idUsuario = usuarios.idUsuario "
                + "WHERE " + criterio + " LIKE '%" + filtro + "%'";
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("idProducto");
                registros[1] = rs.getString("descripcion");
                registros[2] = rs.getString("unidades");
                registros[3] = rs.getString("categoria");
                registros[4] = rs.getString("precio");
                registros[5] = rs.getString("activo");
                registros[6] = rs.getString("fechaCaducidad");
                registros[7] = rs.getString("idProveedor");
                registros[8] = rs.getString("nombreProveedor");
                registros[9] = rs.getString("idUsuario");
                registros[10] = rs.getString("nombreUsuario");
                model.addRow(registros);
            }
            table.setModel(model);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

}
