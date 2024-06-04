package FML;

import java.util.Scanner;

public class longestString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		int counter = 0;
		String longest = null;
	

		while (!input.equalsIgnoreCase("END")) {
			String food = input;
			int lenghto = food.length();

			
			if (lenghto >= counter) {
				counter = lenghto;
				longest = input;
			}
			input= sc.nextLine();
		}
		System.out.println(longest);

		sc.close();
	}
}