package day_3_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

	//task , ask from user 5 times, and print the names
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<String> names = new ArrayList<>();
		for(int i = 0;i<=5;i++) {
			System.out.println("Enter the names" + (i+1));
			String name =scan.nextLine();
			names.add(name);
			
		}
		System.out.println(names);
	}
	
	
	
	
	

}
