package ProjectoFinalSalud.Vistas;

import ProjectoFinalSalud.AccesoDeDatos.OrdenData;
import ProjectoFinalSalud.Entidades.Orden;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class OrdenPorFecha extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int colum) {
            return false;
        }
    };

    OrdenData od = new OrdenData();

    public OrdenPorFecha() {

        initComponents();
        armarCabecera();
        cargarDatos();

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradOrdenXFecha = new keeptoo.KGradientPanel();
        etiquetaOrdenXFecha = new javax.swing.JLabel();
        etiquetaOrdenXFechaFecha = new javax.swing.JLabel();
        calendarioFecha = new com.toedter.calendar.JDateChooser();
        botonOrdenXFechaBuscar = new javax.swing.JButton();
        botonAtrasOrdenXFecha = new javax.swing.JButton();
        panelScrollTabla = new javax.swing.JScrollPane();
        tablaOrdenXFecha = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(975, 575));

        panelGradOrdenXFecha.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradOrdenXFecha.setkStartColor(new java.awt.Color(0, 153, 0));
        panelGradOrdenXFecha.setPreferredSize(new java.awt.Dimension(975, 575));

        etiquetaOrdenXFecha.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        etiquetaOrdenXFecha.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaOrdenXFecha.setText("Búsqueda Por Fecha");

        etiquetaOrdenXFechaFecha.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaOrdenXFechaFecha.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaOrdenXFechaFecha.setText("Fecha:");

        botonOrdenXFechaBuscar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonOrdenXFechaBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonOrdenXFechaBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Boton.png"))); // NOI18N
        botonOrdenXFechaBuscar.setText("Buscar");
        botonOrdenXFechaBuscar.setBorderPainted(false);
        botonOrdenXFechaBuscar.setContentAreaFilled(false);
        botonOrdenXFechaBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOrdenXFechaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenXFechaBuscarActionPerformed(evt);
            }
        });

        botonAtrasOrdenXFecha.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasOrdenXFecha.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasOrdenXFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso.png"))); // NOI18N
        botonAtrasOrdenXFecha.setText("Atrás");
        botonAtrasOrdenXFecha.setBorderPainted(false);
        botonAtrasOrdenXFecha.setContentAreaFilled(false);
        botonAtrasOrdenXFecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtrasOrdenXFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasOrdenXFechaActionPerformed(evt);
            }
        });

        tablaOrdenXFecha.setBackground(panelGradOrdenXFecha.getkStartColor());
        tablaOrdenXFecha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaOrdenXFecha.setForeground(new java.awt.Color(255, 255, 255));
        tablaOrdenXFecha.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaOrdenXFecha.getTableHeader().setReorderingAllowed(false);
        panelScrollTabla.setViewportView(tablaOrdenXFecha);
        if (tablaOrdenXFecha.getColumnModel().getColumnCount() > 0) {
            tablaOrdenXFecha.getColumnModel().getColumn(0).setResizable(false);
            tablaOrdenXFecha.getColumnModel().getColumn(1).setResizable(false);
            tablaOrdenXFecha.getColumnModel().getColumn(2).setResizable(false);
            tablaOrdenXFecha.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout panelGradOrdenXFechaLayout = new javax.swing.GroupLayout(panelGradOrdenXFecha);
        panelGradOrdenXFecha.setLayout(panelGradOrdenXFechaLayout);
        panelGradOrdenXFechaLayout.setHorizontalGroup(
            panelGradOrdenXFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradOrdenXFechaLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(etiquetaOrdenXFechaFecha)
                .addGap(18, 18, 18)
                .addGroup(panelGradOrdenXFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradOrdenXFechaLayout.createSequentialGroup()
                        .addComponent(etiquetaOrdenXFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAtrasOrdenXFecha))
                    .addGroup(panelGradOrdenXFechaLayout.createSequentialGroup()
                        .addComponent(calendarioFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(botonOrdenXFechaBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelGradOrdenXFechaLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(panelScrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(383, Short.MAX_VALUE))
        );
        panelGradOrdenXFechaLayout.setVerticalGroup(
            panelGradOrdenXFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradOrdenXFechaLayout.createSequentialGroup()
                .addGroup(panelGradOrdenXFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradOrdenXFechaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAtrasOrdenXFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradOrdenXFechaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaOrdenXFecha)
                        .addGap(9, 9, 9)))
                .addGroup(panelGradOrdenXFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradOrdenXFechaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelGradOrdenXFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calendarioFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaOrdenXFechaFecha, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(panelGradOrdenXFechaLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(botonOrdenXFechaBuscar)))
                .addGap(18, 18, 18)
                .addComponent(panelScrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradOrdenXFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 1244, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradOrdenXFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        setBounds(0, 0, 975, 575);
    }// </editor-fold>//GEN-END:initComponents

    private void botonOrdenXFechaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenXFechaBuscarActionPerformed
        limpiarTabla();
        try {
            LocalDate fecha = calendarioFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            ArrayList<Orden> listaFecha = od.listarOrdenesPorFecha(fecha);

            for (Orden orden : listaFecha) {
                modelo.addRow(new Object[]{orden.getIdOrden(), orden.getAfiliado().getNombre(),
                    orden.getPrestador().getNombre(), orden.getFormaPago(), orden.getImporte()});

            }
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Fecha");

        }

    }//GEN-LAST:event_botonOrdenXFechaBuscarActionPerformed

    private void botonAtrasOrdenXFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasOrdenXFechaActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasOrdenXFechaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasOrdenXFecha;
    private javax.swing.JButton botonOrdenXFechaBuscar;
    private com.toedter.calendar.JDateChooser calendarioFecha;
    private javax.swing.JLabel etiquetaOrdenXFecha;
    private javax.swing.JLabel etiquetaOrdenXFechaFecha;
    private keeptoo.KGradientPanel panelGradOrdenXFecha;
    private javax.swing.JScrollPane panelScrollTabla;
    private javax.swing.JTable tablaOrdenXFecha;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("Código");
        modelo.addColumn("Afiliado");
        modelo.addColumn("Prestador");
        modelo.addColumn("Pago");
        modelo.addColumn("Importe");
        tablaOrdenXFecha.setModel(modelo);
    }

    private void cargarDatos() {
        ArrayList<Orden> listaFecha = new ArrayList<>();
        for (Orden orden : listaFecha) {
            modelo.addRow(new Object[]{orden.getIdOrden(), orden.getAfiliado().getNombre(),
                orden.getPrestador().getNombre(), orden.getFecha(), orden.getFormaPago(), orden.getImporte()});
        }
    }

    private void limpiarTabla() {
        int fila = modelo.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
}
