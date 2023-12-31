
package ProjectoFinalSalud.Vistas;

import ProjectoFinalSalud.AccesoDeDatos.OrdenData;
import ProjectoFinalSalud.Entidades.Orden;
import java.awt.Component;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class ConsultasOrdenes extends javax.swing.JInternalFrame {

    OrdenData od = new OrdenData();

    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int colum) {
            return false;
        }
    };

    public ConsultasOrdenes() {
        
        initComponents();
        armarCabecera();
        cargarTabla();
        
        resizeColumnWidth(tablaConsulOrden);
        tablaConsulOrden.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }
    
    private String ordenarFecha(Orden orden) {
        
        String stri = "" + orden.getFecha().getDayOfMonth() + "/" + orden.getFecha().getMonthValue() + "/" + orden.getFecha().getYear();
        return stri;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConsulConsulOrden = new keeptoo.KGradientPanel();
        etiquetaConsulOrden = new javax.swing.JLabel();
        botonAtrasConsulOrden = new javax.swing.JButton();
        panelScrollConsulOrden = new javax.swing.JScrollPane();
        tablaConsulOrden = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(975, 575));

        panelConsulConsulOrden.setBackground(new java.awt.Color(255, 255, 255));
        panelConsulConsulOrden.setkEndColor(new java.awt.Color(0, 153, 255));
        panelConsulConsulOrden.setkStartColor(new java.awt.Color(0, 153, 0));

        etiquetaConsulOrden.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaConsulOrden.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        etiquetaConsulOrden.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaConsulOrden.setText("Consultar Ordenes");

        botonAtrasConsulOrden.setBackground(new java.awt.Color(255, 255, 255));
        botonAtrasConsulOrden.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasConsulOrden.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasConsulOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso.png"))); // NOI18N
        botonAtrasConsulOrden.setText("Atrás");
        botonAtrasConsulOrden.setBorderPainted(false);
        botonAtrasConsulOrden.setContentAreaFilled(false);
        botonAtrasConsulOrden.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtrasConsulOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAtrasConsulOrdenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAtrasConsulOrdenMouseExited(evt);
            }
        });
        botonAtrasConsulOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasConsulOrdenActionPerformed(evt);
            }
        });

        tablaConsulOrden.setBackground(panelConsulConsulOrden.getkStartColor());
        tablaConsulOrden.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaConsulOrden.setForeground(new java.awt.Color(255, 255, 255));
        tablaConsulOrden.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaConsulOrden.getTableHeader().setReorderingAllowed(false);
        panelScrollConsulOrden.setViewportView(tablaConsulOrden);
        if (tablaConsulOrden.getColumnModel().getColumnCount() > 0) {
            tablaConsulOrden.getColumnModel().getColumn(0).setResizable(false);
            tablaConsulOrden.getColumnModel().getColumn(1).setResizable(false);
            tablaConsulOrden.getColumnModel().getColumn(2).setResizable(false);
            tablaConsulOrden.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout panelConsulConsulOrdenLayout = new javax.swing.GroupLayout(panelConsulConsulOrden);
        panelConsulConsulOrden.setLayout(panelConsulConsulOrdenLayout);
        panelConsulConsulOrdenLayout.setHorizontalGroup(
            panelConsulConsulOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsulConsulOrdenLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(panelConsulConsulOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsulConsulOrdenLayout.createSequentialGroup()
                        .addComponent(etiquetaConsulOrden)
                        .addGap(218, 218, 218)
                        .addComponent(botonAtrasConsulOrden)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsulConsulOrdenLayout.createSequentialGroup()
                        .addComponent(panelScrollConsulOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        panelConsulConsulOrdenLayout.setVerticalGroup(
            panelConsulConsulOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsulConsulOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConsulConsulOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAtrasConsulOrden)
                    .addComponent(etiquetaConsulOrden))
                .addGap(116, 116, 116)
                .addComponent(panelScrollConsulOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConsulConsulOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConsulConsulOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 975, 575);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasConsulOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasConsulOrdenActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasConsulOrdenActionPerformed

    private void botonAtrasConsulOrdenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasConsulOrdenMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonAtrasConsulOrdenMouseEntered

    private void botonAtrasConsulOrdenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasConsulOrdenMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonAtrasConsulOrdenMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasConsulOrden;
    private javax.swing.JLabel etiquetaConsulOrden;
    private keeptoo.KGradientPanel panelConsulConsulOrden;
    private javax.swing.JScrollPane panelScrollConsulOrden;
    private javax.swing.JTable tablaConsulOrden;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        
        modelo.addColumn("Código");
        modelo.addColumn("Afiliado");
        modelo.addColumn("Prestador");
        modelo.addColumn("Fecha");
        modelo.addColumn("Pago");
        modelo.addColumn("Importe");
        tablaConsulOrden.setModel(modelo);
    }

    private void limpiarTabla() {
        
        int fila = modelo.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarTabla() {
        
        ArrayList<Orden> listarOrdenes = od.ListarOrdenes();
        for (Orden orden : listarOrdenes) {
            modelo.addRow(new Object[]{orden.getIdOrden(), orden.getAfiliado().getNombre(),
                orden.getPrestador().getNombre(),
                ordenarFecha(orden), orden.getFormaPago(), orden.getImporte()});
        }
    }
    
    private void resizeColumnWidth(JTable tablaConsulOrden) {

    TableColumnModel columnModel = tablaConsulOrden.getColumnModel();
        for (int column = 0; column < tablaConsulOrden.getColumnCount(); column++) {
            int width = 150;
            for (int row = 0; row < tablaConsulOrden.getRowCount(); row++) {
                TableCellRenderer renderer = tablaConsulOrden.getCellRenderer(row, column);
                Component comp = tablaConsulOrden.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
        if (width > 300) {
            width = 300;
        }
        columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
}