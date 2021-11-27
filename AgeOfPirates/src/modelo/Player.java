


package modelo;
/**
 *
 * @author ytces
 */
public class Player {
    private String name;
    private int turno;
    private boolean[][] positions = new boolean[20][20];
    
    
    Player(){
        name = "";
        turno = 0;
        for(int row=0;row<20;row++){
            for(int col=0;col<20;col++){
                positions[row][col] = false;
            }
        }
        
    }
}
