import java.util.Scanner;
import java.util.Arrays;
//Jordan Hinson CS-190-2 Lab 9

public class Arrays_Sorting {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int[] originalArray = new int[n];
		for (int i = 0; i < n; i++) 
			originalArray[i] = (int)(Math.random() * n);
		int[] selectionSortCopy = originalArray.clone();
		int[] bubbleSortCopy = originalArray.clone();
		int[] arrayCommandSortCopy = originalArray.clone();
		System.out.print("Unsorted array: ");
		printArray(originalArray);
		System.out.print("Selection Sort Array: ");
		long startTime = System.nanoTime();
		selectionSortPrint(selectionSortCopy);
		long endTime = System.nanoTime();
		System.out.println("Selection Sort Time: " + (endTime - startTime) + " nanoseconds");
		System.out.print("Bubble Sort Array: ");
		startTime = System.nanoTime();
		bubbleSortPrint(bubbleSortCopy);
		endTime = System.nanoTime();
		System.out.println("Bubble Sort Time: " + (endTime - startTime) + " nanoseconds");
		System.out.print("Arrays.sort Array: ");
		startTime = System.nanoTime();
		arrayCommandSortPrint(arrayCommandSortCopy);
		endTime = System.nanoTime();
		System.out.println("Array.sort Time: " + (endTime - startTime) + " nanoseconds");
	}
	private static void selectionSortPrint(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int currentMin = a[i];
			int currentMinIndex = i;
			for (int j = (i + 1); j < a.length; j++) {
				if (currentMin > a[j]) {
					currentMin = a[j];
					currentMinIndex = j;
			}
		}
		if (currentMinIndex != i) {
			a[currentMinIndex] = a[i];
			a[i] = currentMin;
		}
		}
		printArray(a);
	}
	private static void bubbleSortPrint(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int z = 0; z < (a.length - 1); z++) {
				if (a[i] < a[z]) {
					int temp = a[i];
					a[i] = a[z];
					a[z] = temp;
				}
				else continue;
			}
		}
		printArray(a);
	}
	private static void arrayCommandSortPrint(int[] a) {
		Arrays.sort(a);
		printArray(a);
	}
	private static void printArray(int[] a) {
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println("]");
	}
}