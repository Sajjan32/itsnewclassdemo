package day27.polymorphismdemo;

public class AdditionDemo {
	 
	
	public void add (int a, int b) { // name same , parameter different 
		//constructor overloading
		int sum = a + b;
		System.out.println(sum);
	 }
	
	
	public void add (double a, double b) {
		double sum = a+ b;
		System.out.println(sum);
		 
	 }
	public void add (int a, int b , int c) {
		 int sum = a+b+c;
		 System.out.println(sum);
	 }
	
	
	public static void main (String[] args) {
		// compile time polymorpism (static binding)
		//which can be acheived by overloading of methods
		
		AdditionDemo o = new AdditionDemo();
		o.add(4.5,3.4);
		o.add(4,7);
		o.add(4,7,9);
	}
}
