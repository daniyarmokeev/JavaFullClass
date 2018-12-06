package day_2_methods;

public class MyMethods {

	public static void main(String[] args) {

		welcome("Dan");
		fullname("Dan", "Peter");
	}
	

	public static void welcome (String name) {
		System.out.println("Welcome, "+ name);
	}


public static void fullname (String name1, String last) {
	System.out.println("First : " + name1);
	System.out.println("Last : " + last);
}




}
