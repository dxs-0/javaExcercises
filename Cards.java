package FML;

import java.util.Scanner;

public class Cards {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String strCards = "2 3 4 5 6 7 8 9 10 J Q K A";

		String cardSigns[] = strCards.split(" ");

		String suits[] = { "spades", "clubs", "hearts", "diamonds" };

		for (String card : cardSigns) {

			for (String suit : suits) {

				if (suit.equals("diamonds")) {
					System.out.print(card + " of " + suit);
				} else {
					System.out.print(card + " of " + suit + ", ");
				}
			}

			if (card.equals(input)) {
				break;
			}
			System.out.println();
		}
	}
}