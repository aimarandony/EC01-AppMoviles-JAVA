package gui;

import clases.Empleado;
import java.util.ArrayList;
import lib.Libreria;

/**
 * @author Aimar Berrocal Coaquira
 */
public class Pregunta03 extends javax.swing.JFrame {

    public Pregunta03() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProcesar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaResultadoGeneral = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        btnProcesar.setBackground(new java.awt.Color(213, 30, 63));
        btnProcesar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProcesar.setForeground(new java.awt.Color(255, 255, 255));
        btnProcesar.setText("PROCESAR");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        txaResultado.setColumns(20);
        txaResultado.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txaResultado.setForeground(new java.awt.Color(51, 51, 51));
        txaResultado.setRows(5);
        jScrollPane1.setViewportView(txaResultado);

        txaResultadoGeneral.setColumns(20);
        txaResultadoGeneral.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txaResultadoGeneral.setForeground(new java.awt.Color(51, 51, 51));
        txaResultadoGeneral.setRows(5);
        jScrollPane2.setViewportView(txaResultadoGeneral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProcesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnProcesar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        ArrayList<Empleado> empleados = new ArrayList<>();

        Empleado empleado3 = new Empleado(74587, "Viviana Saldaña", 1, 958454125);
        Empleado empleado2 = new Empleado(67890, "Juan Sanchez");
        Empleado empleado1 = new Empleado();

        empleados.add(empleado3);
        empleados.add(empleado2);
        empleados.add(empleado1);

        double sueldoBruto, descuento, sueldoNeto;
        double sueldoTotal = 0;

        for (Empleado empleado : empleados) {
            sueldoBruto = empleado.sueldoBruto(empleado.getCategoria());
            descuento = empleado.descuento(sueldoBruto);
            sueldoNeto = empleado.sueldoNeto(sueldoBruto, descuento);

            txaResultado.append("\n Código\t: " + empleado.getCodigo() + "\n"
                    + " Nombre\t: " + empleado.getNombre() + "\n"
                    + " Celular\t: " + empleado.getCelular() + "\n"
                    + " Categoría\t: " + empleado.getCategoria() + "\n"
                    + " Sueldo Bruto\t: " + sueldoBruto + "\n"
                    + " Descuento\t: " + descuento + "\n"
                    + " Sueldo Neto\t: " + sueldoNeto + "\n");

            sueldoTotal += sueldoNeto;
        }

        //txaResultadoGeneral.append("===================================");
        txaResultadoGeneral.append("\n Cant. Empleados\t: " + empleados.size()
                + "\n Valor de Descuento\t: " + Libreria.DESC + "%"
                + "\n Suma Sueldo Neto\t: " + sueldoTotal);
    }//GEN-LAST:event_btnProcesarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pregunta03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunta03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunta03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txaResultado;
    private javax.swing.JTextArea txaResultadoGeneral;
    // End of variables declaration//GEN-END:variables
}
