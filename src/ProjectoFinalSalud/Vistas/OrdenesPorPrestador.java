package ProjectoFinalSalud.Vistas;

import ProjectoFinalSalud.AccesoDeDatos.OrdenData;
import ProjectoFinalSalud.AccesoDeDatos.PrestadorData;
import ProjectoFinalSalud.Entidades.Orden;
import ProjectoFinalSalud.Entidades.Prestador;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

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
        cargarComboPrestador();
        armarCabecera();

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradOrdenXPres = new keeptoo.KGradientPanel();
        etiquetaOrdenXPres = new javax.swing.JLabel();
        etiquetaOrdenXPresSelec = new javax.swing.JLabel();
        comboBoxOrdenXPres = new javax.swing.JComboBox<>();
        botonOrdenXPresBuscar = new javax.swing.JButton();
        botonAtrasOrdenXPrest = new javax.swing.JButton();
        panelScrollTabla = new javax.swing.JScrollPane();
        tablaOrdenXPres = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(975, 575));

        panelGradOrdenXPres.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradOrdenXPres.setkStartColor(new java.awt.Color(0, 153, 0));
        panelGradOrdenXPres.setPreferredSize(new java.awt.Dimension(975, 575));

        etiquetaOrdenXPres.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        etiquetaOrdenXPres.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaOrdenXPres.setText("Ordenes Por Prestador");

        etiquetaOrdenXPresSelec.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaOrdenXPresSelec.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaOrdenXPresSelec.setText("Seleccione:");

        comboBoxOrdenXPres.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        botonOrdenXPresBuscar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonOrdenXPresBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonOrdenXPresBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Boton.png"))); // NOI18N
        botonOrdenXPresBuscar.setText("Buscar");
        botonOrdenXPresBuscar.setBorderPainted(false);
        botonOrdenXPresBuscar.setContentAreaFilled(false);
        botonOrdenXPresBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOrdenXPresBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenXPresBuscarActionPerformed(evt);
            }
        });

        botonAtrasOrdenXPrest.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasOrdenXPrest.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasOrdenXPrest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso.png"))); // NOI18N
        botonAtrasOrdenXPrest.setText("Atrás");
        botonAtrasOrdenXPrest.setBorderPainted(false);
        botonAtrasOrdenXPrest.setContentAreaFilled(false);
        botonAtrasOrdenXPrest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradOrdenXPresLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelGradOrdenXPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGradOrdenXPresLayout.createSequentialGroup()
                        .addGroup(panelGradOrdenXPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGradOrdenXPresLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(etiquetaOrdenXPresSelec)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxOrdenXPres, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonOrdenXPresBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelScrollTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelGradOrdenXPresLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(etiquetaOrdenXPres)
                        .addGap(317, 317, 317)
                        .addComponent(botonAtrasOrdenXPrest)
                        .addGap(32, 32, 32))))
        );
        panelGradOrdenXPresLayout.setVerticalGroup(
            panelGradOrdenXPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradOrdenXPresLayout.createSequentialGroup()
                .addGroup(panelGradOrdenXPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradOrdenXPresLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(etiquetaOrdenXPres))
                    .addGroup(panelGradOrdenXPresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAtrasOrdenXPrest)))
                .addGap(35, 35, 35)
                .addGroup(panelGradOrdenXPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOrdenXPresBuscar)
                    .addComponent(comboBoxOrdenXPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaOrdenXPresSelec))
                .addGap(18, 18, 18)
                .addComponent(panelScrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradOrdenXPres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradOrdenXPres, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        setBounds(0, 0, 975, 575);
    }// </editor-fold>//GEN-END:initComponents

    private void botonOrdenXPresBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenXPresBuscarActionPerformed
        limpiarTabla();
        try {
            Prestador pSeleccionado = (Prestador) comboBoxOrdenXPres.getSelectedItem();
            int id = pSeleccionado.getIdPrestador();
            ArrayList<Orden> listarOrdenP = od.OrdenesPorPrestador(id);
            for (Orden orden : listarOrdenP) {
                modelo.addRow(new Object[]{orden.getIdOrden(), orden.getAfiliado().getNombre(),
                    orden.getFecha(), orden.getFormaPago(), orden.getImporte()});
            }
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "Debe seleccioar un Prestador de la lista");
        }
    }//GEN-LAST:event_botonOrdenXPresBuscarActionPerformed

    private void botonAtrasOrdenXPrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasOrdenXPrestActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasOrdenXPrestActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasOrdenXPrest;
    private javax.swing.JButton botonOrdenXPresBuscar;
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
        for (int i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
}
