package controlador;

import helpers.Helpers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Proveedor;
import modelo.ProveedorDAO;
import vista.frmProveedor;

public class ControllerProveedor implements ActionListener {

    Helpers helpers = new Helpers();
    ProveedorDAO pdao = new ProveedorDAO();
    Proveedor p = new Proveedor();
    frmProveedor vistaProveedor = new frmProveedor();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControllerProveedor(frmProveedor frm) {
        this.vistaProveedor = frm;
        this.vistaProveedor.menuNuevoRegistro.addActionListener(this);
        this.vistaProveedor.menuEditarRegistro.addActionListener(this);
        this.vistaProveedor.btnCerrar.addActionListener(this);
        this.vistaProveedor.btnGuardar.addActionListener(this);
        this.vistaProveedor.btnCancelar.addActionListener(this);
        this.vistaProveedor.btnBuscar.addActionListener(this);
        this.vistaProveedor.btnEliminar.addActionListener(this);
        this.vistaProveedor.btnRefrescar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaProveedor.btnCerrar) {
            vistaProveedor.hide();
        }
        if (e.getSource() == vistaProveedor.menuNuevoRegistro) {
            vistaProveedor.lblFlag.setText("0");
            limpiarCampos();
            habilitarCampos(true);
            setVisibleGuardarCancelar(true);
        }
        if (e.getSource() == vistaProveedor.menuEditarRegistro) {
            if ("".equals(vistaProveedor.txtIdProveedor.getText())) {
                JOptionPane.showMessageDialog(vistaProveedor, "Debe Seleccionar Una fila..");
            } else {
                vistaProveedor.lblFlag.setText("1");
                habilitarCampos(true);
                setVisibleGuardarCancelar(true);
            }
        }
        if (e.getSource() == vistaProveedor.btnCancelar) {
            limpiarCampos();
            habilitarCampos(false);
            setVisibleGuardarCancelar(false);
        }
        if (e.getSource() == vistaProveedor.btnRefrescar) {
            filtrarTablaPorNombre(vistaProveedor.tableProveedores, "");
        }
        if (e.getSource() == vistaProveedor.btnBuscar) {
            filtrarTablaPorNombre(vistaProveedor.tableProveedores, vistaProveedor.txtBuscarPorNombre.getText());
        }
        if (e.getSource() == vistaProveedor.btnEliminar) {
            eliminarProveedor();
            limpiarCampos();
        }
        if (e.getSource() == vistaProveedor.btnGuardar) {
            String mode = vistaProveedor.lblFlag.getText();
            switch (mode) {
                case "0":
                    if (vistaProveedor.txtNombreProveedor.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaProveedor, "Debe ingresar el nombre del proveedor", "Agregar proveedor", JOptionPane.INFORMATION_MESSAGE);
                        vistaProveedor.txtNombreProveedor.requestFocus();
                    } else if (vistaProveedor.txtDireccion.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaProveedor, "Debe ingresar la dirección del proveedor", "Agregar proveedor", JOptionPane.INFORMATION_MESSAGE);
                        vistaProveedor.txtDireccion.requestFocus();
                    } else if (vistaProveedor.txtNombreEmpresa.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaProveedor, "Debe ingresar el nombre de la empresa del proveedor", "Agregar proveedor", JOptionPane.INFORMATION_MESSAGE);
                        vistaProveedor.txtNombreEmpresa.requestFocus();
                    } else if (vistaProveedor.txtTelefono.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaProveedor, "Debe ingresar el número de telefono del proveedor", "Agregar proveedor", JOptionPane.INFORMATION_MESSAGE);
                        vistaProveedor.txtTelefono.requestFocus();
                    } else if (vistaProveedor.txtEmail.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaProveedor, "Debe ingresar la dirección de correo  del proveedor", "Agregar proveedor", JOptionPane.INFORMATION_MESSAGE);
                        vistaProveedor.txtEmail.requestFocus();
                    } else {
                        agregarProveedor();
                    }
                    break;
                case "1":
                    if (vistaProveedor.txtNombreProveedor.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaProveedor, "Debe ingresar el nombre del proveedor", "Agregar proveedor", JOptionPane.INFORMATION_MESSAGE);
                        vistaProveedor.txtNombreProveedor.requestFocus();
                    } else if (vistaProveedor.txtDireccion.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaProveedor, "Debe ingresar la dirección del proveedor", "Agregar proveedor", JOptionPane.INFORMATION_MESSAGE);
                        vistaProveedor.txtDireccion.requestFocus();
                    } else if (vistaProveedor.txtNombreEmpresa.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaProveedor, "Debe ingresar el nombre de la empresa del proveedor", "Agregar proveedor", JOptionPane.INFORMATION_MESSAGE);
                        vistaProveedor.txtNombreEmpresa.requestFocus();
                    } else if (vistaProveedor.txtTelefono.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaProveedor, "Debe ingresar el número de telefono del proveedor", "Agregar proveedor", JOptionPane.INFORMATION_MESSAGE);
                        vistaProveedor.txtTelefono.requestFocus();
                    } else if (vistaProveedor.txtEmail.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaProveedor, "Debe ingresar la dirección de correo del proveedor", "Agregar proveedor", JOptionPane.INFORMATION_MESSAGE);
                        vistaProveedor.txtEmail.requestFocus();
                    } else {
                        actualizarProveedor();
                    }
            }
        }
    }

    /**
     * Agregar proveedor
     */
    public void agregarProveedor() {

        String nombreProveedor = vistaProveedor.txtNombreProveedor.getText();
        String dirreccion = vistaProveedor.txtDireccion.getText();
        String nombreEmpresa = vistaProveedor.txtNombreEmpresa.getText();
        String telefono = vistaProveedor.txtTelefono.getText();
        String email = vistaProveedor.txtEmail.getText();

        p.setNombreProveedor(nombreProveedor);
        p.setDireccion(dirreccion);
        p.setNombreEmpresa(nombreEmpresa);
        p.setTelefono(telefono);
        p.setEmail(email);

        int r = pdao.agregarProveedor(p);

        if (r == 1) {
            JOptionPane.showMessageDialog(vistaProveedor, "Proveedor Agregado con Exito.");
            filtrarTablaPorNombre(vistaProveedor.tableProveedores, "");
            limpiarCampos();
            habilitarCampos(false);
            setVisibleGuardarCancelar(false);
        } else {
            JOptionPane.showMessageDialog(vistaProveedor, "Error");
        }
    }

    /**
     * Actualizar Proveedor
     */
    public void actualizarProveedor() {

        if (vistaProveedor.txtIdProveedor.getText().equals("")) {
            JOptionPane.showMessageDialog(vistaProveedor, "No se Identifica el Id debe selecionar un registro en la tabla");
        } else {
            int idProveedor = Integer.parseInt(vistaProveedor.txtIdProveedor.getText());
            String nombreProveedor = vistaProveedor.txtNombreProveedor.getText();
            String direccion = vistaProveedor.txtDireccion.getText();
            String nombreEmpresa = vistaProveedor.txtNombreEmpresa.getText();
            String telefono = vistaProveedor.txtTelefono.getText();
            String email = vistaProveedor.txtEmail.getText();

            p.setIdProveedor(idProveedor);
            p.setNombreProveedor(nombreProveedor);
            p.setDireccion(direccion);
            p.setNombreEmpresa(nombreEmpresa);
            p.setTelefono(telefono);
            p.setEmail(email);

            int r = pdao.actualizarProveedor(p);

            if (r == 1) {
                JOptionPane.showMessageDialog(vistaProveedor, "Proveedor Actualizado con Exito.");
                filtrarTablaPorNombre(vistaProveedor.tableProveedores, "");
                limpiarCampos();
                habilitarCampos(false);
                setVisibleGuardarCancelar(false);
            } else {
                JOptionPane.showMessageDialog(vistaProveedor, "Error");
            }
        }
    }

    /**
     * Eliminar proveedor
     */
    public void eliminarProveedor() {
        
        int fila = vistaProveedor.tableProveedores.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaProveedor.tableProveedores, "Debe Seleccionar una Fila...!!!");
        } else {
            int id = Integer.parseInt((String) vistaProveedor.tableProveedores.getValueAt(fila, 0).toString());
            pdao.eliminarProveedor(id);
            
            JOptionPane.showMessageDialog(vistaProveedor, "Proveedor Eliminado con éxito");
            filtrarTablaPorNombre(vistaProveedor.tableProveedores, "");
        }
    }

    /**
     * Filtrar JTable por nombre del proveedor
     *
     * @param tabla
     * @param filtro
     */
    public void filtrarTablaPorNombre(JTable tabla, String filtro) {
        pdao.filtrarTablaPorNombre(tabla, filtro);
        helpers.centrarCeldas(tabla);
    }

    /**
     * Iniciar
     */
    public void iniciar() {
        filtrarTablaPorNombre(vistaProveedor.tableProveedores, "");
        limpiarCampos();
        setVisibleGuardarCancelar(false);
        habilitarCampos(false);
    }

    /**
     * Limpiar campos del formulario
     */
    public void limpiarCampos() {
        vistaProveedor.txtIdProveedor.setText("");
        vistaProveedor.txtNombreProveedor.setText("");
        vistaProveedor.txtDireccion.setText("");
        vistaProveedor.txtNombreEmpresa.setText("");
        vistaProveedor.txtTelefono.setText("");
        vistaProveedor.txtEmail.setText("");
    }

    /**
     * Setear visible los botones de guardar y cancelar
     *
     * @param estado
     */
    public void setVisibleGuardarCancelar(boolean estado) {
        vistaProveedor.btnGuardar.setVisible(estado);
        vistaProveedor.btnCancelar.setVisible(estado);
    }

    /**
     * Habilitar campos de texto
     *
     * @param estado
     */
    public void habilitarCampos(boolean estado) {
        vistaProveedor.txtNombreProveedor.setEnabled(estado);
        vistaProveedor.txtDireccion.setEnabled(estado);
        vistaProveedor.txtNombreEmpresa.setEnabled(estado);
        vistaProveedor.txtTelefono.setEnabled(estado);
        vistaProveedor.txtEmail.setEnabled(estado);
    }
}
