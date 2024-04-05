 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import helpers.Helpers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;
import modelo.UsuarioDAO;
import vista.frmUsuario;

/**
 *
 * @author Hersann Fonseca
 */
public class ControllerUsuario implements ActionListener {

    Helpers helpers = new Helpers();
    UsuarioDAO usuariodao = new UsuarioDAO();
    Usuario usuario = new Usuario();
    frmUsuario vistaUsuario = new frmUsuario();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControllerUsuario(frmUsuario frm) {
        this.vistaUsuario = frm;
        this.vistaUsuario.menuNuevoRegistro.addActionListener(this);
        this.vistaUsuario.menuEditarRegistro.addActionListener(this);
        this.vistaUsuario.btnCerrar.addActionListener(this);
        this.vistaUsuario.btnGuardar.addActionListener(this);
        this.vistaUsuario.btnCancelar.addActionListener(this);
        this.vistaUsuario.btnBuscar.addActionListener(this);
        this.vistaUsuario.btnEliminar.addActionListener(this);
        this.vistaUsuario.btnRefrescar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaUsuario.btnCerrar) {
            vistaUsuario.hide();
        }
        if (e.getSource() == vistaUsuario.menuNuevoRegistro) {
            vistaUsuario.lblFlag.setText("0");
            limpiarCampos();
            habilitarCampos(true);
            setVisibleGuardarCancelar(true);
        }
        if (e.getSource() == vistaUsuario.menuEditarRegistro) {
            if ("".equals(vistaUsuario.txtIdUsuario.getText())) {
                JOptionPane.showMessageDialog(vistaUsuario, "Debe Seleccionar Una fila..");
            } else {
                vistaUsuario.lblFlag.setText("1");
                habilitarCampos(true);
                setVisibleGuardarCancelar(true);
            }
        }
        if (e.getSource() == vistaUsuario.btnCancelar) {
            limpiarCampos();
            habilitarCampos(false);
            setVisibleGuardarCancelar(false);
        }
        if (e.getSource() == vistaUsuario.btnRefrescar) {
            filtrarTablaPorNombre(vistaUsuario.tableUsuarios, "");
        }
        if (e.getSource() == vistaUsuario.btnBuscar) {
            filtrarTablaPorNombre(vistaUsuario.tableUsuarios, vistaUsuario.txtBuscarPorNombre.getText());
        }
        if (e.getSource() == vistaUsuario.btnEliminar) {
            eliminarUsuario();
            limpiarCampos();
        }
        if (e.getSource() == vistaUsuario.btnGuardar) {
            String mode = vistaUsuario.lblFlag.getText();
            switch (mode) {
                case "0":
                    if (vistaUsuario.txtNombre.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar el nombre del Usuario", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);
                        vistaUsuario.txtNombre.requestFocus();
                    } else if (vistaUsuario.txtNombreUsuario.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar Nombre de Usuario", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);
                        vistaUsuario.txtNombreUsuario.requestFocus();
                    } else if (vistaUsuario.txtPassword.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar un password", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);
                        vistaUsuario.txtPassword.requestFocus();
                    } else if (vistaUsuario.txtPasswordConfirm.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar la confirmacion del password", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);
                        vistaUsuario.txtPassword.requestFocus();
                    } else if (!vistaUsuario.txtPassword.getText().equals(vistaUsuario.txtPasswordConfirm.getText())) {
                        JOptionPane.showMessageDialog(vistaUsuario, "El password no coincide con la confirmacion", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);
                        vistaUsuario.txtPassword.requestFocus(); 
                    } else if (vistaUsuario.cbTipoUsuario.getSelectedIndex() == -1) {
                        JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar un Tipo de Usuario", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);
                        vistaUsuario.cbTipoUsuario.requestFocus();
                    } else {
                        agregarUsuario();
                    }
                    break;
                case "1":
                    if (vistaUsuario.txtNombre.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar el nombre del Usuario", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);
                        vistaUsuario.txtNombre.requestFocus();
                    } else if (vistaUsuario.txtNombreUsuario.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar Nombre de Usuario", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);
                        vistaUsuario.txtNombreUsuario.requestFocus();
                    } else if (vistaUsuario.txtPassword.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar un password", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);
                        vistaUsuario.txtPassword.requestFocus();
                    } else if (vistaUsuario.txtPasswordConfirm.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar la confirmacion del password", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);
                        vistaUsuario.txtPassword.requestFocus();
                    } else if (!vistaUsuario.txtPassword.getText().equals(vistaUsuario.txtPasswordConfirm.getText())) {
                        JOptionPane.showMessageDialog(vistaUsuario, "El password no coincide con la confirmacion", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);
                        vistaUsuario.txtPassword.requestFocus();
                    } else if (vistaUsuario.cbTipoUsuario.getSelectedIndex() == -1) {
                        JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar un Tipo de Usuario", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);
                        vistaUsuario.cbTipoUsuario.requestFocus();
                    } else {
                        actualizarUsuario();
                    }
            }
        }
    }

    /**
     * Agregar usuario
     */
    public void agregarUsuario() {
        String nombre = vistaUsuario.txtNombre.getText();
        String nombreUsuario = vistaUsuario.txtNombreUsuario.getText();
        String password = vistaUsuario.txtPassword.getText();
        String tipoUsuario = vistaUsuario.cbTipoUsuario.getSelectedItem().toString();
        usuario.setNombre(nombre);
        usuario.setNombreUsuario(nombreUsuario);
        usuario.setPassword(password);
        usuario.setTipoUsuario(tipoUsuario);
        int r = usuariodao.agregarUsuario(usuario);
        if (r == 1) {
            JOptionPane.showMessageDialog(vistaUsuario, "Usuario Agregado con Exito.");
            filtrarTablaPorNombre(vistaUsuario.tableUsuarios, "");
            limpiarCampos();
            habilitarCampos(false);
            setVisibleGuardarCancelar(false);
        } else {
            JOptionPane.showMessageDialog(vistaUsuario, "Error");
        }
    }

    /**
     * Actualizar usuario
     */
    public void actualizarUsuario() {
        if (vistaUsuario.txtIdUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(vistaUsuario, "No se Identifica el Id debe selecionar un registro en la tabla");
        } else {
            int idUsuario = Integer.parseInt(vistaUsuario.txtIdUsuario.getText());
            String nombre = vistaUsuario.txtNombre.getText();
            String nombreUsuario = vistaUsuario.txtNombreUsuario.getText();
            String password = vistaUsuario.txtPassword.getText();
            String tipoUsuario = vistaUsuario.cbTipoUsuario.getSelectedItem().toString();
            usuario.setIdUsuario(idUsuario);
            usuario.setNombre(nombre);
            usuario.setNombreUsuario(nombreUsuario);
            usuario.setPassword(password);
            usuario.setTipoUsuario(tipoUsuario);
            int r = usuariodao.actualizarUsuario(usuario);
            if (r == 1) {
                JOptionPane.showMessageDialog(vistaUsuario, "Usuario Actualizado con Exito.");
                filtrarTablaPorNombre(vistaUsuario.tableUsuarios, "");
                limpiarCampos();
                habilitarCampos(false);
                setVisibleGuardarCancelar(false);
            } else {
                JOptionPane.showMessageDialog(vistaUsuario, "Error");
            }
        }
    }

    /**
     * Eliminar usuario
     */
    public void eliminarUsuario() {
        int fila = vistaUsuario.tableUsuarios.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaUsuario.tableUsuarios, "Debe Seleccionar una Fila...!!!");
        } else {
            int id = Integer.parseInt((String) vistaUsuario.tableUsuarios.getValueAt(fila, 0).toString());
            usuariodao.eliminarUsuario(id);
            JOptionPane.showMessageDialog(vistaUsuario, "Usuario Eliminado con éxito");
            filtrarTablaPorNombre(vistaUsuario.tableUsuarios, "");
        }
    }

    /**
     * Filtrar JTable de usuarios por nombre
     *
     * @param tabla
     * @param filtro
     */
    public void filtrarTablaPorNombre(JTable tabla, String filtro) {
        usuariodao.filtrarTablaPorNombre(tabla, filtro);
        helpers.centrarCeldas(tabla);
    }

    /**
     * Iniciar
     */
    public void iniciar() {
        filtrarTablaPorNombre(vistaUsuario.tableUsuarios, "");
        limpiarCampos();
        setVisibleGuardarCancelar(false);
        habilitarCampos(false);
    }

    /**
     * Limpiar campos del formulario
     */
    public void limpiarCampos() {
        vistaUsuario.txtIdUsuario.setText("");
        vistaUsuario.txtNombre.setText("");
        vistaUsuario.txtNombreUsuario.setText("");
        vistaUsuario.txtPassword.setText("");
        vistaUsuario.txtPasswordConfirm.setText("");
        vistaUsuario.cbTipoUsuario.setSelectedIndex(0);
    }

    /**
     * Setear visible los botones de guardar y cancelar
     * @param estado
     */
    public void setVisibleGuardarCancelar(boolean estado) {
        vistaUsuario.btnGuardar.setVisible(estado);
        vistaUsuario.btnCancelar.setVisible(estado);
    }

    /**
     * Habilitar campos del formulario
     * @param estado
     */
    public void habilitarCampos(boolean estado) {
        vistaUsuario.txtNombre.setEnabled(estado);
        vistaUsuario.txtNombreUsuario.setEnabled(estado);
        vistaUsuario.txtPassword.setEnabled(estado);
        vistaUsuario.txtPasswordConfirm.setEnabled(estado);
        vistaUsuario.cbTipoUsuario.setEnabled(estado);
    }
}
