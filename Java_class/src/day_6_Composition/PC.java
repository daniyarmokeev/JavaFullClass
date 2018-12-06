package day_6_Composition;

public class PC {
	
	private Case thecase;
	private Monitor theMonitor;
	private motherboard theMotherboard;
	
	public PC(Case thecase, Monitor theMonitor, motherboard theMotherboard) {
		
		this.thecase = thecase;
		this.theMonitor = theMonitor;
		this.theMotherboard = theMotherboard;
	}

	public Case getThecase() {
		return thecase;
	}

	public Monitor getTheMonitor() {
		return theMonitor;
	}

	public motherboard getTheMotherboard() {
		return theMotherboard;
	}
	
	
}
