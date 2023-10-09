/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectoFinalSalud.Vistas;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author JOSE
 */
public class Consultas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Consultas
     */
    public Consultas() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradienteOrdenes = new keeptoo.KGradientPanel();
        botonAtrasConsultas = new javax.swing.JButton();

        panelGradienteOrdenes.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradienteOrdenes.setkStartColor(new java.awt.Color(0, 153, 0));

        botonAtrasConsultas.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasConsultas.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso25bit.png"))); // NOI18N
        botonAtrasConsultas.setText("Atrás");
        botonAtrasConsultas.setBorderPainted(false);
        botonAtrasConsultas.setContentAreaFilled(false);
        botonAtrasConsultas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonAtrasConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasConsultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGradienteOrdenesLayout = new javax.swing.GroupLayout(panelGradienteOrdenes);
        panelGradienteOrdenes.setLayout(panelGradienteOrdenesLayout);
        panelGradienteOrdenesLayout.setHorizontalGroup(
            panelGradienteOrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradienteOrdenesLayout.createSequentialGroup()
                .addContainerGap(1132, Short.MAX_VALUE)
                .addComponent(botonAtrasConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelGradienteOrdenesLayout.setVerticalGroup(
            panelGradienteOrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradienteOrdenesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAtrasConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(551, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradienteOrdenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradienteOrdenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(315, 200, 1260, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasConsultasActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasConsultasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasConsultas;
    private keeptoo.KGradientPanel panelGradienteOrdenes;
    // End of variables declaration//GEN-END:variables
}