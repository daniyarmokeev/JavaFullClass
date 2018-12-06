package day_3_custom_classes;

public class Ozzy_main {

	public static void main(String[] args) {
//
//		Ozzy_Dog dog1 = new Ozzy_Dog();
//		
//		dog1.name = "Rex";
//		dog1.age = 12;
//		dog1.breed = "Shepherd";
//		dog1.color = "black";
//		
//		//System.out.println(dog1.name);
//		
//		dog1.bark();
//		dog1.eat();
//		dog1.wagTail();
//		
//		
		Dog2 dog = new Dog2();
		System.out.println(dog.name + " === " + dog.age);
		
		Dog2 dog2 = new Dog2();
		System.out.println(dog2.name + " === " + dog2.age);
		
		Dog2 dog3 = new Dog2("TUta",4,"Pupa","Black");
		System.out.println(dog3.name + " === " + dog3.age);
	}

}
