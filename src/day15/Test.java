package day15;

public class Test {

	public static void main(String[] args) {
		NonStaticDemo obj = new NonStaticDemo ();
		System.out.println(obj.name);
		obj.sayHello();
		
	//	System.out.println(studentName); // We cannot call direct in different class
		// greet();
		 
		 //recommended
		 System.out.println(StaticDemo.studentName); // this is recommended to call in different class
		 StaticDemo.greet();
		 

	}

}
