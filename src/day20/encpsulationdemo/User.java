package day20.encpsulationdemo;

public class User {

	String username = "Sajjan Silwal"; // never intialize the member data
	String password = "abc";
	public static void main(String[] args) {
		User user1 = new User();
		System.out.println(user1.username);
		System.out.println(user1.password);
		System.out.println("===============");
		
		User user2 = new User();
		System.out.println(user2.username);
		System.out.println(user2.password);
		
		
	}

}
