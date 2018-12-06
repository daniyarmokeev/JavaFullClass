package day_2_methods;

public class ReturnMethods {

	public static void main(String[] args) {
	
		int a=add(1,3);
		//System.out.println(a);
	System.out.println(last(""));
	}
	
	
	public static int add(int num1,int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
//Create a method that return last character
// Method accepts string type and return char
//special case:
	
	public static char last(String word) {
		if(word.isEmpty()) {
			return ' ';
		}
		return word.charAt(word.length()-1);
		
	}	
}
