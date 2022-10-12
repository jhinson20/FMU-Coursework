import java.util.Scanner;
//Jordan Hinson CS-190-2 Homework2 3.20

public class CS190HW2PT2{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
			System.out.println("Enter a temperature: ");
				double temperatureinput = input.nextDouble();
				
			System.out.println("Enter a wind speed: ");
				double windspeedinput = input.nextDouble();
				double velocity = Math.pow(windspeedinput, 0.16);
				
				double windchill;
				if ((-58 < temperatureinput) && (temperatureinput < 41) && (windspeedinput >= 2)){
					windchill = (35.74 + (0.6215 * temperatureinput) - (35.75 * velocity) + (0.4275 * temperatureinput * velocity));
					System.out.print("With a temperature of " + temperatureinput + " and a wind speed of " + windspeedinput + ", there is a wind chill of " + windchill);}
				else if ((-58 >= temperatureinput) || (temperatureinput >= 41) && (windspeedinput >= 2)){
					System.out.println("The entered temperature (" + temperatureinput + ") is invalid"); }
				else if ((-58 < temperatureinput) && (temperatureinput < 41) && windspeedinput < 2){
					System.out.println("The entered wind speed (" + windspeedinput + ") is invalid");}
				else if ((-58 >= temperatureinput) && (temperatureinput >=41) && (windspeedinput < 2)){
					System.out.println("The entered temperature (" + temperatureinput + ") and the entered wind speed (" + windspeedinput + ") are both invalid"); }
	}
}