import java.util.Random;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        int A[] = new int[10];
        int B[] = new int[10];
        int K;
        Scanner sc = new Scanner(System.in);
        System.out.println("241RDB191, Natalija Kamina, 10, 7.variants");
        System.out.println("241RDB217, Kristaps Nartiss, 10, 7.variants");
        System.out.print("K: ");
        K = sc.nextInt();
        if (K == 0) {
            Random r = new Random();
            for (int i = 0; i <= 9; i++) {
                A[i] = r.nextInt(21);
            }
            for (int i = 0; i <= 9; i++) {
                B[i] = r.nextInt(51)+50;
            }
        } else {
            for (int i = 0; i <= 9; i++) {
                A[i] = i + K;
                B[i] = (i + 10) * K;
            }
        }
            System.out.println("A: ");
            for (int i = 0; i <= 9; i++) {
                System.out.print(A[i] + " ");

            }
            System.out.println();
            System.out.println("B: ");
            for (int i = 0; i <= 9; i++) {
                System.out.print(B[i] + " ");
            }
            int C[] = new int[20];
            for (int i = 0; i <= 9; i++) {
                C[2 * i] = A[i];
                C[2 * i + 1] = B[i];
            }
             System.out.println();
             System.out.println("C: ");
            for (int i = 0; i <= 19; i++) {
                System.out.print(C[i] + " ");
                if ((i + 1) % 10 == 0) {
                    System.out.println();
                }
            }
            sc.close();
        }

    }

