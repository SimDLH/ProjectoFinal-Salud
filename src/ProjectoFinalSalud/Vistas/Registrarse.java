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
public class Registrarse extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registrarse
     */
   
    public Registrarse() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradienteRegis = new keeptoo.KGradientPanel();
        etiquetaTituloRegis = new javax.swing.JLabel();
        etiquetaEsloganRegis = new javax.swing.JLabel();
        botonAtrasRegis = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        etiquetaCuadroRegis = new javax.swing.JLabel();
        etiquetaNombreRegis = new javax.swing.JLabel();
        etiquetaApellidoRegis = new javax.swing.JLabel();
        etiquetaDireccionEmailRegis = new javax.swing.JLabel();
        etiquetaDni1 = new javax.swing.JLabel();
        etiquetaDirecciónRegis = new javax.swing.JLabel();
        etiquetaTelefonoRegis = new javax.swing.JLabel();
        etiquetaContraseñaRegis = new javax.swing.JLabel();
        botonRegistrateRegis = new javax.swing.JButton();
        textoNombreRegis = new javax.swing.JTextField();
        textoApellidoRegis = new javax.swing.JTextField();
        textoDniRegis = new javax.swing.JTextField();
        textoTelefonoRegis = new javax.swing.JTextField();
        textoDireccionRegis1 = new javax.swing.JTextField();
        textoDireccionEmailRegis = new javax.swing.JTextField();
        textoContraseñaRegis = new javax.swing.JPasswordField();
        etiquetaFotos1 = new javax.swing.JLabel();
        etiquetaFotos2 = new javax.swing.JLabel();
        etiquetaFotos3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1600, 820));

        gradienteRegis.setkEndColor(new java.awt.Color(51, 153, 255));
        gradienteRegis.setkStartColor(new java.awt.Color(153, 0, 153));
        gradienteRegis.setPreferredSize(new java.awt.Dimension(1600, 820));

        etiquetaTituloRegis.setFont(new java.awt.Font("Calibri", 2, 48)); // NOI18N
        etiquetaTituloRegis.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTituloRegis.setText("MásSalud");

        etiquetaEsloganRegis.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        etiquetaEsloganRegis.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaEsloganRegis.setText("<html>\nSomos la medicina prepaga con la red más grande del país.\n<br>\n<br>\nContamos con profesionales destacados garantizándote el mejor servicio de salud.\n<br>\n<br>\n¡Tenemos todo para cuidar de vos y  tu familia!\n<br>\n<br>\n¿QUÉ ESPERÁS PARA ASOCIARTE?\n</html>");
        etiquetaEsloganRegis.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaEsloganRegis.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaEsloganRegis.setPreferredSize(new java.awt.Dimension(250, 15));

        botonAtrasRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasRegis.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasRegis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso25bit.png"))); // NOI18N
        botonAtrasRegis.setText("Atrás");
        botonAtrasRegis.setBorderPainted(false);
        botonAtrasRegis.setContentAreaFilled(false);
        botonAtrasRegis.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonAtrasRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasRegisActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etiquetaCuadroRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaCuadroRegis.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaCuadroRegis.setText("<html>\nREGISTRARSE\n<br>\n<br>\nRegistrate y crea una cuenta para ser parte de nosotros...\n</html>\n");
        etiquetaCuadroRegis.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaCuadroRegis.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaCuadroRegis.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaNombreRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaNombreRegis.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaNombreRegis.setText("Nombre:");
        etiquetaNombreRegis.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaNombreRegis.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaNombreRegis.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaApellidoRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaApellidoRegis.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaApellidoRegis.setText("Apellido:");
        etiquetaApellidoRegis.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaApellidoRegis.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaApellidoRegis.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaDireccionEmailRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaDireccionEmailRegis.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaDireccionEmailRegis.setText("Dirección Email:");
        etiquetaDireccionEmailRegis.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaDireccionEmailRegis.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaDireccionEmailRegis.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaDni1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaDni1.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaDni1.setText("DNI:");
        etiquetaDni1.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaDni1.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaDni1.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaDirecciónRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaDirecciónRegis.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaDirecciónRegis.setText("Dirección:");
        etiquetaDirecciónRegis.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaDirecciónRegis.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaDirecciónRegis.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaTelefonoRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaTelefonoRegis.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaTelefonoRegis.setText("Teléfono:");
        etiquetaTelefonoRegis.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaTelefonoRegis.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaTelefonoRegis.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaContraseñaRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaContraseñaRegis.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaContraseñaRegis.setText("Contraseña:");
        etiquetaContraseñaRegis.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaContraseñaRegis.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaContraseñaRegis.setPreferredSize(new java.awt.Dimension(250, 15));

        botonRegistrateRegis.setBackground(new java.awt.Color(153, 0, 153));
        botonRegistrateRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonRegistrateRegis.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrateRegis.setText("¡REGISTRATE!");

        textoNombreRegis.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textoNombreRegis.setForeground(new java.awt.Color(204, 204, 204));
        textoNombreRegis.setText("Ej: Juan");
        textoNombreRegis.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        textoNombreRegis.setPreferredSize(new java.awt.Dimension(60, 20));
        textoNombreRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoNombreRegisMouseClicked(evt);
            }
        });

        textoApellidoRegis.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textoApellidoRegis.setForeground(new java.awt.Color(204, 204, 204));
        textoApellidoRegis.setText("Ej: Lopez");
        textoApellidoRegis.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        textoApellidoRegis.setPreferredSize(new java.awt.Dimension(60, 20));

        textoDniRegis.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textoDniRegis.setForeground(new java.awt.Color(204, 204, 204));
        textoDniRegis.setText("Ej: 12345678");
        textoDniRegis.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        textoDniRegis.setPreferredSize(new java.awt.Dimension(60, 20));

        textoTelefonoRegis.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textoTelefonoRegis.setForeground(new java.awt.Color(204, 204, 204));
        textoTelefonoRegis.setText("Ej: 341500777");
        textoTelefonoRegis.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        textoTelefonoRegis.setPreferredSize(new java.awt.Dimension(60, 20));

        textoDireccionRegis1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textoDireccionRegis1.setForeground(new java.awt.Color(204, 204, 204));
        textoDireccionRegis1.setText("Ej: Mitre  0001, Rosario, Santa Fe");
        textoDireccionRegis1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        textoDireccionRegis1.setPreferredSize(new java.awt.Dimension(60, 20));

        textoDireccionEmailRegis.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textoDireccionEmailRegis.setForeground(new java.awt.Color(204, 204, 204));
        textoDireccionEmailRegis.setText("Ej: juanlopez@gmail.com");
        textoDireccionEmailRegis.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        textoDireccionEmailRegis.setPreferredSize(new java.awt.Dimension(60, 20));

        textoContraseñaRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        textoContraseñaRegis.setForeground(new java.awt.Color(204, 204, 204));
        textoContraseñaRegis.setText("//////////*");
        textoContraseñaRegis.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 120, 215)));
        textoContraseñaRegis.setDisabledTextColor(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaCuadroRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(etiquetaNombreRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(textoNombreRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(etiquetaContraseñaRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textoContraseñaRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(etiquetaDireccionEmailRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textoDireccionEmailRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(etiquetaTelefonoRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textoTelefonoRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(etiquetaDirecciónRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textoDireccionRegis1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(etiquetaDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textoDniRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(etiquetaApellidoRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(textoApellidoRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(botonRegistrateRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaCuadroRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombreRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNombreRegis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaApellidoRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoApellidoRegis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoDniRegis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDirecciónRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoDireccionRegis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTelefonoRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoTelefonoRegis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDireccionEmailRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoDireccionEmailRegis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaContraseñaRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoContraseñaRegis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(botonRegistrateRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        etiquetaFotos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Familia1.png"))); // NOI18N

        etiquetaFotos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Familia4.png"))); // NOI18N

        etiquetaFotos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Familia7.png"))); // NOI18N

        javax.swing.GroupLayout gradienteRegisLayout = new javax.swing.GroupLayout(gradienteRegis);
        gradienteRegis.setLayout(gradienteRegisLayout);
        gradienteRegisLayout.setHorizontalGroup(
            gradienteRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradienteRegisLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(etiquetaTituloRegis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAtrasRegis)
                .addGap(48, 48, 48))
            .addGroup(gradienteRegisLayout.createSequentialGroup()
                .addGroup(gradienteRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradienteRegisLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(etiquetaEsloganRegis, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                        .addGap(56, 56, 56))
                    .addGroup(gradienteRegisLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(etiquetaFotos1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaFotos2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(etiquetaFotos3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        gradienteRegisLayout.setVerticalGroup(
            gradienteRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradienteRegisLayout.createSequentialGroup()
                .addGroup(gradienteRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gradienteRegisLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(gradienteRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaTituloRegis)
                            .addComponent(botonAtrasRegis))
                        .addGroup(gradienteRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gradienteRegisLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(etiquetaEsloganRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaFotos1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradienteRegisLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaFotos2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144))
                            .addGroup(gradienteRegisLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(etiquetaFotos3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(gradienteRegisLayout.createSequentialGroup()
                        .addContainerGap(100, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradienteRegis, javax.swing.GroupLayout.DEFAULT_SIZE, 1584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradienteRegis, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1600, 820);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasRegisActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasRegisActionPerformed

    private void textoNombreRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoNombreRegisMouseClicked
        textoNombreRegis.setText("");
    }//GEN-LAST:event_textoNombreRegisMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasRegis;
    private javax.swing.JButton botonRegistrateRegis;
    private javax.swing.JLabel etiquetaApellidoRegis;
    private javax.swing.JLabel etiquetaContraseñaRegis;
    private javax.swing.JLabel etiquetaCuadroRegis;
    private javax.swing.JLabel etiquetaDireccionEmailRegis;
    private javax.swing.JLabel etiquetaDirecciónRegis;
    private javax.swing.JLabel etiquetaDni1;
    private javax.swing.JLabel etiquetaEsloganRegis;
    public javax.swing.JLabel etiquetaFotos1;
    public javax.swing.JLabel etiquetaFotos2;
    public javax.swing.JLabel etiquetaFotos3;
    private javax.swing.JLabel etiquetaNombreRegis;
    private javax.swing.JLabel etiquetaTelefonoRegis;
    private javax.swing.JLabel etiquetaTituloRegis;
    private keeptoo.KGradientPanel gradienteRegis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textoApellidoRegis;
    private javax.swing.JPasswordField textoContraseñaRegis;
    private javax.swing.JTextField textoDireccionEmailRegis;
    private javax.swing.JTextField textoDireccionRegis1;
    private javax.swing.JTextField textoDniRegis;
    private javax.swing.JTextField textoNombreRegis;
    private javax.swing.JTextField textoTelefonoRegis;
    // End of variables declaration//GEN-END:variables
}