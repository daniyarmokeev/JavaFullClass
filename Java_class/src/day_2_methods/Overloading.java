package day_2_methods;

public class Overloading {

	public static void main(String[] args) {
		
		welcome();
		welcome("James");
	
	
	}
	
	public static void welcome() {
		System.out.println("Hello World");
	}
	
	public static void welcome(String name) {
		System.out.println("Second one "+ name);
	}

}
