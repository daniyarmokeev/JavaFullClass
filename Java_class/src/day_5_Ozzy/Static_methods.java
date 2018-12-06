package day_5_Ozzy;

public class Static_methods {

	public static void main(String[] args) {
		Abc x = new Abc();
		x.show2();
		
		Abc.show1();
		
	}

}


class Abc {
	public static void show1 () {
		System.out.println("hi");
		show4();
	}
	
	public void show2() {
		System.out.println("hi");
		show1();
		show3();
	}
	public void show3() {
		System.out.println("hi");
	}
	public static void show4() {
		System.out.println("hi");
	}
}

