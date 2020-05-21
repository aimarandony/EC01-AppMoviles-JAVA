package gui;

import java.text.NumberFormat;
import javax.swing.table.DefaultTableModel;

/**
 * @author Aimar Berrocal Coaquira 
 */

public class Pregunta01 extends javax.swing.JFrame {
    /*
    La Empresa Somos Programaores, dedicada a los servicios de Desarrollo de Software Coporativo, 
    asignará el monto de S/. 450,000.00 de presupuesto a sus áreas.

    El dinero será distribuido entre diversas áreas: Administración, Consultoría, Sistemas, 
    Contabilidad y Marketing de la siguiente forma:

    • Administración: 15% del monto de dinero a repartir.
    • Consultoría: 30% del monto equivalente recibido por Contabilidad
    • Sistemas: 20% del monto de dinero a repartir
    • Contabilidad: 25% del monto equivalente recibido por Administración y Sistemas.
    • Marketing: Lo que queda del dinero a repartir.

    Dado el monto de dinero a repartir, diseñe una aplicación que determine que cantidad de dinero le corresponde a cada área.  Incluyendo el total al final de la visualización.
    */
    public Pregunta01() {
        initComponents();     
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProcesar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SOLUCIÓN 01");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        btnProcesar.setBackground(new java.awt.Color(23, 81, 255));
        btnProcesar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProcesar.setForeground(new java.awt.Color(255, 255, 255));
        btnProcesar.setText("PROCESAR");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ÁREA", "MONTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnProcesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnProcesar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
       
        double total = 450000;        
        double administracion = total * 0.15;        
        double sistema = total * 0.20;        
        double contabilidad = (administracion + sistema) * 0.25;
        double consultoria = contabilidad * 0.30;
        double marketing = total - (administracion + sistema);
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        DefaultTableModel model;     
        model = (DefaultTableModel) tblResultado.getModel();
        Object datos[][] = 
        {
            {"Administración", nf.format(administracion)}, {"Sistemas", nf.format(sistema)}, 
            {"Contabilidad", nf.format(contabilidad)}, {"Consultoría", nf.format(consultoria)},
            {"Marketing", nf.format(marketing)}
        };
        model.setNumRows(0);
        for (Object[] dato : datos) {
            model.addRow(dato);
        }        
    }//GEN-LAST:event_btnProcesarActionPerformed

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
            java.util.logging.Logger.getLogger(Pregunta01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunta01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunta01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblResultado;
    // End of variables declaration//GEN-END:variables
}
