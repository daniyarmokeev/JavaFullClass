package Day_6_Interface;

public class Main {

	public static void main(String[] args) {
	
		//DeskPhone mikePhone = new DeskPhone(312000,true);
		
		ITelephone mikePhone = new DeskPhone (312000,true);
		
		mikePhone.powerOn();
		mikePhone.callPhone(312000);
		mikePhone.answer();

	}

}
