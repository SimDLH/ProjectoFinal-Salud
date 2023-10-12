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
public class Ordenes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ordenes
     */
    public Ordenes() {
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
        botonAtrasOrdenes = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuSacarOrden = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuPorFecha = new javax.swing.JMenuItem();
        jMenuPorAfiliado = new javax.swing.JMenuItem();
        jMenuPorPrestador = new javax.swing.JMenuItem();

        panelGradienteOrdenes.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradienteOrdenes.setkStartColor(new java.awt.Color(0, 153, 0));

        botonAtrasOrdenes.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasOrdenes.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasOrdenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso25bit.png"))); // NOI18N
        botonAtrasOrdenes.setText("Atrás");
        botonAtrasOrdenes.setBorderPainted(false);
        botonAtrasOrdenes.setContentAreaFilled(false);
        botonAtrasOrdenes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonAtrasOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasOrdenesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGradienteOrdenesLayout = new javax.swing.GroupLayout(panelGradienteOrdenes);
        panelGradienteOrdenes.setLayout(panelGradienteOrdenesLayout);
        panelGradienteOrdenesLayout.setHorizontalGroup(
            panelGradienteOrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradienteOrdenesLayout.createSequentialGroup()
                .addContainerGap(1132, Short.MAX_VALUE)
                .addComponent(botonAtrasOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelGradienteOrdenesLayout.setVerticalGroup(
            panelGradienteOrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradienteOrdenesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAtrasOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(541, Short.MAX_VALUE))
        );

        jMenu1.setText("Sacar Orden");

        jMenuSacarOrden.setText("Sacar Orden");
        jMenuSacarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSacarOrdenActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSacarOrden);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ordenes");

        jMenuPorFecha.setText("Ordenes Por Feha");
        jMenuPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPorFechaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuPorFecha);

        jMenuPorAfiliado.setText("Ordenes Por Afiliado");
        jMenu2.add(jMenuPorAfiliado);

        jMenuPorPrestador.setText("Ordenes Por Prestador");
        jMenu2.add(jMenuPorPrestador);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void botonAtrasOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasOrdenesActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasOrdenesActionPerformed

    private void jMenuSacarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSacarOrdenActionPerformed
        panelGradienteOrdenes.removeAll();
        panelGradienteOrdenes.repaint();
        SacarOrden sa = new SacarOrden();
        sa.setVisible(true);
        panelGradienteOrdenes.add(sa);
        panelGradienteOrdenes.setVisible(true);
    }//GEN-LAST:event_jMenuSacarOrdenActionPerformed

    private void jMenuPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPorFechaActionPerformed
        panelGradienteOrdenes.removeAll();
        panelGradienteOrdenes.repaint();
        OrdenPorFecha opf = new OrdenPorFecha();
        opf.setVisible(true);
        panelGradienteOrdenes.add(opf);
        panelGradienteOrdenes.setVisible(true);
    }//GEN-LAST:event_jMenuPorFechaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasOrdenes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuPorAfiliado;
    private javax.swing.JMenuItem jMenuPorFecha;
    private javax.swing.JMenuItem jMenuPorPrestador;
    private javax.swing.JMenuItem jMenuSacarOrden;
    private keeptoo.KGradientPanel panelGradienteOrdenes;
    // End of variables declaration//GEN-END:variables
}
