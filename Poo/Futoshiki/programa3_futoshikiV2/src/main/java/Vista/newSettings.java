/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.programa2;

/**
 *
 * @author Natalia S.R.S
 */
public class newSettings extends javax.swing.JFrame {

    /**
     * Creates new form newSettings
     */
    public newSettings() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNivel = new javax.swing.JLabel();
        labelReloj = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRFac = new javax.swing.JRadioButton();
        jRInt = new javax.swing.JRadioButton();
        jRDif = new javax.swing.JRadioButton();
        jRSi = new javax.swing.JRadioButton();
        jRNo = new javax.swing.JRadioButton();
        jRTimer = new javax.swing.JRadioButton();
        jRDer = new javax.swing.JRadioButton();
        jRIzq = new javax.swing.JRadioButton();
        jR5 = new javax.swing.JRadioButton();
        jR6 = new javax.swing.JRadioButton();
        jR7 = new javax.swing.JRadioButton();
        jR9 = new javax.swing.JRadioButton();
        jR8 = new javax.swing.JRadioButton();
        labelNivel2 = new javax.swing.JLabel();
        jLabelConf = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        labelNivel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNivel.setFont(new java.awt.Font("Rockwell Condensed", 1, 12)); // NOI18N
        labelNivel.setText("1. Nivel");

        labelReloj.setFont(new java.awt.Font("Rockwell Condensed", 1, 12)); // NOI18N
        labelReloj.setText("2. Reloj:");

        jRFac.setText("Fácil");
        jRFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRFacActionPerformed(evt);
            }
        });

        jRInt.setText("Intermedio");
        jRInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRIntActionPerformed(evt);
            }
        });

        jRDif.setText("Difícil");
        jRDif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRDifActionPerformed(evt);
            }
        });

        jRSi.setText("Si");
        jRSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRSiActionPerformed(evt);
            }
        });

        jRNo.setText("No");
        jRNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRNoActionPerformed(evt);
            }
        });

        jRTimer.setText("Timer");
        jRTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRTimerActionPerformed(evt);
            }
        });

        jRDer.setText("Derecha");
        jRDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRDerActionPerformed(evt);
            }
        });

        jRIzq.setText("Izquierda");
        jRIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRIzqActionPerformed(evt);
            }
        });

        jR5.setText("5");
        jR5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR5ActionPerformed(evt);
            }
        });

        jR6.setText("6");
        jR6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR6ActionPerformed(evt);
            }
        });

        jR7.setText("7");
        jR7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR7ActionPerformed(evt);
            }
        });

        jR9.setText("9");
        jR9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR9ActionPerformed(evt);
            }
        });

        jR8.setText("8");
        jR8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRIzq)
                    .addComponent(jRDer)
                    .addComponent(jRTimer)
                    .addComponent(jRNo)
                    .addComponent(jRSi)
                    .addComponent(jRDif)
                    .addComponent(jRInt)
                    .addComponent(jRFac)
                    .addComponent(jR5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jR6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jR7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jR9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jR8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jRFac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRInt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRDif)
                .addGap(40, 40, 40)
                .addComponent(jRSi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRTimer)
                .addGap(30, 30, 30)
                .addComponent(jRDer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRIzq)
                .addGap(33, 33, 33)
                .addComponent(jR5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jR6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jR7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jR8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jR9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelNivel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 12)); // NOI18N
        labelNivel2.setText("3. Posición en la ventana del panel de dígitos:");

        jLabelConf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelConf.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConf.setText("    ------<->--<->- CONFIGURACIÓN-<->--<->------");
        jLabelConf.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        labelNivel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 12)); // NOI18N
        labelNivel3.setText("4. Tamaño de la cuadrícula:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAceptar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(labelNivel)
                                        .addGap(205, 205, 205))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelReloj)
                                        .addComponent(labelNivel2)
                                        .addComponent(labelNivel3)))
                                .addGap(98, 98, 98)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabelConf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelConf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(labelNivel)
                        .addGap(85, 85, 85)
                        .addComponent(labelReloj)
                        .addGap(85, 85, 85)
                        .addComponent(labelNivel2)
                        .addGap(60, 60, 60)
                        .addComponent(labelNivel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0)
                .addComponent(btnAceptar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRFacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRFacActionPerformed

    private void jRIntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRIntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRIntActionPerformed

    private void jRDifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRDifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRDifActionPerformed

    private void jRSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRSiActionPerformed
        //aparece=true;
    }//GEN-LAST:event_jRSiActionPerformed

    private void jRNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRNoActionPerformed
        //aparece=false;

    }//GEN-LAST:event_jRNoActionPerformed

    private void jRTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRTimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRTimerActionPerformed

    private void jRDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRDerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRDerActionPerformed

    private void jRIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRIzqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRIzqActionPerformed

    private void jR5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jR5ActionPerformed

    private void jR6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jR6ActionPerformed

    private void jR7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jR7ActionPerformed

    private void jR9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jR9ActionPerformed

    private void jR8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jR8ActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:

        /*
        if(validar()==true){
            InitialScreen initialScreen = new InitialScreen();
            initialScreen.setVisible(true);
            initialScreen.setReloj(aparece);
            initialScreen.setGame(futoshiki);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una de las opciones de cada requerimiento indicado");
        }
    */
    }//GEN-LAST:event_btnAceptarActionPerformed
    
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
            java.util.logging.Logger.getLogger(newSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabelConf;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jR5;
    private javax.swing.JRadioButton jR6;
    private javax.swing.JRadioButton jR7;
    private javax.swing.JRadioButton jR8;
    private javax.swing.JRadioButton jR9;
    private javax.swing.JRadioButton jRDer;
    private javax.swing.JRadioButton jRDif;
    private javax.swing.JRadioButton jRFac;
    private javax.swing.JRadioButton jRInt;
    private javax.swing.JRadioButton jRIzq;
    private javax.swing.JRadioButton jRNo;
    private javax.swing.JRadioButton jRSi;
    private javax.swing.JRadioButton jRTimer;
    private javax.swing.JLabel labelNivel;
    private javax.swing.JLabel labelNivel2;
    private javax.swing.JLabel labelNivel3;
    private javax.swing.JLabel labelReloj;
    // End of variables declaration//GEN-END:variables
}
