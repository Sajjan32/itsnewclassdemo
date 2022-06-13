package day17.methoddemo;

public class MethodDemo2 {
	
	// <access modifier> <return type> <method name> (){ =======}
	// return matching value with return type;
	
	
	public int addition() {
		int a = 5;
		int b = 6;
		int sum = a + b; // the type of addition and sum should be same. you cant assign sum datatype double
		return sum;
		// return 4; you can return this way too
	}
	
	// <access modifier> <return type> <method name> (any type and any number of parameters)
	//{ =======
	//
	// return matching value with return type;
	//}
	
	public String greet(String name, String location) {
		String msg = "hello, " + name + " from " + location ;
		return msg;
	}
	

	public static void main(String[] args) {
	
		MethodDemo2 obj = new MethodDemo2();
		
		obj.addition();
	
		System.out.println(obj.addition());
		int sum = obj.addition();
		System.out.println("Sum is " + sum);
		
		
		System.out.println(obj.greet("sajjan" , "Kathmandu"));
		
		String name = "Hari";
		String location = "Nepal";
		String msg = obj.greet(name, location);
		System.out.println(msg);

	}

}
