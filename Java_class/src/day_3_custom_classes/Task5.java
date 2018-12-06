package day_3_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
	public static void main(String[] args) {
		List<String>people = new ArrayList<>();
		people.add("James");
		people.add("John");
		people.add("Mike");
		people.add("Santaa");
		people.add("Ka");
		
		addName(people);
	}
	
	public static void addName (List<String>names) {
		for(int i =0; i<names.size();i++) {
			if(names.get(i).length()==2) {
				
				names.remove(i);
			}
		}
		System.out.println(names);
	}
	
}
