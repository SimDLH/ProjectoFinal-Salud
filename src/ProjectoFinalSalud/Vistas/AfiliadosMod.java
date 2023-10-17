
package ProjectoFinalSalud.Vistas;

import ProjectoFinalSalud.AccesoDeDatos.AfiliadoData;
import ProjectoFinalSalud.Entidades.Afiliado;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class AfiliadosMod extends javax.swing.JInternalFrame {

    AfiliadoData ad=new AfiliadoData();
    
    public AfiliadosMod() {
        
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

        panelGradAfiModAfi = new keeptoo.KGradientPanel();
        etiquetaAfiModAfi = new javax.swing.JLabel();
        etiquetaAfiModNumDoc = new javax.swing.JLabel();
        etiquetaAfiModNomYApe = new javax.swing.JLabel();
        etiquetaAfiModNumTel = new javax.swing.JLabel();
        etiquetaAfiModDom = new javax.swing.JLabel();
        textoAfiModDNI = new javax.swing.JTextField();
        textoAfiModNomYApe = new javax.swing.JTextField();
        textoAfiModNumTel = new javax.swing.JTextField();
        textoAfiModDom = new javax.swing.JTextField();
        botonAfiModBuscar = new javax.swing.JButton();
        botonAfiModModif = new javax.swing.JButton();
        botonAtrasAfiMod = new javax.swing.JButton();
        separadorAfiMod = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(975, 575));

        panelGradAfiModAfi.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradAfiModAfi.setkStartColor(new java.awt.Color(0, 153, 0));
        panelGradAfiModAfi.setPreferredSize(new java.awt.Dimension(975, 575));

        etiquetaAfiModAfi.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        etiquetaAfiModAfi.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaAfiModAfi.setText("Modificar Afiliados");

        etiquetaAfiModNumDoc.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaAfiModNumDoc.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaAfiModNumDoc.setText("Número de Documento:");

        etiquetaAfiModNomYApe.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaAfiModNomYApe.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaAfiModNomYApe.setText("Nombre y Apellido:");

        etiquetaAfiModNumTel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaAfiModNumTel.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaAfiModNumTel.setText("Número de Teléfono:");

        etiquetaAfiModDom.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaAfiModDom.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaAfiModDom.setText("Domicilio:");

        botonAfiModBuscar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAfiModBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonAfiModBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Boton.png"))); // NOI18N
        botonAfiModBuscar.setText("Buscar");
        botonAfiModBuscar.setBorderPainted(false);
        botonAfiModBuscar.setContentAreaFilled(false);
        botonAfiModBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAfiModBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAfiModBuscarActionPerformed(evt);
            }
        });

        botonAfiModModif.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAfiModModif.setForeground(new java.awt.Color(255, 255, 255));
        botonAfiModModif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Boton.png"))); // NOI18N
        botonAfiModModif.setText("Modificar");
        botonAfiModModif.setBorderPainted(false);
        botonAfiModModif.setContentAreaFilled(false);
        botonAfiModModif.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAfiModModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAfiModModifActionPerformed(evt);
            }
        });

        botonAtrasAfiMod.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasAfiMod.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasAfiMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso.png"))); // NOI18N
        botonAtrasAfiMod.setText("Atrás");
        botonAtrasAfiMod.setBorderPainted(false);
        botonAtrasAfiMod.setContentAreaFilled(false);
        botonAtrasAfiMod.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtrasAfiMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasAfiModActionPerformed(evt);
            }
        });

        separadorAfiMod.setForeground(new java.awt.Color(255, 255, 255));
        separadorAfiMod.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout panelGradAfiModAfiLayout = new javax.swing.GroupLayout(panelGradAfiModAfi);
        panelGradAfiModAfi.setLayout(panelGradAfiModAfiLayout);
        panelGradAfiModAfiLayout.setHorizontalGroup(
            panelGradAfiModAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradAfiModAfiLayout.createSequentialGroup()
                .addGroup(panelGradAfiModAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradAfiModAfiLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(panelGradAfiModAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaAfiModNomYApe)
                            .addComponent(etiquetaAfiModNumTel)
                            .addComponent(etiquetaAfiModDom))
                        .addGap(18, 18, 18)
                        .addGroup(panelGradAfiModAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoAfiModNumTel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoAfiModNomYApe, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoAfiModDom, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelGradAfiModAfiLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(panelGradAfiModAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAfiModModif)
                            .addGroup(panelGradAfiModAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(separadorAfiMod, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelGradAfiModAfiLayout.createSequentialGroup()
                                    .addComponent(etiquetaAfiModNumDoc)
                                    .addGap(18, 18, 18)
                                    .addGroup(panelGradAfiModAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelGradAfiModAfiLayout.createSequentialGroup()
                                            .addComponent(textoAfiModDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(botonAfiModBuscar))
                                        .addComponent(etiquetaAfiModAfi)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                        .addComponent(botonAtrasAfiMod)))
                .addContainerGap())
        );
        panelGradAfiModAfiLayout.setVerticalGroup(
            panelGradAfiModAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradAfiModAfiLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelGradAfiModAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradAfiModAfiLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(etiquetaAfiModAfi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelGradAfiModAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaAfiModNumDoc)
                            .addComponent(textoAfiModDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAfiModBuscar)))
                    .addComponent(botonAtrasAfiMod))
                .addGap(40, 40, 40)
                .addComponent(separadorAfiMod, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(panelGradAfiModAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoAfiModNomYApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaAfiModNomYApe))
                .addGap(35, 35, 35)
                .addGroup(panelGradAfiModAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoAfiModNumTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaAfiModNumTel))
                .addGap(35, 35, 35)
                .addGroup(panelGradAfiModAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoAfiModDom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaAfiModDom))
                .addGap(18, 18, 18)
                .addComponent(botonAfiModModif)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradAfiModAfi, javax.swing.GroupLayout.DEFAULT_SIZE, 1244, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradAfiModAfi, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        setBounds(0, 0, 975, 575);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAfiModBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAfiModBuscarActionPerformed
        try{
            int dni=Integer.parseInt(textoAfiModDNI.getText());
            Afiliado af=ad.buscarAfiliadosActivos(dni);
            if (af.getTelefono()==0){
                limpiar();
            }else{
            textoAfiModNomYApe.setText(af.getNombre());
            textoAfiModDom.setText(af.getDomicilio());
            textoAfiModNumTel.setText(af.getTelefono()+"");
            }
        }catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(null, "Ingrese un número de documento válido para buscar a un Afiliado");
            limpiar();
        }
    }//GEN-LAST:event_botonAfiModBuscarActionPerformed

    private void botonAfiModModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAfiModModifActionPerformed
        try{
            if (textoAfiModDNI.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Ingrese un DNI para buscar un Afiliado");
            }else if(textoAfiModNumTel.getText().isEmpty() || textoAfiModNomYApe.getText().isEmpty() || textoAfiModDom.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Tiene que llenar la planilla para confirmar la modificacion del Afiliado");
            }else{
        int dni=Integer.parseInt(textoAfiModDNI.getText());
        int num=Integer.parseInt(textoAfiModNumTel.getText());
        Afiliado afiliado=new Afiliado(textoAfiModNomYApe.getText(),dni,textoAfiModDom.getText(),num,true);
        ad.modificarAfiliado(afiliado);
            }
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Error de ingreso de datos, revise los datos ingresados");
        }
        limpiar();
    }//GEN-LAST:event_botonAfiModModifActionPerformed

    private void botonAtrasAfiModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasAfiModActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasAfiModActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAfiModBuscar;
    private javax.swing.JButton botonAfiModModif;
    private javax.swing.JButton botonAtrasAfiMod;
    private javax.swing.JLabel etiquetaAfiModAfi;
    private javax.swing.JLabel etiquetaAfiModDom;
    private javax.swing.JLabel etiquetaAfiModNomYApe;
    private javax.swing.JLabel etiquetaAfiModNumDoc;
    private javax.swing.JLabel etiquetaAfiModNumTel;
    private keeptoo.KGradientPanel panelGradAfiModAfi;
    private javax.swing.JSeparator separadorAfiMod;
    private javax.swing.JTextField textoAfiModDNI;
    private javax.swing.JTextField textoAfiModDom;
    private javax.swing.JTextField textoAfiModNomYApe;
    private javax.swing.JTextField textoAfiModNumTel;
    // End of variables declaration//GEN-END:variables

  private void limpiar(){
        textoAfiModDNI.setText("");
        textoAfiModDom.setText("");
        textoAfiModNomYApe.setText("");
        textoAfiModNumTel.setText("");
        
    }
}
