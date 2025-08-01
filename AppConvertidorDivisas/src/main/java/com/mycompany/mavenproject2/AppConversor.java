/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author JoshVargas
 */
public class AppConversor extends javax.swing.JFrame {
    double conversion = 0;
    int cantidad = 0;
    String de="USD";
    String a="USD";
    /**
     * Creates new form NewJFrame
     */
    public AppConversor() {
        initComponents();
        this.setTitle("CONVERSOR DE DIVISAS");
        this.setLocationRelativeTo(null);
     
    }
    
    public String aMoneda(double cantidad, String moneda){
        return "$ "+Math.round(cantidad*100.0)/100.0+" "+moneda;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CONVERTIR = new javax.swing.JButton();
        cboDe = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboA = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        TFMonto = new javax.swing.JTextField();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONVERSOR DE DIVISAS");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 320, 60));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CANTIDAD A CONVERTIR");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 200, -1));

        CONVERTIR.setBackground(new java.awt.Color(0, 255, 108));
        CONVERTIR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CONVERTIR.setForeground(new java.awt.Color(255, 255, 255));
        CONVERTIR.setText("CONVERTIR");
        CONVERTIR.setBorderPainted(false);
        CONVERTIR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CONVERTIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONVERTIRActionPerformed(evt);
            }
        });
        jPanel3.add(CONVERTIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 180, 70));

        cboDe.setBackground(new java.awt.Color(51, 255, 204));
        cboDe.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        cboDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "USD ($)", "EUR (€)", "MXN ($)", "LIBRA (£)", "YEN (¥)", "KRW (₩)" }));
        cboDe.setBorder(null);
        cboDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDeActionPerformed(evt);
            }
        });
        jPanel3.add(cboDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, 40));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MONEDA DE ORIGEN");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 150, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MONEDA DE RETORNO");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 160, -1));

        cboA.setBackground(new java.awt.Color(51, 255, 204));
        cboA.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        cboA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "USD ($)", "EUR (€)", "MXN ($)", "LIBRA (£)", "YEN (¥)", "KRW (₩)" }));
        cboA.setBorder(null);
        cboA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAActionPerformed(evt);
            }
        });
        jPanel3.add(cboA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 140, 40));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 255, 204));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 440, 70));

        TFMonto.setBackground(new java.awt.Color(102, 255, 255));
        TFMonto.setFont(TFMonto.getFont().deriveFont((float)16));
        TFMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFMonto.setSelectionColor(new java.awt.Color(0, 0, 204));
        TFMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFMontoActionPerformed(evt);
            }
        });
        jPanel3.add(TFMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 84, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFMontoActionPerformed

    }//GEN-LAST:event_TFMontoActionPerformed
public void convertir(){
    Integer cantidad = Integer.valueOf(TFMonto.getText());
        switch(de){
            case "USD ($)" -> {
                conversion = switch (a) {
            case "EUR (€)" -> cantidad * 0.943;
            case "MXN ($)" -> cantidad * 18.44;
            case "LIBRA (£)" -> cantidad *0.837;
            case "YEN (¥)" -> cantidad * 136.316;
            case "KRW (₩)" -> cantidad * 1316.223;
            default -> cantidad;
        }; //USD
                break;
            }
                
            case "EUR (€)"-> {
                conversion = switch (a) {
            case "USD ($)" -> cantidad*1.055;
            case "MXN ($)" -> cantidad*19.438;
            case "LIBRA (£)" -> cantidad*0.883;
            case "YEN (¥)" -> cantidad*143.783;
            case "KRW (₩)" -> cantidad*1388.71;
            default -> cantidad;
        }; //EUR
            break;
            }
               case "MXN ($)" -> {
                   conversion = switch (a) {
            case "EUR (€)" -> cantidad*0.943;
            case "USD ($)" -> cantidad*0.051;
            case "LIBRA (£)" -> cantidad*0.045;
            case "YEN (¥)" -> cantidad*7.397;
            case "KRW (₩)" -> cantidad*1388.71;
            default -> cantidad;
        }; //MXN
                break;
            }
                case "LIBRA (£)" -> {
                    conversion = switch (a) {
            case "EUR (€)" -> cantidad*1.132;
            case "MXN ($)" -> cantidad*22.008;
            case "USD ($)" -> cantidad*1.194;
            case "YEN (¥)" -> cantidad*162.825;
            case "KRW (₩)" -> cantidad*1571.75;
            default -> cantidad;
        }; //LIBRA
                break;
            }
                case "YEN (¥)" -> {
                    conversion = switch (a) {
            case "EUR (€)" -> cantidad*0.006;
            case "MXN ($)" -> cantidad*0.135;
            case "LIBRA (£)" -> cantidad*0.006;
            case "USD ($)" -> cantidad*0.007;
            case "KRW (₩)" -> cantidad*9.653;
            default -> cantidad;
        };
                break;
            }
                case "KRW (₩)" -> {
                    conversion = switch (a) {
            case "EUR (€)" -> cantidad*0.00071;
            case "MXN ($)" -> cantidad*0.0139;
            case "LIBRA (£)" -> cantidad*0.00063;
            case "YEN (¥)" -> cantidad*0.1035;
            case "USD ($)" -> cantidad*0.00076;
            default -> cantidad;
        };
                break;
                } 
            }
        //jTextField1.setText(aMoneda(cantidad, de)+" -> "+aMoneda(conversion,a));
    }
    private void CONVERTIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONVERTIRActionPerformed

        Integer cantidad = Integer.valueOf(TFMonto.getText());
        jTextField1.setText(aMoneda(cantidad, de)+" son aproximadamente: "+aMoneda(conversion,a));
        convertir();

    }//GEN-LAST:event_CONVERTIRActionPerformed

    private void cboDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDeActionPerformed
        de =cboDe.getSelectedItem().toString();
            convertir();
    }//GEN-LAST:event_cboDeActionPerformed

    private void cboAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAActionPerformed
        a =cboA.getSelectedItem().toString();
            convertir();
    }//GEN-LAST:event_cboAActionPerformed

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
            java.util.logging.Logger.getLogger(AppConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppConversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CONVERTIR;
    private javax.swing.JTextField TFMonto;
    private javax.swing.JComboBox<String> cboA;
    private javax.swing.JComboBox<String> cboDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
