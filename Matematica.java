package matematica;

/**
 *
 * @author kawe.silva_uscsonlin
 */
public class Matematica {

    public static void main(String[] args) {
        System.out.println("34+88=" + math (34,88));
       potencia (5,3);
    }
    
    public static int math (int a, int b){
        return a+b;
    }
    public static void potencia (int x, int y) {
        System.out.println(x+ " elevado a " + y + " = " + Math.pow (x,y));
    }
}
