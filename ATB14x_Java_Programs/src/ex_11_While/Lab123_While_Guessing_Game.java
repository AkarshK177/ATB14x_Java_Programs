package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
	public static void main(String[] args) {

		// Generating a random number
		Random random = new Random();
		int numberToGuess = random.nextInt(5) + 1;
		// System.out.println(numberToGuess);

		// Getting input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number between 1-100");

		int attempt = 0;
		while (true) {

			// Handling edge case
			if (!sc.hasNextInt()) {
				System.out.println("Invalid input! Please enter a number.");
				sc.next(); // Consume invalid token
				continue;
			}

			int userGuess = sc.nextInt();
			attempt++;
			
			if (userGuess < 1 || userGuess > 100) {
				System.out.println("Wrong Input ! Please enter number between 1-100");
				continue;
			}

			if (userGuess < numberToGuess) {
				System.out.println("Too low");
				continue;
				
			} else if (userGuess > numberToGuess) {
				System.out.println("Too High");
				continue;
			}

			else {
				System.out.println("Bravo !! You Have guessed it right in " + attempt + " attempts.");
				break;
			}
		}

	}
}
