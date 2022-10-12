public class CS190HW4PT1{
//Jordan Hinson CS-190-2 Homework 4 PT 1
	public static void main(String[] args){
	
		System.out.println("These are all of the numbers between 100 and 200 that are divisible by 5 or 6, by not both.");
		
			String tempNumbers = "";
			int l = 0;
			
				for (int i = 100; i < 200; i++) { 
				if (i % 5 == 0 ^ i % 6 == 0) {
					tempNumbers += " " + i;
					l++; }
					if (l >= 10) {
						System.out.println(tempNumbers);
						tempNumbers = "";
						l = 0; }
				
	}
}
}