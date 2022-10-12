import java.util.Scanner;
//Jordan Hinson CS-190-2 Lab 10
public class JordanHinson_Lab10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean condition = true;
		int[][] deminsionalArray = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])];
		fillArray(deminsionalArray);
		printArray(deminsionalArray);
		System.out.println("");
		while (condition) {
			System.out.println("");
			System.out.println("1: Swap two random rows");
			System.out.println("2: Swap two random columns");
			System.out.println("3: Form array transpose");
			System.out.println("4: Exit");
			int choice = input.nextInt();
			if (choice == 4)
				condition = false;
			else if (choice == 3) {
				deminsionalArray = menuTranspose(deminsionalArray);
				printArray(deminsionalArray);
			}
			else
				menuOptions(deminsionalArray, choice);
		}
	}
	private static void fillArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				array[i][j] = (int)(Math.random() * 100);
		}
	}
	private static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("");
			for (int j = 0; j < array[i].length; j++)
				System.out.printf("%6d", array[i][j]);
		}
	}
	private static void menuOptions(int[][] array, int x) {
		if (x == 1) {
			int r1 = (int)(Math.random() * array.length);
			int r2 = (int)(Math.random() * array.length);
			int temp = 0;
			while (r1 == r2)
				 r2 = (int)(Math.random() * array.length);
			 for (int i = 0; i < array[r1].length; i++) {
				 temp = array[r1][i];
				 array[r1][i] = array[r2][i];
				 array[r2][i] = temp;
			 }
			 System.out.println("");
			 System.out.println("Swapping rows " + r1 + " and " + r2 + ".");
			 printArray(array);
		}
		else if (x == 2) {
			int c1 = (int)(Math.random() * array[0].length);
			int c2 = (int)(Math.random() * array[0].length);
			int temp = 0;
			while (c1 == c2)
				 c2 = (int)(Math.random() * array[0].length);
			 for (int i = 0; i < array.length; i++) {
				 temp = array[i][c1];
				 array[i][c1] = array[i][c2];
				 array[i][c2] = temp;
			 }
			 System.out.println("");
			 System.out.print("Swapping columns " + c1 + " and " + c2 + ".");
			 printArray(array);
		}
		else if (x == 4)
			return;
		else
			System.out.println("Incorrect Option - Try Again");
	}
	private static int[][] menuTranspose(int[][] array) {
			int[][] arrayCopy = new int[array[0].length][array.length];
			for (int i = 0; i < arrayCopy.length; i++) {
				for (int j = 0; j < arrayCopy[0].length; j++)
					arrayCopy[i][j] = array[j][i];
			}
			System.out.println("");
			System.out.println("Transpose of array");
			return arrayCopy;
	}
}