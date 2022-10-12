import java.util.*;
import java.io.*;

public class Exercise_3_9 {
	public static void main(String[] args) {
		String isbnInput;
		ArrayList<String> isbnList = new ArrayList<>();	
		File file = new File(args[0] + ".txt");			
		Scanner fileReader = new Scanner(file);
		while(fileReader.hasNext())isbnList.add(fileReader.nextLine());
			fileReader.close();
		for (int i = 0; i < isbnList.size(); i++){
			String[] touristItems = isbnList.get(i).split(",");
			toString(touristItems); 
  }
 }
 
 static void toString(String[] touristItems){
   System.out.println("Tourist name: " + touristItems[0] + " Phone: " + touristItems[1] + " Address: " + touristItems[2]);
 }
}