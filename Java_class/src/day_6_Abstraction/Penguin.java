package day_6_Abstraction;

public class Penguin extends Bird{

	public Penguin(String name) {
		super(name);
		
	}

	@Override
	public void fly() {
		
		System.out.println("I will swim instead of flying");
		
	}
	
	
		
}
