package FML;

import java.util.Arrays;
import java.util.Scanner;

public class combineLists {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		String list1[] = input1.split(",");
		String list2[] = input2.split(",");
		String[] concat = new String[list1.length * 2];
		int index = 0;
		for (int i = 0; i < list1.length; i++) {
			concat[index++] = list1[i];
			concat[index++] = list2[i];

		}

		System.out.print(Arrays.toString(concat).replace("[", "").replace("]", "").replace(" ", ""));
	}
}
