package FML;

import java.util.Scanner;

public class primeFactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 0;
		if (n <= 4) {
			System.out.print(" Invalid Input ");
			return;
		}

		for (i = 2; i < n; i++) {
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
		}
		if (n > 2) {
			System.out.println(n);
		}
	}
}