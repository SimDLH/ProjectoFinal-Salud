
package ProjectoFinalSalud.Vistas;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class MasInformacion extends javax.swing.JInternalFrame {

    public MasInformacion() {
        
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

        panelGradienteMasInformacion = new keeptoo.KGradientPanel();
        botonAtrasMasInfo = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(975, 575));

        panelGradienteMasInformacion.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        panelGradienteMasInformacion.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradienteMasInformacion.setkStartColor(new java.awt.Color(0, 153, 0));
        panelGradienteMasInformacion.setPreferredSize(new java.awt.Dimension(975, 575));

        botonAtrasMasInfo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasMasInfo.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasMasInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso.png"))); // NOI18N
        botonAtrasMasInfo.setText("Atrás");
        botonAtrasMasInfo.setBorderPainted(false);
        botonAtrasMasInfo.setContentAreaFilled(false);
        botonAtrasMasInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtrasMasInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasMasInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGradienteMasInformacionLayout = new javax.swing.GroupLayout(panelGradienteMasInformacion);
        panelGradienteMasInformacion.setLayout(panelGradienteMasInformacionLayout);
        panelGradienteMasInformacionLayout.setHorizontalGroup(
            panelGradienteMasInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradienteMasInformacionLayout.createSequentialGroup()
                .addContainerGap(1081, Short.MAX_VALUE)
                .addComponent(botonAtrasMasInfo)
                .addContainerGap())
        );
        panelGradienteMasInformacionLayout.setVerticalGroup(
            panelGradienteMasInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradienteMasInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAtrasMasInfo)
                .addContainerGap(526, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradienteMasInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 1244, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradienteMasInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        setBounds(300, 140, 975, 575);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasMasInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasMasInfoActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasMasInfoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasMasInfo;
    private keeptoo.KGradientPanel panelGradienteMasInformacion;
    // End of variables declaration//GEN-END:variables
}