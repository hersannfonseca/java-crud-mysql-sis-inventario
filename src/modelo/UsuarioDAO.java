  package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UsuarioDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection con;
    Conexion conectar = new Conexion();

    /**
     * Agregar usuario a la base de datos
     *
     * @param user
     * @return
     */
    public int agregarUsuario(Usuario user) {

        int r = 0;
        String sql = "INSERT INTO usuarios(nombre, nombreUsuario, password, tipoUsuario) VALUES (?,?,?,?)";

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getNombreUsuario());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getTipoUsuario());
            r = ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        
        return r;
    }

    /**
     * Actualizar usuario en la base de datos
     *
     * @param user
     * @return
     */
    public int actualizarUsuario(Usuario user) {

        int r = 0;
        String sql = "UPDATE usuarios SET nombre=?, nombreUsuario=?, password=?, tipoUsuario=? WHERE idUsuario=?";

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getNombreUsuario());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getTipoUsuario());
            ps.setInt(5, user.getIdUsuario());
            r = ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        
        return r;
    }

    /**
     * Eliminar usuario de la base de datos
     *
     * @param id
     * @return
     */
    public int eliminarUsuario(int id) {

        int r = 0;
        String sql = "DELETE FROM usuarios WHERE idUsuario=" + id;

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
     * Filtrar JTable por nombre de usuario
     *
     * @param table
     * @param filtro
     */
    public void filtrarTablaPorNombre(JTable table, String filtro) {

        String[] titulos = {"ID", "NOMBRE", "USUARIO", "PASSWORD", "TIPO"};
        String[] registros = new String[100];
        String sql = "SELECT * FROM usuarios WHERE nombre LIKE '%" + filtro + "%'";
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("idUsuario");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("nombreUsuario");
                registros[3] = rs.getString("password");
                registros[4] = rs.getString("tipoUsuario");
                model.addRow(registros);
            }
            table.setModel(model);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    /**
     * Acceso al sistema
     *
     * @param user
     * @return
     */
    public boolean login(Usuario user) {

        String sql = "SELECT idUsuario, nombreUsuario, password, tipoUsuario FROM usuarios WHERE nombreUsuario=?";

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombreUsuario());
            rs = ps.executeQuery();
            if (rs.next()) {
                if (user.getPassword().equals(rs.getString("password")) && user.getTipoUsuario().equals(rs.getString("tipoUsuario"))) {
                    user.setIdUsuario(rs.getInt("idUsuario"));
                    user.setNombreUsuario(rs.getString("nombreUsuario"));
                    user.setTipoUsuario(rs.getString("tipoUsuario"));
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        } catch (SQLException e) {
            return false;
        }
    }
}
