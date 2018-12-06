package day_7_CollectionFramework;

import java.util.ArrayList;

import java.util.List;

public class Grocerylist {

	//List groceryList = new ArrayList();
	List<String> groceryList = new ArrayList<String>();
	
	public void addGroveryItem (String item) {
		groceryList.add(item);
	}
	
	public void printGroceryList() {
		System.out.println("You have" + groceryList.size() + " items in your grocery list") ;
		for(int i=0;i<groceryList.size();i++) {
			System.out.println((i+1)+ "." + groceryList.get(i));
		
		}
	}
	
	public void modify(int position,String newItem) {
		
		groceryList.set(position, newItem);
		
	}
	
	public void removeGroceryItem(int position) {
		
		groceryList.remove(position);
	}
	
	public String findItem (String searchItem) {
		//boolean exists = groceryList.contains(searchItem);
		int position = groceryList.indexOf(searchItem);
		if(position>=0) {
			return groceryList.get(position);
		}
		return null;
	}
	
	
	
	
}
