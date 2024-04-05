package vista;

public class frmProductosPorFechaCaducidad extends javax.swing.JInternalFrame {

    public frmProductosPorFechaCaducidad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu = new javax.swing.JMenu();
        panelDetalle = new javax.swing.JPanel();
        panelTableProductos = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        lblFechaInicial = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        dtpFechaInicial = new com.toedter.calendar.JDateChooser();
        lblFechaFinal = new javax.swing.JLabel();
        dtpFechaFinal = new com.toedter.calendar.JDateChooser();
        lblTitle = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        btnCerrar = new javax.swing.JMenuItem();

        jMenu.setText("jMenu1");

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        tableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductosMouseClicked(evt);
            }
        });
        panelTableProductos.setViewportView(tableProductos);

        lblFechaInicial.setText("Fecha Inicial:");

        btnImprimir.setText("Imprimir Reporte");

        btnBuscar.setText("BUSCAR");

        dtpFechaInicial.setDateFormatString("yyyy-MM-dd");

        lblFechaFinal.setText("Fecha Final:");

        dtpFechaFinal.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTableProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleLayout.createSequentialGroup()
                        .addComponent(lblFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtpFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtpFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnBuscar)))
                .addContainerGap())
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(dtpFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblFechaFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dtpFechaFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblFechaInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTableProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(btnImprimir)
                .addContainerGap())
        );

        getContentPane().add(panelDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 62, 910, -1));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setText("REPORTE DE PRODUCTOS POR FECHA DE CADUCIDAD");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 15, 890, -1));

        menuArchivo.setText("Archivo");

        btnCerrar.setText("Cerrar");
        menuArchivo.add(btnCerrar);

        MenuBar.add(menuArchivo);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductosMouseClicked
        
    }//GEN-LAST:event_tableProductosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JMenuItem btnCerrar;
    public javax.swing.JButton btnImprimir;
    public com.toedter.calendar.JDateChooser dtpFechaFinal;
    public com.toedter.calendar.JDateChooser dtpFechaInicial;
    private javax.swing.JMenu jMenu;
    private javax.swing.JLabel lblFechaFinal;
    private javax.swing.JLabel lblFechaInicial;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JScrollPane panelTableProductos;
    public javax.swing.JTable tableProductos;
    // End of variables declaration//GEN-END:variables
}
