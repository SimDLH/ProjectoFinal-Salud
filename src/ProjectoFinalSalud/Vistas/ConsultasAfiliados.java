
package ProjectoFinalSalud.Vistas;

import ProjectoFinalSalud.AccesoDeDatos.AfiliadoData;
import ProjectoFinalSalud.Entidades.Afiliado;
import java.awt.Component;
import java.awt.Cursor;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class ConsultasAfiliados extends javax.swing.JInternalFrame {
    
    DefaultTableModel modelo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int colum) {
            return false;
        }
    };
    
    AfiliadoData ad=new AfiliadoData();
    
    public ConsultasAfiliados() {
        
        initComponents();
        armarCabesera();
        cargarTabla();
        resizeColumnWidth(tablaListaAfi);
        tablaListaAfi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
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

        panelGradConsConsAfi = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        panelScrollTablaListaAfi = new javax.swing.JScrollPane();
        tablaListaAfi = new javax.swing.JTable();
        botonAtrasProfConsul = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(975, 575));

        panelGradConsConsAfi.setBackground(new java.awt.Color(255, 255, 255));
        panelGradConsConsAfi.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradConsConsAfi.setkStartColor(new java.awt.Color(0, 153, 0));
        panelGradConsConsAfi.setPreferredSize(new java.awt.Dimension(975, 575));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultar Afiliados");

        tablaListaAfi.setBackground(panelGradConsConsAfi.getkStartColor());
        tablaListaAfi.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaListaAfi.setForeground(new java.awt.Color(255, 255, 255));
        tablaListaAfi.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaListaAfi.getTableHeader().setReorderingAllowed(false);
        panelScrollTablaListaAfi.setViewportView(tablaListaAfi);
        if (tablaListaAfi.getColumnModel().getColumnCount() > 0) {
            tablaListaAfi.getColumnModel().getColumn(0).setResizable(false);
            tablaListaAfi.getColumnModel().getColumn(1).setResizable(false);
            tablaListaAfi.getColumnModel().getColumn(2).setResizable(false);
            tablaListaAfi.getColumnModel().getColumn(3).setResizable(false);
        }

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

        javax.swing.GroupLayout panelGradConsConsAfiLayout = new javax.swing.GroupLayout(panelGradConsConsAfi);
        panelGradConsConsAfi.setLayout(panelGradConsConsAfiLayout);
        panelGradConsConsAfiLayout.setHorizontalGroup(
            panelGradConsConsAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradConsConsAfiLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(panelGradConsConsAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradConsConsAfiLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(245, 245, 245)
                        .addComponent(botonAtrasProfConsul)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradConsConsAfiLayout.createSequentialGroup()
                        .addComponent(panelScrollTablaListaAfi, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        panelGradConsConsAfiLayout.setVerticalGroup(
            panelGradConsConsAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradConsConsAfiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradConsConsAfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAtrasProfConsul)
                    .addComponent(jLabel1))
                .addGap(112, 112, 112)
                .addComponent(panelScrollTablaListaAfi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradConsConsAfi, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradConsConsAfi, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        setBounds(0, 0, 975, 575);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasProfConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasProfConsulActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasProfConsulActionPerformed

    private void botonAtrasProfConsulMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasProfConsulMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonAtrasProfConsulMouseEntered

    private void botonAtrasProfConsulMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasProfConsulMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonAtrasProfConsulMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasProfConsul;
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel panelGradConsConsAfi;
    private javax.swing.JScrollPane panelScrollTablaListaAfi;
    private javax.swing.JTable tablaListaAfi;
    // End of variables declaration//GEN-END:variables

    private void armarCabesera(){
        modelo.addColumn("ID");
        modelo.addColumn("Nombre y Apellido");
        modelo.addColumn("Número de Documento");
        modelo.addColumn("Número Telefónico");
        modelo.addColumn("Domicilio");
        tablaListaAfi.setModel(modelo);
    }
  
    private void cargarTabla(){
        for(Afiliado afi:ad.listarAfiliados()){
            modelo.addRow(new Object[]{afi.getIdAfiliado(),afi.getNombre(),afi.getDni(),afi.getTelefono(),afi.getDomicilio()});
        }
    }
    
    private void resizeColumnWidth(JTable tablaListaAfi) {

        TableColumnModel columnModel = tablaListaAfi.getColumnModel();
        for (int column = 0; column < tablaListaAfi.getColumnCount(); column++) {
            int width = 150;
            for (int row = 0; row < tablaListaAfi.getRowCount(); row++) {
                TableCellRenderer renderer = tablaListaAfi.getCellRenderer(row, column);
                Component comp = tablaListaAfi.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
        if (width > 300) {
            width = 300;
        }
        columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
}