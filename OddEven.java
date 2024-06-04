package FML;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numbers[] = new int[n];
		int oddsum = 1;
		int evensum = 1;

		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();

			if (i % 2 == 0) {

				evensum = evensum * numbers[i];
			} else {

				oddsum = oddsum * numbers[i];
			}

		}
		if (oddsum == evensum) {
			System.out.printf("yes %d", evensum);
		} else {
			System.out.printf("no %d %d", evensum, oddsum);
		}
		sc.close();
	}
}
