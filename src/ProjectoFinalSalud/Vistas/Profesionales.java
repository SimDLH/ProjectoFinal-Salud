
package ProjectoFinalSalud.Vistas;

import ProjectoFinalSalud.AccesoDeDatos.PrestadorData;
import ProjectoFinalSalud.Entidades.Prestador;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class Profesionales extends javax.swing.JInternalFrame {
    
    DefaultTableModel modelo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int colum) {
            return false;
        }
    };
    
    PrestadorData presData = new PrestadorData();
    
    public Profesionales() {    
        
        initComponents();
        armarTablaProfesionales();
        cargarTablaProfesionales();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }
    
    private void armarTablaProfesionales(){
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Telefono");
        modelo.addColumn("Especialidad");
        tablaProf.setModel(modelo);
        }
        
    private void cargarTablaProfesionales(){
        for(Prestador pres:presData.listarPrestador()){
            modelo.addRow(new Object[]{pres.getNombre(),pres.getDomicilio(),pres.getTelefono(),pres.getEspecialidad().getEspecialidad()});
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

        panelGradProf = new keeptoo.KGradientPanel();
        etiquetaProfCartilla = new javax.swing.JLabel();
        botonProfPedirOrden = new javax.swing.JButton();
        botonAtrasProf = new javax.swing.JButton();
        panelScrollTabla = new javax.swing.JScrollPane();
        tablaProf = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(975, 575));

        panelGradProf.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradProf.setkStartColor(new java.awt.Color(0, 153, 0));
        panelGradProf.setPreferredSize(new java.awt.Dimension(975, 575));

        etiquetaProfCartilla.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        etiquetaProfCartilla.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaProfCartilla.setText("Consulta Nuestra Cartilla Médica");

        botonProfPedirOrden.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        botonProfPedirOrden.setForeground(new java.awt.Color(255, 255, 255));
        botonProfPedirOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Boton.png"))); // NOI18N
        botonProfPedirOrden.setText("¡Pedir Orden!");
        botonProfPedirOrden.setBorderPainted(false);
        botonProfPedirOrden.setContentAreaFilled(false);
        botonProfPedirOrden.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonProfPedirOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProfPedirOrdenActionPerformed(evt);
            }
        });

        botonAtrasProf.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasProf.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso.png"))); // NOI18N
        botonAtrasProf.setText("Atrás");
        botonAtrasProf.setBorderPainted(false);
        botonAtrasProf.setContentAreaFilled(false);
        botonAtrasProf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtrasProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasProfActionPerformed(evt);
            }
        });

        tablaProf.setBackground(panelGradProf.getkStartColor());
        tablaProf.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tablaProf.setForeground(new java.awt.Color(255, 255, 255));
        tablaProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProf.getTableHeader().setReorderingAllowed(false);
        panelScrollTabla.setViewportView(tablaProf);
        if (tablaProf.getColumnModel().getColumnCount() > 0) {
            tablaProf.getColumnModel().getColumn(0).setResizable(false);
            tablaProf.getColumnModel().getColumn(1).setResizable(false);
            tablaProf.getColumnModel().getColumn(2).setResizable(false);
            tablaProf.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout panelGradProfLayout = new javax.swing.GroupLayout(panelGradProf);
        panelGradProf.setLayout(panelGradProfLayout);
        panelGradProfLayout.setHorizontalGroup(
            panelGradProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradProfLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(etiquetaProfCartilla)
                .addGroup(panelGradProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradProfLayout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(botonProfPedirOrden))
                    .addGroup(panelGradProfLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(botonAtrasProf)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradProfLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelScrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(412, 412, 412))
        );
        panelGradProfLayout.setVerticalGroup(
            panelGradProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradProfLayout.createSequentialGroup()
                .addGroup(panelGradProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradProfLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(etiquetaProfCartilla, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGradProfLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAtrasProf)))
                .addGap(18, 18, 18)
                .addComponent(panelScrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonProfPedirOrden)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradProf, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradProf, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        setBounds(300, 140, 975, 575);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasProfActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasProfActionPerformed

    private void botonProfPedirOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProfPedirOrdenActionPerformed
        
    }//GEN-LAST:event_botonProfPedirOrdenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasProf;
    private javax.swing.JButton botonProfPedirOrden;
    private javax.swing.JLabel etiquetaProfCartilla;
    private keeptoo.KGradientPanel panelGradProf;
    private javax.swing.JScrollPane panelScrollTabla;
    private javax.swing.JTable tablaProf;
    // End of variables declaration//GEN-END:variables
}