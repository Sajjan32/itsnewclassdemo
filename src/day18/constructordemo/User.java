package day18.constructordemo;

public class User {
	// do not initialize the value in instance vairable
//	String user = "sajjan"; wrong practice
//	String password ="abc123";
	String user;
	String password;
	
	public User(String u, String p) {
		System.out.println("constructor called");
		user = u;
		password = p;
	}
	
	//public void assignInfo(String u, String p) {
		//user = u;
		//password = p;
	//}
	public void displayInfo() {
		System.out.println("Username is " + user);
		System.out.println("Password is " + password);
	}

	public static void main(String[] args) {
	//User Sajjan =  new User();
	//Sajjan.user = "Sajjan"; // even can call the method, it is not good to use because we are showing the data
	//Sajjan.password = "123abc";// Bad practice
	//Sajjan.displayInfo();
		
		User sajjan = new User ("sajjan", "abc123" );
	
	//Sajjan.assignInfo("sajjan", "abc");
	System.out.println("22222222222222222");
	sajjan.displayInfo();
	
	User Hari = new User("Hari", "123CV");
	//Hari.user = "Hari"; // Bad practice
	//Hari.password = "32abc"; // Bad practice
	//Hari.displayInfo();
	//Hari.assignInfo("Hari", "123e");
	Hari.displayInfo();
	
	//Sajjan.assignInfo("rahul", "dfjje"); // here the objecT Sajjan name has changed so 
	//Sajjan.displayInfo();	
	
	// we need constructors
		User aa = new User("AAA", "543WES");
		aa.displayInfo();
		
	}
	
	

}
