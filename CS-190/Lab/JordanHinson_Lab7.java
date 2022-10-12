import java.util.Scanner;
//Jordan Hinson CS-190-2 Lab 7

public class JordanHinson_Lab7 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a 14 digit card number: ");
		String cardNumber = input.next();
		
			if (lengthTest(cardNumber)) 
				System.out.println("Length correct");
			else {
				System.out.println("Length incorrect");
				System.exit(0);
			}
			
			if (letterTest(cardNumber)) 
				System.out.println("Characters correct");
			else {
				System.out.println("Characters incorrect");
				System.exit(0);
			}
			
			System.out.println("Odd sum = " + oddSum(cardNumber));
			System.out.println("Even sum = " + evenSum(cardNumber));
			
			if (bothSum(oddSum(cardNumber),evenSum(cardNumber)))
				System.out.println("Card number valid");
			else
				System.out.println("Card number invalid");
	}
	private static boolean lengthTest(String x) {
		if (x.length() == 14)
			return true;
		else 
			return false;	
	}
	private static boolean letterTest(String x) {
		for (int i = 0; i < x.length(); i++){
			if (x.charAt(i) >= 48 && x.charAt(i) <= 57)
				continue;
			else
				return false;
		}
		return true;
	}
	private static int oddSum(String x) {
		int z = 0;
		for (int i = 0; i <= 12; i += 2) {
			int y = Integer.parseInt(x.substring(i,(i+1)));
			y *= 2;
			if (y >= 10)
				z += y - 9;
			else
				z += y;
		}
		return z;
	}
	private static int evenSum(String x) {
		int z = 0;
		for (int i = 1; i <= 13; i += 2) {
			z += Integer.parseInt(x.substring(i,(i+1)));
		}
		return z;
	}
	private static boolean bothSum(int x,int y) {
		if ((x + y) % 10 == 0)
			return true;
		else
			return false;
	}
}			