package FML;

import java.util.Scanner;

public class examNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startnum = Integer.parseInt(sc.nextLine());
		int endnum = Integer.parseInt(sc.nextLine());
		int target = Integer.parseInt(sc.nextLine());

		if (100 <= startnum && startnum < endnum && endnum <= 999) {
			for (int i = startnum; i <= endnum; i++) {
				int result = sumDigits(i, 0);
				if (result == target) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Does not meet constraints..");
		}
	}

	static int sumDigits(int num, int sum) {
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		return sum;
	}
}
