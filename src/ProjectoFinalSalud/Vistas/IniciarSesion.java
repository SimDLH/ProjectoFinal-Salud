
package ProjectoFinalSalud.Vistas;

import ProjectoFinalSalud.AccesoDeDatos.UsuarioData;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class IniciarSesion extends javax.swing.JInternalFrame {

    UsuarioData usuData = new UsuarioData ();
    
    public IniciarSesion() {
        
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

        gradienteIniSes = new keeptoo.KGradientPanel();
        panelIniSes = new javax.swing.JPanel();
        etiquetaCuadroIniSes = new javax.swing.JLabel();
        textoNombreIniSes = new javax.swing.JTextField();
        textoApellidoIniSes = new javax.swing.JTextField();
        textoDireEmailIniSes = new javax.swing.JTextField();
        etiquetaNombreIniSes = new javax.swing.JLabel();
        etiquetaApellidoIniSes = new javax.swing.JLabel();
        etiquetaDireccionEmailIniSes = new javax.swing.JLabel();
        etiquetaContraseñaIniSes = new javax.swing.JLabel();
        textoContraIniSes = new javax.swing.JPasswordField();
        botonContinuarIniSes = new javax.swing.JButton();
        etiquetaTituloIniSes = new javax.swing.JLabel();
        etiquetaEsloganIniSes = new javax.swing.JLabel();
        etiquetaImagenIniSes = new javax.swing.JLabel();
        botonAtrasIniSes = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        gradienteIniSes.setkEndColor(new java.awt.Color(51, 153, 255));
        gradienteIniSes.setkStartColor(new java.awt.Color(153, 0, 153));
        gradienteIniSes.setPreferredSize(new java.awt.Dimension(1280, 720));

        panelIniSes.setBackground(new java.awt.Color(255, 255, 255));

        etiquetaCuadroIniSes.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaCuadroIniSes.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaCuadroIniSes.setText("<html>\nINICIAR SESIÓN\n<br>\n<br>\nInicia sesión en tu cuenta para realizar tus trámites...\n</html>\n");
        etiquetaCuadroIniSes.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaCuadroIniSes.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaCuadroIniSes.setPreferredSize(new java.awt.Dimension(250, 15));

        textoNombreIniSes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textoNombreIniSes.setForeground(new java.awt.Color(204, 204, 204));
        textoNombreIniSes.setText("Ej: Juan");
        textoNombreIniSes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        textoNombreIniSes.setPreferredSize(new java.awt.Dimension(60, 20));
        textoNombreIniSes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoNombreIniSesMouseClicked(evt);
            }
        });

        textoApellidoIniSes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textoApellidoIniSes.setForeground(new java.awt.Color(204, 204, 204));
        textoApellidoIniSes.setText("Ej: Lopez");
        textoApellidoIniSes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        textoApellidoIniSes.setPreferredSize(new java.awt.Dimension(60, 20));
        textoApellidoIniSes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoApellidoIniSesMouseClicked(evt);
            }
        });

        textoDireEmailIniSes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textoDireEmailIniSes.setForeground(new java.awt.Color(204, 204, 204));
        textoDireEmailIniSes.setText("Ej: juanlopes@gmail.com");
        textoDireEmailIniSes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        textoDireEmailIniSes.setPreferredSize(new java.awt.Dimension(60, 20));
        textoDireEmailIniSes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoDireEmailIniSesMouseClicked(evt);
            }
        });

        etiquetaNombreIniSes.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaNombreIniSes.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaNombreIniSes.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaNombreIniSes.setText("Nombre:");
        etiquetaNombreIniSes.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaNombreIniSes.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaNombreIniSes.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaApellidoIniSes.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaApellidoIniSes.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaApellidoIniSes.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaApellidoIniSes.setText("Apellido:");
        etiquetaApellidoIniSes.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaApellidoIniSes.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaApellidoIniSes.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaDireccionEmailIniSes.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaDireccionEmailIniSes.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaDireccionEmailIniSes.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaDireccionEmailIniSes.setText("Dirección email:");
        etiquetaDireccionEmailIniSes.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaDireccionEmailIniSes.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaDireccionEmailIniSes.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaContraseñaIniSes.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaContraseñaIniSes.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaContraseñaIniSes.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaContraseñaIniSes.setText("Contraseña:");
        etiquetaContraseñaIniSes.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaContraseñaIniSes.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaContraseñaIniSes.setPreferredSize(new java.awt.Dimension(250, 15));

        textoContraIniSes.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        textoContraIniSes.setForeground(new java.awt.Color(204, 204, 204));
        textoContraIniSes.setText("***********");
        textoContraIniSes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 120, 215)));
        textoContraIniSes.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textoContraIniSes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoContraIniSesMouseClicked(evt);
            }
        });

        botonContinuarIniSes.setBackground(gradienteIniSes.getkStartColor());
        botonContinuarIniSes.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonContinuarIniSes.setForeground(new java.awt.Color(255, 255, 255));
        botonContinuarIniSes.setText("¡CONTINUAR!");
        botonContinuarIniSes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarIniSesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIniSesLayout = new javax.swing.GroupLayout(panelIniSes);
        panelIniSes.setLayout(panelIniSesLayout);
        panelIniSesLayout.setHorizontalGroup(
            panelIniSesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIniSesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIniSesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIniSesLayout.createSequentialGroup()
                        .addComponent(etiquetaCuadroIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(botonContinuarIniSes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIniSesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelIniSesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIniSesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etiquetaNombreIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelIniSesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoNombreIniSes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoDireEmailIniSes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoApellidoIniSes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(etiquetaApellidoIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(etiquetaDireccionEmailIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(etiquetaContraseñaIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textoContraIniSes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelIniSesLayout.setVerticalGroup(
            panelIniSesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIniSesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaCuadroIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(etiquetaNombreIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(textoNombreIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(etiquetaApellidoIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(textoApellidoIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(etiquetaDireccionEmailIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(textoDireEmailIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(etiquetaContraseñaIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(textoContraIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(botonContinuarIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        etiquetaTituloIniSes.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaTituloIniSes.setFont(new java.awt.Font("Calibri", 2, 48)); // NOI18N
        etiquetaTituloIniSes.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTituloIniSes.setText("MásSalud");

        etiquetaEsloganIniSes.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaEsloganIniSes.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        etiquetaEsloganIniSes.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaEsloganIniSes.setText("<html>\nLa red más grande del país...\n<br>\nCientos de profesionales a tu disposición...\n<br>\n¡Tenemos todo para cuidar de vos y  tu familia!\n</html>");
        etiquetaEsloganIniSes.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaEsloganIniSes.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaEsloganIniSes.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaImagenIniSes.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaImagenIniSes.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaImagenIniSes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/PacienteYMedico.png"))); // NOI18N

        botonAtrasIniSes.setBackground(new java.awt.Color(255, 255, 255));
        botonAtrasIniSes.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasIniSes.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasIniSes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso.png"))); // NOI18N
        botonAtrasIniSes.setText("Atrás");
        botonAtrasIniSes.setBorderPainted(false);
        botonAtrasIniSes.setContentAreaFilled(false);
        botonAtrasIniSes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtrasIniSes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasIniSesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradienteIniSesLayout = new javax.swing.GroupLayout(gradienteIniSes);
        gradienteIniSes.setLayout(gradienteIniSesLayout);
        gradienteIniSesLayout.setHorizontalGroup(
            gradienteIniSesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradienteIniSesLayout.createSequentialGroup()
                .addGroup(gradienteIniSesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradienteIniSesLayout.createSequentialGroup()
                        .addGroup(gradienteIniSesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gradienteIniSesLayout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(etiquetaTituloIniSes))
                            .addGroup(gradienteIniSesLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(etiquetaImagenIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 107, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradienteIniSesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(etiquetaEsloganIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(panelIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(botonAtrasIniSes)
                .addContainerGap())
        );
        gradienteIniSesLayout.setVerticalGroup(
            gradienteIniSesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradienteIniSesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(panelIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradienteIniSesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gradienteIniSesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAtrasIniSes)
                    .addGroup(gradienteIniSesLayout.createSequentialGroup()
                        .addComponent(etiquetaTituloIniSes)
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaEsloganIniSes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaImagenIniSes)))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradienteIniSes, javax.swing.GroupLayout.DEFAULT_SIZE, 1264, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradienteIniSes, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1280, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasIniSesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasIniSesActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasIniSesActionPerformed

    private void textoNombreIniSesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoNombreIniSesMouseClicked
        textoNombreIniSes.setText("");
    }//GEN-LAST:event_textoNombreIniSesMouseClicked

    private void textoApellidoIniSesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoApellidoIniSesMouseClicked
        textoApellidoIniSes.setText("");
    }//GEN-LAST:event_textoApellidoIniSesMouseClicked

    private void textoDireEmailIniSesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoDireEmailIniSesMouseClicked
        textoDireEmailIniSes.setText("");
    }//GEN-LAST:event_textoDireEmailIniSesMouseClicked

    private void textoContraIniSesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoContraIniSesMouseClicked
        textoContraIniSes.setText("");
    }//GEN-LAST:event_textoContraIniSesMouseClicked

    private void botonContinuarIniSesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarIniSesActionPerformed
        UsuarioData usua = new UsuarioData();
        usua.validarUsuario(textoNombreIniSes, textoApellidoIniSes, textoDireEmailIniSes, textoContraIniSes);
        limpiar();
    }//GEN-LAST:event_botonContinuarIniSesActionPerformed
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasIniSes;
    private javax.swing.JButton botonContinuarIniSes;
    private javax.swing.JLabel etiquetaApellidoIniSes;
    private javax.swing.JLabel etiquetaContraseñaIniSes;
    private javax.swing.JLabel etiquetaCuadroIniSes;
    private javax.swing.JLabel etiquetaDireccionEmailIniSes;
    private javax.swing.JLabel etiquetaEsloganIniSes;
    private javax.swing.JLabel etiquetaImagenIniSes;
    private javax.swing.JLabel etiquetaNombreIniSes;
    private javax.swing.JLabel etiquetaTituloIniSes;
    private keeptoo.KGradientPanel gradienteIniSes;
    private javax.swing.JPanel panelIniSes;
    private javax.swing.JTextField textoApellidoIniSes;
    private javax.swing.JPasswordField textoContraIniSes;
    private javax.swing.JTextField textoDireEmailIniSes;
    private javax.swing.JTextField textoNombreIniSes;
    // End of variables declaration//GEN-END:variables

    private void limpiar(){
        textoNombreIniSes.setText("");
        textoApellidoIniSes.setText("");
        textoDireEmailIniSes.setText("");
        textoContraIniSes.setText("");
    }
}