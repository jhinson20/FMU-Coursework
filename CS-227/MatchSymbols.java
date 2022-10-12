/**
 * Name: Jordan Hinson
 * Date: 10/21/21
 * email: jordan.hinson@g.fmarion.edu
 * Description: Class that reads a file and checks for the proper
 * 				number and syntax of braces and parentheses.
 */

import java.util.*;
import java.io.*;

public class MatchSymbols {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		Stack<Character> stringStack = new Stack<>();
		File file;
		Scanner fileReader;
		
		System.out.print("What file would you like to check? ");
		while(true) {
			try {
			String fileName = input.nextLine() + ".txt";
			file = new File(fileName);
			fileReader = new Scanner(file);

			}catch(Exception o) {
			
			System.out.print("File not found. Enter a file name again. ");
			continue;
			
			}
			break;
		}
		
		while(fileReader.hasNext()) {
			String nextString = fileReader.next();
			
			for(int i = 0; i < nextString.length(); i++) {
				if((nextString.charAt(i) == ')') || (nextString.charAt(i) == ']') || (nextString.charAt(i) == '}')) {
					char popped = ' ';
					
					try {
					popped = stringStack.pop();
					
					}
					
					catch(Exception e) {
						System.out.println("The document contains a closing symbol without an opening symbol to match.");
						System.exit(0);
						
					}
					
					if((popped == '(') && (nextString.charAt(i) == ')'))
						continue;
					
					else if((popped == '[') && (nextString.charAt(i) == ']'))
						continue;
					
					else if((popped == '{') && (nextString.charAt(i) == '}'))
						continue;
					
					else {
						System.out.println("The document did not correctly close a symbol with a matching symbol.");
						System.exit(0);
					}	
					
				}
			
				else if((nextString.charAt(i) == '(') || (nextString.charAt(i) == '[') || (nextString.charAt(i) == '{')) {
					stringStack.push(nextString.charAt(i));
					
				}
			
				else
					continue;
			
			}
			
		}
		
		fileReader.close();
		input.close();
		
		
		if(stringStack.size() > 0)
			System.out.println("There was an opening symbol that did not have a matching symbol to close it.");
		else
			System.out.println("There were no completion errors in the document.");
		
	}
}