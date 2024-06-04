package FML;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class reverseNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String numbers[] = input.split("");
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i]);
		}
	}
}