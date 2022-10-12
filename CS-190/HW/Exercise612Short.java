import java.util.Scanner;
//Jordan Hinson Exercise 6.21 CS-190-2
public class Exercise612Short {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a string: ");
		String inputNumberString = input.next();
		String resultNumber = "";
		for (int i = 0; i < inputNumberString.length(); i++) {
			if (Character.toUpperCase(inputNumberString.charAt(i)) >= 'A' && Character.toUpperCase(inputNumberString.charAt(i)) <= 'Z') 
				resultNumber += letterToNumber(Character.toUpperCase(inputNumberString.charAt(i)));
			else 
				resultNumber += inputNumberString.charAt(i);
		}
		System.out.println(resultNumber);
	}
	public static int letterToNumber (char letter) {
		if (letter >= 'W') return 9;
		else if (letter >= 'T') return 8;
		else if (letter >= 'P') return 7;
		else if (letter >= 'M') return 6;
		else if (letter >= 'J') return 5;
		else if (letter >= 'G') return 4;
		else if (letter >= 'D') return 3;
		else return 2;
	}
}