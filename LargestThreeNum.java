package FML;

import java.util.Scanner;

public class LargestThreeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numbers[] = new int[n];
		int largest = Integer.MIN_VALUE  ;
		int slargest = Integer.MIN_VALUE  ;
		int tlargest = Integer.MIN_VALUE ;
		int i = 0;

		if (numbers.length < 3) {
			System.out.print(" Invalid Input ");
			return;
		}

		for (i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		for (i = 0; i < n; i++) {
			if (numbers[i] > largest) {
				tlargest = slargest;
				slargest = largest;
				largest = numbers[i];
			}else if (numbers[i] > slargest) {
				tlargest = slargest;
				slargest = numbers[i];

			} else if (numbers[i] > tlargest) {
				tlargest=numbers[i] ;
			}
		}
		System.out.printf("%d, %d and %d", largest, slargest, tlargest);
		sc.close();
		System.out.println();
	}

}
