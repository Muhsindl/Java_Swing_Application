
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class SecmeliDersKayıt extends javax.swing.JFrame {

    ButtonGroup btn_grp1 = new ButtonGroup();
    ButtonGroup btn_grp2 = new ButtonGroup();
    ButtonGroup btn_grp3 = new ButtonGroup();
    ButtonGroup btn_grp4 = new ButtonGroup();

    public SecmeliDersKayıt() {
        initComponents();
        btn_grp1.add(chk11);
        btn_grp1.add(chk12);
        btn_grp1.add(chk13);
        btn_grp1.add(chk14);
        btn_grp1.add(chk15);

        btn_grp2.add(chk21);
        btn_grp2.add(chk22);
        btn_grp2.add(chk23);
        btn_grp2.add(chk24);
        btn_grp2.add(chk25);

        btn_grp3.add(chk31);
        btn_grp3.add(chk32);
        btn_grp3.add(chk33);
        btn_grp3.add(chk34);
        btn_grp3.add(chk35);

        btn_grp4.add(chk41);
        btn_grp4.add(chk42);
        btn_grp4.add(chk43);
        btn_grp4.add(chk44);
        btn_grp4.add(chk45);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        chk11 = new javax.swing.JCheckBox();
        chk21 = new javax.swing.JCheckBox();
        chk31 = new javax.swing.JCheckBox();
        chk41 = new javax.swing.JCheckBox();
        chk22 = new javax.swing.JCheckBox();
        chk23 = new javax.swing.JCheckBox();
        chk32 = new javax.swing.JCheckBox();
        chk33 = new javax.swing.JCheckBox();
        chk42 = new javax.swing.JCheckBox();
        chk43 = new javax.swing.JCheckBox();
        chk12 = new javax.swing.JCheckBox();
        chk13 = new javax.swing.JCheckBox();
        chk24 = new javax.swing.JCheckBox();
        chk25 = new javax.swing.JCheckBox();
        chk34 = new javax.swing.JCheckBox();
        chk35 = new javax.swing.JCheckBox();
        chk44 = new javax.swing.JCheckBox();
        chk45 = new javax.swing.JCheckBox();
        chk14 = new javax.swing.JCheckBox();
        chk15 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jCheckBox17.setText("jCheckBox1");

        jCheckBox18.setText("jCheckBox1");

        jCheckBox19.setText("jCheckBox1");

        jCheckBox20.setText("jCheckBox1");

        jCheckBox21.setText("jCheckBox1");

        jCheckBox22.setText("jCheckBox1");

        jCheckBox23.setText("jCheckBox1");

        jCheckBox24.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel1.setText("Ders Kayıt");

        chk11.setText("1.Sınıf Ders 1");

        chk21.setText("2.Sınıf Ders 1 ");

        chk31.setText("3.Sınıf Ders 1");

        chk41.setText("4.Sınıf Ders 1");

        chk22.setText("2.Sınıf Ders 2");

        chk23.setText("2.Sınıf Ders 3");

        chk32.setText("3.Sınıf Ders 2");

        chk33.setText("3.Sınıf Ders 3");

        chk42.setText("4.Sınıf Ders 2");

        chk43.setText("4.Sınıf Ders 3");

        chk12.setText("1.Sınıf Ders 2");

        chk13.setText("1.Sınıf Ders 3");

        chk24.setText("2.Sınıf Ders 4");

        chk25.setText("2.Sınıf Ders 5");

        chk34.setText("3.Sınıf Ders 4");

        chk35.setText("3.Sınıf Ders 5");

        chk44.setText("4.Sınıf Ders 4");

        chk45.setText("4.Sınıf Ders 5");

        chk14.setText("1.Sınıf Ders 4");

        chk15.setText("1.Sınıf Ders 5");

        jButton1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jButton1.setText("Gönder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel2.setText("1.Sınıf Seçmeli");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel3.setText("2.Sınıf Seçmeli");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel4.setText("3.Sınıf Seçmeli");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel5.setText("4.Sınıf Seçmeli");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(172, 172, 172))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addGap(194, 194, 194))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk15)
                            .addComponent(chk14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk25)
                            .addComponent(chk24))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk35)
                            .addComponent(chk34))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk45)
                            .addComponent(chk44)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk13)
                            .addComponent(chk12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk23)
                            .addComponent(chk22))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk33)
                            .addComponent(chk32))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk43)
                            .addComponent(chk42)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(chk11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chk21)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chk31)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chk41)
                            .addComponent(jLabel5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk11)
                    .addComponent(chk21)
                    .addComponent(chk31)
                    .addComponent(chk41))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chk12)
                        .addGap(18, 18, 18)
                        .addComponent(chk13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chk22)
                        .addGap(18, 18, 18)
                        .addComponent(chk23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chk32)
                        .addGap(18, 18, 18)
                        .addComponent(chk33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chk42)
                        .addGap(18, 18, 18)
                        .addComponent(chk43)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chk14)
                        .addGap(18, 18, 18)
                        .addComponent(chk15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chk24)
                        .addGap(18, 18, 18)
                        .addComponent(chk25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chk34)
                        .addGap(18, 18, 18)
                        .addComponent(chk35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chk44)
                        .addGap(18, 18, 18)
                        .addComponent(chk45)))
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int kredi = 0;
        if (chk11.isSelected()) {
            kredi += 10;
        }
        if (chk21.isSelected()) {
            kredi += 10;
        }
        if (chk31.isSelected()) {
            kredi += 10;
        }
        if (chk41.isSelected()) {
            kredi += 10;
        }
        if (chk12.isSelected()) {
            kredi += 20;
        }
        if (chk22.isSelected()) {
            kredi += 20;
        }
        if (chk32.isSelected()) {
            kredi += 20;
        }
        if (chk42.isSelected()) {
            kredi += 20;
        }
        if (chk13.isSelected()) {
            kredi += 30;
        }
        if (chk23.isSelected()) {
            kredi += 30;
        }
        if (chk33.isSelected()) {
            kredi += 30;
        }
        if (chk43.isSelected()) {
            kredi += 30;
        }
        if (chk14.isSelected()) {
            kredi += 40;
        }
        if (chk24.isSelected()) {
            kredi += 40;
        }
        if (chk34.isSelected()) {
            kredi += 40;
        }
        if (chk44.isSelected()) {
            kredi += 40;
        }
        if (chk15.isSelected()) {
            kredi += 50;
        }
        if (chk25.isSelected()) {
            kredi += 50;
        }
        if (chk35.isSelected()) {
            kredi += 50;
        }
        if (chk45.isSelected()) {
            kredi += 50;
        }
        JOptionPane.showMessageDialog(null, "Alınan Toplam Kredi " + kredi);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SecmeliDersKayıt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecmeliDersKayıt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecmeliDersKayıt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecmeliDersKayıt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecmeliDersKayıt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chk11;
    private javax.swing.JCheckBox chk12;
    private javax.swing.JCheckBox chk13;
    private javax.swing.JCheckBox chk14;
    private javax.swing.JCheckBox chk15;
    private javax.swing.JCheckBox chk21;
    private javax.swing.JCheckBox chk22;
    private javax.swing.JCheckBox chk23;
    private javax.swing.JCheckBox chk24;
    private javax.swing.JCheckBox chk25;
    private javax.swing.JCheckBox chk31;
    private javax.swing.JCheckBox chk32;
    private javax.swing.JCheckBox chk33;
    private javax.swing.JCheckBox chk34;
    private javax.swing.JCheckBox chk35;
    private javax.swing.JCheckBox chk41;
    private javax.swing.JCheckBox chk42;
    private javax.swing.JCheckBox chk43;
    private javax.swing.JCheckBox chk44;
    private javax.swing.JCheckBox chk45;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}