/**
 * Name: Jordan Hinson
 * Date: 9/29/21
 * email: jordan.hinson@g.fmarion.edu
 * Description: Class that creates a linked list of integers
 * 				to make an arbitrarily long number.
 */

import java.util.*;

public class HughNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userInput = "";
		boolean condition = true;
		
		while(condition) {
			
			System.out.print("Enter an arbitrarily long integer: ");
			userInput = input.nextLine();
			for(int i = 0; i < userInput.length(); i++) {
					
				if((userInput.charAt(i) < 48) || (userInput.charAt(i) > 57)) {
					System.out.print("Invalid input. ");
					break; 
						
					}
					
					else if(!((userInput.charAt(i) < 48) || (userInput.charAt(i) > 57)) && i == (userInput.length() - 1)) {
						condition = false;
					}
					
				}
				
				continue;
					
		}
		
		System.out.println("You out");
		HugeNumber<Integer> numberHugeNumbers = new HugeNumber<Integer>();
		for(int i = 0; i < userInput.length(); i++) {
			numberHugeNumbers.HugeNumberAdd((userInput.charAt(0) - 0));
			userInput = userInput.substring(0,1);
			
		}

	}

}

class HugeNumber<T> {
	
	private T element;
	private Node<T> current = null;
	private HugeNumber<T> head = null;
	private HugeNumber<T> tail = null;
	private HugeNumber<T> tailNext = null;
	private int size = 0;
	
	public HugeNumber() {
		
	}
	
	public HugeNumber(T data) {
		element = data;
	}
	
	private void next(T data) {
		
	}
	
	public void HugeNumberAdd(T data) {
	
	}
		
}

class Node<T> {
	
}
