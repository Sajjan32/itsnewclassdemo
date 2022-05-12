package day15;

public class StaticDemo {

	 static String studentName = "Sajjan"; // static variable
	
	public static void greet() { // static method
		System.out.println("hello there, its me" );
	}
	public static void main(String[] args) {
		 System.out.println(studentName);
		 greet();
		 
		 //recommended
		 System.out.println(StaticDemo.studentName);
		 StaticDemo.greet();
		 

	}

}
