// Natālija Kamina 241RDB191
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0, count = 0,number;
        while(true) {
            number = sc.nextInt();

            if (number == 0) {
                break; 
            }

            if (number > 0) {
                sum += number; 
                count++; 
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf( "%.1f%n",average);
        } else {
            System.out.println(0.00);
        }

        sc.close();
    }
}

