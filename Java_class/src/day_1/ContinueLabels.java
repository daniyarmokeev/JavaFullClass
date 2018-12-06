package day_1;

public class ContinueLabels {

	public static void main(String[] args) {
		//task print all the numbers from 10-100
		//skip the numbers that ends with 3
//		for(int i=10;i<=100;i++) {
//			if(i%10 == 3) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		
	
	//labels
		firstLoop:
		for(int i=10;i<=100;i++) {
			secondLoop:
				for(int j=10;j<=50;j++) {
				System.out.println("i: " + i + "j:" + j);
				if(i==23 && j==30) {
					break firstLoop;
				}
				}
			
		}
	
	
	
	
	
	
	
	}

}
