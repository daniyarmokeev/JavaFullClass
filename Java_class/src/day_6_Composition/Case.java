package day_6_Composition;

public class Case {
	
	private String model;
	private String manufacturer;
	private String powerSypply;
	private Dimensions dimension1;
	public Case(String model, String manufacturer, String powerSypply, Dimensions dimension1) {
		
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSypply = powerSypply;
		this.dimension1 = dimension1;
	}
	
	public void pressPowerButton () {
		System.out.println("Power button pressed");
	}
	
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getPowerSypply() {
		return powerSypply;
	}
	public Dimensions getDimension1() {
		return dimension1;
	}
	
	
	
}	
