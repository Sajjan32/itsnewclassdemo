package day20.encpsulationdemo;

public class User1 {

	

	public static void main(String[] args) {
		SetGet user1 = new SetGet();
		//set
		user1.setUsername("sajjan");
		user1.setPassword("abc"); 
		//get
		System.out.println(user1.getUsername());
		System.out.println(user1.getPassword());
		System.out.println("===============");
		//set
		//set
		SetGet user2 = new SetGet();
		user2.setUsername("Rahul");
		user2.setPassword("a3c"); 
				//get
		System.out.println(user2.getUsername());
		System.out.println(user2.getPassword());
		System.out.println("===============");
				//set
	}

}
