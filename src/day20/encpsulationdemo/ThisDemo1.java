package day20.encpsulationdemo;
// shadowing is the process of hiding instance variable by local variable 
// inside non static method or constructor of the class
public class ThisDemo1 {
	
// instance variable	
private int a =5;

public void printData() {
	System.out.println("this is " + this);
	System.out.println(a); // we can access non static data directly
	// local variable
	int a = 6;
	System.out.println(a);
	int sum = a + a;
	System.out.println(sum);
	
	ThisDemo1 obj1 = new ThisDemo1();
	sum = a + obj1.a;
	System.out.println(sum);
	
	sum = a + this.a;
	System.out.println(sum);
}

 //public static void m() {  we cannot access
	//System.out.println(a);
//}


	//public static void m() {
		//ThisDemo1 ob =new ThisDemo1();
		//System.out.println(ob.a);
		//int a= 6;
		//System.out.println(a);
	//}

	public static void main(String[] args) {
		
		ThisDemo1 obj1 = new ThisDemo1();
		System.out.println("obj1 is " + obj1);
		obj1.printData();
		//System.out.println(a); we cannot access the nonstatic data to static method directly
		System.out.println("==============================");
		ThisDemo1 obj2 = new ThisDemo1();
		System.out.println("obj2 is " + obj2);
		obj2.printData();
	}

}
// this is reference of object
// this is keyword and is an implicit (internally by complier) reference variable
//of current object of current class type and "this" is available only inside non-static method and constructor of class
// this is a final variable. we cannot change the value