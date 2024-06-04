package FML;

import java.util.Scanner;

public class arraySearchbyAwsmguyy {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] list = line.split(",");
		int[] all = new int[list.length];

		String output = "";

		for (int i = 0; i < list.length; i++) {
			all[i] = Integer.parseInt(list[i]);
		}

		for (int i = 1; i <= all.length; i++) {
			int counter = 0;
			for (int j = 0; j < all.length; j++) {
				
				if (i != all[j]) {
					counter++;
				}
			}
			if (counter == all.length) {
				output += i + ",";
			}
			

		}
		System.out.print(output.substring(0, output.length() - 1));
	}
}
