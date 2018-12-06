package day_3_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeShop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Cup> cups = new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter cup"+ (i+1) + " size:");
			int size = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter cup" + (i+1) + "Brand:");
			String brand = scan.nextLine();
			Cup cup = new Cup();
			cup.size = size;
			cup.brand = brand;
			cups.add(cup);
		}
		System.out.println(cups.size());
	}

}
