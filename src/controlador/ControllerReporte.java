/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import helpers.Helpers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import modelo.ProductoDAO;
import vista.frmProductosPorFechaCaducidad;

/**
 *
 * @author Hersann Fonseca
 */
public class ControllerReporte implements ActionListener {

    Helpers helpers = new Helpers();
    ProductoDAO productoDAO = new ProductoDAO();
    frmProductosPorFechaCaducidad vistaReporte = new frmProductosPorFechaCaducidad();
    
    public ControllerReporte (frmProductosPorFechaCaducidad frm) {
        this.vistaReporte = frm;
        this.vistaReporte.btnCerrar.addActionListener(this);
        this.vistaReporte.btnBuscar.addActionListener(this);
        this.vistaReporte.btnImprimir.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaReporte.btnCerrar) {
            vistaReporte.hide();
        }
        if (e.getSource() == vistaReporte.btnBuscar) {
           filtrarTablaProductosPorFechaCaducidad(vistaReporte.tableProductos, helpers.convertDate(vistaReporte.dtpFechaInicial.getDate()), helpers.convertDate(vistaReporte.dtpFechaFinal.getDate()));
        }
        if (e.getSource() == vistaReporte.btnImprimir) {
            try {
                helpers.exportarExcel(vistaReporte.tableProductos, "informe");
            } catch (IOException ex) {
                Logger.getLogger(ControllerReporte.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void filtrarTablaProductosPorFechaCaducidad(JTable tabla, Date inicio, Date fin) {
        productoDAO.filtrarTablaProductosPorFechaCaducidad(tabla, inicio, fin);
        helpers.centrarCeldas(tabla);
    }
    
    public void iniciar(){
        try {
            vistaReporte.dtpFechaInicial.setDate(helpers.fechaActual());
            vistaReporte.dtpFechaFinal.setDate(helpers.fechaActual());
        } catch (ParseException ex) {
            Logger.getLogger(ControllerReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        filtrarTablaProductosPorFechaCaducidad(vistaReporte.tableProductos, helpers.convertDate(vistaReporte.dtpFechaInicial.getDate()), helpers.convertDate(vistaReporte.dtpFechaFinal.getDate()));
    }
}
