package day_2_collections_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		
//		List<String> names = new ArrayList<>();
//		
//		names.add("James");
//		names.add("Adam");
//		names.add("Elize");
//		names.add(0,"Donald");
//		
//		Collections.sort(names);
//		System.out.println(names);
//		System.out.println(names.size());
		
//=======================================================================
		
		
//		String [] birds = {"bird 1", "some other type"};
//		List<String> b = Arrays.asList(birds);
//		System.out.println(b);
	
//========================================================================		
		
		List<Integer> num = new ArrayList<>();
		for(int i = 1;i<=100;i++) {
			
			if(i%2==0) {
				num.add(i);
			}	
		}System.out.println(num);
		
		List<Integer> num1 = new ArrayList<>();
		for(int i = 1; i<=100; i++) {
			
			if(i%2==1) {
				num1.add(i);
			}
		}System.out.println(num1);
		
		
		
		
		
		
		
	}
}
