
package ProjectoFinalSalud.Vistas;

import ProjectoFinalSalud.AccesoDeDatos.EspecialidadData;
import ProjectoFinalSalud.Entidades.Especialidad;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class EspecialidadesAgregar extends javax.swing.JInternalFrame {

    EspecialidadData ed=new EspecialidadData();
    
    public EspecialidadesAgregar() {
        
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

        panelGradEspAgre = new keeptoo.KGradientPanel();
        etiquetaEspAgreIngr = new javax.swing.JLabel();
        etiquetaEspAgreNomEsp = new javax.swing.JLabel();
        textoEspAgre = new javax.swing.JTextField();
        ButtonAgregar = new javax.swing.JButton();
        botonAtrasEspAgre = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(975, 575));

        panelGradEspAgre.setBackground(new java.awt.Color(255, 255, 255));
        panelGradEspAgre.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradEspAgre.setkStartColor(new java.awt.Color(0, 153, 0));
        panelGradEspAgre.setPreferredSize(new java.awt.Dimension(975, 575));

        etiquetaEspAgreIngr.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaEspAgreIngr.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        etiquetaEspAgreIngr.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaEspAgreIngr.setText("Ingreso De Especialidades");

        etiquetaEspAgreNomEsp.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaEspAgreNomEsp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaEspAgreNomEsp.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaEspAgreNomEsp.setText("Nombre de la Especialidad:");

        ButtonAgregar.setBackground(new java.awt.Color(255, 255, 255));
        ButtonAgregar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        ButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Boton.png"))); // NOI18N
        ButtonAgregar.setText("Agregar");
        ButtonAgregar.setBorderPainted(false);
        ButtonAgregar.setContentAreaFilled(false);
        ButtonAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarActionPerformed(evt);
            }
        });

        botonAtrasEspAgre.setBackground(new java.awt.Color(255, 255, 255));
        botonAtrasEspAgre.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasEspAgre.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasEspAgre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso.png"))); // NOI18N
        botonAtrasEspAgre.setText("Atrás");
        botonAtrasEspAgre.setBorderPainted(false);
        botonAtrasEspAgre.setContentAreaFilled(false);
        botonAtrasEspAgre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtrasEspAgre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasEspAgreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGradEspAgreLayout = new javax.swing.GroupLayout(panelGradEspAgre);
        panelGradEspAgre.setLayout(panelGradEspAgreLayout);
        panelGradEspAgreLayout.setHorizontalGroup(
            panelGradEspAgreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradEspAgreLayout.createSequentialGroup()
                .addGap(0, 154, Short.MAX_VALUE)
                .addComponent(etiquetaEspAgreNomEsp)
                .addGap(18, 18, 18)
                .addGroup(panelGradEspAgreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonAgregar)
                    .addGroup(panelGradEspAgreLayout.createSequentialGroup()
                        .addGroup(panelGradEspAgreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoEspAgre, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaEspAgreIngr))
                        .addGap(190, 190, 190)
                        .addComponent(botonAtrasEspAgre)))
                .addContainerGap())
        );
        panelGradEspAgreLayout.setVerticalGroup(
            panelGradEspAgreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradEspAgreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradEspAgreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAtrasEspAgre)
                    .addComponent(etiquetaEspAgreIngr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(panelGradEspAgreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoEspAgre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaEspAgreNomEsp))
                .addGap(31, 31, 31)
                .addComponent(ButtonAgregar)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradEspAgre, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradEspAgre, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        setBounds(0, 0, 975, 575);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarActionPerformed
        if(textoEspAgre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de una Especialidad");
        }else{
        Especialidad especialidad=new Especialidad(textoEspAgre.getText());
        ed.guardarEspecialidad(especialidad);
        }
    }//GEN-LAST:event_ButtonAgregarActionPerformed

    private void botonAtrasEspAgreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasEspAgreActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasEspAgreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregar;
    private javax.swing.JButton botonAtrasEspAgre;
    private javax.swing.JLabel etiquetaEspAgreIngr;
    private javax.swing.JLabel etiquetaEspAgreNomEsp;
    private keeptoo.KGradientPanel panelGradEspAgre;
    private javax.swing.JTextField textoEspAgre;
    // End of variables declaration//GEN-END:variables
}