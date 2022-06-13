package day17.methoddemo;

public class MethodDemo1 {
	
	//method defination// access modifier void methodname (any type and any mumbers of parameters){ // private, public, protected
	// }
	public void sayHello() {
		
		System.out.println("Hello Hello Hello ..........");
	}

		public void displayInfo ( String name, int age, double salary , boolean isEligible) {
			System.out.println("Name is " + name);
			System.out.println("AGE IS " + age);
			System.out.println("Salary is " + salary);
			System.out.println("Eligibility is " + isEligible);
			
		}
	public static void main(String[] args) {
		
		
		System.out.println("main");
		MethodDemo1 ob1 = new MethodDemo1();
		// Method Calling
		ob1.sayHello();
		
		System.out.println("main end");
		
		
		String name ="ram";
		int age = 22;
		double salary =5000;
		boolean isEligible = true;
		ob1.displayInfo ( name, age , salary, isEligible); //  signature should be same like parameters
		
		System.out.println("**********");
		
		ob1.displayInfo( "sajjan", 25, 2000, false);
		
		System.out.println("----------------------");
		
		String n ="Shyam";
		int a = 23;
		double s =3000;
		boolean e = true;
		ob1.displayInfo ( n, a , s, e); 
		System.out.println("parameters");
		
		
	}

}
