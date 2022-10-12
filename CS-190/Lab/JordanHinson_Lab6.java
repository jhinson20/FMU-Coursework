import java.util.Scanner;
//Jordan Hinson CS-190-2 Lab 6

public class JordanHinson_Lab6 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a math operation in the form: (integer)(+,-,*,/)(integer)");
		String inputEquation = input.next();
		System.out.printf("%5s = %-10.3f", inputEquation, doOperation(inputEquation));
	}
		public static double doOperation(String inputEquation) {
		int negative = 0 - 1;
		int operationIndex = 0;
		double answer = 0;
		
		int add = inputEquation.indexOf('+');
		int sub = inputEquation.indexOf('-');
		int multi = inputEquation.indexOf('*');
		int div = inputEquation.indexOf('/');
		
		if (add > negative)
			operationIndex = add;
		else if (sub > negative)
			operationIndex = sub;
		else if (multi > negative)
			operationIndex = multi;
		else if (div > negative)
			operationIndex = div;
		
		String operationStart = inputEquation.substring(0, operationIndex);
		String operationEnd = inputEquation.substring((operationIndex + 1), inputEquation.length());
		double x = Double.parseDouble(operationStart);
		double y = Double.parseDouble(operationEnd);
		
		if (inputEquation.charAt(operationIndex) == '+')
			answer = x + y;
		else if (inputEquation.charAt(operationIndex) == '-')
			answer = x - y;
		else if (inputEquation.charAt(operationIndex) == '*')
			answer = x * y;
		else if (inputEquation.charAt(operationIndex) == '/')
			answer = x / y;
		return answer;
	}
}