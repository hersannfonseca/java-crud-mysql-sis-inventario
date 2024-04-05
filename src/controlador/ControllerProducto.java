/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import helpers.Helpers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.Producto;
import modelo.ProductoDAO;
import modelo.Proveedor;
import modelo.ProveedorDAO;
import modelo.Usuario;
import vista.frmPaginaPrincipal;
import vista.frmProducto;

/**
 *
 * @author laboratorio
 */
public class ControllerProducto implements ActionListener {

    Helpers helpers = new Helpers();
    ProductoDAO productoDAO = new ProductoDAO();
    Producto producto = new Producto();
    frmProducto vistaProducto = new frmProducto();
    ProveedorDAO proveedorDAO = new ProveedorDAO();
    Proveedor proveedor = new Proveedor();
    Usuario usuario = new Usuario();

    public ControllerProducto(frmProducto frm) {
        this.vistaProducto = frm;
        this.vistaProducto.menuNuevoRegistro.addActionListener(this);
        this.vistaProducto.menuEditarRegistro.addActionListener(this);
        this.vistaProducto.btnCerrar.addActionListener(this);
        this.vistaProducto.btnGuardar.addActionListener(this);
        this.vistaProducto.btnCancelar.addActionListener(this);
        this.vistaProducto.btnBuscar.addActionListener(this);
        this.vistaProducto.btnEliminar.addActionListener(this);
        this.vistaProducto.btnRefrescar.addActionListener(this);
        this.vistaProducto.btnBuscarProveedor.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaProducto.btnCerrar) {
            vistaProducto.hide();
        }
        if (e.getSource() == vistaProducto.menuNuevoRegistro) {
            vistaProducto.lblFlag.setText("0");
            limpiarCampos();
            habilitarCampos(true);
            setVisibleGuardarCancelar(true);
        }
        if (e.getSource() == vistaProducto.menuEditarRegistro) {
            if ("".equals(vistaProducto.txtIdProducto.getText())) {
                JOptionPane.showMessageDialog(vistaProducto, "Debe Seleccionar Una fila..");
            } else {
                vistaProducto.lblFlag.setText("1");
                habilitarCampos(true);
                setVisibleGuardarCancelar(true);
            }
        }
        if (e.getSource() == vistaProducto.btnCancelar) {
            limpiarCampos();
            habilitarCampos(false);
            setVisibleGuardarCancelar(false);
        }
        if (e.getSource() == vistaProducto.btnRefrescar) {
            filtrarTablaProductos(vistaProducto.tableProductos, vistaProducto.cbCriterioBusqueda.getSelectedItem().toString(), "");
        }
        if (e.getSource() == vistaProducto.btnBuscar) {
            filtrarTablaProductos(vistaProducto.tableProductos, vistaProducto.cbCriterioBusqueda.getSelectedItem().toString(), vistaProducto.txtBuscarPor.getText());
        }
        if (e.getSource() == vistaProducto.btnEliminar) {
            eliminarProducto();
            limpiarCampos();
        }
        if (e.getSource() == vistaProducto.btnBuscarProveedor) {
            cargarProveedorPorId();
        }
        if (e.getSource() == vistaProducto.btnGuardar) {
            String mode = vistaProducto.lblFlag.getText();
            switch (mode) {
                case "0":
                    agregarProducto();
                    break;
                case "1":
                    actualizarProducto();
            }
        }
    }

    public void agregarProducto() {

        String descripcion = vistaProducto.txtDescripcion.getText();
        int unidades = Integer.parseInt(vistaProducto.txtUnidades.getValue().toString());
        String categoria = vistaProducto.cbCategoria.getSelectedItem().toString();
        double precio = Double.parseDouble(vistaProducto.txtPrecio.getText());
        int activo = 0;
        if (vistaProducto.ckActivo.isSelected()) {
            activo = 1;
        }
        Date fechaCaducidad = vistaProducto.dcFechaCaducidad.getDate();
        int idProveedor = Integer.parseInt(vistaProducto.txtIdProveedor.getText());
        int idUsuario = Integer.parseInt(frmPaginaPrincipal.lblIdUsuario.getText());

        producto.setDescripcion(descripcion);
        producto.setUnidades(unidades);
        producto.setCategoria(categoria);
        producto.setPrecio(precio);
        producto.setActivo(activo);
        producto.setFechaCaducidad(helpers.convertDate(fechaCaducidad));
        proveedor.setIdProveedor(idProveedor);
        producto.setProveedor(proveedor);
        usuario.setIdUsuario(idUsuario);
        producto.setUsuario(usuario);

        int r = productoDAO.agregarProducto(producto);

        if (r == 1) {
            JOptionPane.showMessageDialog(vistaProducto, "Proveedor Agregado con Exito.");
            filtrarTablaProductos(vistaProducto.tableProductos, vistaProducto.cbCriterioBusqueda.getSelectedItem().toString(), "");
            limpiarCampos();
            habilitarCampos(false);
            setVisibleGuardarCancelar(false);
        } else {
            JOptionPane.showMessageDialog(vistaProducto, "Error");
        }
    }

    public void actualizarProducto() {
        if (vistaProducto.txtIdProducto.getText().equals("")) {
            JOptionPane.showMessageDialog(vistaProducto, "No se Identifica el Id debe selecionar un registro en la tabla");
        } else {
            int idProducto = Integer.parseInt(vistaProducto.txtIdProducto.getText());
            String descripcion = vistaProducto.txtDescripcion.getText();
            int unidades = Integer.parseInt(vistaProducto.txtUnidades.getValue().toString());
            String categoria = vistaProducto.cbCategoria.getSelectedItem().toString();
            double precio = Double.parseDouble(vistaProducto.txtPrecio.getText());
            int activo = 0;
            if (vistaProducto.ckActivo.isSelected()) {
                activo = 1;
            }
            Date fechaCaducidad = vistaProducto.dcFechaCaducidad.getDate();
            int idProveedor = Integer.parseInt(vistaProducto.txtIdProveedor.getText());
            int idUsuario = Integer.parseInt(frmPaginaPrincipal.lblIdUsuario.getText());

            producto.setIdProducto(idProducto);
            producto.setDescripcion(descripcion);
            producto.setUnidades(unidades);
            producto.setCategoria(categoria);
            producto.setPrecio(precio);
            producto.setActivo(activo);
            producto.setFechaCaducidad(helpers.convertDate(fechaCaducidad));
            proveedor.setIdProveedor(idProveedor);
            producto.setProveedor(proveedor);
            usuario.setIdUsuario(idUsuario);
            producto.setUsuario(usuario);

            int r = productoDAO.actualizarProducto(producto);
            if (r == 1) {
                JOptionPane.showMessageDialog(vistaProducto, "Usuario Actualizado con Exito.");
                filtrarTablaProductos(vistaProducto.tableProductos, vistaProducto.cbCriterioBusqueda.getSelectedItem().toString(), "");
                limpiarCampos();
                habilitarCampos(false);
                setVisibleGuardarCancelar(false);
            } else {
                JOptionPane.showMessageDialog(vistaProducto, "Error");
            }
        }
    }

    public void eliminarProducto() {
        int fila = vistaProducto.tableProductos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaProducto.tableProductos, "Debe Seleccionar una Fila...!!!");
        } else {
            int idProducto = Integer.parseInt(vistaProducto.tableProductos.getValueAt(fila, 0).toString());
            productoDAO.eliminarProducto(idProducto);
            JOptionPane.showMessageDialog(vistaProducto, "Producto Eliminado con éxito");
            filtrarTablaProductos(vistaProducto.tableProductos, vistaProducto.cbCriterioBusqueda.getSelectedItem().toString(), "");
        }
    }

    public void cargarProveedorPorId() {

        String idProveedor = JOptionPane.showInputDialog("Inserte el ID del proveedor");
        proveedor = proveedorDAO.cargarProveedorPorId(Integer.parseInt(idProveedor));
        vistaProducto.txtIdProveedor.setText(String.valueOf(proveedor.getIdProveedor()));
        vistaProducto.txtNombreProveedor.setText(proveedor.getNombreProveedor());
    }

    public void filtrarTablaProductos(JTable tabla, String criterio, String filtro) {
        productoDAO.filtrarTablaProductos(tabla, criterio, filtro);
        helpers.centrarCeldas(tabla);
    }

    public void iniciar() {
        filtrarTablaProductos(vistaProducto.tableProductos, vistaProducto.cbCriterioBusqueda.getSelectedItem().toString(), "");
        limpiarCampos();
        setVisibleGuardarCancelar(false);
        habilitarCampos(false);
    }

    /**
     * Limpiar campos del formulario
     */
    public void limpiarCampos() {
        vistaProducto.txtDescripcion.setText("");
        vistaProducto.txtUnidades.setValue(0);
        vistaProducto.cbCategoria.setSelectedIndex(0);
        vistaProducto.txtPrecio.setText("0");
        vistaProducto.ckActivo.setSelected(false);
        try {
            vistaProducto.dcFechaCaducidad.setDate(helpers.fechaActual());
        } catch (ParseException ex) {
            Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        vistaProducto.txtIdProveedor.setText("");
        vistaProducto.txtNombreProveedor.setText("");
    }

    /**
     * Setear visible los botones de guardar y cancelar
     *
     * @param estado
     */
    public void setVisibleGuardarCancelar(boolean estado) {
        vistaProducto.btnGuardar.setVisible(estado);
        vistaProducto.btnCancelar.setVisible(estado);
    }

    /**
     * Habilitar campos del formulario
     *
     * @param estado
     */
    public void habilitarCampos(boolean estado) {
        vistaProducto.txtDescripcion.setEnabled(estado);
        vistaProducto.txtUnidades.setEnabled(estado);
        vistaProducto.cbCategoria.setEnabled(estado);
        vistaProducto.txtPrecio.setEnabled(estado);
        vistaProducto.ckActivo.setEnabled(estado);
        vistaProducto.dcFechaCaducidad.setEnabled(estado);
        vistaProducto.btnBuscarProveedor.setEnabled(estado);
    }
}
