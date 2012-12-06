package tower;

public class Susan {
    
    int num, mov = 0;
    String res="";
    
    public void intDatos(int n) {
        num = n;
    }
    
    public void reset() {
        res = "";
        num = 0;
        mov = 0;
    }
    
    public String hanoi() {
        moveTower(num, 'A', 'B', 'C');
        return res;
    }
    
    public int mov() {
        return mov;
    }
    
    private void moveTower (int ht, char f, char t, char i) {
        if(ht>0) {
            moveTower(ht-1,f,i,t);
            moveRing(ht,f,t);
            moveTower(ht-1,i,t,f);
        }
    }
    
    private void moveRing (int d, char f, char t) {
        res = res+"Mueve el anillo "+d+" de la torre "+f+" a la "+t+"\n";
        mov += 1;
    }
}