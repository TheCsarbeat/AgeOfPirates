


package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ytces
 */
public class Player implements Serializable{
    private int id;
    private String name;
    private int turno;
    private int money;
    private int steel;
    public boolean[][] positions = new boolean[20][20];
    public Grafo grafo;
    private ArrayList<Comodin> comodines = new ArrayList();
    private ArrayList<Arma> armas = new ArrayList();
    
    public Player(int id){
        this.id = id;
        name = "";
        turno = 0;
        money = 400000;
        steel = 0;
        grafo = new Grafo();
        for(int row=0;row<20;row++){
            for(int col=0;col<20;col++){
                positions[row][col] = false;
            }
        }       
    }
    
    public Player(){
        id = -1;
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

    public Player(int id, String name, int turno, int money) {
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

    public ArrayList<Comodin> getComodines() {
        return comodines;
    }

    public void setComodines(ArrayList<Comodin> comodines) {
        this.comodines = comodines;
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    public void setMoneyMore(int money) {
        this.money += money;
    }
    
    public void setMoneyLess(int money) {
        this.money -= money;
    }

    public void setSteel(int steel) {
        this.steel = steel;
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

    @Override
    public String toString() {
        return "Player: " + "id: " + id + ", name: " + name + ", turno: " + turno + ", money: " + money + ", steel: " + steel + ", positions: " + positions + ", grafo: " + grafo + ", comodines:" + comodines + ", armas: " + armas;
    }
    
    public Arma buscarArma(String name){
        for(Arma i: armas){
            if(i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }
    
    public ArrayList cantidadArmas(){
        ArrayList datos = new ArrayList();
        int cannon = 0, cannonM = 0, bomba =0, cannonB = 0;
        for (Arma i: armas) {
            if(i.getName().equals("Cannon")){
                cannon++;
            }else if(i.getName().equals("Cannon Multiple")){
                cannonM++;
            }else if(i.getName().equals("Bomba")){
                bomba++;
            }else if(i.getName().equals("Cannon Barba Roja")){
                cannonB++;
            }
        }
        datos.add(cannon);
        datos.add(cannonM);
        datos.add(bomba);
        datos.add(cannonB);
        return datos;
    }
    public boolean addArma(Arma arma){
        Arma i = armas.get(armas.size()-1);
        arma.setId(i.getId()+1);
        armas.add(arma);
        return true;
    }
    public boolean eliminarArma(int idArma){
        for(Arma i: armas){
            //System.out.println("Buscando id... "+i.getId());
            if(i.getId() == idArma){
                armas.remove(i);
                return true;
            }
        }
        return false;
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
    
    public void updateEstructuras(){
        int x,y;
        boolean flag = false;
        for(Vertice v: grafo.vertices){
            flag = false;
            for(Punto p : v.estructura.getCellsBusy()){
                x = p.getX();
                y = p.getY();
                if(positions[x][y] != true){
                    flag = true;
                }
            }
            if(!flag){
                v.estructura.setDestruida(true);
            }
        }
        
        for(Vertice v: grafo.vertices){
            if(v.estructura.isDestruida()){
                v.aristas.clear();
            }
        }
    }
}
