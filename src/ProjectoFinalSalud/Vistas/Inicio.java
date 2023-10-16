
package ProjectoFinalSalud.Vistas;

import java.awt.Component;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        
        initComponents();
        Bloquear();
        
        setExtendedState(this.MAXIMIZED_BOTH);
        setTitle("MásSalud");
    }
    
    public void Bloquear() {
        
        for(Component a:panelGradBotPrincipales.getComponents()){
            a.setEnabled(false);
        }
    }
    
    public void Desbloquear() {
        
        for(Component b:panelGradBotPrincipales.getComponents()){
            b.setEnabled(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEscritorio = new javax.swing.JDesktopPane();
        panelGradPrincipal = new keeptoo.KGradientPanel();
        separadorMenuPrincipal1 = new javax.swing.JSeparator();
        separadorMenuPrincipal2 = new javax.swing.JSeparator();
        etiquetaVideoEmergencia = new javax.swing.JButton();
        botonRegistro = new javax.swing.JButton();
        botonIniSes = new javax.swing.JButton();
        etiquetaLogoPrincipal = new javax.swing.JLabel();
        panelGradBotPrincipales = new keeptoo.KGradientPanel();
        botonMenuDesplegable1 = new javax.swing.JButton();
        botonMenuDesplegable2 = new javax.swing.JButton();
        botonMenuDesplegable3 = new javax.swing.JButton();
        botonMenuDesplegable4 = new javax.swing.JButton();
        botonMenuDesplegable5 = new javax.swing.JButton();
        botonMenuDesplegable6 = new javax.swing.JButton();
        etiquetaMenuDesplegable1 = new javax.swing.JLabel();
        etiquetaMenuDesplegable2 = new javax.swing.JLabel();
        etiquetaMenuDesplegable3 = new javax.swing.JLabel();
        etiquetaMenuDesplegable4 = new javax.swing.JLabel();
        etiquetaMenuDesplegable5 = new javax.swing.JLabel();
        etiquetaMenuDesplegable6 = new javax.swing.JLabel();
        etiquetaPropaganda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEscritorio.setBackground(new java.awt.Color(255, 255, 255));

        panelGradPrincipal.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradPrincipal.setkStartColor(new java.awt.Color(0, 153, 0));

        separadorMenuPrincipal1.setForeground(new java.awt.Color(255, 255, 255));
        separadorMenuPrincipal1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        separadorMenuPrincipal2.setForeground(new java.awt.Color(255, 255, 255));
        separadorMenuPrincipal2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        etiquetaVideoEmergencia.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaVideoEmergencia.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaVideoEmergencia.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaVideoEmergencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Emergencias.gif"))); // NOI18N
        etiquetaVideoEmergencia.setBorderPainted(false);
        etiquetaVideoEmergencia.setContentAreaFilled(false);
        etiquetaVideoEmergencia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        botonRegistro.setBackground(new java.awt.Color(255, 255, 255));
        botonRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonUsuarioRegis.png"))); // NOI18N
        botonRegistro.setToolTipText("");
        botonRegistro.setBorderPainted(false);
        botonRegistro.setContentAreaFilled(false);
        botonRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });

        botonIniSes.setBackground(new java.awt.Color(255, 255, 255));
        botonIniSes.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonIniSes.setForeground(new java.awt.Color(255, 255, 255));
        botonIniSes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonUsuarioIniSes.png"))); // NOI18N
        botonIniSes.setBorderPainted(false);
        botonIniSes.setContentAreaFilled(false);
        botonIniSes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonIniSes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniSesActionPerformed(evt);
            }
        });

        etiquetaLogoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/MasSaludLogo.png"))); // NOI18N

        panelGradBotPrincipales.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradBotPrincipales.setkStartColor(new java.awt.Color(204, 255, 255));

        botonMenuDesplegable1.setBackground(panelGradPrincipal.getkStartColor());
        botonMenuDesplegable1.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        botonMenuDesplegable1.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuDesplegable1.setText("Ordenes");
        botonMenuDesplegable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuDesplegable1ActionPerformed(evt);
            }
        });

        botonMenuDesplegable2.setBackground(panelGradPrincipal.getkStartColor());
        botonMenuDesplegable2.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        botonMenuDesplegable2.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuDesplegable2.setText("Consultas");
        botonMenuDesplegable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuDesplegable2ActionPerformed(evt);
            }
        });

        botonMenuDesplegable3.setBackground(panelGradPrincipal.getkStartColor());
        botonMenuDesplegable3.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        botonMenuDesplegable3.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuDesplegable3.setText("Especialidades");
        botonMenuDesplegable3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuDesplegable3ActionPerformed(evt);
            }
        });

        botonMenuDesplegable4.setBackground(panelGradPrincipal.getkStartColor());
        botonMenuDesplegable4.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        botonMenuDesplegable4.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuDesplegable4.setText("Profesionales");
        botonMenuDesplegable4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuDesplegable4ActionPerformed(evt);
            }
        });

        botonMenuDesplegable5.setBackground(panelGradPrincipal.getkStartColor());
        botonMenuDesplegable5.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        botonMenuDesplegable5.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuDesplegable5.setText("Afiliados");
        botonMenuDesplegable5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuDesplegable5ActionPerformed(evt);
            }
        });

        botonMenuDesplegable6.setBackground(panelGradPrincipal.getkStartColor());
        botonMenuDesplegable6.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        botonMenuDesplegable6.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuDesplegable6.setText("Más Informacion");
        botonMenuDesplegable6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuDesplegable6ActionPerformed(evt);
            }
        });

        etiquetaMenuDesplegable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/OrdenDeConsultaIcono.png"))); // NOI18N

        etiquetaMenuDesplegable2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/ConsultasIcono.png"))); // NOI18N

        etiquetaMenuDesplegable3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/ProfesionalesIcono.png"))); // NOI18N

        etiquetaMenuDesplegable4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/AfiliadoIcono.png"))); // NOI18N

        etiquetaMenuDesplegable5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/MasInformacionIcono.png"))); // NOI18N

        etiquetaMenuDesplegable6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/EspecialidadesIcono.png"))); // NOI18N

        javax.swing.GroupLayout panelGradBotPrincipalesLayout = new javax.swing.GroupLayout(panelGradBotPrincipales);
        panelGradBotPrincipales.setLayout(panelGradBotPrincipalesLayout);
        panelGradBotPrincipalesLayout.setHorizontalGroup(
            panelGradBotPrincipalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradBotPrincipalesLayout.createSequentialGroup()
                .addComponent(etiquetaMenuDesplegable1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMenuDesplegable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelGradBotPrincipalesLayout.createSequentialGroup()
                .addComponent(etiquetaMenuDesplegable4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMenuDesplegable5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelGradBotPrincipalesLayout.createSequentialGroup()
                .addComponent(etiquetaMenuDesplegable2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMenuDesplegable2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelGradBotPrincipalesLayout.createSequentialGroup()
                .addComponent(etiquetaMenuDesplegable6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMenuDesplegable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelGradBotPrincipalesLayout.createSequentialGroup()
                .addComponent(etiquetaMenuDesplegable3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMenuDesplegable4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradBotPrincipalesLayout.createSequentialGroup()
                .addComponent(etiquetaMenuDesplegable5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMenuDesplegable6, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
        );
        panelGradBotPrincipalesLayout.setVerticalGroup(
            panelGradBotPrincipalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradBotPrincipalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradBotPrincipalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonMenuDesplegable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaMenuDesplegable1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGradBotPrincipalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaMenuDesplegable2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonMenuDesplegable2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGradBotPrincipalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonMenuDesplegable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaMenuDesplegable6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGradBotPrincipalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaMenuDesplegable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonMenuDesplegable4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGradBotPrincipalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaMenuDesplegable4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonMenuDesplegable5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGradBotPrincipalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaMenuDesplegable5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonMenuDesplegable6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        etiquetaPropaganda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/TableroDePropaganda1.png"))); // NOI18N

        javax.swing.GroupLayout panelGradPrincipalLayout = new javax.swing.GroupLayout(panelGradPrincipal);
        panelGradPrincipal.setLayout(panelGradPrincipalLayout);
        panelGradPrincipalLayout.setHorizontalGroup(
            panelGradPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradPrincipalLayout.createSequentialGroup()
                .addComponent(separadorMenuPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                .addComponent(separadorMenuPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelGradPrincipalLayout.createSequentialGroup()
                .addGroup(panelGradPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etiquetaLogoPrincipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaVideoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320)
                        .addComponent(botonRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonIniSes))
                    .addGroup(panelGradPrincipalLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(panelGradBotPrincipales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(etiquetaPropaganda)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelGradPrincipalLayout.setVerticalGroup(
            panelGradPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradPrincipalLayout.createSequentialGroup()
                        .addGroup(panelGradPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonIniSes)
                            .addComponent(botonRegistro)
                            .addComponent(etiquetaLogoPrincipal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGradPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separadorMenuPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separadorMenuPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(etiquetaVideoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(panelGradPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGradBotPrincipales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaPropaganda))
                .addGap(75, 75, 75))
        );

        panelEscritorio.setLayer(panelGradPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelEscritorioLayout = new javax.swing.GroupLayout(panelEscritorio);
        panelEscritorio.setLayout(panelEscritorioLayout);
        panelEscritorioLayout.setHorizontalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelEscritorioLayout.setVerticalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEscritorio)
        );

        setSize(new java.awt.Dimension(1600, 820));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        Registrarse Regis = new Registrarse();
        panelEscritorio.add(Regis);
        Regis.setVisible(true);
    }//GEN-LAST:event_botonRegistroActionPerformed

    private void botonIniSesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniSesActionPerformed
        IniciarSesion InSe = new IniciarSesion();
        panelEscritorio.add(InSe);
        InSe.setVisible(true);
        Desbloquear();
    }//GEN-LAST:event_botonIniSesActionPerformed

    private void botonMenuDesplegable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuDesplegable1ActionPerformed
        Ordenes ord = new Ordenes();
        panelEscritorio.add(ord);
        ord.setVisible(true);
    }//GEN-LAST:event_botonMenuDesplegable1ActionPerformed

    private void botonMenuDesplegable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuDesplegable2ActionPerformed
        Consultas consu = new Consultas();
        panelEscritorio.add(consu);
        consu.setVisible(true);
    }//GEN-LAST:event_botonMenuDesplegable2ActionPerformed

    private void botonMenuDesplegable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuDesplegable3ActionPerformed
        Especialidades espe = new Especialidades();
        panelEscritorio.add(espe);
        espe.setVisible(true);
    }//GEN-LAST:event_botonMenuDesplegable3ActionPerformed

    private void botonMenuDesplegable4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuDesplegable4ActionPerformed
        Profesionales prof = new Profesionales();
        panelEscritorio.add(prof);
        prof.setVisible(true);
    }//GEN-LAST:event_botonMenuDesplegable4ActionPerformed

    private void botonMenuDesplegable5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuDesplegable5ActionPerformed
        Afiliados afil = new Afiliados();
        panelEscritorio.add(afil);
        afil.setVisible(true);
    }//GEN-LAST:event_botonMenuDesplegable5ActionPerformed

    private void botonMenuDesplegable6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuDesplegable6ActionPerformed
        MasInformacion msinf = new MasInformacion();
        panelEscritorio.add(msinf);
        msinf.setVisible(true);
    }//GEN-LAST:event_botonMenuDesplegable6ActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniSes;
    private javax.swing.JButton botonMenuDesplegable1;
    private javax.swing.JButton botonMenuDesplegable2;
    private javax.swing.JButton botonMenuDesplegable3;
    private javax.swing.JButton botonMenuDesplegable4;
    private javax.swing.JButton botonMenuDesplegable5;
    private javax.swing.JButton botonMenuDesplegable6;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JLabel etiquetaLogoPrincipal;
    private javax.swing.JLabel etiquetaMenuDesplegable1;
    private javax.swing.JLabel etiquetaMenuDesplegable2;
    private javax.swing.JLabel etiquetaMenuDesplegable3;
    private javax.swing.JLabel etiquetaMenuDesplegable4;
    private javax.swing.JLabel etiquetaMenuDesplegable5;
    private javax.swing.JLabel etiquetaMenuDesplegable6;
    public javax.swing.JLabel etiquetaPropaganda;
    private javax.swing.JButton etiquetaVideoEmergencia;
    private javax.swing.JDesktopPane panelEscritorio;
    private keeptoo.KGradientPanel panelGradBotPrincipales;
    private keeptoo.KGradientPanel panelGradPrincipal;
    private javax.swing.JSeparator separadorMenuPrincipal1;
    private javax.swing.JSeparator separadorMenuPrincipal2;
    // End of variables declaration//GEN-END:variables
}