


package modelo;
/**
 *
 * @author ytces
 */
public class Player {
    private String name;
    private int turno;
    private int money;
    private int steel;
    private boolean[][] positions = new boolean[20][20];
    
    
    Player(){
        name = "";
        turno = 0;
        money = 4000;
        steel = 0;
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
        for(int row=0;row<20;row++){
            for(int col=0;col<20;col++){
                positions[row][col] = false;
            }
        }
    }
    
}
