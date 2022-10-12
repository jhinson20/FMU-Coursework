import java.util.Scanner;
//Jordan Hinson CS-190-2 Lab 4

public class JordanHinson_Lab4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		boolean replay = true;
		
		while (replay) {
			int guesses = 0;
			String letter = "";
			letter += (char)(97 + Math.random() * 26);
			System.out.println("Guess the random lower case letter.");
			System.out.println("You get 10 guesses.");
			
			for (int i = 0; i < 10; i++) {
				System.out.println("Enter your guess:");
				String guessString = input.next();
				if (guessString.compareToIgnoreCase(letter) == 0) {
					System.out.println("The letter was " + letter + "! " + "You got it in " + i + " guesses.");
					break;
				}
				else {
					System.out.print("");
					guesses++;
				}
			}
			if (guesses == 10)
				System.out.println("Sorry, the correct answer was '" + letter + "'");
			System.out.println("Play again?");
			System.out.println("Enter 'y' to continue, 'n' to exit the game:");
			String retry = input.next();
			if (retry.compareToIgnoreCase("Y") == 0)
				replay = true;
			else
				replay = false;
		}
	}
}
