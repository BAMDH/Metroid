/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Natalia S.R.S
 */
public class Temporizador extends javax.swing.JFrame {

    int minutos, segundos;
    Timer tiempo;
    boolean bandera = true;
    boolean pararlo = false;
    
    /*segundos;
    timer 
     * Creates new form timer
     */
    public Temporizador() {
        initComponents();
        this.getContentPane().setBackground(Color.getHSBColor(90, 130, 180));
     
        for(int i=1; i<60; i++){
            jComboBoxMin.addItem(""+i);
        }
        for(int i=1; i<=60; i++){
            jComboBoxSeg.addItem(""+i);
        }
    }

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxMin = new javax.swing.JComboBox<>();
        jComboBoxSeg = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtM = new javax.swing.JLabel();
        txtS = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxMin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutos" }));
        jComboBoxMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMinActionPerformed(evt);
            }
        });

        jComboBoxSeg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segundos" }));
        jComboBoxSeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSegActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel1.setText("  TIMER");

        txtM.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtM.setText("0");

        txtS.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtS.setText("0");

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnParar.setText("Parar");
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxMin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIniciar))
                        .addGap(195, 195, 195))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(txtM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtS, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnParar)
                            .addComponent(jComboBoxSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtM)
                    .addComponent(txtS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(btnParar))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jComboBoxMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMinActionPerformed
        txtM.setText("" + jComboBoxMin.getSelectedItem());
        minutos = Integer.parseInt(txtM.getText());
    }//GEN-LAST:event_jComboBoxMinActionPerformed

    private void jComboBoxSegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSegActionPerformed
        // TODO add your handling code here:
        txtS.setText("" + jComboBoxSeg.getSelectedItem());
        segundos = Integer.parseInt(txtS.getText());
    }//GEN-LAST:event_jComboBoxSegActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        tiempo = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                if(segundos==0){
                    if(minutos>0){
                        segundos=60;
                        minutos--;
                    }
                }
                if(minutos==0&&segundos==0){
                    JOptionPane.showMessageDialog(null, "Tiempo");
                    minutos=0;                    segundos=0;
                    tiempo.stop();
                }
                else{
                    segundos--;
                    
                    if(segundos<60){
                        txtS.setText("" + segundos);
                        bandera=false;
                    }
                    if (minutos<60){
                        txtM.setText("" + minutos);
                        if(segundos<60){
                            txtS.setText("" + segundos);
                            
                        }
                    }
                }
            }
        });
        tiempo.start();
       
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
        // TODO add your handling code here:
        pararlo=true;
        tiempo.stop();
    }//GEN-LAST:event_btnPararActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(Timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Temporizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnParar;
    private javax.swing.JComboBox<String> jComboBoxMin;
    private javax.swing.JComboBox<String> jComboBoxSeg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtM;
    private javax.swing.JLabel txtS;
    // End of variables declaration//GEN-END:variables

   
}
