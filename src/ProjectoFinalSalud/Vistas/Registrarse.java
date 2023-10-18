
package ProjectoFinalSalud.Vistas;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Registrarse extends javax.swing.JInternalFrame {

    public Registrarse() {
        
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradRegis = new keeptoo.KGradientPanel();
        etiquetaTituloRegis = new javax.swing.JLabel();
        etiquetaEsloganRegis = new javax.swing.JLabel();
        botonAtrasRegis = new javax.swing.JButton();
        panelRegistro = new javax.swing.JPanel();
        etiquetaCuadroRegis = new javax.swing.JLabel();
        etiquetaNombreRegis = new javax.swing.JLabel();
        etiquetaApellidoRegis = new javax.swing.JLabel();
        etiquetaDireccionEmailRegis = new javax.swing.JLabel();
        etiquetaDni1 = new javax.swing.JLabel();
        etiquetaFechaNacRegis = new javax.swing.JLabel();
        etiquetaNacionRegis = new javax.swing.JLabel();
        etiquetaContraseñaRegis = new javax.swing.JLabel();
        botonRegistrateRegis = new javax.swing.JButton();
        textoNombreRegis = new javax.swing.JTextField();
        textoApellidoRegis = new javax.swing.JTextField();
        textoDniRegis = new javax.swing.JTextField();
        textoTelefonoRegis = new javax.swing.JTextField();
        textoDireccionEmailRegis = new javax.swing.JTextField();
        textoContraseñaRegis = new javax.swing.JPasswordField();
        calendarioFechaNacRegis = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        panelGradRegis.setBackground(new java.awt.Color(255, 255, 255));
        panelGradRegis.setkEndColor(new java.awt.Color(51, 153, 255));
        panelGradRegis.setkStartColor(new java.awt.Color(153, 0, 153));
        panelGradRegis.setPreferredSize(new java.awt.Dimension(1280, 720));

        etiquetaTituloRegis.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaTituloRegis.setFont(new java.awt.Font("Calibri", 2, 48)); // NOI18N
        etiquetaTituloRegis.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTituloRegis.setText("MásSalud");

        etiquetaEsloganRegis.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaEsloganRegis.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        etiquetaEsloganRegis.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaEsloganRegis.setText("<html>\nSomos la medicina prepaga con la red más grande del país.\n<br>\n<br>\nContamos con profesionales destacados garantizándote el mejor servicio de salud.\n<br>\n<br>\n¡Tenemos todo para cuidar de vos y  tu familia!\n<br>\n<br>\n¿QUÉ ESPERÁS PARA ASOCIARTE?\n</html>");
        etiquetaEsloganRegis.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaEsloganRegis.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaEsloganRegis.setPreferredSize(new java.awt.Dimension(250, 15));

        botonAtrasRegis.setBackground(new java.awt.Color(255, 255, 255));
        botonAtrasRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasRegis.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasRegis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso.png"))); // NOI18N
        botonAtrasRegis.setText("Atrás");
        botonAtrasRegis.setBorderPainted(false);
        botonAtrasRegis.setContentAreaFilled(false);
        botonAtrasRegis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtrasRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasRegisActionPerformed(evt);
            }
        });

        panelRegistro.setBackground(new java.awt.Color(255, 255, 255));

        etiquetaCuadroRegis.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaCuadroRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaCuadroRegis.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaCuadroRegis.setText("<html>\nREGISTRARSE\n<br>\n<br>\nRegistrate y crea una cuenta para ser parte de nosotros...\n</html>\n");
        etiquetaCuadroRegis.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaCuadroRegis.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaCuadroRegis.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaNombreRegis.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaNombreRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaNombreRegis.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaNombreRegis.setText("Nombre:");
        etiquetaNombreRegis.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaNombreRegis.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaNombreRegis.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaApellidoRegis.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaApellidoRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaApellidoRegis.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaApellidoRegis.setText("Apellido:");
        etiquetaApellidoRegis.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaApellidoRegis.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaApellidoRegis.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaDireccionEmailRegis.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaDireccionEmailRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaDireccionEmailRegis.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaDireccionEmailRegis.setText("Dirección Email:");
        etiquetaDireccionEmailRegis.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaDireccionEmailRegis.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaDireccionEmailRegis.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaDni1.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaDni1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaDni1.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaDni1.setText("DNI:");
        etiquetaDni1.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaDni1.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaDni1.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaFechaNacRegis.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaFechaNacRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaFechaNacRegis.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaFechaNacRegis.setText("Fecha De Nacimiento:");
        etiquetaFechaNacRegis.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaFechaNacRegis.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaFechaNacRegis.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaNacionRegis.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaNacionRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaNacionRegis.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaNacionRegis.setText("Nacionalidad:");
        etiquetaNacionRegis.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaNacionRegis.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaNacionRegis.setPreferredSize(new java.awt.Dimension(250, 15));

        etiquetaContraseñaRegis.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaContraseñaRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaContraseñaRegis.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaContraseñaRegis.setText("Contraseña:");
        etiquetaContraseñaRegis.setMaximumSize(new java.awt.Dimension(250, 15));
        etiquetaContraseñaRegis.setMinimumSize(new java.awt.Dimension(250, 15));
        etiquetaContraseñaRegis.setPreferredSize(new java.awt.Dimension(250, 15));

        botonRegistrateRegis.setBackground(panelGradRegis.getkStartColor());
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
        textoApellidoRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoApellidoRegisMouseClicked(evt);
            }
        });

        textoDniRegis.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textoDniRegis.setForeground(new java.awt.Color(204, 204, 204));
        textoDniRegis.setText("Ej: 12345678");
        textoDniRegis.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        textoDniRegis.setPreferredSize(new java.awt.Dimension(60, 20));
        textoDniRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoDniRegisMouseClicked(evt);
            }
        });

        textoTelefonoRegis.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textoTelefonoRegis.setForeground(new java.awt.Color(204, 204, 204));
        textoTelefonoRegis.setText("Ej: Argentina");
        textoTelefonoRegis.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        textoTelefonoRegis.setPreferredSize(new java.awt.Dimension(60, 20));
        textoTelefonoRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoTelefonoRegisMouseClicked(evt);
            }
        });

        textoDireccionEmailRegis.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textoDireccionEmailRegis.setForeground(new java.awt.Color(204, 204, 204));
        textoDireccionEmailRegis.setText("Ej: juanlopez@gmail.com");
        textoDireccionEmailRegis.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        textoDireccionEmailRegis.setPreferredSize(new java.awt.Dimension(60, 20));
        textoDireccionEmailRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoDireccionEmailRegisMouseClicked(evt);
            }
        });

        textoContraseñaRegis.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        textoContraseñaRegis.setForeground(new java.awt.Color(204, 204, 204));
        textoContraseñaRegis.setText("//////////*");
        textoContraseñaRegis.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 120, 215)));
        textoContraseñaRegis.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textoContraseñaRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoContraseñaRegisMouseClicked(evt);
            }
        });

        calendarioFechaNacRegis.setBackground(new java.awt.Color(255, 255, 255));
        calendarioFechaNacRegis.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaCuadroRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelRegistroLayout.createSequentialGroup()
                                    .addComponent(etiquetaNombreRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(textoNombreRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistroLayout.createSequentialGroup()
                                        .addComponent(etiquetaContraseñaRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textoContraseñaRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistroLayout.createSequentialGroup()
                                        .addComponent(etiquetaDireccionEmailRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textoDireccionEmailRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistroLayout.createSequentialGroup()
                                        .addComponent(etiquetaNacionRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textoTelefonoRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistroLayout.createSequentialGroup()
                                        .addComponent(etiquetaFechaNacRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(calendarioFechaNacRegis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistroLayout.createSequentialGroup()
                                        .addComponent(etiquetaDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textoDniRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistroLayout.createSequentialGroup()
                                        .addComponent(etiquetaApellidoRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(textoApellidoRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(botonRegistrateRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaCuadroRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombreRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNombreRegis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaApellidoRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoApellidoRegis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoDniRegis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaFechaNacRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calendarioFechaNacRegis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNacionRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoTelefonoRegis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDireccionEmailRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoDireccionEmailRegis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaContraseñaRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoContraseñaRegis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(botonRegistrateRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout panelGradRegisLayout = new javax.swing.GroupLayout(panelGradRegis);
        panelGradRegis.setLayout(panelGradRegisLayout);
        panelGradRegisLayout.setHorizontalGroup(
            panelGradRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradRegisLayout.createSequentialGroup()
                .addGroup(panelGradRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradRegisLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(etiquetaTituloRegis))
                    .addGroup(panelGradRegisLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(etiquetaEsloganRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(botonAtrasRegis)
                .addContainerGap())
        );
        panelGradRegisLayout.setVerticalGroup(
            panelGradRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradRegisLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(etiquetaTituloRegis)
                .addGap(37, 37, 37)
                .addComponent(etiquetaEsloganRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelGradRegisLayout.createSequentialGroup()
                .addGroup(panelGradRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradRegisLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGradRegisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAtrasRegis)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradRegis, javax.swing.GroupLayout.DEFAULT_SIZE, 1264, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradRegis, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1280, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasRegisActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasRegisActionPerformed

    private void textoNombreRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoNombreRegisMouseClicked
        textoNombreRegis.setText("");
    }//GEN-LAST:event_textoNombreRegisMouseClicked

    private void textoApellidoRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoApellidoRegisMouseClicked
        textoApellidoRegis.setText("");
    }//GEN-LAST:event_textoApellidoRegisMouseClicked

    private void textoDniRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoDniRegisMouseClicked
        textoDniRegis.setText("");
    }//GEN-LAST:event_textoDniRegisMouseClicked

    private void textoTelefonoRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoTelefonoRegisMouseClicked
        textoTelefonoRegis.setText("");
    }//GEN-LAST:event_textoTelefonoRegisMouseClicked

    private void textoDireccionEmailRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoDireccionEmailRegisMouseClicked
        textoDireccionEmailRegis.setText("");
    }//GEN-LAST:event_textoDireccionEmailRegisMouseClicked

    private void textoContraseñaRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoContraseñaRegisMouseClicked
        textoContraseñaRegis.setText("");
    }//GEN-LAST:event_textoContraseñaRegisMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasRegis;
    private javax.swing.JButton botonRegistrateRegis;
    private com.toedter.calendar.JDateChooser calendarioFechaNacRegis;
    private javax.swing.JLabel etiquetaApellidoRegis;
    private javax.swing.JLabel etiquetaContraseñaRegis;
    private javax.swing.JLabel etiquetaCuadroRegis;
    private javax.swing.JLabel etiquetaDireccionEmailRegis;
    private javax.swing.JLabel etiquetaDni1;
    private javax.swing.JLabel etiquetaEsloganRegis;
    private javax.swing.JLabel etiquetaFechaNacRegis;
    private javax.swing.JLabel etiquetaNacionRegis;
    private javax.swing.JLabel etiquetaNombreRegis;
    private javax.swing.JLabel etiquetaTituloRegis;
    private keeptoo.KGradientPanel panelGradRegis;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JTextField textoApellidoRegis;
    private javax.swing.JPasswordField textoContraseñaRegis;
    private javax.swing.JTextField textoDireccionEmailRegis;
    private javax.swing.JTextField textoDniRegis;
    private javax.swing.JTextField textoNombreRegis;
    private javax.swing.JTextField textoTelefonoRegis;
    // End of variables declaration//GEN-END:variables
}