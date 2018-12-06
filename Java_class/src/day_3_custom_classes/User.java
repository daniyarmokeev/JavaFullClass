package day_3_custom_classes;

import java.util.Random;

public class User {
	String name;
	public void utility() {
		Random r = new Random();
		int num = r.nextInt(1000);
		
		System.out.println( " name: " + name + num);

	}

};
