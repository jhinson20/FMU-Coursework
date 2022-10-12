import java.util.Scanner;
//Jordan Hinson CS-190-2 Lab 5

public class JordanHinson_Lab5 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Select your obejct to play");
		System.out.println("Enter 'R' for rock");
		System.out.println("Enter 'P' for paper");
		System.out.println("Enter 'S' for scissors");
		System.out.println("Choose your object to play: ");
		String playerChoiceString = input.next();
		char playerChoice = playerChoiceString.toUpperCase().charAt(0);
		char computerChoice = 0;
		System.out.println("You selected " + (char)playerChoice);
		int randomNumber;
		
		randomNumber = 1 + (int)(Math.random() * 3);
		if (randomNumber == 1)
			computerChoice = 'R';
		else if (randomNumber == 2)
			computerChoice = 'P';
		else if (randomNumber == 3)
			computerChoice = 'S';
	
	System.out.println("Computer choice " + (char)computerChoice);
	String winner = "";
	
	if (playerChoice == computerChoice)
		winner = "Tie";
	else if (playerChoice == 'R' && computerChoice == 'S')
		winner = "Player";
	else if (playerChoice == 'P' && computerChoice == 'R')
		winner = "Player";
	else if (playerChoice == 'S' && computerChoice == 'P')
		winner = "Player";
	else if (computerChoice == 'R' && playerChoice == 'S')
		winner = "Computer";
	else if (computerChoice == 'P' && playerChoice == 'R')
		winner = "Computer";
	else if (computerChoice == 'S' && playerChoice == 'P')
		winner = "Computer";
	
		System.out.println("The winner is: " + winner);	
}
}