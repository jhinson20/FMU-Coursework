/**
 * 
 * Name       : Jordan Hinson
 * Email      : jordan.hinson@g.fmarion.edu
 * Date       : 9/7/2021
 * File Name  : StringPermutation.java
 * Description: Takes a string input from a user and prints
 *              all of the permutations of that string.
 *              
 **/

import java.util.*;

public class StringPermutation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userInput = "";                                //User inputed string
		while(true) {                                         //Loop for input validation
			try {
				System.out.print("Input a string: ");
				userInput = input.nextLine();
				if(userInput == null) {
					System.out.print("Non string input. ");
					continue;
					
				}
				
			}
			
			catch(InputMismatchException e) {                //Catch for if the user input is not a string.
				System.out.print("Non string input. ");
				input.nextLine();
				continue;
				
			}
			
			break;
		}
		
		displayPermutation(userInput);
		
	}
	
	public static void displayPermutation(String s) {     //Takes user inputed string as a parameter. Calls to the displayPermutation overloaded method.
		displayPermutation("", s);
		
	}
	
	public static void displayPermutation(String s1, String s2) {  //Takes two strings as parameters. Recursively calls to itself to find permutations.
		if(s2.length() == 0)              //Base case for printing permutations
			System.out.println(s1);
		for(int i = 0; i < s2.length(); i++) {
			String s1Temp = s1 + s2.charAt(i);
			String s2Temp = s2.substring(0, i) + s2.substring((i+1), s2.length());
			displayPermutation(s1Temp, s2Temp);          //Recursive call to the method using the Temp strings as parameters.
			
		}
		
	}
	
}
