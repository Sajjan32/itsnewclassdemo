package day13.object.demo;

public class NonStaticDemo {
	
	String name ="ram";
	
	public void sayHello() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		System.out.println("main");
		NonStaticDemo obj = new NonStaticDemo();
		System.out.println(obj.name);
		obj.sayHello();

	}

}
