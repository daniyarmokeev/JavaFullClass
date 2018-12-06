package day_6_Composition;

public class Main_Computer {

	public static void main(String[] args) {
		
		Dimensions theDimensions = new Dimensions(23,2,1);
		
		Case theCase = new Case ("2208", "Dell", "234", theDimensions);
		
		motherboard theMotherboard = new motherboard("Bj-123","Asus",3,4,"v2.44");
		
		Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 33, new Resolution(2312,4323));
		
		
		PC thePc = new PC(theCase,theMonitor,theMotherboard);
		
		
		
		thePc.getTheMonitor().drawPixelAt(12, 43, "white");
		thePc.getTheMotherboard().loadProgram("Windows 9.0");
		thePc.getThecase().pressPowerButton();
		
		
		System.out.println(theMotherboard.getManufacturer());
		
		

	}

}
