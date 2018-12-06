package day_6_Abstraction;

public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Rex");
		
		dog.breathe();
		
		dog.eat();

		
		Parrot p1 = new Parrot("Australian");
		
		p1.breathe();
		p1.eat();
		p1.fly();
		
	}

}
