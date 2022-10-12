import java.util.*;
import java.io.*;
public class ISBNTest {
	public static void main(String[] args)throws  IOException, InvalidISBNException{
		Scanner input = new Scanner(System.in);
		ArrayList<String> isbnLineList = new ArrayList<>();
		File file = new File(args[0] + ".txt");
		Scanner fileReader = new Scanner(file);
		while (fileReader.hasNext())
			isbnLineList.add(fileReader.nextLine());
		fileReader.close();
		for (int i = 0; i < isbnLineList.size(); i++) {
			String[] isbnLineArray = isbnLineList.get(i).split("-");
			String lineToPrint = isbnLineList.get(i);
			String isbnLine = "";
			for(int j = 0; j < isbnLineArray.length; j++)
				isbnLine += isbnLineArray[j];
			try {
				if(isbnLine.length() == 10)
					tenCharTest(isbnLine, lineToPrint);
				else if(isbnLine.length() == 13)
					thirteenCharTest(isbnLine, lineToPrint);
				else
					System.out.print("nah");
			}
			catch (InvalidISBNException e) {
				System.out.println(e);
			}
		}
	}
	static void tenCharTest(String testLine, String printLine)throws java.io.IOException, InvalidISBNException {
		BufferedWriter outputFile10 = new BufferedWriter(new FileWriter("valid10_ISBN.txt", true));
		int sum = 0;
		for (int i = 0; i < 10; i++) 
			sum += (Integer.parseInt(String.valueOf(testLine.charAt(i))) * (10-i));
		if ((sum % 11) == 0){
			outputFile10.write(printLine + "\n");
			outputFile10.close();
		}
		else
			throw new InvalidISBNException(printLine);
	}
	static void thirteenCharTest(String testLine, String printLine)throws java.io.IOException, InvalidISBNException {
		BufferedWriter outputFile13 = new BufferedWriter(new FileWriter("valid13_ISBN.txt", true));
		int sum = 0;
		for (int i = 0; i < 13; i++) {
			if((i % 2) == 0)
				sum += Integer.parseInt(String.valueOf(testLine.charAt(i)));
			else
				sum += (Integer.parseInt(String.valueOf(testLine.charAt(i))) * 3);
		}
		if ((sum % 10) == 0) {
			outputFile13.write(printLine + "\n");
			outputFile13.close();
		}
		else
			throw new InvalidISBNException(printLine);
	}
}

class InvalidISBNException extends Exception {
	InvalidISBNException(String line) {
		super("Invalid ISBN " + line);
	}
}