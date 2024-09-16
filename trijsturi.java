//Natālija Kamina 241RDB191//

import java.util.Scanner;
public class trijsturi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b + c && b< a+c && c<a+b) {
            if (a == b && a == c && c == b) {
                System.out.println("equilateral triangle");
            } else if(a==b && a!=c && b!=c || b==c && b!=a && a!=c || a==c && a!=b && b!=c) {
                System.out.println("isosceles triangle");
            } else if (c * c == a * a + b * b || b*b== a*a +c*c || a*a == c*c + b*b) {
                System.out.println("right-angled triangle");
            } else {
                 System.out.println("scalene");
            }  
        } else {
            System.out.println("does not exist");
        }
       
        sc.close();

    }
}
