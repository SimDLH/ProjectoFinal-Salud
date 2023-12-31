
package ProjectoFinalSalud.Vistas;

import ProjectoFinalSalud.AccesoDeDatos.OrdenData;
import ProjectoFinalSalud.AccesoDeDatos.PrestadorData;
import ProjectoFinalSalud.Entidades.Orden;
import ProjectoFinalSalud.Entidades.Prestador;
import java.awt.Component;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class OrdenesPorPrestador extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int colum) {
            return false;
        }
    };

    PrestadorData pd = new PrestadorData();
    OrdenData od = new OrdenData();

    public OrdenesPorPrestador() {

        initComponents();
        armarCabecera();
        cargarComboPrestador();
        
        resizeColumnWidth(tablaOrdenXPres);
        tablaOrdenXPres.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }
    
    private String ordenarFecha(Orden orden) {
        
        String stri = "" + orden.getFecha().getDayOfMonth() + "/" + orden.getFecha().getMonthValue() + "/" + orden.getFecha().getYear();
        return stri;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradOrdenXPres = new keeptoo.KGradientPanel();
        etiquetaOrdenXPres = new javax.swing.JLabel();
        etiquetaOrdenXPresSelec = new javax.swing.JLabel();
        comboBoxOrdenXPres = new javax.swing.JComboBox<>();
        botonAtrasOrdenXPrest = new javax.swing.JButton();
        panelScrollTabla = new javax.swing.JScrollPane();
        tablaOrdenXPres = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(975, 575));

        panelGradOrdenXPres.setBackground(new java.awt.Color(255, 255, 255));
        panelGradOrdenXPres.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradOrdenXPres.setkStartColor(new java.awt.Color(0, 153, 0));
        panelGradOrdenXPres.setPreferredSize(new java.awt.Dimension(975, 575));

        etiquetaOrdenXPres.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaOrdenXPres.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        etiquetaOrdenXPres.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaOrdenXPres.setText("Ordenes Por Profesional");

        etiquetaOrdenXPresSelec.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaOrdenXPresSelec.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaOrdenXPresSelec.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaOrdenXPresSelec.setText("Seleccione:");

        comboBoxOrdenXPres.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        comboBoxOrdenXPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxOrdenXPresActionPerformed(evt);
            }
        });

        botonAtrasOrdenXPrest.setBackground(new java.awt.Color(255, 255, 255));
        botonAtrasOrdenXPrest.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasOrdenXPrest.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasOrdenXPrest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso.png"))); // NOI18N
        botonAtrasOrdenXPrest.setText("Atrás");
        botonAtrasOrdenXPrest.setBorderPainted(false);
        botonAtrasOrdenXPrest.setContentAreaFilled(false);
        botonAtrasOrdenXPrest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtrasOrdenXPrest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAtrasOrdenXPrestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAtrasOrdenXPrestMouseExited(evt);
            }
        });
        botonAtrasOrdenXPrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasOrdenXPrestActionPerformed(evt);
            }
        });

        tablaOrdenXPres.setBackground(panelGradOrdenXPres.getkStartColor());
        tablaOrdenXPres.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaOrdenXPres.setForeground(new java.awt.Color(255, 255, 255));
        tablaOrdenXPres.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaOrdenXPres.getTableHeader().setReorderingAllowed(false);
        panelScrollTabla.setViewportView(tablaOrdenXPres);
        if (tablaOrdenXPres.getColumnModel().getColumnCount() > 0) {
            tablaOrdenXPres.getColumnModel().getColumn(0).setResizable(false);
            tablaOrdenXPres.getColumnModel().getColumn(1).setResizable(false);
            tablaOrdenXPres.getColumnModel().getColumn(2).setResizable(false);
            tablaOrdenXPres.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout panelGradOrdenXPresLayout = new javax.swing.GroupLayout(panelGradOrdenXPres);
        panelGradOrdenXPres.setLayout(panelGradOrdenXPresLayout);
        panelGradOrdenXPresLayout.setHorizontalGroup(
            panelGradOrdenXPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradOrdenXPresLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(etiquetaOrdenXPresSelec)
                .addGap(18, 18, 18)
                .addComponent(comboBoxOrdenXPres, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradOrdenXPresLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(panelGradOrdenXPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradOrdenXPresLayout.createSequentialGroup()
                        .addComponent(etiquetaOrdenXPres)
                        .addGap(196, 196, 196)
                        .addComponent(botonAtrasOrdenXPrest)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradOrdenXPresLayout.createSequentialGroup()
                        .addComponent(panelScrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
        );
        panelGradOrdenXPresLayout.setVerticalGroup(
            panelGradOrdenXPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradOrdenXPresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradOrdenXPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAtrasOrdenXPrest)
                    .addComponent(etiquetaOrdenXPres))
                .addGap(65, 65, 65)
                .addGroup(panelGradOrdenXPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaOrdenXPresSelec)
                    .addComponent(comboBoxOrdenXPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(panelScrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradOrdenXPres, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradOrdenXPres, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        setBounds(0, 0, 975, 575);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasOrdenXPrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasOrdenXPrestActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasOrdenXPrestActionPerformed

    private void botonAtrasOrdenXPrestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasOrdenXPrestMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonAtrasOrdenXPrestMouseEntered

    private void botonAtrasOrdenXPrestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasOrdenXPrestMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonAtrasOrdenXPrestMouseExited

    private void comboBoxOrdenXPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxOrdenXPresActionPerformed
        limpiarTabla();
        Prestador prest = (Prestador)comboBoxOrdenXPres.getSelectedItem();
        cargarTabla(od.OrdenesPorPrestador(prest.getIdPrestador()));
    }//GEN-LAST:event_comboBoxOrdenXPresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasOrdenXPrest;
    private javax.swing.JComboBox<Prestador> comboBoxOrdenXPres;
    private javax.swing.JLabel etiquetaOrdenXPres;
    private javax.swing.JLabel etiquetaOrdenXPresSelec;
    private keeptoo.KGradientPanel panelGradOrdenXPres;
    private javax.swing.JScrollPane panelScrollTabla;
    private javax.swing.JTable tablaOrdenXPres;
    // End of variables declaration//GEN-END:variables

    private void cargarComboPrestador() {

        ArrayList<Prestador> prestadores = pd.listarPrestador();
        for (Prestador pres : prestadores) {
            comboBoxOrdenXPres.addItem(pres);
        }
    }

    private void armarCabecera() {
        
        modelo.addColumn("Código");
        modelo.addColumn("Afiliado");
        modelo.addColumn("Fecha");
        modelo.addColumn("Pago");
        modelo.addColumn("Importe");
        tablaOrdenXPres.setModel(modelo);
    }

    private void limpiarTabla() {
        
        int fila = modelo.getRowCount();
        for(int i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void cargarTabla(ArrayList<Orden> listarOrdenP) {
        
        for (Orden orden:listarOrdenP) {
            modelo.addRow(new Object[]{orden.getIdOrden(), orden.getAfiliado().getNombre(), ordenarFecha(orden), orden.getFormaPago(), orden.getImporte()});
            }
    }
    
    private void resizeColumnWidth(JTable tablaOrdenXPres) {

    TableColumnModel columnModel = tablaOrdenXPres.getColumnModel();
        for (int column = 0; column < tablaOrdenXPres.getColumnCount(); column++) {
            int width = 150;
            for (int row = 0; row < tablaOrdenXPres.getRowCount(); row++) {
                TableCellRenderer renderer = tablaOrdenXPres.getCellRenderer(row, column);
                Component comp = tablaOrdenXPres.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
        if (width > 300) {
            width = 300;
        }
        columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
}