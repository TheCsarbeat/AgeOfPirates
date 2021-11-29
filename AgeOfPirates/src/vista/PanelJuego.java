/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlTienda;
import control.TipoAccion;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Message;
import modelo.Peticion;

/**
 *
 * @author ytces
 */
public class PanelJuego extends javax.swing.JPanel {
    public PanelMar panelMar1, panelMar2;
    public ControlTienda controlTienda;
    public JPanel contentPanel;
    public PanelTienda panelTienda;
    /**
     * Creates new form PanelJuego
     */
    public PanelJuego(JPanel contentPanel) {
        initComponents();
        controlTienda = new ControlTienda();
        panelMar1 = new PanelMar();
        panelMar2 = new PanelMar();
        panelTienda = new PanelTienda();
        this.contentPanel = contentPanel;
        cargarPanel(myPanel, panelMar1);
        cargarPanel(enemyPanel, panelMar2);
        
        for(int i=0; i<20; i++ ){
            JLabel lb = new JLabel();
            JLabel lb2 = new JLabel();
            lb.setText(String.valueOf(i));
            lb2.setText(String.valueOf(i));
            panelNumero2.add(lb);
            PanelNumeros1.add(lb2);
        }
        
        imgCannon.setIcon(Utilities.loadResizeIcon("src\\images\\canon.png", 110));
        imgBomba.setIcon(Utilities.loadResizeIcon("src\\images\\bomba.png", 110));
        imgCannonM.setIcon(Utilities.loadResizeIcon("src\\images\\canonMultiple.png", 110));
        imgCannonB.setIcon(Utilities.loadResizeIcon("src\\images\\cañonBarbaRoja.png", 110));
    }
    
    
    public void cargarPanel(JPanel unPanel, JPanel panel) {
        unPanel.removeAll();
        unPanel.add(panel);
        unPanel.repaint();
        unPanel.revalidate();
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myPanel = new javax.swing.JPanel();
        enemyPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelArmas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbCañon = new javax.swing.JLabel();
        btnCañon = new javax.swing.JPanel();
        imgCannon = new javax.swing.JLabel();
        lbCantidadCannon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbCañonMultiple = new javax.swing.JLabel();
        btnCañonMultiple = new javax.swing.JPanel();
        imgBomba = new javax.swing.JLabel();
        lbcantidadBomba = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbCañonMultiple2 = new javax.swing.JLabel();
        btnCañonMultiple2 = new javax.swing.JPanel();
        imgCannonB = new javax.swing.JLabel();
        lbcantidadCannonBarba = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbCañonMultiple1 = new javax.swing.JLabel();
        btnCañonMultiple1 = new javax.swing.JPanel();
        imgCannonM = new javax.swing.JLabel();
        lbcantidadCannonMultiple = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnMercado = new javax.swing.JButton();
        lbCoordenada3 = new javax.swing.JLabel();
        btnTienda3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnFire = new javax.swing.JButton();
        txtCoordenadaY = new javax.swing.JTextField();
        lbCoordenada2 = new javax.swing.JLabel();
        txtCoordenadaX = new javax.swing.JTextField();
        lbCoordenada = new javax.swing.JLabel();
        lbCoordenada4 = new javax.swing.JLabel();
        chatPanel = new javax.swing.JPanel();
        activatePanel = new javax.swing.JPanel();
        btnActivateChat = new javax.swing.JLabel();
        optionPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();
        txtMsg = new javax.swing.JTextField();
        btnSendMsg = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbBarco = new javax.swing.JLabel();
        panelNumero2 = new javax.swing.JPanel();
        PanelNumeros1 = new javax.swing.JPanel();
        lbSombrero = new javax.swing.JLabel();
        lbBandera = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myPanel.setBackground(new java.awt.Color(255, 0, 0));
        myPanel.setLayout(new java.awt.CardLayout());
        add(myPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 550, 530));

