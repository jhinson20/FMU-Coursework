import java.util.*;

public class WriteVertical {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput = 0;
		while(true) {
			try {
				System.out.print("Enter a postitive integer: ");
				userInput = input.nextInt();
				if(userInput < 0) {
					System.out.print("Invalid input. ");
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.print("Invalid input. ");
				input.nextLine();
				continue;
			}
			break;
		}
		String userInputString = Integer.toString(userInput);
		System.out.println("\nRecursion Method:");
		verticalWriteR(userInputString, userInputString.length(), 0);
		System.out.println("\nIteration Method:");
		verticalWriteI(userInputString);
		
	}
	public static void verticalWriteR(String input, int inputLength, int charLocation) {
		if(charLocation == inputLength)
			return;
		System.out.println(input.charAt(charLocation));
		verticalWriteR(input, inputLength, (charLocation + 1));
	}
	public static void verticalWriteI(String input) {
		for(int i = 0; i < input.length(); i++)
			System.out.println(input.charAt(i));
	}
}