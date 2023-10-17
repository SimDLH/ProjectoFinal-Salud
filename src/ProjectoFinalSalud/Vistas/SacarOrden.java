package ProjectoFinalSalud.Vistas;

import ProjectoFinalSalud.AccesoDeDatos.AfiliadoData;
import ProjectoFinalSalud.AccesoDeDatos.OrdenData;
import ProjectoFinalSalud.AccesoDeDatos.PrestadorData;
import ProjectoFinalSalud.Entidades.Afiliado;
import ProjectoFinalSalud.Entidades.Orden;
import ProjectoFinalSalud.Entidades.Prestador;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class SacarOrden extends javax.swing.JInternalFrame {

    AfiliadoData ad = new AfiliadoData();
    PrestadorData pd = new PrestadorData();
    OrdenData od = new OrdenData();

    public SacarOrden() {

        initComponents();
        cargarComboPrestador();

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
        textoSacarOrdenForPag = new javax.swing.JTextField();
        textoSacarOrdenImp = new javax.swing.JTextField();
        comboBoxSacarOrdenPres = new javax.swing.JComboBox<>();
        calendarioSacarOrden = new com.toedter.calendar.JDateChooser();
        botonSacarOrdenBuscar = new javax.swing.JButton();
        botonSacarOrdenGuardar = new javax.swing.JButton();
        botonAtrasSacarOrden = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(975, 575));

        panelGradSacarOrden.setkEndColor(new java.awt.Color(0, 153, 255));
        panelGradSacarOrden.setkStartColor(new java.awt.Color(0, 153, 0));
        panelGradSacarOrden.setPreferredSize(new java.awt.Dimension(975, 575));

        etiquetaSacarOrden.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        etiquetaSacarOrden.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaSacarOrden.setText("Nueva Orden");

        etiquetaSacarOrdenDoc.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaSacarOrdenDoc.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrdenDoc.setText("Documento:");

        etiquetaSacarOrdenPres.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaSacarOrdenPres.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrdenPres.setText(" Prestador:");

        etiquetaSacarOrdenFecha.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaSacarOrdenFecha.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrdenFecha.setText("Fecha:");

        etiquetaSacarOrdenForPag.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaSacarOrdenForPag.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrdenForPag.setText("Forma de Pago:");

        etiquetaSacarOrdenImp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        etiquetaSacarOrdenImp.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaSacarOrdenImp.setText("Importe:");

        botonSacarOrdenBuscar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        botonSacarOrdenBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonSacarOrdenBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Boton.png"))); // NOI18N
        botonSacarOrdenBuscar.setText("Buscar");
        botonSacarOrdenBuscar.setBorderPainted(false);
        botonSacarOrdenBuscar.setContentAreaFilled(false);
        botonSacarOrdenBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSacarOrdenBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSacarOrdenBuscarActionPerformed(evt);
            }
        });

        botonSacarOrdenGuardar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        botonSacarOrdenGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonSacarOrdenGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/Boton.png"))); // NOI18N
        botonSacarOrdenGuardar.setText("Guardar");
        botonSacarOrdenGuardar.setBorderPainted(false);
        botonSacarOrdenGuardar.setContentAreaFilled(false);
        botonSacarOrdenGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSacarOrdenGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSacarOrdenGuardarActionPerformed(evt);
            }
        });

        botonAtrasSacarOrden.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAtrasSacarOrden.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasSacarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesDelProyecto/BotonRetroceso.png"))); // NOI18N
        botonAtrasSacarOrden.setText("Atrás");
        botonAtrasSacarOrden.setBorderPainted(false);
        botonAtrasSacarOrden.setContentAreaFilled(false);
        botonAtrasSacarOrden.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtrasSacarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasSacarOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGradSacarOrdenLayout = new javax.swing.GroupLayout(panelGradSacarOrden);
        panelGradSacarOrden.setLayout(panelGradSacarOrdenLayout);
        panelGradSacarOrdenLayout.setHorizontalGroup(
            panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradSacarOrdenLayout.createSequentialGroup()
                .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradSacarOrdenLayout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(etiquetaSacarOrden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 611, Short.MAX_VALUE)
                        .addComponent(botonAtrasSacarOrden))
                    .addGroup(panelGradSacarOrdenLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaSacarOrdenPres)
                            .addComponent(etiquetaSacarOrdenDoc)
                            .addComponent(etiquetaSacarOrdenFecha)
                            .addComponent(etiquetaSacarOrdenForPag)
                            .addComponent(etiquetaSacarOrdenImp))
                        .addGap(18, 18, 18)
                        .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoSacarOrdenDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(comboBoxSacarOrdenPres, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calendarioSacarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textoSacarOrdenForPag)
                            .addComponent(textoSacarOrdenImp))
                        .addGap(18, 18, 18)
                        .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonSacarOrdenBuscar)
                            .addComponent(botonSacarOrdenGuardar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelGradSacarOrdenLayout.setVerticalGroup(
            panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradSacarOrdenLayout.createSequentialGroup()
                .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradSacarOrdenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAtrasSacarOrden))
                    .addGroup(panelGradSacarOrdenLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(etiquetaSacarOrden)))
                .addGap(27, 27, 27)
                .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaSacarOrdenDoc)
                    .addComponent(textoSacarOrdenDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSacarOrdenBuscar))
                .addGap(18, 18, 18)
                .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaSacarOrdenPres)
                    .addComponent(comboBoxSacarOrdenPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaSacarOrdenFecha)
                    .addComponent(calendarioSacarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaSacarOrdenForPag)
                    .addComponent(textoSacarOrdenForPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panelGradSacarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaSacarOrdenImp)
                    .addComponent(textoSacarOrdenImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSacarOrdenGuardar))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradSacarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, 1244, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradSacarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        setBounds(0, 0, 975, 575);
    }// </editor-fold>//GEN-END:initComponents

    private void botonSacarOrdenBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSacarOrdenBuscarActionPerformed
        try {
            int dni = Integer.parseInt(textoSacarOrdenDoc.getText());
            Afiliado afiliado;
            afiliado = ad.buscarAfiliados(dni);
            if (afiliado.isActivo()) {
                JOptionPane.showMessageDialog(null, "Bienvenido" + " " + afiliado.getNombre());//arreglar esto
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(null, "El DNI debe ser un número entero");
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "Debe colocar un número de DNI");
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
            Orden orden = new Orden(fecha, textoSacarOrdenForPag.getText(), importe,
                    ad.buscarAfiliados(dni),
                    pSeleccionado);// arreglado
            od.guardarOrden(orden);
            limpiarCampos();
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(null, "El DNI debe ser un numero entero");
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos del formulario");
        }
    }//GEN-LAST:event_botonSacarOrdenGuardarActionPerformed

    private void botonAtrasSacarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasSacarOrdenActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasSacarOrdenActionPerformed

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
        textoSacarOrdenForPag.setText("");
        textoSacarOrdenImp.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasSacarOrden;
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
    private keeptoo.KGradientPanel panelGradSacarOrden;
    private javax.swing.JTextField textoSacarOrdenDoc;
    private javax.swing.JTextField textoSacarOrdenForPag;
    private javax.swing.JTextField textoSacarOrdenImp;
    // End of variables declaration//GEN-END:variables
}
