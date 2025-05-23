
import javax.swing.JOptionPane;

public class RestaurantYonetimSistemi extends javax.swing.JFrame {

    int[] durum_fiyat = {150, 200, 220, 250, 200, 300, 350, 400};
    int[] avantaj_fiyat = {250, 350, 350, 400};
    int[] combo_fiyat = {300, 400, 400, 450};
    int[] servis_fiyat = {250, 400, 400, 450};
    int[] icecek_fiyat = {15, 25, 30, 30, 30, 30};
    double kdv = 0, yiyecek_total = 0, icecek_total = 0;
    double aratoplam = 0, geneltoplam = 0;

    public RestaurantYonetimSistemi() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jButton24 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_tvk_drm = new javax.swing.JTextField();
        chk_tvk_drm = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txt_et_drm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_tvk_zurna = new javax.swing.JTextField();
        chk_tvk_zurna = new javax.swing.JCheckBox();
        txt_tvk_servis = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        chk_tvk_servis = new javax.swing.JCheckBox();
        chk_tvk_plvustu = new javax.swing.JCheckBox();
        txt_tvk_plvustu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_et_zurna = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_et_servis = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_et_plvustu = new javax.swing.JTextField();
        chk_et_drm = new javax.swing.JCheckBox();
        chk_et_zurna = new javax.swing.JCheckBox();
        chk_et_servis = new javax.swing.JCheckBox();
        chk_et_plvustu = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_tvk_durumAvantaj = new javax.swing.JTextField();
        chk_tvk_durumAvantaj = new javax.swing.JCheckBox();
        chk_tvk_zurnaAvantaj = new javax.swing.JCheckBox();
        txt_tvk_zurnaAvantaj = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_et_zurnaAvantaj = new javax.swing.JTextField();
        chk_et_zurnaAvantaj = new javax.swing.JCheckBox();
        chk_et_durumAvantaj = new javax.swing.JCheckBox();
        txt_et_durumAvantaj = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_tvk_durumCombo = new javax.swing.JTextField();
        chk_tvk_durumCombo = new javax.swing.JCheckBox();
        chk_tvk_zurnaCombo = new javax.swing.JCheckBox();
        txt_tvk_zurnaCombo = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txt_et_zurnaCombo = new javax.swing.JTextField();
        chk_et_zurnaCombo = new javax.swing.JCheckBox();
        chk_et_durumCombo = new javax.swing.JCheckBox();
        txt_et_durumCombo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txt_tvk_servisMenu = new javax.swing.JTextField();
        chk_tvk_servisMenu = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        txt_et_servisMenu = new javax.swing.JTextField();
        chk_et_servisMenu = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        txt_tvk_plvUstuMenu = new javax.swing.JTextField();
        chk_tvk_plvUstuMenu = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        txt_et_plvUstuMenu = new javax.swing.JTextField();
        chk_et_plvUstuMenu = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txt_kucukAyran = new javax.swing.JTextField();
        chk_kucukAyran = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        txt_buyukAyran = new javax.swing.JTextField();
        chk_buyukAyran = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        txt_kola = new javax.swing.JTextField();
        chk_kola = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        txt_kolaLight = new javax.swing.JTextField();
        chk_kolaLight = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        txt_sprite = new javax.swing.JTextField();
        chk_sprite = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        txt_fanta = new javax.swing.JTextField();
        chk_fanta = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jTextField27 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btn_hesapla = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        lbl_kdv = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lbl_genelToplam = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lbl_araToplam = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jButton24.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton24.setText("Toplam");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("Restoran Yönetim Sistemi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(221, 221, 221))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dürüm & Servis", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Sitka Text", 3, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Tavuk Dürüm :");

