/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.TipoAccion;
import control.Utilities;
import javax.swing.JOptionPane;
import modelo.Armeria;
import modelo.Conector;
import modelo.Mina;
import modelo.Punto;
import modelo.Templo;
import modelo.Fuente;
import modelo.Mercado;
import modelo.Peticion;
import modelo.Player;
import modelo.Vertice;



/**
 *
 * @author ytces
 */
public class MainWindow extends javax.swing.JFrame {
    
    public static PanelMenu panelMenu;
    public static PanelJuego panelJuego;
    public static PanelTienda panelTienda;
    
    public static PanelVender panelVender;
    public static PanelComprar panelComprar;
    public static PanelMercado panelMercado;
    public static PanelStart panelStar;
    public static PanelTiendaMercado panelTiendaMercado;
    
    public static Player player;
    
    public static Player  enemigo= new Player();
    
    public MainWindow() {
        initComponents();
        panelJuego = new PanelJuego();
        panelMenu = new PanelMenu();
        panelTienda = new PanelTienda();
        panelVender = new PanelVender();
        panelComprar = new PanelComprar();
        panelMercado = new PanelMercado();
        panelTiendaMercado = new PanelTiendaMercado();
        
        panelStar = new PanelStart();
        //player = new Player();
        Utilities.cargarPanel(contentPanel, panelMenu);
    }
    //fuente=0, conector=1, mercado=2, mina=3, templo=4, armeria=5
    //"0": es un conector, no hay que agregarlo como arista
    //"CON-xxx": no es conector, ocupa estar conectado a ese conector del id que recibe
    public static void agregarEstructura(int dimensiones, Punto point, String conectorId){
        if(!"0".equals(conectorId)){
            switch (PanelTienda.lastItemSelected) {
                case 0:
                    {
                        String name = player.getNextValidName(0);
                        Fuente unaFuente = new Fuente(name);
                        unaFuente.setPuntos(point);
                        unaFuente.setEspacio(dimensiones);
                        player.grafo.agregarVertice(unaFuente);
                        player.grafo.agregarArista(player.grafo.buscarVertice(conectorId), player.grafo.buscarVertice(name));
                        //player.subtractMoney(12000);
                        break;
                    }
                case 2:
                    {
                        String name = player.getNextValidName(2);
                        Mercado unMercado = new Mercado(name);
                        unMercado.setPuntos(point);
                        unMercado.setEspacio(dimensiones);
                        player.grafo.agregarVertice(unMercado);
                        player.grafo.agregarArista(player.grafo.buscarVertice(conectorId), player.grafo.buscarVertice(name));
                        //player.subtractMoney(2000);
                        break;
                    }
                case 3:
                    {
                        String name = player.getNextValidName(3);
                        Mina unaMina = new Mina(name);
                        unaMina.setPuntos(point);
                        unaMina.setEspacio(dimensiones);
                        player.grafo.agregarVertice(unaMina);
                        player.grafo.agregarArista(player.grafo.buscarVertice(conectorId), player.grafo.buscarVertice(name));
                        //player.subtractMoney(1000);
                        break;
                    }
                case 4:
                    {
                        String name = player.getNextValidName(4);
                        Templo unTemplo = new Templo(name);
                        unTemplo.setPuntos(point);
                        unTemplo.setEspacio(dimensiones);
                        player.grafo.agregarVertice(unTemplo);
                        player.grafo.agregarArista(player.grafo.buscarVertice(conectorId), player.grafo.buscarVertice(name));
                        //player.subtractMoney(2500);
                        break;
                    }
                default:
                    {
                        String name = player.getNextValidName(5);
                        Armeria unaArmeria = new Armeria(name);
                        unaArmeria.setPuntos(point);
                        unaArmeria.setEspacio(dimensiones);
                        player.grafo.agregarVertice(unaArmeria);
                        player.grafo.agregarArista(player.grafo.buscarVertice(conectorId), player.grafo.buscarVertice(name));
                        //player.subtractMoney(1500);
                        break;
                    }
            }
        }else{
            String name = player.getNextValidName(1);
            Conector unConector = new Conector(name);
            unConector.setPuntos(point);
            unConector.setEspacio(dimensiones);
            player.grafo.agregarVertice(unConector);
            for(Vertice v: player.grafo.vertices){
                if(v.estructura instanceof Fuente){
                    player.grafo.agregarArista(player.grafo.buscarVertice(name), v);
                }
            }
            //player.subtractMoney(100);
        }
        setPlayer();
        
    }
    
    public static void setPlayer(){       
        Peticion peticion = new Peticion(TipoAccion.ACTUALIZAR_PLAYER, MainWindow.player);        
        Client conexion = new Client(peticion);
        Object respuesta = conexion.getRespuestaServer();
        if(respuesta != null){
            System.out.println(((Player)respuesta).toString());
        }else{
            System.out.println("The answer is null");
        }
    }
    
    public static void setPlayerEnemigo(){       
        Peticion peticion = new Peticion(TipoAccion.ACTUALIZAR_PLAYER, MainWindow.enemigo);        
        Client conexion = new Client(peticion);
        Object respuesta = conexion.getRespuestaServer();
        if(respuesta != null){
            System.out.println(((Player)respuesta).toString());
        }else{
            System.out.println("The answer is null");
        }
    }
    
    public static void getPlayer(){       
        Peticion peticion = new Peticion(TipoAccion.GET_PLAYER,player.getId());        
        Client conexion = new Client(peticion);
        Object respuesta = conexion.getRespuestaServer();
        if(respuesta != null){
            player = (Player)respuesta;
            System.out.println(((Player)respuesta).toString());
        }else{
            System.out.println("The answer is null");
        }
    }
    public static void getPlayerEnemigo(int id){       
        Peticion peticion = new Peticion(TipoAccion.GET_PLAYER,id);        
        Client conexion = new Client(peticion);
        Object respuesta = conexion.getRespuestaServer();
        if(respuesta != null){
            enemigo = (Player)respuesta;
            System.out.println(((Player)respuesta).toString());
        }else{
            System.out.println("The answer is null");
        }
    }
    
    public static void finishTurn(){       
        Peticion peticion = new Peticion(TipoAccion.FINISH_TURN, player.getId());        
        Client conexion = new Client(peticion);
        Object respuesta = conexion.getRespuestaServer();
        if(respuesta != null){
            if((boolean)respuesta){
                JOptionPane.showMessageDialog(null, "Su turno ha acabado!", "LISTo", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }else{
            System.out.println("The answer is null");
        }
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPanel.setPreferredSize(new java.awt.Dimension(1900, 1000));
        contentPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1894, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainWindow mainWindow = new MainWindow();
                mainWindow.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel contentPanel;
    // End of variables declaration//GEN-END:variables
}
