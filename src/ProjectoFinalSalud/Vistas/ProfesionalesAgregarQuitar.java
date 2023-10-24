
package ProjectoFinalSalud.Vistas;

import ProjectoFinalSalud.AccesoDeDatos.EspecialidadData;
import ProjectoFinalSalud.AccesoDeDatos.PrestadorData;
import ProjectoFinalSalud.Entidades.Especialidad;
import ProjectoFinalSalud.Entidades.Prestador;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class ProfesionalesAgregarQuitar extends javax.swing.JInternalFrame {

    PrestadorData presData = new PrestadorData();
    
    public ProfesionalesAgregarQuitar() {
        
        initComponents();
        cargarComboB();
        
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

        panelGradProfAgreQuit = new keeptoo.KGradientPanel();
        botonAtrasProfAgreQuit = new javax.swing.JButton();
        etiquetaProfAgreQuit = new javax.swing.JLabel();
        etiquetaProfAgreQuitDNI = new javax.swing.JLabel();
        textoProfAgreQuitDNI = new javax.swing.JTextField();
        botonProfAgreQuitBuscar = new javax.swing.JButton();
        separadorProfAgreQuit = new javax.swing.JSeparator();
        etiquetaProfAgreQuitNomYApe = new javax.swing.JLabel();
        textoProfAgreQuitNomYApe = new javax.swing.JTextField();
        etiquetaProfAgreQuitNumTel = new javax.swing.JLabel();
        textoProfAgreQuitNumTel = new javax.swing.JTextField();
        etiquetaProfAgreQuitDom = new javax.swing.JLabel();
        textoProfAgreQuitDom = new javax.swing.JTextField();
        etiquetaProfAgreQuitEstado = new javax.swing.JLabel();
        etiquetaProfAgreQuitAcONoac = new javax.swing.JLabel();
        botonProfAgreQuitRein = new javax.swing.JButton();
        botonProfAgreQuitGuardar = new javax.swing.JButton();
        botonProfAgreQuitAnular = new javax.swing.JButton();
        comboBoxProfAgreQuitEsp = new javax.swing.JComboBox<>();
        etiquetaProfAgreQuitEsp = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(975, 575));

        panelGradProfAgreQuit.setBackground(new java.awt.Color(255, 255, 255));
        panelGradProfAgreQuit.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradProfAgreQuit.setkStartColor(new java.awt.Color(0, 153, 0));
        panelGradProfAgreQuit.setPreferredSize(new java.awt.Dimension(975, 575));

        botonAtrasProfAgreQuit.setBackground(new java.awt.Color(255, 255, 255));
        botonAtrasProfAgreQuit.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasProfAgreQuit.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasProfAgreQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso.png"))); // NOI18N
        botonAtrasProfAgreQuit.setText("Atrás");
        botonAtrasProfAgreQuit.setBorderPainted(false);
        botonAtrasProfAgreQuit.setContentAreaFilled(false);
        botonAtrasProfAgreQuit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtrasProfAgreQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAtrasProfAgreQuitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAtrasProfAgreQuitMouseExited(evt);
            }
        });
        botonAtrasProfAgreQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasProfAgreQuitActionPerformed(evt);
            }
        });

        etiquetaProfAgreQuit.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaProfAgreQuit.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        etiquetaProfAgreQuit.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaProfAgreQuit.setText("Agregar Y Anular Profesionales");

        etiquetaProfAgreQuitDNI.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaProfAgreQuitDNI.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaProfAgreQuitDNI.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaProfAgreQuitDNI.setText("Ingrese El DNI Del Profesional");

        textoProfAgreQuitDNI.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        botonProfAgreQuitBuscar.setBackground(new java.awt.Color(255, 255, 255));
        botonProfAgreQuitBuscar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonProfAgreQuitBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonProfAgreQuitBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Boton.png"))); // NOI18N
        botonProfAgreQuitBuscar.setText("Buscar");
        botonProfAgreQuitBuscar.setBorderPainted(false);
        botonProfAgreQuitBuscar.setContentAreaFilled(false);
        botonProfAgreQuitBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonProfAgreQuitBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonProfAgreQuitBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonProfAgreQuitBuscarMouseExited(evt);
            }
        });
        botonProfAgreQuitBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProfAgreQuitBuscarActionPerformed(evt);
            }
        });

        separadorProfAgreQuit.setForeground(new java.awt.Color(255, 255, 255));
        separadorProfAgreQuit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        etiquetaProfAgreQuitNomYApe.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaProfAgreQuitNomYApe.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaProfAgreQuitNomYApe.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaProfAgreQuitNomYApe.setText("Nombre y Apellido:");

        textoProfAgreQuitNomYApe.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        etiquetaProfAgreQuitNumTel.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaProfAgreQuitNumTel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaProfAgreQuitNumTel.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaProfAgreQuitNumTel.setText("Número de Teléfono:");

        textoProfAgreQuitNumTel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        etiquetaProfAgreQuitDom.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaProfAgreQuitDom.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaProfAgreQuitDom.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaProfAgreQuitDom.setText("Domicilio:");

        textoProfAgreQuitDom.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        etiquetaProfAgreQuitEstado.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaProfAgreQuitEstado.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaProfAgreQuitEstado.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaProfAgreQuitEstado.setText("Estado:");

        etiquetaProfAgreQuitAcONoac.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaProfAgreQuitAcONoac.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        etiquetaProfAgreQuitAcONoac.setForeground(new java.awt.Color(255, 255, 255));

        botonProfAgreQuitRein.setBackground(new java.awt.Color(255, 255, 255));
        botonProfAgreQuitRein.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonProfAgreQuitRein.setForeground(new java.awt.Color(255, 255, 255));
        botonProfAgreQuitRein.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Boton.png"))); // NOI18N
        botonProfAgreQuitRein.setText("Reinstituir");
        botonProfAgreQuitRein.setBorderPainted(false);
        botonProfAgreQuitRein.setContentAreaFilled(false);
        botonProfAgreQuitRein.setEnabled(false);
        botonProfAgreQuitRein.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonProfAgreQuitRein.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonProfAgreQuitReinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonProfAgreQuitReinMouseExited(evt);
            }
        });
        botonProfAgreQuitRein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProfAgreQuitReinActionPerformed(evt);
            }
        });

        botonProfAgreQuitGuardar.setBackground(new java.awt.Color(255, 255, 255));
        botonProfAgreQuitGuardar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonProfAgreQuitGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonProfAgreQuitGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Boton.png"))); // NOI18N
        botonProfAgreQuitGuardar.setText("Guardar");
        botonProfAgreQuitGuardar.setBorderPainted(false);
        botonProfAgreQuitGuardar.setContentAreaFilled(false);
        botonProfAgreQuitGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonProfAgreQuitGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonProfAgreQuitGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonProfAgreQuitGuardarMouseExited(evt);
            }
        });
        botonProfAgreQuitGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProfAgreQuitGuardarActionPerformed(evt);
            }
        });

        botonProfAgreQuitAnular.setBackground(new java.awt.Color(255, 255, 255));
        botonProfAgreQuitAnular.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonProfAgreQuitAnular.setForeground(new java.awt.Color(255, 255, 255));
        botonProfAgreQuitAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Boton.png"))); // NOI18N
        botonProfAgreQuitAnular.setText("Anular");
        botonProfAgreQuitAnular.setBorderPainted(false);
        botonProfAgreQuitAnular.setContentAreaFilled(false);
        botonProfAgreQuitAnular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonProfAgreQuitAnular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonProfAgreQuitAnularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonProfAgreQuitAnularMouseExited(evt);
            }
        });
        botonProfAgreQuitAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProfAgreQuitAnularActionPerformed(evt);
            }
        });

        comboBoxProfAgreQuitEsp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboBoxProfAgreQuitEsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        etiquetaProfAgreQuitEsp.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaProfAgreQuitEsp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaProfAgreQuitEsp.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaProfAgreQuitEsp.setText("Especialidad:");

        javax.swing.GroupLayout panelGradProfAgreQuitLayout = new javax.swing.GroupLayout(panelGradProfAgreQuit);
        panelGradProfAgreQuit.setLayout(panelGradProfAgreQuitLayout);
        panelGradProfAgreQuitLayout.setHorizontalGroup(
            panelGradProfAgreQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradProfAgreQuitLayout.createSequentialGroup()
                .addGroup(panelGradProfAgreQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradProfAgreQuitLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(etiquetaProfAgreQuit)
                        .addGap(175, 175, 175))
                    .addGroup(panelGradProfAgreQuitLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(panelGradProfAgreQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGradProfAgreQuitLayout.createSequentialGroup()
                                .addComponent(etiquetaProfAgreQuitDNI)
                                .addGap(18, 18, 18)
                                .addComponent(textoProfAgreQuitDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonProfAgreQuitBuscar))
                            .addComponent(separadorProfAgreQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelGradProfAgreQuitLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(panelGradProfAgreQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelGradProfAgreQuitLayout.createSequentialGroup()
                                        .addComponent(botonProfAgreQuitRein)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonProfAgreQuitGuardar)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonProfAgreQuitAnular))
                                    .addGroup(panelGradProfAgreQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelGradProfAgreQuitLayout.createSequentialGroup()
                                            .addComponent(etiquetaProfAgreQuitNomYApe)
                                            .addGap(18, 18, 18)
                                            .addComponent(textoProfAgreQuitNomYApe, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelGradProfAgreQuitLayout.createSequentialGroup()
                                            .addComponent(etiquetaProfAgreQuitNumTel)
                                            .addGap(18, 18, 18)
                                            .addComponent(textoProfAgreQuitNumTel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelGradProfAgreQuitLayout.createSequentialGroup()
                                            .addGroup(panelGradProfAgreQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(etiquetaProfAgreQuitDom)
                                                .addComponent(etiquetaProfAgreQuitEsp)
                                                .addComponent(etiquetaProfAgreQuitEstado))
                                            .addGap(18, 18, 18)
                                            .addGroup(panelGradProfAgreQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textoProfAgreQuitDom)
                                                .addComponent(etiquetaProfAgreQuitAcONoac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(comboBoxProfAgreQuitEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)))
                .addComponent(botonAtrasProfAgreQuit)
                .addContainerGap())
        );
        panelGradProfAgreQuitLayout.setVerticalGroup(
            panelGradProfAgreQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradProfAgreQuitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradProfAgreQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAtrasProfAgreQuit)
                    .addComponent(etiquetaProfAgreQuit))
                .addGap(56, 56, 56)
                .addGroup(panelGradProfAgreQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonProfAgreQuitBuscar)
                    .addComponent(textoProfAgreQuitDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaProfAgreQuitDNI))
                .addGap(18, 18, 18)
                .addComponent(separadorProfAgreQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelGradProfAgreQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGradProfAgreQuitLayout.createSequentialGroup()
                        .addGroup(panelGradProfAgreQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoProfAgreQuitNomYApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaProfAgreQuitNomYApe))
                        .addGap(18, 18, 18)
                        .addGroup(panelGradProfAgreQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoProfAgreQuitNumTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaProfAgreQuitNumTel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelGradProfAgreQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoProfAgreQuitDom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaProfAgreQuitDom))
                        .addGap(18, 18, 18)
                        .addGroup(panelGradProfAgreQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxProfAgreQuitEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaProfAgreQuitEsp))
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaProfAgreQuitAcONoac, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaProfAgreQuitEstado))
                .addGap(18, 18, 18)
                .addGroup(panelGradProfAgreQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonProfAgreQuitRein)
                    .addComponent(botonProfAgreQuitGuardar)
                    .addComponent(botonProfAgreQuitAnular))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradProfAgreQuit, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradProfAgreQuit, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        setBounds(0, 0, 975, 575);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasProfAgreQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasProfAgreQuitActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasProfAgreQuitActionPerformed

    private void botonProfAgreQuitBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProfAgreQuitBuscarActionPerformed
        try{
            int Dni = Integer.parseInt(textoProfAgreQuitDNI.getText());
            botonProfAgreQuitGuardar.setEnabled(false);
            Prestador pres = presData.buscarPrestadorDni(Dni);
            if(pres.getTelefono()==0){
                limpiar();
            }else{
                textoProfAgreQuitNomYApe.setText(pres.getNombre());
                textoProfAgreQuitDom.setText(pres.getDomicilio());
                textoProfAgreQuitNumTel.setText(pres.getTelefono()+"");
                comboBoxProfAgreQuitEsp.setSelectedItem(pres.getEspecialidad());
                if(pres.isActivo()){
                    etiquetaProfAgreQuitAcONoac.setText("Activo");
                    botonProfAgreQuitRein.setEnabled(false);
                }else{
                    etiquetaProfAgreQuitAcONoac.setText("Inactivo");
                    botonProfAgreQuitRein.setEnabled(true);
                }
            }
        }catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(null, "Ingrese un DNI válido para buscar a un Prestador");
            limpiar();
        }
    }//GEN-LAST:event_botonProfAgreQuitBuscarActionPerformed

    private void botonProfAgreQuitReinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProfAgreQuitReinActionPerformed
        int Dni=Integer.parseInt(textoProfAgreQuitDNI.getText());
        presData.reinstituirPrestador(Dni);
        limpiar();
    }//GEN-LAST:event_botonProfAgreQuitReinActionPerformed

    private void botonProfAgreQuitGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProfAgreQuitGuardarActionPerformed
        try{
            if(textoProfAgreQuitDNI.getText().isEmpty() || textoProfAgreQuitNumTel.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Tiene que llenar la planilla para ingresar un Profesional");
            }else if(buscarDni(Integer.parseInt(textoProfAgreQuitDNI.getText()))){
                JOptionPane.showMessageDialog(null, "El DNI ingresado ya le pertenece a un Profesional registrado");
            }else{
                int Dni = Integer.parseInt(textoProfAgreQuitDNI.getText());
                int Tel = Integer.parseInt(textoProfAgreQuitNumTel.getText());
                Prestador pres = new Prestador();
                pres.setDni(Dni);
                pres.setNombre(textoProfAgreQuitNomYApe.getText());
                pres.setTelefono(Tel);
                pres.setDomicilio(textoProfAgreQuitDom.getText());
                //pres.setEspecialidad(comboBoxProfAgreQuitEsp.getItemAt(comboBoxProfAgreQuitEsp.getSelectedIndex()));
                pres.setActivo(true);
                presData.guardarPrestador(pres);
            }
        }catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(null, "Error al ingresar, caracteres erróneos");
        }catch(NullPointerException np){
            JOptionPane.showMessageDialog(null, "Tiene que llenar la planilla para ingresar un Profesional");
        }
        limpiar();
    }//GEN-LAST:event_botonProfAgreQuitGuardarActionPerformed

    private void botonProfAgreQuitAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProfAgreQuitAnularActionPerformed
        try{
            int Dni=Integer.parseInt(textoProfAgreQuitDNI.getText());
            presData.eliminarPrestador(Dni);
        }catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(null, "Ingrese el DNI de un Profesional para anularlo");
        }catch(NullPointerException np){
            JOptionPane.showMessageDialog(null, "Tiene que ingresar el DNI de un Profesional para anularlo");
        }
        limpiar();
    }//GEN-LAST:event_botonProfAgreQuitAnularActionPerformed

    private void botonAtrasProfAgreQuitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasProfAgreQuitMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonAtrasProfAgreQuitMouseEntered

    private void botonAtrasProfAgreQuitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasProfAgreQuitMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonAtrasProfAgreQuitMouseExited

    private void botonProfAgreQuitBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProfAgreQuitBuscarMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonProfAgreQuitBuscarMouseEntered

    private void botonProfAgreQuitBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProfAgreQuitBuscarMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonProfAgreQuitBuscarMouseExited

    private void botonProfAgreQuitReinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProfAgreQuitReinMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonProfAgreQuitReinMouseEntered

    private void botonProfAgreQuitReinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProfAgreQuitReinMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonProfAgreQuitReinMouseExited

    private void botonProfAgreQuitGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProfAgreQuitGuardarMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonProfAgreQuitGuardarMouseEntered

    private void botonProfAgreQuitGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProfAgreQuitGuardarMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonProfAgreQuitGuardarMouseExited

    private void botonProfAgreQuitAnularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProfAgreQuitAnularMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonProfAgreQuitAnularMouseEntered

    private void botonProfAgreQuitAnularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProfAgreQuitAnularMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonProfAgreQuitAnularMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasProfAgreQuit;
    private javax.swing.JButton botonProfAgreQuitAnular;
    private javax.swing.JButton botonProfAgreQuitBuscar;
    private javax.swing.JButton botonProfAgreQuitGuardar;
    private javax.swing.JButton botonProfAgreQuitRein;
    private javax.swing.JComboBox<String> comboBoxProfAgreQuitEsp;
    private javax.swing.JLabel etiquetaProfAgreQuit;
    private javax.swing.JLabel etiquetaProfAgreQuitAcONoac;
    private javax.swing.JLabel etiquetaProfAgreQuitDNI;
    private javax.swing.JLabel etiquetaProfAgreQuitDom;
    private javax.swing.JLabel etiquetaProfAgreQuitEsp;
    private javax.swing.JLabel etiquetaProfAgreQuitEstado;
    private javax.swing.JLabel etiquetaProfAgreQuitNomYApe;
    private javax.swing.JLabel etiquetaProfAgreQuitNumTel;
    private keeptoo.KGradientPanel panelGradProfAgreQuit;
    private javax.swing.JSeparator separadorProfAgreQuit;
    private javax.swing.JTextField textoProfAgreQuitDNI;
    private javax.swing.JTextField textoProfAgreQuitDom;
    private javax.swing.JTextField textoProfAgreQuitNomYApe;
    private javax.swing.JTextField textoProfAgreQuitNumTel;
    // End of variables declaration//GEN-END:variables

    private void limpiar(){
       
        textoProfAgreQuitNomYApe.setText("");
        textoProfAgreQuitNumTel.setText("");
        textoProfAgreQuitDom.setText("");
        etiquetaProfAgreQuitAcONoac.setText("");
        botonProfAgreQuitRein.setEnabled(false);
        botonProfAgreQuitGuardar.setEnabled(true);
    }
    
    private boolean buscarDni(int dni) {
        
        ArrayList<Prestador> prestador = presData.listarPrestador();
        boolean bd = false;
        for (Prestador pres : prestador) {
            if (pres.getDni() == dni) {
                bd = true;
                return bd;
            }
        }
        return bd;
    }
    
    private void cargarComboB() {
        
        EspecialidadData espData = new EspecialidadData();
        ArrayList<Especialidad> especialidades = espData.listarEspecialidad();
        comboBoxProfAgreQuitEsp.removeAllItems();
        for(int i = 0; i < especialidades.size(); i++) {
            comboBoxProfAgreQuitEsp.addItem(especialidades.get(i).getEspecialidad());
        }    
    }
}