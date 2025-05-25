
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class ÖzelSayiUygulamasi extends javax.swing.JFrame {

    public ÖzelSayiUygulamasi() {
        initComponents();
        ButtonGroup grp = new ButtonGroup();
        grp.add(rb_fibo);
        grp.add(rb_tau);
        grp.add(rb_mukemmel);
        grp.add(rb_mersenne);
        grp.add(rb_harshad);
        grp.add(rb_ikizAsal);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rb_mersenne = new javax.swing.JRadioButton();
        rb_fibo = new javax.swing.JRadioButton();
        rb_harshad = new javax.swing.JRadioButton();
        rb_tau = new javax.swing.JRadioButton();
        rb_ikizAsal = new javax.swing.JRadioButton();
        rb_mukemmel = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txt_sayi = new javax.swing.JTextField();
        btn_uygula = new javax.swing.JButton();
        lbl_sonuc = new javax.swing.JLabel();

        jRadioButton4.setText("jRadioButton1");

        jRadioButton7.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Özel Sayı Uygulaması");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        rb_mersenne.setText("Mersenne Sayı");

        rb_fibo.setText("Fibonacci Sayı");

        rb_harshad.setText("Harshad Sayı");

        rb_tau.setText("Tau Sayı");

        rb_ikizAsal.setText("İkiz Asal");

        rb_mukemmel.setText("Mükemmel Sayı");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_fibo)
                    .addComponent(rb_mersenne))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_tau)
                    .addComponent(rb_ikizAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_mukemmel)
                    .addComponent(rb_harshad))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_mersenne)
                    .addComponent(rb_tau)
                    .addComponent(rb_harshad))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_fibo)
                    .addComponent(rb_ikizAsal)
                    .addComponent(rb_mukemmel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Sayı giriniz :");

        btn_uygula.setText("Uygula");
        btn_uygula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uygulaActionPerformed(evt);
            }
        });

        lbl_sonuc.setFont(new java.awt.Font("Sans Serif Collection", 2, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_uygula, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(txt_sayi))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_sonuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_sayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_uygula))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl_sonuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_uygulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uygulaActionPerformed
        if (txt_sayi.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Sayı girmelisiniz !!");
        } else {
            int sayi = Integer.parseInt(txt_sayi.getText());
            if (rb_fibo.isSelected()) {
                lbl_sonuc.setText(String.valueOf(fibonacci(sayi)));
            } else if (rb_tau.isSelected()) {
                lbl_sonuc.setText(tau(sayi));
            } else if (rb_mukemmel.isSelected()) {
                lbl_sonuc.setText(mukemmel(sayi));
            } else if (rb_mersenne.isSelected()) {
                lbl_sonuc.setText(mersenne(sayi));
            } else if (rb_harshad.isSelected()) {
                lbl_sonuc.setText(harshad(sayi));
            } else if (rb_ikizAsal.isSelected()) {
                lbl_sonuc.setText(ikizAsal(sayi));
            } else {
                JOptionPane.showMessageDialog(null, "Lütfen hesaplanacak özel sayı seçiniz !!");
            }
        }
    }//GEN-LAST:event_btn_uygulaActionPerformed

    private int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    private String tau(int n) {
        int sayac = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sayac++;
            }
        }
        if (n % sayac == 0) {
            return "Tau sayıdır";
        } else {
            return "Tau sayı değildir";
        }
    }

    private String mukemmel(int n) {
        int toplam = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam += i;
            }
        }
        if (toplam == n) {
            return "Mükemmel Sayıdır";
        } else {
            return "Mükemmel sayı değildir";
        }
    }

    private String mersenne(int n) {
        double mersenneSayi = Math.pow(2, n) - 1;
        if (asalMi(mersenneSayi)) {
            return "Mersenne sayıdır";
        } else {
            return "Mersenne sayı değildir";
        }

    }

    private boolean asalMi(double n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private String harshad(int n) {
        int toplam = 0;
        while (n > 0) {
            toplam += n % 10;
            n /= 10;
        }
        if (toplam == n) {
            return "Harshad Sayıdır";
        } else {
            return "Harshad sayı değildir";
        }
    }

    private String ikizAsal(int n) {
        if (asalMi(n) && (asalMi(n - 2) || asalMi(n + 2))) {
            return "İkiz Asaldır";
        } else {
            return "İkiz asal değildir";
        }
    }

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
            java.util.logging.Logger.getLogger(ÖzelSayiUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÖzelSayiUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÖzelSayiUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÖzelSayiUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ÖzelSayiUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_uygula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JLabel lbl_sonuc;
    private javax.swing.JRadioButton rb_fibo;
    private javax.swing.JRadioButton rb_harshad;
    private javax.swing.JRadioButton rb_ikizAsal;
    private javax.swing.JRadioButton rb_mersenne;
    private javax.swing.JRadioButton rb_mukemmel;
    private javax.swing.JRadioButton rb_tau;
    private javax.swing.JTextField txt_sayi;
    // End of variables declaration//GEN-END:variables
}
