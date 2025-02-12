/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pa.althaus.dam.javaproyect.aeropuerto.view.panels;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pa.althaus.dam.javaproyect.aeropuerto.controller.LlegadasController;
import pa.althaus.dam.javaproyect.aeropuerto.model.DailyFlight;


/**
 *
 * @author Imper
 */
public class LlegadasPanel extends javax.swing.JPanel {
    
    private static int index = 2;
    private final LlegadasController llegadasController;
    private final DefaultTableModel tableModel = new DefaultTableModel();

    public LlegadasPanel() {
        this.llegadasController = new LlegadasController();
        initComponents();
        inicializarTabla();
    }

    private void inicializarTabla() {
        tableModel.addColumn("Hora de Llegada");
        tableModel.addColumn("Detalles del Vuelo");
        tblLlegadasDatos.setModel(tableModel);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLlegadas = new javax.swing.JLabel();
        tblLlegadas = new javax.swing.JScrollPane();
        tblLlegadasDatos = new javax.swing.JTable();
        btnEnviar = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        airportSelector = new javax.swing.JComboBox<>();

        lblLlegadas.setText("Llegadas al Aeropuerto");

        tblLlegadas.setViewportView(tblLlegadasDatos);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        airportSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblLlegadas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lblLlegadas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(airportSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnEnviar)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblLlegadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblLlegadas, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEnviar)
                        .addComponent(airportSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try {
            LocalDate selectedDate = dateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            // Obtener llegadas para la fecha seleccionada, ordenadas por hora de llegada ascendente
            HashMap<Integer, DailyFlight> llegadas = llegadasController.obtenerLlegadas(selectedDate);

            // Mostrar llegadas en la tabla
            actualizarTablaLlegadas(llegadas);
        } catch (DateTimeException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al procesar la fecha.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void actualizarTablaLlegadas(HashMap<Integer, DailyFlight> llegadas) {
        tableModel.setRowCount(0);

        for (DailyFlight llegada : llegadas.values()) {
            Object[] rowData = {llegada.getHoraLlegada(), llegada.getFlight()};
            tableModel.addRow(rowData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> airportSelector;
    private javax.swing.JButton btnEnviar;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel lblLlegadas;
    private javax.swing.JScrollPane tblLlegadas;
    private javax.swing.JTable tblLlegadasDatos;
    // End of variables declaration//GEN-END:variables

}
