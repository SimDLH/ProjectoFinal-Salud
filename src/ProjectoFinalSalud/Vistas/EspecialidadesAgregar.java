
package ProjectoFinalSalud.Vistas;

import ProjectoFinalSalud.AccesoDeDatos.EspecialidadData;
import ProjectoFinalSalud.Entidades.Especialidad;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class EspecialidadesAgregar extends javax.swing.JInternalFrame {

    EspecialidadData ed = new EspecialidadData();

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
        botonEspAgregarEsp = new javax.swing.JButton();
        botonAtrasEspAgreEsp = new javax.swing.JButton();

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

        botonEspAgregarEsp.setBackground(new java.awt.Color(255, 255, 255));
        botonEspAgregarEsp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonEspAgregarEsp.setForeground(new java.awt.Color(255, 255, 255));
        botonEspAgregarEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Boton.png"))); // NOI18N
        botonEspAgregarEsp.setText("Agregar");
        botonEspAgregarEsp.setBorderPainted(false);
        botonEspAgregarEsp.setContentAreaFilled(false);
        botonEspAgregarEsp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEspAgregarEsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEspAgregarEspMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEspAgregarEspMouseExited(evt);
            }
        });
        botonEspAgregarEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEspAgregarEspActionPerformed(evt);
            }
        });

        botonAtrasEspAgreEsp.setBackground(new java.awt.Color(255, 255, 255));
        botonAtrasEspAgreEsp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasEspAgreEsp.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasEspAgreEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso.png"))); // NOI18N
        botonAtrasEspAgreEsp.setText("Atrás");
        botonAtrasEspAgreEsp.setBorderPainted(false);
        botonAtrasEspAgreEsp.setContentAreaFilled(false);
        botonAtrasEspAgreEsp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtrasEspAgreEsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAtrasEspAgreEspMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAtrasEspAgreEspMouseExited(evt);
            }
        });
        botonAtrasEspAgreEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasEspAgreEspActionPerformed(evt);
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
                    .addComponent(botonEspAgregarEsp)
                    .addGroup(panelGradEspAgreLayout.createSequentialGroup()
                        .addGroup(panelGradEspAgreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoEspAgre, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaEspAgreIngr))
                        .addGap(190, 190, 190)
                        .addComponent(botonAtrasEspAgreEsp)))
                .addContainerGap())
        );
        panelGradEspAgreLayout.setVerticalGroup(
            panelGradEspAgreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradEspAgreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradEspAgreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAtrasEspAgreEsp)
                    .addComponent(etiquetaEspAgreIngr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(panelGradEspAgreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoEspAgre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaEspAgreNomEsp))
                .addGap(31, 31, 31)
                .addComponent(botonEspAgregarEsp)
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

    private void botonEspAgregarEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEspAgregarEspActionPerformed
        if (textoEspAgre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de una Especialidad");
        } else {
            buscarEspecialidad();

        }
        textoEspAgre.setText("");
    }//GEN-LAST:event_botonEspAgregarEspActionPerformed

    private void botonAtrasEspAgreEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasEspAgreEspActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasEspAgreEspActionPerformed

    private void botonAtrasEspAgreEspMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasEspAgreEspMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonAtrasEspAgreEspMouseEntered

    private void botonAtrasEspAgreEspMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasEspAgreEspMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonAtrasEspAgreEspMouseExited

    private void botonEspAgregarEspMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEspAgregarEspMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonEspAgregarEspMouseEntered

    private void botonEspAgregarEspMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEspAgregarEspMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonEspAgregarEspMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasEspAgreEsp;
    private javax.swing.JButton botonEspAgregarEsp;
    private javax.swing.JLabel etiquetaEspAgreIngr;
    private javax.swing.JLabel etiquetaEspAgreNomEsp;
    private keeptoo.KGradientPanel panelGradEspAgre;
    private javax.swing.JTextField textoEspAgre;
    // End of variables declaration//GEN-END:variables

    private void buscarEspecialidad() {
        
        ArrayList<Especialidad> listarEspecialidades = ed.listarEspecialidad();
        for (Especialidad esp : listarEspecialidades) {
            if (esp.getEspecialidad().equals(textoEspAgre.getText())) {
                JOptionPane.showMessageDialog(null, "Esta especialidad ya existe en la base");
                return;
            }

        }
        Especialidad especialidad = new Especialidad(textoEspAgre.getText());
        ed.guardarEspecialidad(especialidad);
    }
}