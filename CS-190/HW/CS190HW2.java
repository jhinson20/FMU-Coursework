import java.util.Scanner;
//Jordan Hinson CS-190-2 Homework2 3.5

public class CS190HW2{
	public static void main (String[] args){  //Sets class
		System.out.println("These are the days of the week with their corresponding numbers: ");
			System.out.println("0) Sunday");
			System.out.println("1) Monday");
			System.out.println("2) Tuesday");
			System.out.println("3) Wednesday");
			System.out.println("4) Thursday");
			System.out.println("5) Friday");
			System.out.println("6) Saturday");
		
		Scanner input = new Scanner (System.in);  // Allows for inputs in the scanner
			System.out.println("Enter today's day: ");  //Prints text that prompts user for day
			int todaynum = input.nextInt();  //Sets input for the day of the prompt for the day
		
		System.out.println("Enter the number of days elapsed since today: ");
			int elapsednum = input.nextInt();
			
			String today;  //Delcares today as a string variable+
			switch (todaynum){
				case 0: today = "Sunday"; break;
				case 1: today = "Monday"; break;
				case 2: today = "Tuesday"; break;
				case 3: today = "Wednesday"; break;
				case 4: today = "Thursday"; break;
				case 5: today = "Friday"; break;
				case 6: today = "Saturday"; break;
				default: today = "Not a valid input"; break;
			}
			
			int elapsedcalc = (todaynum + elapsednum) % 7;
			
			String elapsed;
			switch (elapsedcalc){
				case 0: elapsed = "Sunday"; break;
				case 1: elapsed = "Monday"; break;
				case 2: elapsed = "Tuesday"; break;
				case 3: elapsed = "Wednesday"; break;
				case 4: elapsed = "Thursday"; break;
				case 5: elapsed = "Friday"; break;
				case 6: elapsed = "Saturday"; break;
				default: elapsed = "Not a valid input"; break;
			}
				
			
		System.out.println("Today is " + today + " and the future day is " + elapsed);
	}
}