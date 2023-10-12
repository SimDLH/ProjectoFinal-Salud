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
public class Especialidades extends javax.swing.JInternalFrame {

    /**
     * Creates new form Especialidades
     */
    public Especialidades() {
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
        botonAtrasEspecialidades = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        panelGradienteOrdenes.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradienteOrdenes.setkStartColor(new java.awt.Color(0, 153, 0));

        botonAtrasEspecialidades.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasEspecialidades.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso25bit.png"))); // NOI18N
        botonAtrasEspecialidades.setText("Atrás");
        botonAtrasEspecialidades.setBorderPainted(false);
        botonAtrasEspecialidades.setContentAreaFilled(false);
        botonAtrasEspecialidades.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonAtrasEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasEspecialidadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGradienteOrdenesLayout = new javax.swing.GroupLayout(panelGradienteOrdenes);
        panelGradienteOrdenes.setLayout(panelGradienteOrdenesLayout);
        panelGradienteOrdenesLayout.setHorizontalGroup(
            panelGradienteOrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradienteOrdenesLayout.createSequentialGroup()
                .addContainerGap(1132, Short.MAX_VALUE)
                .addComponent(botonAtrasEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelGradienteOrdenesLayout.setVerticalGroup(
            panelGradienteOrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradienteOrdenesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAtrasEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(530, Short.MAX_VALUE))
        );

        jMenu1.setText("Control de especialidades");

        jMenuItem1.setText("Agregar una especialidad");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Borrar una especialidad");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Lista de especialidades");
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

    private void botonAtrasEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasEspecialidadesActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasEspecialidadesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        panelGradienteOrdenes.removeAll();
        panelGradienteOrdenes.repaint();
        EspecialidadesAgregar ea=new EspecialidadesAgregar();
        panelGradienteOrdenes.add(ea);
        ea.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        panelGradienteOrdenes.removeAll();
        panelGradienteOrdenes.repaint();
        EspecialidadBorrar eb=new EspecialidadBorrar();
        panelGradienteOrdenes.add(eb);
        eb.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasEspecialidades;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private keeptoo.KGradientPanel panelGradienteOrdenes;
    // End of variables declaration//GEN-END:variables
}
