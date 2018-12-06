//package day_7_CollectionFramework;
//
//import java.util.Scanner;
//
//public class Main {
//
//	private static Scanner scan = new Scanner (System.in);
//	private static Grocerylist grocerylist = new Grocerylist();
//	public static void main(String[] args) {
//		
//		boolean quit = false;
//		int choice = 0;
//		printInstructions();
//		while(!quit) {
//			System.out.println("Enter your choice");
//			choice = scan.nextInt();
//			scan.nextLine();
//			
//			switch(choice) {
//			case 0:
//				printInstructions();
//				break;
//			case 1:
//				grocerylist.printGroceryList();
//				break;
//			case 2:
//				addItem();
//				break;
//			case 3:
//				modifyItem();
//				break;
//			case 4:
//				removeItem();
//				break; 
//			case 5:
//				searchForItem();
//				break;
//			case 6:
//				quit=true;
//				break;
//				
//			}
//		}
//		
//	}
//	private static void printInstructions() {
//		
//		
//		
//	}
//
//}
