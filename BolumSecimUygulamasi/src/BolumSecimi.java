import javax.swing.ButtonGroup;

public class BolumSecimi extends javax.swing.JFrame {

    public BolumSecimi() {
        initComponents();
        ButtonGroup grp = new ButtonGroup();
        grp.add(cb_bilgisayar);
        grp.add(cb_bilisim);
        grp.add(cb_yazilim);
        grp.add(cb_yapayzeka);
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        cb_yapayzeka = new javax.swing.JCheckBox();
        cb_bilisim = new javax.swing.JCheckBox();
        cb_yazilim = new javax.swing.JCheckBox();
        cb_bilgisayar = new javax.swing.JCheckBox();
        lbl_ekran = new javax.swing.JLabel();
        btn_goruntule = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cb_yapayzeka.setText("Yapay Zeka Mühendisliği");

        cb_bilisim.setText("Bilişim Sistemleri Mühendisliği");

        cb_yazilim.setText("Yazılım Mühendisliği");

        cb_bilgisayar.setText("Bilgisayar Mühendisliği");

        lbl_ekran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btn_goruntule.setText("GÖRÜNTÜLE");
        btn_goruntule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goruntuleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_goruntule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cb_yazilim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_bilgisayar, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_bilisim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_yapayzeka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbl_ekran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_ekran, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_yazilim)
                    .addComponent(cb_yapayzeka))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_bilgisayar)
                    .addComponent(cb_bilisim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_goruntule)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_goruntuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goruntuleActionPerformed
        String txt = "";
        if (cb_bilgisayar.isSelected()) {
            txt = cb_bilgisayar.getText();
        } else if (cb_bilisim.isSelected()) {
            txt = cb_bilisim.getText();
        } else if (cb_yazilim.isSelected()) {
            txt = cb_yazilim.getText();
        } else if (cb_yapayzeka.isSelected()) {
            txt = cb_yapayzeka.getText();
        } else {
            txt = "Bölüm seçilmedi";
        }
        lbl_ekran.setText(txt);
    }//GEN-LAST:event_btn_goruntuleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BolumSecimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BolumSecimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BolumSecimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BolumSecimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BolumSecimi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_goruntule;
    private javax.swing.JCheckBox cb_bilgisayar;
    private javax.swing.JCheckBox cb_bilisim;
    private javax.swing.JCheckBox cb_yapayzeka;
    private javax.swing.JCheckBox cb_yazilim;
    private javax.swing.JLabel lbl_ekran;
    // End of variables declaration//GEN-END:variables
}
