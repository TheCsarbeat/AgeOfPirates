


package modelo;

import java.util.ArrayList;

/**
 *
 * @author ytces
 */
public class Player {
    private int id;
    private String name;
    private int turno;
    private int money;
    private int steel;
    private boolean[][] positions = new boolean[20][20];
    public Grafo grafo;
    private ArrayList<Comodin> comodines = new ArrayList();
    public Player(int id){
        this.id = id;
        name = "";
        turno = 0;
        money = 4000;
        steel = 0;
        grafo = new Grafo();
        for(int row=0;row<20;row++){
            for(int col=0;col<20;col++){
                positions[row][col] = false;
            }
        }
        
    }

    public Player(String name, int turno, int money) {
        this.name = name;
        this.turno = turno;
        this.money = money;
        steel = 0;
        grafo = new Grafo();
        for(int row=0;row<20;row++){
            for(int col=0;col<20;col++){
                positions[row][col] = false;
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean[][] getPositions() {
        return positions;
    }

    public void setPositions(boolean[][] positions) {
        this.positions = positions;
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }

    public String getName() {
        return name;
    }

    public int getTurno() {
        return turno;
    }

    public int getMoney() {
        return money;
    }

    public int getSteel() {
        return steel;
    }
    
    public void addMoney(int money){
        this.money = this.money + money;
    }
    
    public void subtractMoney(int money){
        this.money = this.money - money;
    }
    
    public void addSteel(int steel){
        this.steel = this.steel + steel;
    }
    
    public void subtractSteel(){
        this.steel = this.steel - steel; 
    }
    
    //fuente=0, conector=1, mercado=2, mina=3, templo=4, armeria=5
    public String getNextValidName(int tipo){
        String prefijo = "";
        int cont = 0;
        switch(tipo){
            case 0:
                prefijo = "FUE-";
                for(Vertice ver : grafo.vertices){
                    if(ver.estructura instanceof Fuente){
                        cont++;
                    }
                }
                break;
            case 1:
                prefijo = "CON-";
                for(Vertice ver : grafo.vertices){
                    if(ver.estructura instanceof Conector){
                        cont++;
                    }
                }
                break;
            case 2:
                prefijo = "MER-";
                for(Vertice ver : grafo.vertices){
                    if(ver.estructura instanceof Mercado){
                        cont++;
                    }
                }
                break;
            case 3:
                prefijo = "MIN-";
                for(Vertice ver : grafo.vertices){
                    if(ver.estructura instanceof Mina){
                        cont++;
                    }
                }
                break;
            case 4:
                prefijo = "TEM-";
                for(Vertice ver : grafo.vertices){
                    if(ver.estructura instanceof Templo){
                        cont++;
                    }
                }
                break;
            case 5:
                prefijo = "ARM-";
                for(Vertice ver : grafo.vertices){
                    if(ver.estructura instanceof Armeria){
                        cont++;
                    }
                }
                break;
        }
        cont++;
        return prefijo + cont;
    }
}
