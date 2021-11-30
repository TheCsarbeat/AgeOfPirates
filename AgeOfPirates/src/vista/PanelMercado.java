/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.Utilities;

/**
 *
 * @author muril
 */
public class PanelMercado extends javax.swing.JPanel {

    /**
     * Creates new form PanelMercado
     */
    public PanelMercado() {
        initComponents();
        
        imgCannon1.setIcon(Utilities.loadResizeIcon("src\\images\\canon.png", 110));
        imgBomba1.setIcon(Utilities.loadResizeIcon("src\\images\\bomba.png", 110));
        imgCannonMultiple1.setIcon(Utilities.loadResizeIcon("src\\images\\canonMultiple.png", 110));
        imgBarbaRoja.setIcon(Utilities.loadResizeIcon("src\\images\\cañonBarbaRoja.png", 110));
        imgAcero.setIcon(Utilities.loadResizeIcon("src\\images\\acero.png", 110));
        imgComprar.setIcon(Utilities.loadResizeIcon("src\\images\\comprar.png", 110));
        imgVender.setIcon(Utilities.loadResizeIcon("src\\images\\vender.png", 110));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBack = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbCañon = new javax.swing.JLabel();
        btnCannon = new javax.swing.JPanel();
        imgBomba1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbCañon1 = new javax.swing.JLabel();
        btnCannon1 = new javax.swing.JPanel();
        imgCannon1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbCañon2 = new javax.swing.JLabel();
        btnCannon2 = new javax.swing.JPanel();
        imgBarbaRoja = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbCañon3 = new javax.swing.JLabel();
        btnCannon3 = new javax.swing.JPanel();
        imgCannonMultiple1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbCañon4 = new javax.swing.JLabel();
        btnCannon4 = new javax.swing.JPanel();
        imgAcero = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbCañon5 = new javax.swing.JLabel();
        btnCannon5 = new javax.swing.JPanel();
        imgVender = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lbCañon6 = new javax.swing.JLabel();
        btnCannon6 = new javax.swing.JPanel();
        imgComprar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        lbBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBackMouseClicked(evt);
            }
        });
        add(lbBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 70));

        jPanel2.setBackground(new java.awt.Color(165, 173, 167));

        lbCañon.setBackground(new java.awt.Color(0, 0, 0));
        lbCañon.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        lbCañon.setForeground(new java.awt.Color(0, 0, 0));
        lbCañon.setText("Bomba");
        lbCañon.setToolTipText("");

        btnCannon.setBackground(new java.awt.Color(212, 212, 212));
        btnCannon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCannonMouseClicked(evt);
            }
        });
        btnCannon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgBomba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/canon.png"))); // NOI18N
        btnCannon.add(imgBomba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 110));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbCañon)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCannon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCañon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCannon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(165, 173, 167));

        lbCañon1.setBackground(new java.awt.Color(0, 0, 0));
        lbCañon1.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        lbCañon1.setForeground(new java.awt.Color(0, 0, 0));
        lbCañon1.setText("Cañón");
        lbCañon1.setToolTipText("");

        btnCannon1.setBackground(new java.awt.Color(212, 212, 212));
        btnCannon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCannon1MouseClicked(evt);
            }
        });
        btnCannon1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgCannon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/canon.png"))); // NOI18N
        btnCannon1.add(imgCannon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 110));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lbCañon1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCannon1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCañon1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCannon1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(165, 173, 167));

        lbCañon2.setBackground(new java.awt.Color(0, 0, 0));
        lbCañon2.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        lbCañon2.setForeground(new java.awt.Color(0, 0, 0));
        lbCañon2.setText("Cañón barba roja");
        lbCañon2.setToolTipText("");

        btnCannon2.setBackground(new java.awt.Color(212, 212, 212));
        btnCannon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCannon2MouseClicked(evt);
            }
        });
        btnCannon2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgBarbaRoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/canon.png"))); // NOI18N
        btnCannon2.add(imgBarbaRoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 110));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCañon2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCannon2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCañon2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCannon2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(165, 173, 167));

        lbCañon3.setBackground(new java.awt.Color(0, 0, 0));
        lbCañon3.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        lbCañon3.setForeground(new java.awt.Color(0, 0, 0));
        lbCañon3.setText("Cañón múltiple");
        lbCañon3.setToolTipText("");

        btnCannon3.setBackground(new java.awt.Color(212, 212, 212));
        btnCannon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCannon3MouseClicked(evt);
            }
        });
        btnCannon3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgCannonMultiple1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/canon.png"))); // NOI18N
        btnCannon3.add(imgCannonMultiple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 110));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCannon3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lbCañon3)
                        .addGap(10, 10, 10)))
                .addGap(31, 31, 31))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCañon3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCannon3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(165, 173, 167));

        lbCañon4.setBackground(new java.awt.Color(0, 0, 0));
        lbCañon4.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        lbCañon4.setForeground(new java.awt.Color(0, 0, 0));
        lbCañon4.setText("Acero");
        lbCañon4.setToolTipText("");

        btnCannon4.setBackground(new java.awt.Color(212, 212, 212));
        btnCannon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCannon4MouseClicked(evt);
            }
        });
        btnCannon4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgAcero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/canon.png"))); // NOI18N
        btnCannon4.add(imgAcero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 110));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(lbCañon4)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnCannon4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCañon4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCannon4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, 280));

        panelBotones.setBackground(new java.awt.Color(165, 173, 167));
        panelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Dar clic en el boton de comprar para poder comprar algún producto.");
        panelBotones.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 590, 40));

        jPanel8.setBackground(new java.awt.Color(165, 173, 167));

        lbCañon5.setBackground(new java.awt.Color(0, 0, 0));
        lbCañon5.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        lbCañon5.setForeground(new java.awt.Color(0, 0, 0));
        lbCañon5.setText("Vender");
        lbCañon5.setToolTipText("");

        btnCannon5.setBackground(new java.awt.Color(212, 212, 212));
        btnCannon5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCannon5MouseClicked(evt);
            }
        });
        btnCannon5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/canon.png"))); // NOI18N
        btnCannon5.add(imgVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 110));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCannon5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lbCañon5)
                        .addContainerGap(44, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(lbCañon5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCannon5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelBotones.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 180, 180));

        jPanel9.setBackground(new java.awt.Color(165, 173, 167));

        lbCañon6.setBackground(new java.awt.Color(0, 0, 0));
        lbCañon6.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        lbCañon6.setForeground(new java.awt.Color(0, 0, 0));
        lbCañon6.setText("Comprar");
        lbCañon6.setToolTipText("");

        btnCannon6.setBackground(new java.awt.Color(212, 212, 212));
        btnCannon6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCannon6MouseClicked(evt);
            }
        });
        btnCannon6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/canon.png"))); // NOI18N
        imgComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgComprarMouseClicked(evt);
            }
        });
        btnCannon6.add(imgComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 110));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCannon6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lbCañon6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCañon6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCannon6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        panelBotones.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 180, 180));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Dar clic en el boton de vender para poder vender algún producto.");
        panelBotones.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 50, 580, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Indicaciones:");
        panelBotones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 160, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pirata.png"))); // NOI18N
        panelBotones.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 150, 130, 140));

        add(panelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 1630, 300));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Mercado de intercambio");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 290, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Catálogo de productos del mercado");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 410, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCannonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCannonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCannonMouseClicked

    private void btnCannon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCannon1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCannon1MouseClicked

    private void btnCannon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCannon2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCannon2MouseClicked

    private void btnCannon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCannon3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCannon3MouseClicked

    private void btnCannon4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCannon4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCannon4MouseClicked

    private void lbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseClicked
        Utilities.cargarPanel(MainWindow.contentPanel, MainWindow.panelTiendaMercado);
    }//GEN-LAST:event_lbBackMouseClicked

    private void btnCannon5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCannon5MouseClicked
        // TODO add your handling code here:
        Utilities.cargarPanel(MainWindow.contentPanel, MainWindow.panelVender);
    }//GEN-LAST:event_btnCannon5MouseClicked

    private void btnCannon6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCannon6MouseClicked
        // TODO add your handling code here:
        Utilities.cargarPanel(MainWindow.contentPanel, MainWindow.panelComprar);
    }//GEN-LAST:event_btnCannon6MouseClicked

    private void imgComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgComprarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_imgComprarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCannon;
    private javax.swing.JPanel btnCannon1;
    private javax.swing.JPanel btnCannon2;
    private javax.swing.JPanel btnCannon3;
    private javax.swing.JPanel btnCannon4;
    private javax.swing.JPanel btnCannon5;
    private javax.swing.JPanel btnCannon6;
    private javax.swing.JLabel imgAcero;
    private javax.swing.JLabel imgBarbaRoja;
    private javax.swing.JLabel imgBomba1;
    private javax.swing.JLabel imgCannon1;
    private javax.swing.JLabel imgCannonMultiple1;
    private javax.swing.JLabel imgComprar;
    private javax.swing.JLabel imgVender;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbBack;
    private javax.swing.JLabel lbCañon;
    private javax.swing.JLabel lbCañon1;
    private javax.swing.JLabel lbCañon2;
    private javax.swing.JLabel lbCañon3;
    private javax.swing.JLabel lbCañon4;
    private javax.swing.JLabel lbCañon5;
    private javax.swing.JLabel lbCañon6;
    private javax.swing.JPanel panelBotones;
    // End of variables declaration//GEN-END:variables
}
