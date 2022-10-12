import java.util.Scanner;
//Jordan Hinson Lab 2 CS-190-2

public class JordanHinson_Lab2{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			System.out.println("Please enter a 3 digit number to determine if it is an Armstrong number:");
			int number = input.nextInt();
		
		int hundreds = number/100;
		int tens = number % 100/10;
		int ones = number % 10;
		
		int div10   = number/10;
		int div100  = number/100;
		int div1000 = number/1000;
		
			System.out.println("First remainder is: " + ones);
			System.out.println("After first integer division number is now: " + div10);
			System.out.println("Second remainder is: " + tens);
			System.out.println("After second integer division number is now: " + div100);
			System.out.println("Third remainder is: " + hundreds);
			System.out.println("After second integer division number is now: " + div1000);
			
		int pow  = 3;
		int test = ((int)Math.pow(ones,pow) + (int)Math.pow(tens,pow) + (int)Math.pow(hundreds,pow));
		
		if (test == number)
			System.out.println("Number: " + number + " is an Armstrong number");
		else
			System.out.println("Number: " + number + " is not an Armstrong number");
	}
}