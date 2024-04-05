package vista;

import javax.swing.JOptionPane;

public class frmProveedor extends javax.swing.JInternalFrame {

    public frmProveedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        panelIngresarDatos = new javax.swing.JPanel();
        txtIdProveedor = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lbIdProveedor = new javax.swing.JLabel();
        lblNombreProveedor = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        panelDireccion = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblNombreEmpresa = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        panelDetalle = new javax.swing.JPanel();
        panelTableClientes = new javax.swing.JScrollPane();
        tableProveedores = new javax.swing.JTable();
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

        txtIdProveedor.setEditable(false);
        txtIdProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtNombreProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreProveedor.setEnabled(false);

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTelefono.setEnabled(false);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.setEnabled(false);

        lbIdProveedor.setText("ID:");

        lblNombreProveedor.setText("NOMBRE:");

        lblDireccion.setText("DIRECCIÓN:");

        lblTelefono.setText("TELEFONO:");

        lblEmail.setText("E-MAIL");

        txtDireccion.setColumns(20);
        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDireccion.setRows(5);
        txtDireccion.setEnabled(false);
        panelDireccion.setViewportView(txtDireccion);

        btnGuardar.setText("GUARDAR");

        btnCancelar.setText("CANCELAR");

        lblNombreEmpresa.setText("EMPRESA:");

        txtNombreEmpresa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreEmpresa.setEnabled(false);

        javax.swing.GroupLayout panelIngresarDatosLayout = new javax.swing.GroupLayout(panelIngresarDatos);
        panelIngresarDatos.setLayout(panelIngresarDatosLayout);
        panelIngresarDatosLayout.setHorizontalGroup(
            panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(45, 45, 45))
            .addGroup(panelIngresarDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIngresarDatosLayout.createSequentialGroup()
                        .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombreProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(lbIdProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIngresarDatosLayout.createSequentialGroup()
                                .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelDireccion))
                                .addGap(10, 10, 10))
                            .addGroup(panelIngresarDatosLayout.createSequentialGroup()
                                .addComponent(txtTelefono)
                                .addContainerGap())))
                    .addGroup(panelIngresarDatosLayout.createSequentialGroup()
                        .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelIngresarDatosLayout.createSequentialGroup()
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelIngresarDatosLayout.createSequentialGroup()
                                .addComponent(lblNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(txtNombreEmpresa)))
                        .addContainerGap())))
        );
        panelIngresarDatosLayout.setVerticalGroup(
            panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresarDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIdProveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreProveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccion)
                    .addComponent(panelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreEmpresa))
                .addGap(16, 16, 16)
                .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        lblEmail.getAccessibleContext().setAccessibleName("E-MAIL:");

        getContentPane().add(panelIngresarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 62, -1, -1));

        panelDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        tableProveedores = new javax.swing.JTable(){
            public boolean isCellEditable(int fila,int col){
                return false;
            }
        };
        tableProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableProveedores.setFocusable(false);
        tableProveedores.setRowMargin(4);
        tableProveedores.getTableHeader().setReorderingAllowed(false);
        tableProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProveedoresMouseClicked(evt);
            }
        });
        panelTableClientes.setViewportView(tableProveedores);

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
                    .addComponent(panelTableClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
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
                .addComponent(panelTableClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
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

        getContentPane().add(panelDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 62, -1, -1));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setText("MANTENIMIENTO DE PROVEEDORES");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 15, 580, -1));

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

    private void tableProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProveedoresMouseClicked
        try {
            int fila = tableProveedores.getSelectedRow();
            txtIdProveedor.setText(tableProveedores.getValueAt(fila, 0).toString());
            txtNombreProveedor.setText(tableProveedores.getValueAt(fila, 1).toString());
            txtDireccion.setText(tableProveedores.getValueAt(fila, 2).toString());
            txtNombreEmpresa.setText(tableProveedores.getValueAt(fila, 3).toString());
            txtTelefono.setText(tableProveedores.getValueAt(fila, 4).toString());
            txtEmail.setText(tableProveedores.getValueAt(fila, 5).toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR AL SELECCIONAR UN REGISTRO : " + ex.getMessage());
        }
    }//GEN-LAST:event_tableProveedoresMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JMenuItem btnCerrar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnRefrescar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lbIdProveedor;
    private javax.swing.JLabel lblBuscarPorNombre;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmail;
    public javax.swing.JLabel lblFlag;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblNombreProveedor;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JMenu menuAcciones;
    private javax.swing.JMenu menuArchivo;
    public javax.swing.JMenuItem menuEditarRegistro;
    public javax.swing.JMenuItem menuNuevoRegistro;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JScrollPane panelDireccion;
    public javax.swing.JPanel panelIngresarDatos;
    private javax.swing.JScrollPane panelTableClientes;
    public javax.swing.JTable tableProveedores;
    public javax.swing.JTextField txtBuscarPorNombre;
    public javax.swing.JTextArea txtDireccion;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtIdProveedor;
    public javax.swing.JTextField txtNombreEmpresa;
    public javax.swing.JTextField txtNombreProveedor;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
