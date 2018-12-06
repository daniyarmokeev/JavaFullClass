package day_3_custom_classes;

public class Student_task_main {

	public static void main(String[] args) {
		
		Student student1 = new Student("Mike",17,"M",2016,"Java");
		System.out.println(student1.name);
		
		Student student2 = new Student("Smith",21,"M",2015,"JavaScript");
		System.out.println(student2.age);
		
		Student student3 = new Student("Oleg",23,"M",2018,"Java");
		System.out.println(student3.name +" "+ student3.age +" "+ student3.gender +" "+ student3.course +" "+ student3.university);
	}

}
