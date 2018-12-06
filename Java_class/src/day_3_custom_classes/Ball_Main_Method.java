package day_3_custom_classes;

public class Ball_Main_Method {

	public static void main(String[] args) {
	
		Ball balls = new Ball();
		balls.color="Red";
		balls.size = 45;
		
		Ball balls2 = new Ball();
		balls2.color="Yellow";
		balls2.size = 34;
		
		Ball balls3 = new Ball();
		balls3.color= "Pink";
		balls3.size = 4;
		
		
		balls3.bounce();

	}

}
