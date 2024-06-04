package FML;

import java.util.Scanner;

public class voweltoLenght {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numInputs = Integer.parseInt(sc.nextLine());
		String bestFood = "";
		int bestVowels = 1;
		int bestLenght = 1;
		//float bestRatio = 1;
		for (int i = 0; i < numInputs; i++) {
			String currentFood = sc.nextLine();
			int currentVowels = vowelCounter(currentFood);
			int currentLenght = currentFood.length();
			//System.out.printf("%s %d/%d", currentFood, currentVowels, currentLenght);
			//System.out.println();
			float currentRatio = currentVowels / (float) currentLenght;
			float bestRatio = bestVowels / (float) bestLenght;
			//System.out.printf("cur %f - best %f", currentRatio, bestRatio);
			//System.out.println();
			if (currentRatio < bestRatio) {
				bestFood = currentFood;
				bestVowels = currentVowels;
				bestLenght = currentLenght;
			} else if (currentRatio == bestRatio) {
				if (currentVowels > bestVowels) {
					bestFood = currentFood;
					bestVowels = currentVowels;
					bestLenght = currentLenght;
				} else if (currentVowels == bestVowels) {
					if (currentLenght > bestLenght) {
						bestFood = currentFood;
						bestVowels = currentVowels;
						bestLenght = currentLenght;
					}
				}

			}
		}
		System.out.printf("%s %d/%d", bestFood, bestVowels, bestLenght);

	}

	static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');

	}

	static int vowelCounter(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++)
			if (isVowel(str.charAt(i)))
				count++;
		return count;

	}

}
