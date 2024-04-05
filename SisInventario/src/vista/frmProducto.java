package vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frmProducto extends javax.swing.JInternalFrame {

    public frmProducto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        panelIngresarDatos = new javax.swing.JPanel();
        txtIdProducto = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        lblIdProducto = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblUnidades = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNombreProveedor = new javax.swing.JTextField();
        lblFechaCaducidad = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        ckActivo = new javax.swing.JCheckBox();
        txtUnidades = new javax.swing.JSpinner();
        dcFechaCaducidad = new com.toedter.calendar.JDateChooser();
        lblProveedor = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox();
        lblActivo = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtIdProveedor = new javax.swing.JTextField();
        btnBuscarProveedor = new javax.swing.JButton();
        panelDetalle = new javax.swing.JPanel();
        panelTableProductos = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        lblBuscarPor = new javax.swing.JLabel();
        txtBuscarPor = new javax.swing.JTextField();
        btnRefrescar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblFlag = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        cbCriterioBusqueda = new javax.swing.JComboBox();
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

        txtIdProducto.setEditable(false);
        txtIdProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelIngresarDatos.add(txtIdProducto);
        txtIdProducto.setBounds(160, 30, 280, 22);

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelIngresarDatos.add(txtDescripcion);
        txtDescripcion.setBounds(160, 70, 280, 22);

        lblIdProducto.setText("ID:");
        panelIngresarDatos.add(lblIdProducto);
        lblIdProducto.setBounds(20, 30, 111, 16);

        lblDescripcion.setText("DESCRIPCIÓN:");
        panelIngresarDatos.add(lblDescripcion);
        lblDescripcion.setBounds(20, 70, 111, 16);

        lblUnidades.setText("CANT. UNIDADES:");
        panelIngresarDatos.add(lblUnidades);
        lblUnidades.setBounds(20, 110, 140, 20);

        lblPrecio.setText("PRECIO ($):");
        panelIngresarDatos.add(lblPrecio);
        lblPrecio.setBounds(20, 210, 111, 20);

        btnGuardar.setText("GUARDAR");
        panelIngresarDatos.add(btnGuardar);
        btnGuardar.setBounds(130, 400, 100, 23);

        btnCancelar.setText("CANCELAR");
        panelIngresarDatos.add(btnCancelar);
        btnCancelar.setBounds(250, 400, 100, 23);

        txtNombreProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreProveedor.setEnabled(false);
        panelIngresarDatos.add(txtNombreProveedor);
        txtNombreProveedor.setBounds(190, 350, 160, 22);

        lblFechaCaducidad.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblFechaCaducidad.setText("FECHA DE CADUCIDAD:");
        panelIngresarDatos.add(lblFechaCaducidad);
        lblFechaCaducidad.setBounds(20, 290, 130, 30);

        lblCategoria.setText("CATEGORÍA:");
        panelIngresarDatos.add(lblCategoria);
        lblCategoria.setBounds(20, 150, 111, 16);

        ckActivo.setText("SI / NO");
        panelIngresarDatos.add(ckActivo);
        ckActivo.setBounds(160, 250, 220, 20);
        panelIngresarDatos.add(txtUnidades);
        txtUnidades.setBounds(160, 100, 80, 30);

        dcFechaCaducidad.setDateFormatString("yyyy-MM-dd");
        panelIngresarDatos.add(dcFechaCaducidad);
        dcFechaCaducidad.setBounds(160, 290, 280, 30);

        lblProveedor.setText("PROVEEDOR:");
        panelIngresarDatos.add(lblProveedor);
        lblProveedor.setBounds(20, 350, 125, 20);

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VIDEO JUEGOS", "ELECTRODOMESTICOS", "ARTICULOS DE HOGAR", "OTRO" }));
        panelIngresarDatos.add(cbCategoria);
        cbCategoria.setBounds(160, 140, 280, 30);

        lblActivo.setText("ACTIVO:");
        panelIngresarDatos.add(lblActivo);
        lblActivo.setBounds(20, 250, 125, 20);

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelIngresarDatos.add(txtPrecio);
        txtPrecio.setBounds(160, 210, 280, 22);

        txtIdProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdProveedor.setEnabled(false);
        panelIngresarDatos.add(txtIdProveedor);
        txtIdProveedor.setBounds(160, 350, 20, 22);

        btnBuscarProveedor.setText("BUSCAR");
        panelIngresarDatos.add(btnBuscarProveedor);
        btnBuscarProveedor.setBounds(360, 350, 80, 23);

        getContentPane().add(panelIngresarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 67, 460, 460));

        panelDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        tableProductos = new javax.swing.JTable(){
            public boolean isCellEditable(int fila,int col){
                return false;
            }
        };
        tableProductos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableProductos.setFocusable(false);
        tableProductos.setRowMargin(4);
        tableProductos.getTableHeader().setReorderingAllowed(false);
        tableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductosMouseClicked(evt);
            }
        });
        panelTableProductos.setViewportView(tableProductos);

        lblBuscarPor.setText("BUSCAR POR:");

        btnRefrescar.setText("REFRESCAR");

        btnEliminar.setText("ELIMINAR");

        lblFlag.setText("0");

        btnBuscar.setText("BUSCAR");

        cbCriterioBusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "productos.descripcion", "productos.categoria", "proveedores.nombreProveedor" }));

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addComponent(lblFlag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefrescar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addComponent(panelTableProductos)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleLayout.createSequentialGroup()
                        .addComponent(lblBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbCriterioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addGap(22, 22, 22))
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarPor)
                    .addComponent(txtBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(cbCriterioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTableProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFlag)
                    .addComponent(btnRefrescar)
                    .addComponent(btnEliminar))
                .addGap(304, 304, 304))
        );

        getContentPane().add(panelDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 67, 650, 460));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setText("REGISTRAR PRODUCTOS");
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

    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductosMouseClicked
        try {
            int fila = tableProductos.getSelectedRow();
            txtIdProducto.setText(tableProductos.getValueAt(fila, 0).toString());
            txtDescripcion.setText(tableProductos.getValueAt(fila, 1).toString());
            
            int unidades = Integer.valueOf(tableProductos.getValueAt(fila, 2).toString());
            txtUnidades.setValue(unidades);
            
            cbCategoria.setSelectedItem(tableProductos.getValueAt(fila, 3).toString());
            txtPrecio.setText(tableProductos.getValueAt(fila, 4).toString());
            int activo = Integer.valueOf(tableProductos.getValueAt(fila, 5).toString());
            
            if (activo != 1) {
                ckActivo.setSelected(false);
            } else {
                ckActivo.setSelected(true);
            }
            
            String dateSelected = tableProductos.getValueAt(fila, 6).toString();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateSelected);  
            dcFechaCaducidad.setDate(date);
            
            txtIdProveedor.setText(tableProductos.getValueAt(fila, 7).toString());
            txtNombreProveedor.setText(tableProductos.getValueAt(fila, 8).toString());
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "ERROR AL SELECCIONAR UN REGISTRO : " + ex.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(frmProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tableProductosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnBuscarProveedor;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JMenuItem btnCerrar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnRefrescar;
    public javax.swing.JComboBox cbCategoria;
    public javax.swing.JComboBox cbCriterioBusqueda;
    public javax.swing.JCheckBox ckActivo;
    public com.toedter.calendar.JDateChooser dcFechaCaducidad;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblActivo;
    private javax.swing.JLabel lblBuscarPor;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFechaCaducidad;
    public javax.swing.JLabel lblFlag;
    private javax.swing.JLabel lblIdProducto;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUnidades;
    private javax.swing.JMenu menuAcciones;
    private javax.swing.JMenu menuArchivo;
    public javax.swing.JMenuItem menuEditarRegistro;
    public javax.swing.JMenuItem menuNuevoRegistro;
    private javax.swing.JPanel panelDetalle;
    public javax.swing.JPanel panelIngresarDatos;
    private javax.swing.JScrollPane panelTableProductos;
    public javax.swing.JTable tableProductos;
    public javax.swing.JTextField txtBuscarPor;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtIdProducto;
    public javax.swing.JTextField txtIdProveedor;
    public javax.swing.JTextField txtNombreProveedor;
    public javax.swing.JTextField txtPrecio;
    public javax.swing.JSpinner txtUnidades;
    // End of variables declaration//GEN-END:variables
}
