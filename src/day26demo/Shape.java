package day26demo;
// we cannot use final keyword in abstract class
public /* final */ abstract class  Shape {
// we cannot use final keyword 
	// we cannot use final, private and static keyboard in aabstract
	public abstract void draw ();



// we cannot make the object for abstract class but we can make reference variable to call child object
// we cannot use static, final , private keyword inabstract method
// child class should override parent class
//abstrac only use for class and method
	// it is necessary to  override non abstract
	// if there is abstract method, the class should must be abstract
	// it is necessary to create abstract method inside abstract class
 

public void paint() { // non abstract or concrete method
	System.out.println("Shape is painted");
}

	public Shape() {
		System.out.println("Shape constructor");
	}
}