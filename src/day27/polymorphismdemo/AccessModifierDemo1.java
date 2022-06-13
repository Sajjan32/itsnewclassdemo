package day27.polymorphismdemo;

public class AccessModifierDemo1 extends AccessModifierDemo {

	public static void main(String[] args) {
		AccessModifierDemo o = new AccessModifierDemo(4);
		o.publicMethod();
		o.protectMethod();
		o.defaultMethod();
		//o.privateMethod();

	}

}
