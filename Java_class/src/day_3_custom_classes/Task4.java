package day_3_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		List<String>people = new ArrayList<>();
		people.add("James");
		people.add("John");
		people.add("Mike");
		people.add("Santaa");
		
		removeName(people,4);
	
		}
	
	public static void removeName (List<String> names, int length) {
		for(int i = 0; i<names.size();i++) {
			if(names.get(i).length()==length) {
				names.remove(i);
				i--;
			}
		}
		System.out.println(names);
	}
	
	
	
	
}
