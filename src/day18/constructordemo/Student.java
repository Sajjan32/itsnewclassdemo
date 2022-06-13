package day18.constructordemo;

public class Student {
	String studentname;
	int roll;
	
	// constructor is a special members method which has the following characteristics
	//1. its name is same as class name
	//2. it can have access modifier
	//3. we cannot use 'void' keyword
	//4. it doesnot have any return datatype
	//5. it runs only once for each object
	//6. it is mainly used to initialize the membe'r data (non static variable inside the class)

	public Student(String sname) {
		studentname = sname;
		System.out.println("parameterized constructor sname");
		
	}
	public Student() {
		System.out.println("default constructor");
	}
	public Student(String sname, int r) {
		studentname= sname;
		roll = r;
		System.out.println("paremeterizzze constructor sname , r");
	}
	public Student( int r, String sname) {
		roll = r;
		studentname = sname;
		System.out.println("sequence constructor r , sname");
	}
	
	public void displayInfo() {
		System.out.println("Student name is " + studentname);
		System.out.println("roll is " + roll);
		
	}
	public static void main(String[] args) {
		
		Student student1 = new Student("ram");// complier make the default constructor
		student1.displayInfo();
		Student student2 = new Student();
		student2.displayInfo();
		Student student3 = new Student("ram" , 2);
		student3.displayInfo();
		Student student4 = new Student(3,"Sajjan");
		student4.displayInfo();
	}

}