        enemyPanel.setBackground(new java.awt.Color(255, 0, 0));
        enemyPanel.setLayout(new java.awt.CardLayout());
        add(enemyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 40, 550, 530));

        jLabel1.setText("0       1       2       3       4       5       6       7       8       9     10    11    12    13    14    15     16     17     18     19");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 580, -1));

        panelArmas.setBackground(new java.awt.Color(165, 173, 167));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Armas");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(165, 173, 167));

        lbCañon.setBackground(new java.awt.Color(0, 0, 0));
        lbCañon.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        lbCañon.setForeground(new java.awt.Color(0, 0, 0));
        lbCañon.setText("Cañón");
        lbCañon.setToolTipText("");

        btnCañon.setBackground(new java.awt.Color(212, 212, 212));
        btnCañon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCañonMouseClicked(evt);
            }
        });
        btnCañon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgCannon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/canon.png"))); // NOI18N
        btnCañon.add(imgCannon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 110));

        lbCantidadCannon.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbCantidadCannon.setForeground(new java.awt.Color(0, 0, 0));
        lbCantidadCannon.setText("Cantidad");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(btnCañon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lbCantidadCannon))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lbCañon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCañon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCañon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCantidadCannon)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(165, 173, 167));

        lbCañonMultiple.setBackground(new java.awt.Color(0, 0, 0));
        lbCañonMultiple.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        lbCañonMultiple.setForeground(new java.awt.Color(0, 0, 0));
        lbCañonMultiple.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCañonMultiple.setText("Bomba");
        lbCañonMultiple.setToolTipText("");

        btnCañonMultiple.setBackground(new java.awt.Color(212, 212, 212));
        btnCañonMultiple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCañonMultipleMouseClicked(evt);
            }
        });
        btnCañonMultiple.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgBomba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/canonMultiple.png"))); // NOI18N
        btnCañonMultiple.add(imgBomba, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 110));

        lbcantidadBomba.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbcantidadBomba.setForeground(new java.awt.Color(0, 0, 0));
        lbcantidadBomba.setText("Cantidad");

        jPanel5.setBackground(new java.awt.Color(165, 173, 167));

        lbCañonMultiple2.setBackground(new java.awt.Color(0, 0, 0));
        lbCañonMultiple2.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        lbCañonMultiple2.setForeground(new java.awt.Color(0, 0, 0));
        lbCañonMultiple2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCañonMultiple2.setText("Cañón Barba Roja");
        lbCañonMultiple2.setToolTipText("");

        btnCañonMultiple2.setBackground(new java.awt.Color(212, 212, 212));
        btnCañonMultiple2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCañonMultiple2MouseClicked(evt);
            }
        });
        btnCañonMultiple2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgCannonB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/canonMultiple.png"))); // NOI18N
        btnCañonMultiple2.add(imgCannonB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 110));

        lbcantidadCannonBarba.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbcantidadCannonBarba.setForeground(new java.awt.Color(0, 0, 0));
        lbcantidadCannonBarba.setText("Cantidad");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbcantidadCannonBarba)
                .addGap(77, 77, 77))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnCañonMultiple2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCañonMultiple2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCañonMultiple2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCañonMultiple2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbcantidadCannonBarba)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbcantidadBomba)
                .addGap(77, 77, 77))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCañonMultiple, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(lbCañonMultiple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCañonMultiple, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCañonMultiple, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbcantidadBomba)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(165, 173, 167));

        lbCañonMultiple1.setBackground(new java.awt.Color(0, 0, 0));
        lbCañonMultiple1.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        lbCañonMultiple1.setForeground(new java.awt.Color(0, 0, 0));
        lbCañonMultiple1.setText("Cañón múltiple");
        lbCañonMultiple1.setToolTipText("");

        btnCañonMultiple1.setBackground(new java.awt.Color(212, 212, 212));
        btnCañonMultiple1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCañonMultiple1MouseClicked(evt);
            }
        });
        btnCañonMultiple1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgCannonM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/canonMultiple.png"))); // NOI18N
        btnCañonMultiple1.add(imgCannonM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 110));

        lbcantidadCannonMultiple.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbcantidadCannonMultiple.setForeground(new java.awt.Color(0, 0, 0));
        lbcantidadCannonMultiple.setText("Cantidad");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbcantidadCannonMultiple)
                .addGap(77, 77, 77))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lbCañonMultiple1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnCañonMultiple1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCañonMultiple1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCañonMultiple1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbcantidadCannonMultiple)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelArmasLayout = new javax.swing.GroupLayout(panelArmas);
        panelArmas.setLayout(panelArmasLayout);
        panelArmasLayout.setHorizontalGroup(
            panelArmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArmasLayout.createSequentialGroup()
                .addGroup(panelArmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelArmasLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel2))
                    .addGroup(panelArmasLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelArmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
        );
        panelArmasLayout.setVerticalGroup(
            panelArmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArmasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
        );

        add(panelArmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 1000));

        jLabel3.setText("0       1       2       3       4       5       6       7       8       9     10    11    12    13    14    15     16     17     18     19");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 580, -1));

        panelBotones.setBackground(new java.awt.Color(165, 173, 167));
        panelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMercado.setText("Mercado");
        btnMercado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMercadoMouseClicked(evt);
            }
        });
        btnMercado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMercadoActionPerformed(evt);
            }
        });
        panelBotones.add(btnMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 140, 50));

        lbCoordenada3.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbCoordenada3.setForeground(new java.awt.Color(0, 0, 0));
        lbCoordenada3.setText("Opciones");
        panelBotones.add(lbCoordenada3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 90, -1));

        btnTienda3.setText("Tienda");
        btnTienda3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTienda3MouseClicked(evt);
            }
        });
        btnTienda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTienda3ActionPerformed(evt);
            }
        });
        panelBotones.add(btnTienda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 140, 50));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFire.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFire.setText("Disparar");
        btnFire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFireMouseClicked(evt);
            }
        });
        btnFire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFireActionPerformed(evt);
            }
        });
        jPanel1.add(btnFire, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 160, 30));

        txtCoordenadaY.setBackground(new java.awt.Color(212, 212, 212));
        txtCoordenadaY.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtCoordenadaY.setForeground(new java.awt.Color(99, 99, 99));
        txtCoordenadaY.setBorder(null);
        jPanel1.add(txtCoordenadaY, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, 30));

        lbCoordenada2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbCoordenada2.setForeground(new java.awt.Color(0, 0, 0));
        lbCoordenada2.setText("Coordenada en Y:");
        jPanel1.add(lbCoordenada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtCoordenadaX.setBackground(new java.awt.Color(212, 212, 212));
        txtCoordenadaX.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtCoordenadaX.setForeground(new java.awt.Color(99, 99, 99));
        txtCoordenadaX.setBorder(null);
        jPanel1.add(txtCoordenadaX, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 30));

        lbCoordenada.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbCoordenada.setForeground(new java.awt.Color(0, 0, 0));
        lbCoordenada.setText("Coordenada en X:");
        jPanel1.add(lbCoordenada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        lbCoordenada4.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lbCoordenada4.setForeground(new java.awt.Color(0, 0, 0));
        lbCoordenada4.setText("Indique las coordenadas");
        jPanel1.add(lbCoordenada4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        panelBotones.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, 250));

        chatPanel.setLayout(new java.awt.CardLayout());

        activatePanel.setLayout(new java.awt.CardLayout());

        btnActivateChat.setBackground(new java.awt.Color(86, 73, 64));
        btnActivateChat.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        btnActivateChat.setForeground(new java.awt.Color(255, 255, 255));
        btnActivateChat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActivateChat.setText("Activate Chat");
        btnActivateChat.setIconTextGap(20);
        btnActivateChat.setOpaque(true);
        btnActivateChat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActivateChatMouseClicked(evt);
            }
        });
        activatePanel.add(btnActivateChat, "card3");

        chatPanel.add(activatePanel, "card3");

        optionPanel.setName("optionPanel"); // NOI18N
        optionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtChat.setColumns(20);
        txtChat.setRows(5);
        jScrollPane1.setViewportView(txtChat);

        optionPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 200));

        txtMsg.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMsgActionPerformed(evt);
            }
        });
        optionPanel.add(txtMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 290, 35));

        btnSendMsg.setBackground(new java.awt.Color(86, 73, 64));
        btnSendMsg.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btnSendMsg.setForeground(new java.awt.Color(255, 255, 255));
        btnSendMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSendMsg.setText("SEND");
        btnSendMsg.setIconTextGap(20);
        btnSendMsg.setOpaque(true);
        btnSendMsg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSendMsgMouseClicked(evt);
            }
        });
        optionPanel.add(btnSendMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 130, 35));

        chatPanel.add(optionPanel, "card2");

        panelBotones.add(chatPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 430, 250));

        jLabel10.setBackground(new java.awt.Color(86, 73, 64));
        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel10.setText("SEND");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setOpaque(true);
        panelBotones.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 130, 50));

        txtNombre.setText("jTextField1");
        panelBotones.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 160, -1));

        lbBarco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbBarco.setForeground(new java.awt.Color(0, 0, 0));
        lbBarco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barco.png"))); // NOI18N
        panelBotones.add(lbBarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 140, 140));

        add(panelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 1630, 300));

        panelNumero2.setLayout(new java.awt.GridLayout(20, 0));
        add(panelNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 40, 20, 530));

        PanelNumeros1.setLayout(new java.awt.GridLayout(20, 0));
        add(PanelNumeros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 20, 530));

        lbSombrero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbSombrero.setForeground(new java.awt.Color(0, 0, 0));
        lbSombrero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombrero.png"))); // NOI18N
        add(lbSombrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 480, 140, 140));

        lbBandera.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbBandera.setForeground(new java.awt.Color(0, 0, 0));
        lbBandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bandera.png"))); // NOI18N
        add(lbBandera, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 290, 140, 140));
    }// </editor-fold>//GEN-END:initComponents

    private void btnMercadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMercadoMouseClicked
        // TODO add your handling code here:
        cargarPanel(contentPanel,panelTienda);
    }//GEN-LAST:event_btnMercadoMouseClicked

    private void btnCañonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCañonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCañonMouseClicked

    private void btnCañonMultipleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCañonMultipleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCañonMultipleMouseClicked

    private void btnFireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFireMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFireMouseClicked

    private void btnMercadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMercadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMercadoActionPerformed

    private void btnFireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFireActionPerformed

    private void btnTienda3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTienda3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTienda3MouseClicked

    private void btnTienda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTienda3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTienda3ActionPerformed

    private void txtMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMsgActionPerformed

    private void btnActivateChatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActivateChatMouseClicked
        // TODO add your handling code here:
        cargarPanel(chatPanel, optionPanel);
        Thread th = new Thread(){
        @Override
        public void run(){
            try {
                int i = 0;
                while(true){
                    Thread.sleep(800);
                    i++;
                    Peticion peticionIngresar = new Peticion(TipoAccion.ACTUALIZAR_CHAT, "");        
                    Client conexion = new Client(peticionIngresar);
                    Object respuesta = conexion.getRespuestaServer();
                    if(respuesta != null){
                       txtChat.setText((String)respuesta);
                    }else{
                        JOptionPane.showMessageDialog(null, "Los datos no coinciden!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        };th.start();
        
        


    }//GEN-LAST:event_btnActivateChatMouseClicked

    private void btnSendMsgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendMsgMouseClicked
        // TODO add your handling code here:
        Message msg = new Message(txtNombre.getText(),txtMsg.getText());
        Peticion peticionIngresar = new Peticion(TipoAccion.SEND_MSG, msg);        
        Client conexion = new Client(peticionIngresar);
        Object respuesta = conexion.getRespuestaServer();
        if(respuesta != null){
           txtChat.setText((String)respuesta);
        }else{
            JOptionPane.showMessageDialog(null, "Los datos no coinciden!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSendMsgMouseClicked

    private void btnCañonMultiple1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCañonMultiple1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCañonMultiple1MouseClicked

    private void btnCañonMultiple2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCañonMultiple2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCañonMultiple2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelNumeros1;
    private javax.swing.JPanel activatePanel;
    private javax.swing.JLabel btnActivateChat;
    private javax.swing.JPanel btnCañon;
    private javax.swing.JPanel btnCañonMultiple;
    private javax.swing.JPanel btnCañonMultiple1;
    private javax.swing.JPanel btnCañonMultiple2;
    private javax.swing.JButton btnFire;
    private javax.swing.JButton btnMercado;
    private javax.swing.JLabel btnSendMsg;
    private javax.swing.JButton btnTienda3;
    private javax.swing.JPanel chatPanel;
    private javax.swing.JPanel enemyPanel;
    private javax.swing.JLabel imgBomba;
    private javax.swing.JLabel imgCannon;
    private javax.swing.JLabel imgCannonB;
    private javax.swing.JLabel imgCannonM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBandera;
    private javax.swing.JLabel lbBarco;
    private javax.swing.JLabel lbCantidadCannon;
    private javax.swing.JLabel lbCañon;
    private javax.swing.JLabel lbCañonMultiple;
    private javax.swing.JLabel lbCañonMultiple1;
    private javax.swing.JLabel lbCañonMultiple2;
    private javax.swing.JLabel lbCoordenada;
    private javax.swing.JLabel lbCoordenada2;
    private javax.swing.JLabel lbCoordenada3;
    private javax.swing.JLabel lbCoordenada4;
    private javax.swing.JLabel lbSombrero;
    private javax.swing.JLabel lbcantidadBomba;
    private javax.swing.JLabel lbcantidadCannonBarba;
    private javax.swing.JLabel lbcantidadCannonMultiple;
    private javax.swing.JPanel myPanel;
    private javax.swing.JPanel optionPanel;
    private javax.swing.JPanel panelArmas;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelNumero2;
    private javax.swing.JTextArea txtChat;
    private javax.swing.JTextField txtCoordenadaX;
    private javax.swing.JTextField txtCoordenadaY;
    private javax.swing.JTextField txtMsg;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
