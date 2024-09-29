
// Natālija Kamina 241RDB191
import java.util.Scanner;
public class Main3 {
    public static  void main(String[] args) {
        double f, t, step, x, sakne, rezultats;
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("from: ");
        f = sc.nextDouble();
        System.out.print("to: ");
        t = sc.nextDouble();
        System.out.print("step: ");
        step = sc.nextDouble();
        
        for( x = f; x<=t + 0.000001; x= x+step){
            sakne= Math.sqrt(x-1);
            if (x - 1 <= 0 + 0.000001) {
                
                System.out.printf("%.2f\tnot defined%n", x);
                
                
            } else {
                
                rezultats = ((x + 1) * (x + 1)) / sakne;
                System.out.printf("%.2f\t%.2f%n", x, rezultats);
                

            }

        }
    } catch (Exception e) {
        System.out.println("input-output error");

    }
    sc.close();





    }
}
