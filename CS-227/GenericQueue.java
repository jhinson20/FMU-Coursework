import java.util.*;

public class GenericQueue<T> {

	private T data;
	private int priority;
	ArrayList<T> genericObjects = new ArrayList<T>();
	
	public GenericQueue(T data, int priority) {
		this.data = data;
		this.priority = priority;
	}
	
	public T getData() {
		return data;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public void add() {
		if(genericObjects.size() == 0)
			genericObjects.add(data);
		
		else {
			if()
		}
			
	}
}

	

