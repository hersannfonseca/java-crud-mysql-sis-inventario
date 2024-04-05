package vista;

import javax.swing.JOptionPane;

public class frmUsuario extends javax.swing.JInternalFrame {

    public frmUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        panelIngresarDatos = new javax.swing.JPanel();
        txtIdUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblIdCliente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblConfirmarPass = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNombreUsuario = new javax.swing.JTextField();
        lblTipoUsuario = new javax.swing.JLabel();
        cbTipoUsuario = new javax.swing.JComboBox();
        txtPassword = new javax.swing.JPasswordField();
        txtPasswordConfirm = new javax.swing.JPasswordField();
        lblPassword1 = new javax.swing.JLabel();
        panelDetalle = new javax.swing.JPanel();
        panelTableClientes = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();
        lblBuscarPorNombre = new javax.swing.JLabel();
        txtBuscarPorNombre = new javax.swing.JTextField();
        btnRefrescar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblFlag = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        btnCerrar = new javax.swing.JMenuItem();
        menuAcciones = new javax.swing.JMenu();
        menuNuevoRegistro = new javax.swing.JMenuItem();
        menuEditarRegistro = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIngresarDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Datos"));
        panelIngresarDatos.setLayout(null);

        txtIdUsuario.setEditable(false);
        txtIdUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelIngresarDatos.add(txtIdUsuario);
        txtIdUsuario.setBounds(164, 27, 280, 22);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.setEnabled(false);
        panelIngresarDatos.add(txtNombre);
        txtNombre.setBounds(164, 67, 280, 22);

        lblIdCliente.setText("ID:");
        panelIngresarDatos.add(lblIdCliente);
        lblIdCliente.setBounds(20, 30, 111, 14);

        lblNombre.setText("NOMBRE:");
        panelIngresarDatos.add(lblNombre);
        lblNombre.setBounds(20, 70, 111, 14);

        lblNombreUsuario.setText("NOMBRE DE USUARIO:");
        panelIngresarDatos.add(lblNombreUsuario);
        lblNombreUsuario.setBounds(20, 110, 140, 20);

        lblConfirmarPass.setText("CONFIRMAR:");
        panelIngresarDatos.add(lblConfirmarPass);
        lblConfirmarPass.setBounds(20, 180, 111, 14);

        btnGuardar.setText("GUARDAR");
        panelIngresarDatos.add(btnGuardar);
        btnGuardar.setBounds(140, 320, 100, 23);

        btnCancelar.setText("CANCELAR");
        panelIngresarDatos.add(btnCancelar);
        btnCancelar.setBounds(260, 320, 100, 23);

        txtNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreUsuario.setEnabled(false);
        panelIngresarDatos.add(txtNombreUsuario);
        txtNombreUsuario.setBounds(164, 107, 280, 22);

        lblTipoUsuario.setText("TIPO DE USUARIO:");
        panelIngresarDatos.add(lblTipoUsuario);
        lblTipoUsuario.setBounds(16, 218, 125, 14);

        cbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMINISTRADOR", "ASISTENTE" }));
        panelIngresarDatos.add(cbTipoUsuario);
        cbTipoUsuario.setBounds(164, 212, 280, 20);

        txtPassword.setText("jPasswordField1");
        panelIngresarDatos.add(txtPassword);
        txtPassword.setBounds(164, 147, 280, 21);

        txtPasswordConfirm.setText("jPasswordField1");
        panelIngresarDatos.add(txtPasswordConfirm);
        txtPasswordConfirm.setBounds(164, 174, 280, 20);

        lblPassword1.setText("PASSWORD:");
        panelIngresarDatos.add(lblPassword1);
        lblPassword1.setBounds(20, 150, 111, 14);

        getContentPane().add(panelIngresarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 67, 460, 366));

        panelDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        tableUsuarios = new javax.swing.JTable(){
            public boolean isCellEditable(int fila,int col){
                return false;
            }
        };
        tableUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableUsuarios.setFocusable(false);
        tableUsuarios.setRowMargin(4);
        tableUsuarios.getTableHeader().setReorderingAllowed(false);
        tableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsuariosMouseClicked(evt);
            }
        });
        panelTableClientes.setViewportView(tableUsuarios);

        lblBuscarPorNombre.setText("BUSCAR POR NOMBRE:");

        btnRefrescar.setText("REFRESCAR");

        btnEliminar.setText("ELIMINAR");

        lblFlag.setText("0");

        btnBuscar.setText("BUSCAR");

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTableClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleLayout.createSequentialGroup()
                        .addComponent(lblFlag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefrescar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleLayout.createSequentialGroup()
                        .addComponent(lblBuscarPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarPorNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap())
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarPorNombre)
                    .addComponent(txtBuscarPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTableClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRefrescar)
                            .addComponent(btnEliminar)))
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFlag)))
                .addContainerGap())
        );

        getContentPane().add(panelDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 67, 630, -1));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setText("MANTENIMIENTO DE USUARIOS");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 407, -1));

        menuArchivo.setText("Archivo");

        btnCerrar.setText("Cerrar");
        menuArchivo.add(btnCerrar);

        MenuBar.add(menuArchivo);

        menuAcciones.setText("Acciones");

        menuNuevoRegistro.setText("Nuevo Registro");
        menuAcciones.add(menuNuevoRegistro);

        menuEditarRegistro.setText("Editar Registro");
        menuAcciones.add(menuEditarRegistro);

        MenuBar.add(menuAcciones);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUsuariosMouseClicked
        try {
            int fila = tableUsuarios.getSelectedRow();
            txtIdUsuario.setText(tableUsuarios.getValueAt(fila, 0).toString());
            txtNombre.setText(tableUsuarios.getValueAt(fila, 1).toString());
            txtNombreUsuario.setText(tableUsuarios.getValueAt(fila, 2).toString());
            txtPassword.setText(tableUsuarios.getValueAt(fila, 3).toString());
            txtPasswordConfirm.setText(tableUsuarios.getValueAt(fila, 3).toString());
            cbTipoUsuario.setSelectedItem(tableUsuarios.getValueAt(fila, 4).toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR AL SELECCIONAR UN REGISTRO : " + ex.getMessage());
        }
    }//GEN-LAST:event_tableUsuariosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JMenuItem btnCerrar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnRefrescar;
    public javax.swing.JComboBox cbTipoUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblBuscarPorNombre;
    private javax.swing.JLabel lblConfirmarPass;
    public javax.swing.JLabel lblFlag;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblTipoUsuario;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JMenu menuAcciones;
    private javax.swing.JMenu menuArchivo;
    public javax.swing.JMenuItem menuEditarRegistro;
    public javax.swing.JMenuItem menuNuevoRegistro;
    private javax.swing.JPanel panelDetalle;
    public javax.swing.JPanel panelIngresarDatos;
    private javax.swing.JScrollPane panelTableClientes;
    public javax.swing.JTable tableUsuarios;
    public javax.swing.JTextField txtBuscarPorNombre;
    public javax.swing.JTextField txtIdUsuario;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNombreUsuario;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JPasswordField txtPasswordConfirm;
    // End of variables declaration//GEN-END:variables
}
