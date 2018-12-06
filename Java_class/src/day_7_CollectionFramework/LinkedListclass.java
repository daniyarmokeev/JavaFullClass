package day_7_CollectionFramework;

import java.util.LinkedList;

public class LinkedListclass {

	public static void main(String[] args) {
		
		LinkedList<String> object = new LinkedList<String>();
		
		object.add("A");
		object.add("B");
		object.addFirst("D");
		object.addLast("C");
		object.add(2,"E");
		object.add("f");
		object.add("G");
		
		System.out.println(object);
		
		
		object.remove("B");
		object.remove(3);
		object.removeFirst();
		object.removeLast();
		
		System.out.println(object);
		
	}

}
