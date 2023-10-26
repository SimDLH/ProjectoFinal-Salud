
package ProjectoFinalSalud.Vistas;

import ProjectoFinalSalud.AccesoDeDatos.PrestadorData;
import ProjectoFinalSalud.Entidades.Prestador;
import java.awt.Component;
import java.awt.Cursor;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class ProfesionalesConsultas extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int colum) {
            return false;
        }
    };
    
    PrestadorData presData = new PrestadorData();
    
    public ProfesionalesConsultas() {
        
        initComponents();
        armarTablaProfesionales();
        cargarTablaProfesionales();
        resizeColumnWidth(tablaProf);
        tablaProf.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }
    
    private void armarTablaProfesionales(){
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Especialidad");
        tablaProf.setModel(modelo);
        }
        
    private void cargarTablaProfesionales(){
        for(Prestador pres:presData.listarPrestador()){
            modelo.addRow(new Object[]{pres.getNombre(),pres.getDomicilio(),pres.getTelefono(),pres.getEspecialidad().getEspecialidad()});
        }
    }
    
    private void resizeColumnWidth(JTable tablaProf) {

    TableColumnModel columnModel = tablaProf.getColumnModel();
        for (int column = 0; column < tablaProf.getColumnCount(); column++) {
            int width = 150;
            for (int row = 0; row < tablaProf.getRowCount(); row++) {
                TableCellRenderer renderer = tablaProf.getCellRenderer(row, column);
                Component comp = tablaProf.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
        if (width > 300) {
            width = 300;
        }
        columnModel.getColumn(column).setPreferredWidth(width);
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

        panelGradProfConsul = new keeptoo.KGradientPanel();
        etiquetaProfCartilla = new javax.swing.JLabel();
        botonProfPedirOrden = new javax.swing.JButton();
        botonAtrasProfConsul = new javax.swing.JButton();
        panelScrollTabla = new javax.swing.JScrollPane();
        tablaProf = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(975, 575));

        panelGradProfConsul.setBackground(new java.awt.Color(255, 255, 255));
        panelGradProfConsul.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradProfConsul.setkStartColor(new java.awt.Color(0, 153, 0));
        panelGradProfConsul.setPreferredSize(new java.awt.Dimension(975, 575));

        etiquetaProfCartilla.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaProfCartilla.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        etiquetaProfCartilla.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaProfCartilla.setText("Consulta Nuestra Cartilla Médica");

        botonProfPedirOrden.setBackground(new java.awt.Color(255, 255, 255));
        botonProfPedirOrden.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonProfPedirOrden.setForeground(new java.awt.Color(255, 255, 255));
        botonProfPedirOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Boton.png"))); // NOI18N
        botonProfPedirOrden.setText("¡Pedir Orden!");
        botonProfPedirOrden.setBorderPainted(false);
        botonProfPedirOrden.setContentAreaFilled(false);
        botonProfPedirOrden.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonProfPedirOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonProfPedirOrdenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonProfPedirOrdenMouseExited(evt);
            }
        });
        botonProfPedirOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProfPedirOrdenActionPerformed(evt);
            }
        });

        botonAtrasProfConsul.setBackground(new java.awt.Color(255, 255, 255));
        botonAtrasProfConsul.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasProfConsul.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasProfConsul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso.png"))); // NOI18N
        botonAtrasProfConsul.setText("Atrás");
        botonAtrasProfConsul.setBorderPainted(false);
        botonAtrasProfConsul.setContentAreaFilled(false);
        botonAtrasProfConsul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtrasProfConsul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAtrasProfConsulMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAtrasProfConsulMouseExited(evt);
            }
        });
        botonAtrasProfConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasProfConsulActionPerformed(evt);
            }
        });

        tablaProf.setBackground(panelGradProfConsul.getkStartColor());
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

        javax.swing.GroupLayout panelGradProfConsulLayout = new javax.swing.GroupLayout(panelGradProfConsul);
        panelGradProfConsul.setLayout(panelGradProfConsulLayout);
        panelGradProfConsulLayout.setHorizontalGroup(
            panelGradProfConsulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradProfConsulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaProfCartilla)
                .addGap(157, 157, 157)
                .addComponent(botonAtrasProfConsul)
                .addContainerGap())
            .addGroup(panelGradProfConsulLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(panelGradProfConsulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonProfPedirOrden)
                    .addComponent(panelScrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        panelGradProfConsulLayout.setVerticalGroup(
            panelGradProfConsulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradProfConsulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradProfConsulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAtrasProfConsul)
                    .addComponent(etiquetaProfCartilla))
                .addGap(60, 60, 60)
                .addComponent(panelScrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(botonProfPedirOrden)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradProfConsul, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradProfConsul, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        setBounds(0, 0, 975, 575);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasProfConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasProfConsulActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasProfConsulActionPerformed

    private void botonProfPedirOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProfPedirOrdenActionPerformed
        panelGradProfConsul.removeAll();
        panelGradProfConsul.repaint();
        OrdenesSacar ordSac = new OrdenesSacar();
        panelGradProfConsul.add(ordSac);
        ordSac.setVisible(true);
    }//GEN-LAST:event_botonProfPedirOrdenActionPerformed

    private void botonAtrasProfConsulMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasProfConsulMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonAtrasProfConsulMouseEntered

    private void botonAtrasProfConsulMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasProfConsulMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonAtrasProfConsulMouseExited

    private void botonProfPedirOrdenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProfPedirOrdenMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonProfPedirOrdenMouseEntered

    private void botonProfPedirOrdenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProfPedirOrdenMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonProfPedirOrdenMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasProfConsul;
    private javax.swing.JButton botonProfPedirOrden;
    private javax.swing.JLabel etiquetaProfCartilla;
    private keeptoo.KGradientPanel panelGradProfConsul;
    private javax.swing.JScrollPane panelScrollTabla;
    private javax.swing.JTable tablaProf;
    // End of variables declaration//GEN-END:variables
}