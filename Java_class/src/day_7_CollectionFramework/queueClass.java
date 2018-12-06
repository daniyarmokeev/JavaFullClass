package day_7_CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class queueClass {

	public static void main(String[] args) {
		
		Queue<Integer> q = new PriorityQueue<Integer>();
		
		//add elements
		
		for(int i=0;i<5;i++) {
			q.add(i);
		}
		System.out.println(q);
		
		int a = q.remove();
		
		System.out.println(a);
		
		System.out.println(q);
		
		System.out.println(q.peek());
		
		System.out.println(q.size());
		
		
		
		
	}

}
