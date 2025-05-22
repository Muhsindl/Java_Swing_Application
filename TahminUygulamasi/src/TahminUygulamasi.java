
import java.util.Random;
import javax.swing.JOptionPane;

public class TahminUygulamasi extends javax.swing.JFrame {

    public TahminUygulamasi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_tahmin = new javax.swing.JTextField();
        btn_kontrol = new javax.swing.JButton();
        btn_sifirla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel1.setText("SAYI TAHMİN UYGULAMASI");

        jLabel2.setText("Tahmin giriniz: ");

        btn_kontrol.setText("Tahmin Gönder");
        btn_kontrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kontrolActionPerformed(evt);
            }
        });

        btn_sifirla.setText("Sıfırdan Başla");
        btn_sifirla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sifirlaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btn_sifirla))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_kontrol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_tahmin))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_tahmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_kontrol)
                    .addComponent(btn_sifirla))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int tahminHakki = 10;
    Random r = new Random();
    int tahminEdilecekSayi = r.nextInt(100);
    private void btn_kontrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kontrolActionPerformed
        int tahminEdilenSayi = Integer.parseInt(txt_tahmin.getText());

        if (tahminHakki > 0) {
            if (tahminEdilenSayi > 100 || tahminEdilenSayi < 0) {
                JOptionPane.showMessageDialog(null, "0-100 arası sayı deneyiniz");
            } else {
                if (tahminEdilecekSayi < tahminEdilenSayi) {
                    JOptionPane.showMessageDialog(null, "Daha küçük sayı giriniz !! ");
                    tahminHakki--;
                } else if (tahminEdilecekSayi > tahminEdilenSayi) {
                    JOptionPane.showMessageDialog(null, "Daha büyük sayı giriniz !! ");
                    tahminHakki--;
                } else {
                    tahminHakki--;
                    JOptionPane.showMessageDialog(null, "Tebrikler doğru bildiniz\n Deneme Sayısı:" + (10 - tahminHakki));
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Hakkınız bitti tekrar başlayınız");
        }

    }//GEN-LAST:event_btn_kontrolActionPerformed

    private void btn_sifirlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sifirlaActionPerformed
        tahminHakki = 10;
    }//GEN-LAST:event_btn_sifirlaActionPerformed

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
            java.util.logging.Logger.getLogger(TahminUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TahminUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TahminUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TahminUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TahminUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kontrol;
    private javax.swing.JButton btn_sifirla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_tahmin;
    // End of variables declaration//GEN-END:variables
}
