package Project2;

import java.util.*;

public class ModelQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> a = new PriorityQueue<>();
		a.add(20);
		a.add(10);
		a.add(5);
		a.add(3);
		a.add(35);
		a.poll();
		System.out.println(a);
		
		
		Queue<String> queue = new LinkedList<>();
		queue.add("red");
		queue.add("Yellow");
		queue.add("Orange");
		queue.add("Dark");
		queue.poll();
		System.out.println(queue);
		
		
	}

}
