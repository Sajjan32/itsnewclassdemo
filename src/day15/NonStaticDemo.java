package day15;

public class NonStaticDemo {
	// NON STAIC (INSTANCE VARIABLE)
	String name = "Sajjan";
	
	// NON STATIC METHOD
	public void sayHello() {
		System.out.println("hello....");
	}

	public static void main(String[] args) {
		System.out.println("main");
		//System.out.println(name);
		//sayHello();
		
		NonStaticDemo ob1 = new NonStaticDemo();
		System.out.println(ob1.name);
		ob1.sayHello();
		
		
		

	}

}
