import java.util.Scanner;
//Jordan Hinson CS-190-2 Homework 3

public class CS190HW3{
	public static void main(String[] args){
		System.out.println("Enter a valid Social Security Number in the format DDD-DD-DDDD, where D is a digit."); 
		System.out.println("(Must include dashes and contain no spaces.):");
		Scanner input = new Scanner (System.in);  //Allows for input
			String SSNumber = input.next();  //Makes next input the int SSNumber
				int SSLength = SSNumber.length();
					
				
			if (SSLength != 11){
				System.out.println("Incorrect number of characters for the input.");
				System.exit(0);
			}
				

				char CH1 = (SSNumber.charAt(0));
				char CH2 = (SSNumber.charAt(1));
				char CH3 = (SSNumber.charAt(2));
				char CH4 = (SSNumber.charAt(3));
				char CH5 = (SSNumber.charAt(4));
				char CH6 = (SSNumber.charAt(5));
				char CH7 = (SSNumber.charAt(6));
				char CH8 = (SSNumber.charAt(7));
				char CH9 = (SSNumber.charAt(8));
				char CH10 = (SSNumber.charAt(9));
				char CH11 = (SSNumber.charAt(10)); 
				
			
			
				int x = 45;		
			
		
			if (SSLength == 11 && Character.isDigit(CH1) && Character.isDigit(CH2) && Character.isDigit(CH3) && (x == CH4) && Character.isDigit(CH5) && Character.isDigit(CH6) &&
				(x == CH7) && Character.isDigit(CH8) && Character.isDigit(CH9) && Character.isDigit(CH10) && Character.isDigit(CH11))
				System.out.println(SSNumber + " is a correct input for a Social Security Number.");  
			else
				System.out.println(SSNumber + " is an incorrect input for the Social Security Number.");
		
	}
}