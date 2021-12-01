/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.TipoAccion;
import control.Utilities;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Arma;
import modelo.Conector;
import modelo.Fuente;
import modelo.Mercado;
import modelo.Peticion;
import modelo.Player;
import java.util.Random;
import modelo.Vertice;
import static vista.MainWindow.player;

/**
 *
 * @author erksm
 */
public class PanelStart extends javax.swing.JPanel {

    /**
     * Creates new form PanelName
     */
    public PanelStart() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void contectarse(){
        int id;
        Peticion peticionIngresar = new Peticion(TipoAccion.CONECTARSE, "");
        
        Client conexion = new Client(peticionIngresar);
        Object respuesta = conexion.getRespuestaServer();
        if(respuesta != null){
            Utilities.cargarPanel(cardPanel, dataPanel);
            MainWindow.player = (Player)respuesta;
            id = MainWindow.player.getId();
            if(id ==-1){
                Utilities.cargarPanel(cardPanel, infoPanel);
                lbInfo.setText("There are too many players!");
            }else{
                MainWindow.player.setTurno(id);
                MainWindow.player.setMoney(4000);

                if(id ==0)
                    lbStatus.setText("HOST");
                else
                    lbStatus.setText("GUEST");
                
                
                /*
                Vertice verticeFuente = new Vertice(new Fuente(player.getNextValidName(0)));
                player.grafo.agregarVertice(verticeFuente);

                String nameMercado1 = player.getNextValidName(2);
                Mercado mercado1 = new Mercado (nameMercado1); 
                Vertice verticeMercado = new Vertice(mercado1);        
                player.grafo.agregarVertice(verticeMercado);

                Conector conector1 = new Conector(player.getNextValidName(1));
                Vertice verticeConector = new Vertice(conector1);        
                player.grafo.agregarVertice(verticeConector);

                player.grafo.agregarArista(verticeFuente, verticeConector);
                player.grafo.agregarArista(verticeConector, verticeMercado);
*/
                //player.grafo.imprimir();
            }
        }else{
            Utilities.cargarPanel(cardPanel, infoPanel);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbStatus = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        lbInfo = new javax.swing.JLabel();
        dataPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        lbCoordenada4 = new javax.swing.JLabel();
        btnStart = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(86, 73, 64));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbStatus.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(255, 255, 255));
        lbStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbStatus.setText("GUEST");
        lbStatus.setToolTipText("");
        lbStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        cardPanel.setLayout(new java.awt.CardLayout());

        infoPanel.setBackground(new java.awt.Color(120, 120, 120));

        lbInfo.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        lbInfo.setForeground(new java.awt.Color(255, 255, 255));
        lbInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfo.setText("Connection lost try again!");
        lbInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1900, Short.MAX_VALUE)
            .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                    .addContainerGap(403, Short.MAX_VALUE)
                    .addComponent(lbInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(477, Short.MAX_VALUE)))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                    .addContainerGap(335, Short.MAX_VALUE)
                    .addComponent(lbInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(335, Short.MAX_VALUE)))
        );

        cardPanel.add(infoPanel, "card3");

        dataPanel.setBackground(new java.awt.Color(120, 120, 120));

        jPanel1.setBackground(new java.awt.Color(165, 173, 167));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setBackground(new java.awt.Color(212, 212, 212));
        txtName.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(99, 99, 99));
        txtName.setBorder(null);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 450, 30));

        lbCoordenada4.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        lbCoordenada4.setForeground(new java.awt.Color(0, 0, 0));
        lbCoordenada4.setText("Write Your Name");
        jPanel1.add(lbCoordenada4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 210, 50));

        btnStart.setBackground(new java.awt.Color(86, 73, 64));
        btnStart.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnStart.setText("Start");
        btnStart.setIconTextGap(20);
        btnStart.setOpaque(true);
        btnStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStartMouseClicked(evt);
            }
        });
        jPanel1.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 240, 80));

        javax.swing.GroupLayout dataPanelLayout = new javax.swing.GroupLayout(dataPanel);
        dataPanel.setLayout(dataPanelLayout);
        dataPanelLayout.setHorizontalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataPanelLayout.createSequentialGroup()
                .addContainerGap(722, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(658, 658, 658))
        );
        dataPanelLayout.setVerticalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        cardPanel.add(dataPanel, "card2");

        add(cardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1900, 810));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Age of Pirates");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 620, 140));
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseClicked
        // TODO add your handling code here:
        String name = txtName.getText();
        if(!name.equals("")){
            MainWindow.player.setName(name);
            //MainWindow.setPlayer();
            
            ArrayList<Arma> armas = new ArrayList();
            Random rand = new Random();
            for (int i = 0; i < 5; i++) {                
                int random = rand.nextInt((4 - 1) + 1);
                Arma a;
                if(random == 1){
                    a = new Arma(i, "Cannon");
                }else if(random == 2){
                    a = new Arma(i, "Cannon Multiple");
                }else if(random == 3){
                    a = new Arma(i, "Bomba");
                }else {
                    a = new Arma(i, "Cannon Barba Roja");
                }
                armas.add(a);
            }
            MainWindow.player.setArmas(armas);            
            MainWindow.setPlayer();            
            Utilities.cargarPanel(MainWindow.contentPanel, MainWindow.panelJuego);     
            MainWindow.panelJuego.loadDatos();
            
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
       

    }//GEN-LAST:event_btnStartMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnStart;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCoordenada4;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
