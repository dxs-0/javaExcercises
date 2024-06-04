package FML;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = scanner.nextInt();
        double S = 1;
        int factorial = 1;
 
        for (int i = 1; i <= N; i++) {
            factorial = factorial * i;
            S = S + factorial / Math.pow(x, i);
        }
        System.out.printf("%.5f", S);
 
    }
}