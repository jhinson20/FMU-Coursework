import java.util.Scanner;
//Jordan Hinson CS-190-2 Chapter 2 #7

	public class MakeChange {
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			System.out.println("Enter price of item");
			System.out.print("(from 25 cents to a dollar, in 5-cent increments):");
			int payment = input.nextInt();
			int change = 100 - payment;
			int q = 0; //quarters
			int d = 0; //dimes
			int n = 0; //nickels

			while(change >= 25) {
				change -= 25;
				q++;
			}
			while(change >= 10 && change < 25) {
				change -= 10;
				d++;
			}
			while(change >= 5 && change < 10) {
				change -= 5;
				n++;
			}
			
			System.out.println("You bought an item for " + payment + " cents and gave me a dollar, so your change is:");
			System.out.println(q + " quarter(s),");
			System.out.println(d + " dime(s), and");
			System.out.println(n + " nickel(s).");
		}
	}