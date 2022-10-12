/**
 * 
 * Name       : Jordan Hinson
 * Email      : jordan.hinson@g.fmarion.edu
 * Date       : 9/16/2021
 * File Name  : ArrayListShuffle.java
 * Description: Code shuffles an array list randomly.
 *              
 **/

import java.util.*;

public class ArrayListShuffle {

	public static void main(String[] args) {
		ArrayList<Integer> shuffleArray = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++)
			shuffleArray.add(i);
		System.out.println(shuffleArray);
		shuffleArrayPrint(shuffleArray);

	}
	
	public static <E> void shuffleArrayPrint(ArrayList<E> list) {
		int originalLength = list.size();
		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		for(int i = 0; i < originalLength; i++) {
			int x = (int)(Math.random() * (list.size()));
			tempArray.add((int)(list.get(x)));
			list.remove(x);
			
		}
		
		System.out.println(tempArray);
	}

}
