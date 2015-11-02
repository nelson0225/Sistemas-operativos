package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Esta clase define el panel donse se simularán los procesos.
 * @author: Camilo Rodríguez
 * @author: Nelson Barreto
 * @version: 26/10/15
 */
public class PanelSimulacion extends JPanel {
    //Campos de la clase
    private DefaultTableModel itemTablaProceso;
    private DefaultTableModel itemTablaProcesoAtendidos;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnBloquear;
    private javax.swing.JButton btnForzarBloqueo;

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbnMostrarProceso;
    private javax.swing.JLabel lbnTiempoMostrar;
    private javax.swing.JLabel lbnTotalEjecucion;
    private javax.swing.JLabel lbnTiempoBLoqueado;
    private javax.swing.JPanel panelBtnAcciones;
    private javax.swing.JPanel panelMostrarProceso;
    private javax.swing.JPanel panelProcesosAtendidos;
    private javax.swing.JPanel panelTablaProceso;
    private javax.swing.JTable tablaProcesos;
    private javax.swing.JTable tablaProcesosAtendidos;
    private javax.swing.JTextField txtBloquear;
    
    /**
     * Constructor para iniciar metodo inicio
     */
    public  PanelSimulacion(){
        inicio();
    }
    /**
     * Método inicia todos los elementos del panel.
     */
    public void inicio() {
        itemTablaProceso =new DefaultTableModel();
        itemTablaProcesoAtendidos=new DefaultTableModel();
        panelTablaProceso = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBloquear= new javax.swing.JTextField();
        txtBloquear.setSize(60,40);
        tablaProcesos = new javax.swing.JTable();
        panelMostrarProceso = new javax.swing.JPanel();
        lbnMostrarProceso = new javax.swing.JLabel();
        panelBtnAcciones = new javax.swing.JPanel();
        btnEjecutar = new javax.swing.JButton();
        btnBloquear = new javax.swing.JButton();
        btnForzarBloqueo = new javax.swing.JButton();
        lbnTiempoMostrar = new javax.swing.JLabel();
        lbnTiempoBLoqueado = new javax.swing.JLabel();
        lbnTotalEjecucion = new javax.swing.JLabel();
        panelProcesosAtendidos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProcesosAtendidos = new javax.swing.JTable();


        this.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        this.setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        panelTablaProceso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "TABLAPROCESOS"));
        panelTablaProceso.setLayout(new javax.swing.BoxLayout(panelTablaProceso, javax.swing.BoxLayout.LINE_AXIS));


        itemTablaProceso.addColumn("NOMBRE PROCESO");
        itemTablaProceso.addColumn("TIEMPO");
        lbnTotalEjecucion.setText("TIEMPO TOTAL DE EJECUCION= ");
        tablaProcesos.setModel(itemTablaProceso);
        jScrollPane2.setViewportView(tablaProcesos);

        panelTablaProceso.add(jScrollPane2);

        this.add(panelTablaProceso);

        panelMostrarProceso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PROCESO POR ATENDER"));

        //lbnMostrarProceso.setText("Mostrar proceso");
        lbnMostrarProceso.setForeground(Color.red);

        javax.swing.GroupLayout panelMostrarProcesoLayout = new javax.swing.GroupLayout(panelMostrarProceso);
        panelMostrarProceso.setLayout(panelMostrarProcesoLayout);
        panelMostrarProcesoLayout.setHorizontalGroup(
                panelMostrarProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelMostrarProcesoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbnMostrarProceso)
                                .addContainerGap(371, Short.MAX_VALUE))
        );
        panelMostrarProcesoLayout.setVerticalGroup(
                panelMostrarProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelMostrarProcesoLayout.createSequentialGroup()
                                .addComponent(lbnMostrarProceso)
                                .addGap(0, 7, Short.MAX_VALUE))
        );

        this.add(panelMostrarProceso);

        panelBtnAcciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnEjecutar.setText("EJECUTAR");
        btnBloquear.setText("BLOQUEAR");
        btnForzarBloqueo.setText("FORZAR BLOQUEO");
        lbnTiempoMostrar.setText("TIEMPO DEL PROCESO");
        lbnTiempoBLoqueado.setText("TIEMPO BLOQUEADO");

        javax.swing.GroupLayout panelBtnAccionesLayout = new javax.swing.GroupLayout(panelBtnAcciones);
        panelBtnAcciones.setLayout(panelBtnAccionesLayout);
        panelBtnAccionesLayout.setHorizontalGroup(
                panelBtnAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBtnAccionesLayout.createSequentialGroup()
                                .addComponent(btnEjecutar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBloquear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnForzarBloqueo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbnTiempoBLoqueado, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbnTiempoMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))

        );
        panelBtnAccionesLayout.setVerticalGroup(
                panelBtnAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEjecutar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(btnBloquear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnForzarBloqueo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBloquear)
                        .addComponent(lbnTiempoBLoqueado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbnTiempoMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        this.add(panelBtnAcciones);
        panelProcesosAtendidos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PROCESOS ATENDIDOS"));
        panelProcesosAtendidos.setLayout(new javax.swing.BoxLayout(panelProcesosAtendidos, javax.swing.BoxLayout.LINE_AXIS));
        itemTablaProcesoAtendidos.addColumn("NOMBRE PROCESO");
        itemTablaProcesoAtendidos.addColumn("TIEMPO");
        itemTablaProcesoAtendidos.addColumn("TIEMPO BLOQUEO");
        itemTablaProcesoAtendidos.addColumn("TIEMPO EJECUCIÓN");
        itemTablaProcesoAtendidos.addColumn("INTERRUPCION");
        tablaProcesosAtendidos.setModel(itemTablaProcesoAtendidos);
        jScrollPane1.setViewportView(tablaProcesosAtendidos);
        panelProcesosAtendidos.add(jScrollPane1);

        this.add(panelProcesosAtendidos);
        this.add(lbnTotalEjecucion);
    }
    /**
     * Método que borra todos los valores en los labels.
     */
    public void borrarLbn(){
        lbnMostrarProceso.setText("");
        lbnTiempoBLoqueado.setText("");
        lbnTiempoMostrar.setText("");
        lbnTotalEjecucion.setText("");
    }
    /**
     * Método borra todos los datos en las filas.
     */
    public void borrarFilas(JTable tabla) {

        try {
            DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
            int filas=tabla.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
    public DefaultTableModel getItemTablaProceso() {
        return itemTablaProceso;
    }

    public void setItemTablaProceso(DefaultTableModel itemTablaProceso) {
        this.itemTablaProceso = itemTablaProceso;
    }

    public DefaultTableModel getItemTablaProcesoAtendidos() {
        return itemTablaProcesoAtendidos;
    }

    public void setItemTablaProcesoAtendidos(DefaultTableModel itemTablaProcesoAtendidos) {
        this.itemTablaProcesoAtendidos = itemTablaProcesoAtendidos;
    }

    public JButton getBtnEjecutar() {
        return btnEjecutar;
    }

    public void setBtnEjecutar(JButton btnEjecutar) {
        this.btnEjecutar = btnEjecutar;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JLabel getLbnMostrarProceso() {
        return lbnMostrarProceso;
    }

    public void setLbnMostrarProceso(JLabel lbnMostrarProceso) {
        this.lbnMostrarProceso = lbnMostrarProceso;
    }

    public JLabel getLbnTiempoMostrar() {
        return lbnTiempoMostrar;
    }

    public void setLbnTiempoMostrar(JLabel lbnTiempoMostrar) {
        this.lbnTiempoMostrar = lbnTiempoMostrar;
    }

    public JPanel getPanelBtnAcciones() {
        return panelBtnAcciones;
    }

    public void setPanelBtnAcciones(JPanel panelBtnAcciones) {
        this.panelBtnAcciones = panelBtnAcciones;
    }

    public JPanel getPanelMostrarProceso() {
        return panelMostrarProceso;
    }

    public void setPanelMostrarProceso(JPanel panelMostrarProceso) {
        this.panelMostrarProceso = panelMostrarProceso;
    }

    public JPanel getPanelProcesosAtendidos() {
        return panelProcesosAtendidos;
    }

    public void setPanelProcesosAtendidos(JPanel panelProcesosAtendidos) {
        this.panelProcesosAtendidos = panelProcesosAtendidos;
    }

    public JPanel getPanelTablaProceso() {
        return panelTablaProceso;
    }

    public void setPanelTablaProceso(JPanel panelTablaProceso) {
        this.panelTablaProceso = panelTablaProceso;
    }

    public JTable getTablaProcesos() {
        return tablaProcesos;
    }

    public void setTablaProcesos(JTable tablaProcesos) {
        this.tablaProcesos = tablaProcesos;
    }

    public JTable getTablaProcesosAtendidos() {
        return tablaProcesosAtendidos;
    }

    public void setTablaProcesosAtendidos(JTable tablaProcesosAtendidos) {
        this.tablaProcesosAtendidos = tablaProcesosAtendidos;
    }

    public JButton getBtnBloquear() {
        return btnBloquear;
    }

    public void setBtnBloquear(JButton btnBloquear) {
        this.btnBloquear = btnBloquear;
    }

    public JTextField getTxtBloquear() {
        return txtBloquear;
    }

    public JButton getBtnForzarBloqueo() {
        return btnForzarBloqueo;
    }

    public void setBtnForzarBloqueo(JButton btnForzarBloqueo) {
        this.btnForzarBloqueo = btnForzarBloqueo;
    }

    public JLabel getLbnTiempoBLoqueado() {
        return lbnTiempoBLoqueado;
    }

    public void setLbnTiempoBLoqueado(JLabel lbnTiempoBLoqueado) {
        this.lbnTiempoBLoqueado = lbnTiempoBLoqueado;
    }

    public JLabel getLbnTotalEjecucion() {
        return lbnTotalEjecucion;
    }

    public void setLbnTotalEjecucion(JLabel lbnTotalEjecucion) {
        this.lbnTotalEjecucion = lbnTotalEjecucion;
    }

    public void setTxtBloquear(JTextField txtBloquear) {
        this.txtBloquear = txtBloquear;
    }
}
