package day27.polymorphismdemo;

public class AccessModifierDemo {
	String defaultVar = "this is default variable";
	public String publicVar = "this is public variable";
	private String privateVar = "this is private variable";
	protected String protectVar = "this is protect variable";
	
	void defaultMethod() {
		System.out.println("this is default method");
		
	}
	
	 public void publicMethod() {
		 System.out.println("this is public method");
			
	 }
	 private void privateMethod() {
		 System.out.println("this is private method");
			
	 }
	protected void protectMethod() {
		 System.out.println("this is protec method");
			
	 }
	public AccessModifierDemo(){
		System.out.println("public constructor");
	}
	
	AccessModifierDemo(int a){
		System.out.println("default constructor");
	}
	protected AccessModifierDemo(int a, int b){
		System.out.println("protected constructor");
	}
	
	private AccessModifierDemo(int a, int b , int c){
		System.out.println("private constructor");
	}
	
	public static void main(String[] args) {
		AccessModifierDemo o = new AccessModifierDemo();
		o.publicMethod();
		o.protectMethod();
		o.defaultMethod();
		o.privateMethod();
	}

}
