package day_3_custom_classes;

import java.util.Scanner;

public class Ozzy_task_scanner1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int sum = 0;
		int counter = 1;
		while(counter<11) {
			System.out.println("Enter numbers - " +counter);
			boolean bool =scan.hasNextInt();
			
			if(bool) {
				counter++;
				int num = scan.nextInt();
				sum+=num;
			}
			else {
				System.out.println("Invalid number");
			}
			scan.nextLine();
		}
		System.out.println(sum);
		scan.close();

	}

}
