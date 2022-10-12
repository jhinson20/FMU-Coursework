import java.util.Scanner;
//Jordan Hinson CS-190-2 Homework 4 PT 2

	public class CS190HW4PT2 {
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			System.out.println("What is your sentence?: ");
			String inputSentence = input.nextLine();
			String sentenceReversed = "";
			int sentenceLength = inputSentence.length();
			int wordCount = 1;
			int last = sentenceLength;
			int runThrough = 0;
			int checkpoint = 1;
			
			int check = sentenceLength - 1;
			while (check >= 0){
				if (inputSentence.charAt(check) == (char)(32)){
					wordCount++;
					check--;
				}
				else
					check--;
			}
			
			check = sentenceLength - 1;
			while (check >= 0){
				runThrough++;
				if (inputSentence.charAt(check) == (char)(32) && checkpoint == 1){ 
					sentenceReversed += inputSentence.substring(check + 1,last);
					last -= runThrough;
					check--;
					runThrough = 0;
					checkpoint += 1;
				}
				else if (checkpoint == wordCount){
					sentenceReversed += " " + inputSentence.substring(0,last);
					last -= runThrough;
					check--;
					runThrough = 0;
					checkpoint += 1;
				}
				else if (inputSentence.charAt(check) == (char)(32) && checkpoint != 0){ 
					sentenceReversed += inputSentence.substring(check,last);
					last -= runThrough;
					check--;
					runThrough = 0;
					checkpoint += 1;
				}
				else
					check--;
			}
			System.out.println(sentenceReversed);
		}
	}
	