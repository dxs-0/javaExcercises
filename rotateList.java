package FML;

import java.util.Arrays;
import java.util.Scanner;

public class rotateList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		//int input2 = sc.nextInt();
		String list[] = input1.split(",");
		int rotateIndex = sc.nextInt();
		int[] rotatedList = new int[list.length];
		for(int i=0;i<rotatedList.length;i++) {rotatedList[i] = Integer.parseInt(list[i]);}
		for (int i = 0; i < rotateIndex; i++) {
			
			int temp, lastElement;
			lastElement = rotatedList[rotatedList.length - 1];

			for (temp = list.length - 1; i > 0; i--) {
				rotatedList[temp] = rotatedList[temp - 1];
				rotatedList[0]	=lastElement ;
			}
		}
		System.out.print(Arrays.toString(rotatedList).replace("[", "").replace("]", "").replace(" ", ""));
		sc.close();
	}
}