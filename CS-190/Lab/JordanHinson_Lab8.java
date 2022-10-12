import java.util.Scanner;
//Jordan Hinson CS-190-2 Lab 8

public class JordanHinson_Lab8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] salespeople = new String[5];
		double[] salesAmount = new double[salespeople.length];
		double total = 0;
		for (int i = 0; i < salespeople.length; i++) {
			System.out.print("Enter name for salesperson " + (i + 1) + ": ");
			salespeople[i] = input.next();
			System.out.print("Enter the amount for salesperson " + salespeople[i] + ": ");
			salesAmount[i] = input.nextDouble();
		}
		for (int i = 0; i < salespeople.length; i++)
			total += salesAmount[i];
		double average = total/salespeople.length;
		System.out.println("");
		System.out.println("Sales Report for all Personel");
		System.out.println("- - - - - - - - - - - - - - - - - -");
		for (int i = 0; i < salespeople.length; i++) 
			System.out.printf(salespeople[i] + "\t%25.2f\n", salesAmount[i]);
		System.out.println("- - - - - - - - - - - - - - - - - -");
		System.out.printf("Total sales: " + "\t%17.2f\n", Math.round(total * 100.00) / 100.00);
		System.out.printf("Average sales: " + "\t%17.2f\n", Math.round(average * 100.00) / 100.00);
	}
}