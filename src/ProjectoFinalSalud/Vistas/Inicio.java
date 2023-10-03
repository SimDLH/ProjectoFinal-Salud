
package ProjectoFinalSalud.Vistas;

import java.awt.event.MouseWheelListener;

public class Inicio extends javax.swing.JFrame {
        
    public Inicio() {
        
        initComponents();
        textoAreaActivos.setVisible(false);
        textoAreaEspecial.setVisible(false);
        textoAreaOrden.setVisible(false);
        
        
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEscritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        etiquetaLogo = new javax.swing.JLabel();
        etiquetaPubli = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        etiquetaNumDeEmerg = new javax.swing.JLabel();
        botonUsuario = new javax.swing.JButton();
        botonActivos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoAreaActivos = new javax.swing.JTextArea();
        botonEspecial = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoAreaEspecial = new javax.swing.JTextArea();
        botonOrden = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textoAreaOrden = new javax.swing.JTextArea();
        jScrollBar1 = new javax.swing.JScrollBar();
        etiquetaBanners = new javax.swing.JLabel();
        etiquetaBannerAbajo = new javax.swing.JLabel();
        etiquetaUltimo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEscritorio.setBackground(new java.awt.Color(255, 255, 255));
        panelEscritorio.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etiquetaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/MasSaludLogo.png"))); // NOI18N

        etiquetaPubli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/MasSaludImagenMasPequeña.png"))); // NOI18N

        separador1.setBackground(new java.awt.Color(0, 0, 0));
        separador1.setForeground(new java.awt.Color(0, 0, 0));

        etiquetaNumDeEmerg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/IconoEmergencias.png"))); // NOI18N

        botonUsuario.setBackground(new java.awt.Color(255, 255, 255));
        botonUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Usuario.png"))); // NOI18N
        botonUsuario.setText("Mi Cuenta");
        botonUsuario.setBorderPainted(false);
        botonUsuario.setContentAreaFilled(false);
        botonUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonUsuario.setOpaque(true);
        botonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUsuarioActionPerformed(evt);
            }
        });

        botonActivos.setBackground(new java.awt.Color(255, 255, 255));
        botonActivos.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botonActivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Activos.png"))); // NOI18N
        botonActivos.setText("Afiliados y Prestadores Activos");
        botonActivos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonActivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonActivosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonActivosMouseExited(evt);
            }
        });
        botonActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActivosActionPerformed(evt);
            }
        });

        textoAreaActivos.setColumns(20);
        textoAreaActivos.setRows(5);
        textoAreaActivos.setText("Consulta nuestra \nlista de afiliados \ny prestadores \nactivos");
        jScrollPane2.setViewportView(textoAreaActivos);

        botonEspecial.setBackground(new java.awt.Color(255, 255, 255));
        botonEspecial.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botonEspecial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Especialidades.png"))); // NOI18N
        botonEspecial.setText("Especialidades");
        botonEspecial.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonEspecial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEspecialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEspecialMouseExited(evt);
            }
        });
        botonEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEspecialActionPerformed(evt);
            }
        });

        textoAreaEspecial.setEditable(false);
        textoAreaEspecial.setColumns(20);
        textoAreaEspecial.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        textoAreaEspecial.setRows(5);
        textoAreaEspecial.setText("Consulta que especialidades \ntenemos disponibles \npara vos !");
        jScrollPane1.setViewportView(textoAreaEspecial);

        botonOrden.setBackground(new java.awt.Color(255, 255, 255));
        botonOrden.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botonOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Ordenes.png"))); // NOI18N
        botonOrden.setText("Ordenes De Consulta");
        botonOrden.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonOrdenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonOrdenMouseExited(evt);
            }
        });
        botonOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenActionPerformed(evt);
            }
        });

        textoAreaOrden.setColumns(20);
        textoAreaOrden.setRows(5);
        textoAreaOrden.setText("Tus ordenes de consulta\ndispuestas según tus\nnecesidades !");
        jScrollPane3.setViewportView(textoAreaOrden);

        etiquetaBanners.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaBanners.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/baners informativos.png"))); // NOI18N

        etiquetaBannerAbajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BannerDeAbajo.png"))); // NOI18N

        etiquetaUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Vista De Trabajo 0--arreglarrr.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiquetaLogo)
                        .addGap(323, 323, 323)
                        .addComponent(etiquetaNumDeEmerg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonUsuario)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(separador1)
                        .addGap(29, 29, 29))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiquetaBannerAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)
                                .addComponent(botonEspecial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etiquetaPubli))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(etiquetaBanners, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(etiquetaUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)))
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonUsuario)
                    .addComponent(etiquetaNumDeEmerg, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaLogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiquetaPubli)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonActivos)
                            .addComponent(botonEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaBanners, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaBannerAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelEscritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelEscritorioLayout = new javax.swing.GroupLayout(panelEscritorio);
        panelEscritorio.setLayout(panelEscritorioLayout);
        panelEscritorioLayout.setHorizontalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelEscritorioLayout.setVerticalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panelEscritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenActionPerformed
        Ordenes orden = new Ordenes();
        panelEscritorio.add(orden);
        orden.setVisible(true);
    }//GEN-LAST:event_botonOrdenActionPerformed

    private void botonOrdenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonOrdenMouseExited
        textoAreaOrden.setVisible(false);
    }//GEN-LAST:event_botonOrdenMouseExited

    private void botonOrdenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonOrdenMouseEntered
        textoAreaOrden.setVisible(true);
    }//GEN-LAST:event_botonOrdenMouseEntered

    private void botonEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEspecialActionPerformed
        Especialidades esp = new Especialidades();
        panelEscritorio.add(esp);
        esp.setVisible(true);
    }//GEN-LAST:event_botonEspecialActionPerformed

    private void botonEspecialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEspecialMouseExited
        textoAreaEspecial.setVisible(false);
    }//GEN-LAST:event_botonEspecialMouseExited

    private void botonEspecialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEspecialMouseEntered
        textoAreaEspecial.setVisible(true);
    }//GEN-LAST:event_botonEspecialMouseEntered

    private void botonActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActivosActionPerformed
        AfiliadosPrestadoresActivos activos = new AfiliadosPrestadoresActivos();
        panelEscritorio.add(activos);
        activos.setVisible(true);
    }//GEN-LAST:event_botonActivosActionPerformed

    private void botonActivosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActivosMouseExited
        textoAreaActivos.setVisible(false);
    }//GEN-LAST:event_botonActivosMouseExited

    private void botonActivosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActivosMouseEntered
        textoAreaActivos.setVisible(true);
    }//GEN-LAST:event_botonActivosMouseEntered

    private void botonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUsuarioActionPerformed
        Cuentas cuentas = new Cuentas();
        panelEscritorio.add(cuentas);
        cuentas.setVisible(true);
    }//GEN-LAST:event_botonUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActivos;
    private javax.swing.JButton botonEspecial;
    private javax.swing.JButton botonOrden;
    private javax.swing.JButton botonUsuario;
    private javax.swing.JLabel etiquetaBannerAbajo;
    private javax.swing.JLabel etiquetaBanners;
    private javax.swing.JLabel etiquetaLogo;
    private javax.swing.JLabel etiquetaNumDeEmerg;
    private javax.swing.JLabel etiquetaPubli;
    private javax.swing.JLabel etiquetaUltimo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDesktopPane panelEscritorio;
    private javax.swing.JSeparator separador1;
    private javax.swing.JTextArea textoAreaActivos;
    private javax.swing.JTextArea textoAreaEspecial;
    private javax.swing.JTextArea textoAreaOrden;
    // End of variables declaration//GEN-END:variables
}