        chk_tvk_drm.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_tvk_drm.setToolTipText("");
        chk_tvk_drm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_tvk_drm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_tvk_drmActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Et Dürüm :");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Tavuk Zurna :");

        chk_tvk_zurna.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_tvk_zurna.setToolTipText("");
        chk_tvk_zurna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_tvk_zurna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_tvk_zurnaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Tavuk Servis :");

        chk_tvk_servis.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_tvk_servis.setToolTipText("");
        chk_tvk_servis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_tvk_servis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_tvk_servisActionPerformed(evt);
            }
        });

        chk_tvk_plvustu.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_tvk_plvustu.setToolTipText("");
        chk_tvk_plvustu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_tvk_plvustu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_tvk_plvustuActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Tavuk Pilavüstü :");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Et Zurna :");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Et Servis :");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Et Pilavüstü :");

        chk_et_drm.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_et_drm.setToolTipText("");
        chk_et_drm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_et_drm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_et_drmActionPerformed(evt);
            }
        });

        chk_et_zurna.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_et_zurna.setToolTipText("");
        chk_et_zurna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_et_zurna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_et_zurnaActionPerformed(evt);
            }
        });

        chk_et_servis.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_et_servis.setToolTipText("");
        chk_et_servis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_et_servis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_et_servisActionPerformed(evt);
            }
        });

        chk_et_plvustu.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_et_plvustu.setToolTipText("");
        chk_et_plvustu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_et_plvustu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_et_plvustuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tvk_plvustu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tvk_servis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tvk_zurna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tvk_drm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_tvk_drm)
                            .addComponent(chk_tvk_plvustu)
                            .addComponent(chk_tvk_servis)
                            .addComponent(chk_tvk_zurna))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_et_drm, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_et_zurna, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_et_servis, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_et_plvustu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(chk_et_plvustu))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk_et_zurna)
                                    .addComponent(chk_et_servis)
                                    .addComponent(chk_et_drm)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(txt_et_drm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(chk_et_drm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_et_zurna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(chk_et_zurna, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_et_servis, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(txt_et_servis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(txt_et_plvustu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chk_et_plvustu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(chk_tvk_drm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk_tvk_zurna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txt_tvk_zurna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk_tvk_servis, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txt_tvk_servis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txt_tvk_drm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chk_tvk_plvustu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_tvk_plvustu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5, jLabel6});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel8, jLabel9});

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menüler", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Sitka Text", 3, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Avantaj Menüler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 3, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Tavuk Dürüm Avantaj Menü :");

        chk_tvk_durumAvantaj.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_tvk_durumAvantaj.setToolTipText("");
        chk_tvk_durumAvantaj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_tvk_durumAvantaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_tvk_durumAvantajActionPerformed(evt);
            }
        });

        chk_tvk_zurnaAvantaj.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_tvk_zurnaAvantaj.setToolTipText("");
        chk_tvk_zurnaAvantaj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_tvk_zurnaAvantaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_tvk_zurnaAvantajActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel17.setText("Tavuk Zurna Avantaj Menü :");

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel24.setText("Et Zurna Avantaj Menü :");

        chk_et_zurnaAvantaj.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_et_zurnaAvantaj.setToolTipText("");
        chk_et_zurnaAvantaj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_et_zurnaAvantaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_et_zurnaAvantajActionPerformed(evt);
            }
        });

        chk_et_durumAvantaj.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_et_durumAvantaj.setToolTipText("");
        chk_et_durumAvantaj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_et_durumAvantaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_et_durumAvantajActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel12.setText("Et Dürüm Avantaj Menü :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txt_tvk_durumAvantaj, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tvk_zurnaAvantaj, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(chk_tvk_zurnaAvantaj)
                            .addComponent(chk_tvk_durumAvantaj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_et_zurnaAvantaj, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_et_durumAvantaj, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_et_durumAvantaj)
                    .addComponent(chk_et_zurnaAvantaj))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_et_durumAvantaj, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(txt_et_durumAvantaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_et_zurnaAvantaj, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel24)
                                .addComponent(txt_et_zurnaAvantaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_tvk_durumAvantaj, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txt_tvk_durumAvantaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_tvk_zurnaAvantaj, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(txt_tvk_zurnaAvantaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel12, jLabel17, jLabel24, jLabel7});

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Combo Menüler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 3, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel13.setText("Tavuk Dürüm Combo Menü :");

        chk_tvk_durumCombo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_tvk_durumCombo.setToolTipText("");
        chk_tvk_durumCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_tvk_durumCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_tvk_durumComboActionPerformed(evt);
            }
        });

        chk_tvk_zurnaCombo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_tvk_zurnaCombo.setToolTipText("");
        chk_tvk_zurnaCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_tvk_zurnaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_tvk_zurnaComboActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel27.setText("Tavuk Zurna Combo Menü :");

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel28.setText("Et Zurna Combo Menü :");

        chk_et_zurnaCombo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_et_zurnaCombo.setToolTipText("");
        chk_et_zurnaCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_et_zurnaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_et_zurnaComboActionPerformed(evt);
            }
        });

        chk_et_durumCombo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_et_durumCombo.setToolTipText("");
        chk_et_durumCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_et_durumCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_et_durumComboActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel14.setText("Et Dürüm Combo Menü :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_tvk_durumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tvk_zurnaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk_tvk_zurnaCombo)
                    .addComponent(chk_tvk_durumCombo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_et_zurnaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_et_durumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_et_zurnaCombo)
                    .addComponent(chk_et_durumCombo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel13, jLabel27});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_et_durumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(txt_et_durumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_et_zurnaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel28)
                                .addComponent(txt_et_zurnaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_tvk_durumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(txt_tvk_durumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_tvk_zurnaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel27)
                                .addComponent(txt_tvk_zurnaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel13, jLabel14, jLabel27, jLabel28});

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servis Menüler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 3, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel22.setText("Tavuk Servis Menü :");

        chk_tvk_servisMenu.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_tvk_servisMenu.setToolTipText("");
        chk_tvk_servisMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_tvk_servisMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_tvk_servisMenuActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel23.setText("Et Servis Menü :");

        chk_et_servisMenu.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_et_servisMenu.setToolTipText("");
        chk_et_servisMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_et_servisMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_et_servisMenuActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel25.setText("Tavuk Pilavüstü Menü :");

        chk_tvk_plvUstuMenu.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_tvk_plvUstuMenu.setToolTipText("");
        chk_tvk_plvUstuMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_tvk_plvUstuMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_tvk_plvUstuMenuActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel26.setText("Et Pilavüstü Menü :");

        chk_et_plvUstuMenu.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        chk_et_plvUstuMenu.setToolTipText("");
        chk_et_plvUstuMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk_et_plvUstuMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_et_plvUstuMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_tvk_servisMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tvk_plvUstuMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_tvk_servisMenu)
                    .addComponent(chk_tvk_plvUstuMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txt_et_servisMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk_et_servisMenu))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txt_et_plvUstuMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk_et_plvUstuMenu)))
                .addGap(31, 31, 31))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel23, jLabel26});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_et_servisMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_et_servisMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_et_plvUstuMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_et_plvUstuMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_tvk_servisMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tvk_servisMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_tvk_plvUstuMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tvk_plvUstuMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel22, jLabel23, jLabel25, jLabel26});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "İçecekler", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Sitka Text", 3, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel15.setText("Küçük Ayran :");

        txt_kucukAyran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kucukAyranActionPerformed(evt);
            }
        });

        chk_kucukAyran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_kucukAyranActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel16.setText("Büyük Ayran :");

        txt_buyukAyran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buyukAyranActionPerformed(evt);
            }
        });

        chk_buyukAyran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_buyukAyranActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel18.setText("Kola :");

        txt_kola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kolaActionPerformed(evt);
            }
        });

        chk_kola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_kolaActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel19.setText("Ligth Kola :");

        txt_kolaLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kolaLightActionPerformed(evt);
            }
        });

        chk_kolaLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_kolaLightActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel20.setText("Sprite :");

        txt_sprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_spriteActionPerformed(evt);
            }
        });

        chk_sprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_spriteActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel21.setText("Fanta :");

        txt_fanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fantaActionPerformed(evt);
            }
        });

        chk_fanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_fantaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_fanta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sprite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_kolaLight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_kola, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_buyukAyran, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_kucukAyran, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk_kolaLight)
                    .addComponent(chk_fanta)
                    .addComponent(chk_sprite)
                    .addComponent(chk_kola)
                    .addComponent(chk_buyukAyran)
                    .addComponent(chk_kucukAyran))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_kucukAyran, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txt_kucukAyran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_buyukAyran, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txt_buyukAyran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_kola, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(txt_kola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_kolaLight, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(txt_kolaLight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_sprite, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(txt_sprite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_fanta)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(txt_fanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "İşlem Alanı", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Sitka Text", 3, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Fatura", jPanel9);

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton1.setText("7");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton2.setText("9");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton3.setText("8");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton4.setText("-");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton5.setText("*");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton6.setText("6");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton7.setText("5");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton8.setText("4");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton9.setText("/");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton10.setText("3");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton11.setText("2");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton12.setText("1");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton13.setText("%");
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton14.setText("=");
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton15.setText(".");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton16.setText("0");
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton17.setText("Del");
        jButton17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton18.setText("C");
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton19.setText("^2");
        jButton19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton20.setText("+");
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField27)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Hesap Makinesi", jPanel10);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kdv & Sipariş", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Sitka Text", 3, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        btn_hesapla.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btn_hesapla.setText("Hesapla");
        btn_hesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hesaplaActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel29.setText("KDV :");

        lbl_kdv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel31.setText("Genel Toplam :");

        lbl_genelToplam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel33.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel33.setText("Ara Toplam :");

        lbl_araToplam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_kdv, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_genelToplam, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_araToplam, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_hesapla)
                    .addComponent(btn_reset))
                .addContainerGap())
        );

        jPanel11Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_hesapla, btn_reset});

        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btn_hesapla)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reset))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_araToplam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_kdv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_genelToplam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel11Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_hesapla, btn_reset});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_kucukAyranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kucukAyranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kucukAyranActionPerformed

    private void txt_buyukAyranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buyukAyranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buyukAyranActionPerformed

    private void txt_kolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kolaActionPerformed

    private void txt_kolaLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kolaLightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kolaLightActionPerformed

    private void txt_spriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_spriteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_spriteActionPerformed

    private void txt_fantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fantaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fantaActionPerformed

    private void btn_hesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hesaplaActionPerformed
        kdv = (yiyecek_total * 0.18) + (icecek_total * 0.18);
        aratoplam = yiyecek_total + icecek_total;
        geneltoplam = aratoplam + kdv;
        lbl_kdv.setText(String.valueOf(kdv));
        lbl_araToplam.setText(String.valueOf(aratoplam));
        lbl_genelToplam.setText(String.valueOf(geneltoplam));

    }//GEN-LAST:event_btn_hesaplaActionPerformed

    private void chk_tvk_drmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_tvk_drmActionPerformed
        yiyecekDurumHesapla(txt_tvk_drm, chk_tvk_drm, 0);
    }//GEN-LAST:event_chk_tvk_drmActionPerformed

    private void chk_tvk_zurnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_tvk_zurnaActionPerformed
        yiyecekDurumHesapla(txt_tvk_zurna, chk_tvk_zurna, 1);
    }//GEN-LAST:event_chk_tvk_zurnaActionPerformed

    private void chk_tvk_servisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_tvk_servisActionPerformed
        yiyecekDurumHesapla(txt_tvk_servis, chk_tvk_servis, 2);
    }//GEN-LAST:event_chk_tvk_servisActionPerformed

    private void chk_tvk_plvustuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_tvk_plvustuActionPerformed
        yiyecekDurumHesapla(txt_tvk_plvustu, chk_tvk_plvustu, 3);
    }//GEN-LAST:event_chk_tvk_plvustuActionPerformed

    private void chk_et_drmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_et_drmActionPerformed
        yiyecekDurumHesapla(txt_et_drm, chk_et_drm, 4);
    }//GEN-LAST:event_chk_et_drmActionPerformed

    private void chk_et_zurnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_et_zurnaActionPerformed
        yiyecekDurumHesapla(txt_et_zurna, chk_et_zurna, 5);
    }//GEN-LAST:event_chk_et_zurnaActionPerformed

    private void chk_et_servisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_et_servisActionPerformed
        yiyecekDurumHesapla(txt_et_servis, chk_et_servis, 6);
    }//GEN-LAST:event_chk_et_servisActionPerformed

    private void chk_et_plvustuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_et_plvustuActionPerformed
        yiyecekDurumHesapla(txt_et_plvustu, chk_et_plvustu, 7);
    }//GEN-LAST:event_chk_et_plvustuActionPerformed

    private void chk_tvk_durumAvantajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_tvk_durumAvantajActionPerformed
        yiyecekAvantajHesapla(txt_tvk_durumAvantaj, chk_tvk_durumAvantaj, 0);
    }//GEN-LAST:event_chk_tvk_durumAvantajActionPerformed

    private void chk_tvk_zurnaAvantajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_tvk_zurnaAvantajActionPerformed
        yiyecekAvantajHesapla(txt_tvk_zurnaAvantaj, chk_tvk_zurnaAvantaj, 1);
    }//GEN-LAST:event_chk_tvk_zurnaAvantajActionPerformed

    private void chk_et_durumAvantajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_et_durumAvantajActionPerformed
        yiyecekAvantajHesapla(txt_et_durumAvantaj, chk_et_durumAvantaj, 2);
    }//GEN-LAST:event_chk_et_durumAvantajActionPerformed

    private void chk_et_zurnaAvantajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_et_zurnaAvantajActionPerformed
        yiyecekAvantajHesapla(txt_et_zurnaAvantaj, chk_et_zurnaAvantaj, 3);
    }//GEN-LAST:event_chk_et_zurnaAvantajActionPerformed

    private void chk_tvk_durumComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_tvk_durumComboActionPerformed
        yiyecekComboHesapla(txt_tvk_durumCombo, chk_tvk_durumCombo, 0);
    }//GEN-LAST:event_chk_tvk_durumComboActionPerformed

    private void chk_tvk_zurnaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_tvk_zurnaComboActionPerformed
        yiyecekComboHesapla(txt_tvk_zurnaCombo, chk_tvk_zurnaCombo, 1);
    }//GEN-LAST:event_chk_tvk_zurnaComboActionPerformed

    private void chk_et_durumComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_et_durumComboActionPerformed
        yiyecekComboHesapla(txt_et_durumCombo, chk_et_durumCombo, 2);
    }//GEN-LAST:event_chk_et_durumComboActionPerformed

    private void chk_et_zurnaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_et_zurnaComboActionPerformed
        yiyecekComboHesapla(txt_et_zurnaCombo, chk_et_zurnaCombo, 3);
    }//GEN-LAST:event_chk_et_zurnaComboActionPerformed

    private void chk_tvk_servisMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_tvk_servisMenuActionPerformed
        yiyecekServisHesapla(txt_tvk_servisMenu, chk_tvk_servisMenu, 0);
    }//GEN-LAST:event_chk_tvk_servisMenuActionPerformed

    private void chk_tvk_plvUstuMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_tvk_plvUstuMenuActionPerformed
        yiyecekServisHesapla(txt_tvk_plvUstuMenu, chk_tvk_plvUstuMenu, 1);
    }//GEN-LAST:event_chk_tvk_plvUstuMenuActionPerformed

    private void chk_et_servisMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_et_servisMenuActionPerformed
        yiyecekServisHesapla(txt_et_servisMenu, chk_et_servisMenu, 2);
    }//GEN-LAST:event_chk_et_servisMenuActionPerformed

    private void chk_et_plvUstuMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_et_plvUstuMenuActionPerformed
        yiyecekServisHesapla(txt_et_plvUstuMenu, chk_et_plvUstuMenu, 3);
    }//GEN-LAST:event_chk_et_plvUstuMenuActionPerformed

    private void chk_kucukAyranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_kucukAyranActionPerformed
        icecekHesapla(txt_kucukAyran, chk_kucukAyran, 0);
    }//GEN-LAST:event_chk_kucukAyranActionPerformed

    private void chk_buyukAyranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_buyukAyranActionPerformed
        icecekHesapla(txt_buyukAyran, chk_buyukAyran, 1);
    }//GEN-LAST:event_chk_buyukAyranActionPerformed

    private void chk_kolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_kolaActionPerformed
        icecekHesapla(txt_kola, chk_kola, 2);
    }//GEN-LAST:event_chk_kolaActionPerformed

    private void chk_kolaLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_kolaLightActionPerformed
        icecekHesapla(txt_kolaLight, chk_kolaLight, 3);
    }//GEN-LAST:event_chk_kolaLightActionPerformed

    private void chk_spriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_spriteActionPerformed
        icecekHesapla(txt_sprite, chk_sprite, 4);
    }//GEN-LAST:event_chk_spriteActionPerformed

    private void chk_fantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_fantaActionPerformed
        icecekHesapla(txt_fanta, chk_fanta, 5);
    }//GEN-LAST:event_chk_fantaActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed

        resetFormat(txt_kucukAyran, chk_kucukAyran);
        resetFormat(txt_buyukAyran, chk_buyukAyran);
        resetFormat(txt_kola, chk_kola);
        resetFormat(txt_kolaLight, chk_kolaLight);
        resetFormat(txt_sprite, chk_sprite);
        resetFormat(txt_fanta, chk_fanta);

        resetFormat(txt_tvk_drm, chk_tvk_drm);
        resetFormat(txt_tvk_zurna, chk_tvk_zurna);
        resetFormat(txt_tvk_servis, chk_tvk_servis);
        resetFormat(txt_tvk_plvustu, chk_tvk_plvustu);
        resetFormat(txt_et_drm, chk_et_drm);
        resetFormat(txt_et_zurna, chk_et_zurna);
        resetFormat(txt_et_servis, chk_et_servis);
        resetFormat(txt_et_plvustu, chk_et_plvustu);

        resetFormat(txt_tvk_durumAvantaj, chk_tvk_durumAvantaj);
        resetFormat(txt_tvk_zurnaAvantaj, chk_tvk_zurnaAvantaj);
        resetFormat(txt_et_durumAvantaj, chk_et_durumAvantaj);
        resetFormat(txt_et_zurnaAvantaj, chk_et_zurnaAvantaj);

        resetFormat(txt_tvk_durumCombo, chk_tvk_durumCombo);
        resetFormat(txt_tvk_zurnaCombo, chk_tvk_zurnaCombo);
        resetFormat(txt_et_durumCombo, chk_et_durumCombo);
        resetFormat(txt_et_zurnaCombo, chk_et_zurnaCombo);

        resetFormat(txt_tvk_servisMenu, chk_tvk_servisMenu);
        resetFormat(txt_tvk_plvUstuMenu, chk_tvk_plvUstuMenu);
        resetFormat(txt_et_servisMenu, chk_et_servisMenu);
        resetFormat(txt_et_plvUstuMenu, chk_et_plvUstuMenu);


    }//GEN-LAST:event_btn_resetActionPerformed
    
    private void resetFormat(javax.swing.JTextField txt, javax.swing.JCheckBox chk) {
        txt.setText("");
        txt.setEnabled(true);
        chk.setSelected(false);
    }

    private void icecekHesapla(javax.swing.JTextField txt, javax.swing.JCheckBox chk, int index) {
        if (chk.isSelected() && txt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen bir değer giriniz!");
            chk.setSelected(false);
            return;//kodun devamının çalışmasını durdurur;
        }
        int icecekAdet = Integer.parseInt(txt.getText());
        if (chk.isSelected()) {
            txt.setEnabled(false);
            icecek_total += icecekAdet * icecek_fiyat[index];
        } else {
            txt.setEnabled(true);
            icecek_total -= icecekAdet * icecek_fiyat[index];
        }
    }

    private void yiyecekDurumHesapla(javax.swing.JTextField txt, javax.swing.JCheckBox chk, int index) {
        if (chk.isSelected() && txt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen bir değer giriniz!");
            chk.setSelected(false);
            return;//kodun devamının çalışmasını durdurur;
        }
        int yiyecekAdet = Integer.parseInt(txt.getText());
        if (chk.isSelected()) {
            txt.setEnabled(false);
            yiyecek_total += yiyecekAdet * durum_fiyat[index];
        } else {
            txt.setEnabled(true);
            yiyecek_total -= yiyecekAdet * durum_fiyat[index];
        }
    }

    private void yiyecekAvantajHesapla(javax.swing.JTextField txt, javax.swing.JCheckBox chk, int index) {
        if (chk.isSelected() && txt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen bir değer giriniz!");
            chk.setSelected(false);
            return;//kodun devamının çalışmasını durdurur;
        }
        int yiyecekAdet = Integer.parseInt(txt.getText());
        if (chk.isSelected()) {
            txt.setEnabled(false);
            yiyecek_total += yiyecekAdet * avantaj_fiyat[index];
        } else {
            txt.setEnabled(true);
            yiyecek_total -= yiyecekAdet * avantaj_fiyat[index];
        }
    }

    private void yiyecekComboHesapla(javax.swing.JTextField txt, javax.swing.JCheckBox chk, int index) {
        if (chk.isSelected() && txt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen bir değer giriniz!");
            chk.setSelected(false);
            return;//kodun devamının çalışmasını durdurur;
        }
        int yiyecekAdet = Integer.parseInt(txt.getText());
        if (chk.isSelected()) {
            txt.setEnabled(false);
            yiyecek_total += yiyecekAdet * combo_fiyat[index];
        } else {
            txt.setEnabled(true);
            yiyecek_total -= yiyecekAdet * combo_fiyat[index];
        }
    }

    private void yiyecekServisHesapla(javax.swing.JTextField txt, javax.swing.JCheckBox chk, int index) {
        if (chk.isSelected() && txt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen bir değer giriniz!");
            chk.setSelected(false);
            return;//kodun devamının çalışmasını durdurur;
        }
        int yiyecekAdet = Integer.parseInt(txt.getText());
        if (chk.isSelected()) {
            txt.setEnabled(false);
            yiyecek_total += yiyecekAdet * servis_fiyat[index];
        } else {
            txt.setEnabled(true);
            yiyecek_total -= yiyecekAdet * servis_fiyat[index];
        }
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(RestaurantYonetimSistemi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantYonetimSistemi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantYonetimSistemi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantYonetimSistemi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantYonetimSistemi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hesapla;
    private javax.swing.JButton btn_reset;
    private javax.swing.JCheckBox chk_buyukAyran;
    private javax.swing.JCheckBox chk_et_drm;
    private javax.swing.JCheckBox chk_et_durumAvantaj;
    private javax.swing.JCheckBox chk_et_durumCombo;
    private javax.swing.JCheckBox chk_et_plvUstuMenu;
    private javax.swing.JCheckBox chk_et_plvustu;
    private javax.swing.JCheckBox chk_et_servis;
    private javax.swing.JCheckBox chk_et_servisMenu;
    private javax.swing.JCheckBox chk_et_zurna;
    private javax.swing.JCheckBox chk_et_zurnaAvantaj;
    private javax.swing.JCheckBox chk_et_zurnaCombo;
    private javax.swing.JCheckBox chk_fanta;
    private javax.swing.JCheckBox chk_kola;
    private javax.swing.JCheckBox chk_kolaLight;
    private javax.swing.JCheckBox chk_kucukAyran;
    private javax.swing.JCheckBox chk_sprite;
    private javax.swing.JCheckBox chk_tvk_drm;
    private javax.swing.JCheckBox chk_tvk_durumAvantaj;
    private javax.swing.JCheckBox chk_tvk_durumCombo;
    private javax.swing.JCheckBox chk_tvk_plvUstuMenu;
    private javax.swing.JCheckBox chk_tvk_plvustu;
    private javax.swing.JCheckBox chk_tvk_servis;
    private javax.swing.JCheckBox chk_tvk_servisMenu;
    private javax.swing.JCheckBox chk_tvk_zurna;
    private javax.swing.JCheckBox chk_tvk_zurnaAvantaj;
    private javax.swing.JCheckBox chk_tvk_zurnaCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JLabel lbl_araToplam;
    private javax.swing.JLabel lbl_genelToplam;
    private javax.swing.JLabel lbl_kdv;
    private javax.swing.JTextField txt_buyukAyran;
    private javax.swing.JTextField txt_et_drm;
    private javax.swing.JTextField txt_et_durumAvantaj;
    private javax.swing.JTextField txt_et_durumCombo;
    private javax.swing.JTextField txt_et_plvUstuMenu;
    private javax.swing.JTextField txt_et_plvustu;
    private javax.swing.JTextField txt_et_servis;
    private javax.swing.JTextField txt_et_servisMenu;
    private javax.swing.JTextField txt_et_zurna;
    private javax.swing.JTextField txt_et_zurnaAvantaj;
    private javax.swing.JTextField txt_et_zurnaCombo;
    private javax.swing.JTextField txt_fanta;
    private javax.swing.JTextField txt_kola;
    private javax.swing.JTextField txt_kolaLight;
    private javax.swing.JTextField txt_kucukAyran;
    private javax.swing.JTextField txt_sprite;
    private javax.swing.JTextField txt_tvk_drm;
    private javax.swing.JTextField txt_tvk_durumAvantaj;
    private javax.swing.JTextField txt_tvk_durumCombo;
    private javax.swing.JTextField txt_tvk_plvUstuMenu;
    private javax.swing.JTextField txt_tvk_plvustu;
    private javax.swing.JTextField txt_tvk_servis;
    private javax.swing.JTextField txt_tvk_servisMenu;
    private javax.swing.JTextField txt_tvk_zurna;
    private javax.swing.JTextField txt_tvk_zurnaAvantaj;
    private javax.swing.JTextField txt_tvk_zurnaCombo;
    // End of variables declaration//GEN-END:variables
}
