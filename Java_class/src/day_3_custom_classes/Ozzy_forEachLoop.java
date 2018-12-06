package day_3_custom_classes;

public class Ozzy_forEachLoop {

	public static void main(String[] args) {
	
		int[] marks = {125,132,95,116,110};
		int numero = maximum(marks);
		System.out.println(numero);
	}

	public static int maximum(int[] array) {
		int max = 0;
		for(int num:array) {
			if(num>max) {
				max=num;
			}
		}
		return max;
	}
	
	
}
