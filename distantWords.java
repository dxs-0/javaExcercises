package FML;

import java.util.Scanner;
import java.lang.Math;

public class distantWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = Integer.parseInt(sc.nextLine());
		int numWords = Integer.parseInt(sc.nextLine());
		int sumDistance = 0;
		for (int i = 0; i < numWords; i++) {
			String currentWord = sc.nextLine();
			int currentScore = wordScore(currentWord);
			int currentDistance = Math.abs(currentScore - target);
			sumDistance += currentDistance;

			System.out.printf("%s %s", currentWord, currentDistance);
			System.out.println();
		}
		float avgDistance = sumDistance / (float) numWords;
		System.out.printf("%.2f", avgDistance);

	}

	static int wordScore(String word) {
		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			sum += ((int) word.toLowerCase().charAt(i)) - 96;

		}
		return sum;
	}

}