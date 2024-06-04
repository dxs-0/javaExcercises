package FML;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Object;
import java.util.stream.*;

public class sortNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String splitNumbers[] = input.split(", ");
		int numLenght = splitNumbers.length;
		Integer numbers[] = new Integer[numLenght];

		for (int i = 0; i < splitNumbers.length; i++) {
			numbers[i] = Integer.parseInt(splitNumbers[i]);

		}
		Arrays.sort(numbers, Collections.reverseOrder());
		System.out.println(Stream.of(numbers).map(String::valueOf).collect(Collectors.joining(", ")));
		// Stream.of(numbers).map(String::valueOf).collect(Collectors.joining(", "));

	}

}
//Arrays.sort(numbers, Collections.reverseOrder())  String.join(", ",numbers.toString());