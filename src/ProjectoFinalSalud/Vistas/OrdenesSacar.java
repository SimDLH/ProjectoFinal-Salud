package ProjectoFinalSalud.Vistas;

import ProjectoFinalSalud.AccesoDeDatos.AfiliadoData;
import ProjectoFinalSalud.AccesoDeDatos.OrdenData;
import ProjectoFinalSalud.AccesoDeDatos.PrestadorData;
import ProjectoFinalSalud.Entidades.Afiliado;
import ProjectoFinalSalud.Entidades.FormaDePago;
import ProjectoFinalSalud.Entidades.Orden;
import ProjectoFinalSalud.Entidades.Prestador;
import java.awt.Cursor;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class OrdenesSacar extends javax.swing.JInternalFrame {

    AfiliadoData ad = new AfiliadoData();
    PrestadorData pd = new PrestadorData();
    OrdenData od = new OrdenData();

    public OrdenesSacar() {

        initComponents();
        cargarComboPrestador();
        jComboBoxPago.setModel(new DefaultComboBoxModel(FormaDePago.values()));

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradSacarOrden = new keeptoo.KGradientPanel();
        etiquetaSacarOrden = new javax.swing.JLabel();
        etiquetaSacarOrdenDoc = new javax.swing.JLabel();
        etiquetaSacarOrdenPres = new javax.swing.JLabel();
        etiquetaSacarOrdenFecha = new javax.swing.JLabel();
        etiquetaSacarOrdenForPag = new javax.swing.JLabel();
        etiquetaSacarOrdenImp = new javax.swing.JLabel();
        textoSacarOrdenDoc = new javax.swing.JTextField();
        textoSacarOrdenImp = new javax.swing.JTextField();
        comboBoxSacarOrdenPres = new javax.swing.JComboBox<>();
        calendarioSacarOrden = new com.toedter.calendar.JDateChooser();
        botonSacarOrdenBuscar = new javax.swing.JButton();
        botonSacarOrdenGuardar = new javax.swing.JButton();
        botonAtrasOrdenSacar = new javax.swing.JButton();
        jComboBoxPago = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(975, 575));

        panelGradSacarOrden.setBackground(new java.awt.Color(255, 255, 255));
        panelGradSacarOrden.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradSacarOrden.setkStartColor(new java.awt.Color(0, 153, 0));
        panelGradSacarOrden.setPreferredSize(new java.awt.Dimension(975, 575));

        etiquetaSacarOrden.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrden.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        etiquetaSacarOrden.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaSacarOrden.setText("Nueva Orden");

        etiquetaSacarOrdenDoc.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrdenDoc.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaSacarOrdenDoc.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrdenDoc.setText("Documento:");

        etiquetaSacarOrdenPres.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrdenPres.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaSacarOrdenPres.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrdenPres.setText(" Prestador:");

        etiquetaSacarOrdenFecha.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrdenFecha.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaSacarOrdenFecha.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrdenFecha.setText("Fecha:");

        etiquetaSacarOrdenForPag.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrdenForPag.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaSacarOrdenForPag.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrdenForPag.setText("Forma de Pago:");

        etiquetaSacarOrdenImp.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrdenImp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaSacarOrdenImp.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrdenImp.setText("Importe:");

        textoSacarOrdenDoc.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        textoSacarOrdenImp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        comboBoxSacarOrdenPres.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        calendarioSacarOrden.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        botonSacarOrdenBuscar.setBackground(new java.awt.Color(255, 255, 255));
        botonSacarOrdenBuscar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonSacarOrdenBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonSacarOrdenBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Boton.png"))); // NOI18N
        botonSacarOrdenBuscar.setText("Buscar");
        botonSacarOrdenBuscar.setBorderPainted(false);
        botonSacarOrdenBuscar.setContentAreaFilled(false);
        botonSacarOrdenBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSacarOrdenBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSacarOrdenBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSacarOrdenBuscarMouseExited(evt);
            }
        });
        botonSacarOrdenBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSacarOrdenBuscarActionPerformed(evt);
            }
        });

        botonSacarOrdenGuardar.setBackground(new java.awt.Color(255, 255, 255));
        botonSacarOrdenGuardar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonSacarOrdenGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonSacarOrdenGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Boton.png"))); // NOI18N
        botonSacarOrdenGuardar.setText("Guardar");
        botonSacarOrdenGuardar.setBorderPainted(false);
        botonSacarOrdenGuardar.setContentAreaFilled(false);
        botonSacarOrdenGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSacarOrdenGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSacarOrdenGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSacarOrdenGuardarMouseExited(evt);
            }
        });
        botonSacarOrdenGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSacarOrdenGuardarActionPerformed(evt);
            }
        });

        botonAtrasOrdenSacar.setBackground(new java.awt.Color(255, 255, 255));
        botonAtrasOrdenSacar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasOrdenSacar.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasOrdenSacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso.png"))); // NOI18N
        botonAtrasOrdenSacar.setText("Atrás");
        botonAtrasOrdenSacar.setBorderPainted(false);
        botonAtrasOrdenSacar.setContentAreaFilled(false);
        botonAtrasOrdenSacar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtrasOrdenSacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAtrasOrdenSacarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAtrasOrdenSacarMouseExited(evt);
            }
        });
        botonAtrasOrdenSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasOrdenSacarActionPerformed(evt);
            }
        });

        jComboBoxPago.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelGradSacarOrdenLayout = new javax.swing.GroupLayout(panelGradSacarOrden);
        panelGradSacarOrden.setLayout(panelGradSacarOrdenLayout);
        panelGradSacarOrdenLayout.setHorizontalGroup(
            panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradSacarOrdenLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaSacarOrdenDoc)
                    .addComponent(etiquetaSacarOrdenPres)
                    .addComponent(etiquetaSacarOrdenFecha)
                    .addComponent(etiquetaSacarOrdenForPag)
                    .addComponent(etiquetaSacarOrdenImp))
                .addGap(18, 18, 18)
                .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoSacarOrdenImp, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBoxPago, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxSacarOrdenPres, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textoSacarOrdenDoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addComponent(calendarioSacarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradSacarOrdenLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(botonSacarOrdenBuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradSacarOrdenLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(botonSacarOrdenGuardar)))
                .addContainerGap(225, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradSacarOrdenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaSacarOrden)
                .addGap(287, 287, 287)
                .addComponent(botonAtrasOrdenSacar)
                .addContainerGap())
        );
        panelGradSacarOrdenLayout.setVerticalGroup(
            panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradSacarOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAtrasOrdenSacar)
                    .addComponent(etiquetaSacarOrden))
                .addGap(54, 54, 54)
                .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGradSacarOrdenLayout.createSequentialGroup()
                        .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaSacarOrdenDoc)
                            .addComponent(textoSacarOrdenDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSacarOrdenBuscar))
                        .addGap(18, 18, 18)
                        .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxSacarOrdenPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaSacarOrdenPres))
                        .addGap(33, 33, 33)
                        .addComponent(calendarioSacarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaSacarOrdenFecha))
                .addGap(30, 30, 30)
                .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaSacarOrdenForPag)
                    .addComponent(jComboBoxPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoSacarOrdenImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaSacarOrdenImp)
                    .addComponent(botonSacarOrdenGuardar))
                .addGap(146, 146, 146))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradSacarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradSacarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        setBounds(0, 0, 975, 575);
    }// </editor-fold>//GEN-END:initComponents

    private void botonSacarOrdenBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSacarOrdenBuscarActionPerformed
        try {
            if (textoSacarOrdenDoc.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe colocar un número de DNI");
                return;
            }
            int dni = Integer.parseInt(textoSacarOrdenDoc.getText());
            Afiliado afiliado;
            afiliado = ad.buscarAfiliados(dni);

            if (afiliado.isActivo()) {
                JOptionPane.showMessageDialog(null, "Es un afiliado activo");
            } else {
                JOptionPane.showMessageDialog(null, "NO es un afiliado activo");
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(null, "El DNI debe ser un número entero");
        }
    }//GEN-LAST:event_botonSacarOrdenBuscarActionPerformed

    private void botonSacarOrdenGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSacarOrdenGuardarActionPerformed
        try {
            int dni = Integer.parseInt(textoSacarOrdenDoc.getText());
            Prestador pSeleccionado = (Prestador) comboBoxSacarOrdenPres.getSelectedItem();
            LocalDate fecha = calendarioSacarOrden.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            ArrayList<Orden> ordenes = od.listarOrdenesPorFecha(fecha);
            for (Orden o : ordenes) {
                if (o.getPrestador().getIdPrestador() == pSeleccionado.getIdPrestador() && o.getAfiliado().getDni() == dni) {
                    JOptionPane.showMessageDialog(null, "Solo se admite 1 (una) Orden por día para el"
                            + " mismo Prestador por Afiliado");
                    limpiarCampos();
                    return;
                }
            }
            double importe = Double.parseDouble(textoSacarOrdenImp.getText());
            Afiliado af = ad.buscarAfiliados(dni);
            if (af.getDni() == 0) {
                return;
            }
            if (!af.isActivo()) {
                JOptionPane.showMessageDialog(null, "No se pueden crear ordenes para afiliados INACTIVOS ");
                return;
            }
            Orden orden = new Orden(fecha, jComboBoxPago.getSelectedItem().toString(), importe,
                    af,
                    pSeleccionado);// arreglado
            od.guardarOrden(orden);
            limpiarCampos();
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos del formulario");
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(null, "El DNI debe ser un numero entero");

        }
    }//GEN-LAST:event_botonSacarOrdenGuardarActionPerformed

    private void botonAtrasOrdenSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasOrdenSacarActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasOrdenSacarActionPerformed

    private void botonAtrasOrdenSacarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasOrdenSacarMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonAtrasOrdenSacarMouseEntered

    private void botonAtrasOrdenSacarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasOrdenSacarMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonAtrasOrdenSacarMouseExited

    private void botonSacarOrdenBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSacarOrdenBuscarMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonSacarOrdenBuscarMouseEntered

    private void botonSacarOrdenBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSacarOrdenBuscarMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonSacarOrdenBuscarMouseExited

    private void botonSacarOrdenGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSacarOrdenGuardarMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonSacarOrdenGuardarMouseEntered

    private void botonSacarOrdenGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSacarOrdenGuardarMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonSacarOrdenGuardarMouseExited

    private void cargarComboPrestador() {

        int id;
        ArrayList<Prestador> prestadores = pd.listarPrestador();
        for (Prestador pres : prestadores) {
            comboBoxSacarOrdenPres.addItem(pres);
        }
    }

    private void limpiarCampos() {

        textoSacarOrdenDoc.setText("");
        calendarioSacarOrden.setDate(null);
        textoSacarOrdenImp.setText("");
    }

    private void cargarCombo() {
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasOrdenSacar;
    private javax.swing.JButton botonSacarOrdenBuscar;
    private javax.swing.JButton botonSacarOrdenGuardar;
    private com.toedter.calendar.JDateChooser calendarioSacarOrden;
    private javax.swing.JComboBox<Prestador> comboBoxSacarOrdenPres;
    private javax.swing.JLabel etiquetaSacarOrden;
    private javax.swing.JLabel etiquetaSacarOrdenDoc;
    private javax.swing.JLabel etiquetaSacarOrdenFecha;
    private javax.swing.JLabel etiquetaSacarOrdenForPag;
    private javax.swing.JLabel etiquetaSacarOrdenImp;
    private javax.swing.JLabel etiquetaSacarOrdenPres;
    private javax.swing.JComboBox<FormaDePago> jComboBoxPago;
    private keeptoo.KGradientPanel panelGradSacarOrden;
    private javax.swing.JTextField textoSacarOrdenDoc;
    private javax.swing.JTextField textoSacarOrdenImp;
    // End of variables declaration//GEN-END:variables
}