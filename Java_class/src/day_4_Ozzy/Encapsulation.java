package day_4_Ozzy;

public class Encapsulation {

	public static void main(String[] args) {
		
		
		Car porsche = new Car();
		porsche.setModel("91");
		String check = porsche.getModel();
		System.out.println(check);
	}

}
