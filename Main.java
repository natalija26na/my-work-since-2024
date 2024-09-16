import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double litersPer100km;
        double milesPerGallon;
        Scanner sc = new Scanner(System.in);

        System.out.print("liters-per-100km: ");

        litersPer100km = sc.nextDouble();
        milesPerGallon = ((100 / litersPer100km) * 3.8) / 1.6;

        System.out.printf("miles-per-gallon: %.2f\n", milesPerGallon);

        sc.close();
    }
}