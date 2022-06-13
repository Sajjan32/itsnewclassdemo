package day25.inheritancedemo;

public class ParentTest {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.name);
		p.greet();
		
		Child c = new Child();
		System.out.println(c.name);
		c.greet();
		
		GrandChild g = new GrandChild();
		System.out.println(g.name);
		g.greet();
	}

}

/* we can inharited
 * 1. private member(non static vairable and non static method
 * 2. hidden variable
 * overridden method
 * constructor
 */




