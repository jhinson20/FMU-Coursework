/**
 * Name: Jordan Hinson
 * Date: 10/6/21
 * email: jordan.hinson@g.fmarion.edu
 * Description: Class that creates a circular linked list of nodes
 * 				that represent and determine Eve's suitor.
 */

import java.util.*;

public class EveSuitors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numSuitors;
		
		while(true) {
			
			try {
				System.out.print("Enter an integer for the number of suitors for Eve: ");
				numSuitors = input.nextInt();
				if(numSuitors < 1) {
					System.out.print("There must be at least one suitor. ");
					continue;
					
				}
				
			}
			
			catch(InputMismatchException e){
				System.out.print("Invalid Input. ");
				input.nextLine();
				continue;
				
			}
				
			break;
			
		}
		
		Suitors<Integer> eveSuitors = new Suitors<Integer>();
		for(int i = 0; i < numSuitors; i++)
			eveSuitors.addLast(i + 1);
	
		suitorPrinter(eveSuitors, numSuitors);
		input.close();

	}
	
	public static void suitorPrinter(Suitors<Integer> suitorList, int size) {
		int originalSize = size + 1;
		int itterations = 2;
		
		System.out.println("Starting suitors: " + suitorList.toString());
		
		if(size == 1)
			System.out.println("After no rounds, the chosen suitor is suitor 1!");
		
		else {
			
			do {
				if(size != 2)
					System.out.print("Suitors left after " + (originalSize - size) + " round(s): ");
				//if(itterations >= size)
					
				suitorList.removeSuitor(itterations);
				if(size == 2) {
					System.out.println("After " + (originalSize - size) + " rounds, the chosen suitor is suitor " + suitorList.toString().substring(0, (size * 3 - 5)) + "!");
					break;
					
				}
				
				System.out.println("[ " + suitorList.toString().substring(0, (size * 3 - 5)) + " ]");
				size--;
				itterations += 2;
				
			}while(size > 1);
			
		}
	}

}

class Suitors<T> {
	private Node<T> head = null;
	private Node<T> tail = null;
	private int size = 0;
	
	public Suitors() {
		
	}
	
	public T getFirst() {
		
		if(size == 0)
			return null;
		
		else
			return head.element;
	}
	
	public T getLast() {
		
		if(size == 0)
			return null;
		
		else
			return tail.element;
	}
	
	public void addFirst(T data) {
		
		Node<T> newNode = new Node<>(data);
		newNode.next = head;
		head = newNode;
		size++;
		
		if(tail == null)
			tail = head;
		
	}
	
	public void addLast(T data) {
		
		Node<T> newNode = new Node<>(data);
		
		if(tail == null) {
			tail = newNode;
			head = tail;
			
		}
		
		else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
			
		}
		
		size++;
		
	}
	
	public void add(T data, int index) {
	
		if(index == 0 || size == 0)
			addFirst(data);
		
		else if(index == size)
			addLast(data);
		
		else {
			Node<T> current = head;
			
			for(int i = 0; i < index; i++)
				current = current.next;
			
			Node<T> temp = current.next;
			current.next = new Node<>(data);
			(current.next).next = temp;
			size++;
			
		}
		
	}
	
	public T removeFirst() {
		
		if(size == 0) 
			return null;
		
		else {
		T temp = head.element;
		head = head.next;
		
		if(head == null)
			tail = null;
		
		size--;
		return temp;
			
		}
		
	}
	
	public T removeLast() {
		
		if(size == 0) 
			return null;
		
		else if(size == 1) {
			T temp = head.element;
			head = null;
			tail = null;
			size = 0;
			return temp;
		}
		else {	
			Node<T> current = head;
			for(int i = 0; i < (size - 2); i ++)
				 current = current.next;
			 T temp = tail.element;
			 tail = current;
			 tail.next = head;
			 size--;
			 return temp;
			
		}
	}

	public T remove(int index) {
		
		if(index >= size || index < 0)
			return null;
		
		else if(index == 0)
			return removeFirst();
		
		else if(index == (size - 1))
			return removeLast();
		
		else {
			Node<T> previous = head;
			
			for(int i = 0; i <index; i++)
				previous = previous.next;
			
			Node<T> temp = previous.next;
			previous.next = temp.next;
			size--;
			return temp.element;
		}
		
	}

	public void removeSuitor(int itterations) {
		Node<T> temp = null;
		
		Node<T> previous = head;
		for(int i = 0; i < itterations - 1; i++)
			previous = previous.next;
		
		if(previous.next == head)
			removeFirst();
		else if(previous.next == tail)
			removeLast();
		else {
		temp = previous.next;
		previous.next = temp.next;
		size--;
		}
		
	}
	
	@Override
	public String toString() {
		String linkedString = "";
		
		Node<T> current = head;
		for(int i = 0; i < size; i++) {
			linkedString += (current.element) + ", ";
			current = current.next;
	
		}
		
		return linkedString;
		
	}
		
	class Node<T> {
		
		T element;
		Node<T> next;
			
		public Node(T element) {
			this.element = element;
		}
	}
}