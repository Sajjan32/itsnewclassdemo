package day20.encpsulationdemo;

public class SetGet {
	//pojo plain old java object
	 private String username;
	private String password;
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getPassword() {
		return password;
	}
	
	//java is platform independent, java is secure(we cant temper byte code), java is objected oriented based, java support multithreading program,
	
	// in multithread if we set the data directly, data might be corrupt( it might come username different)

	// we are making data private in class and showing or binding through the method. binding the data with the method inside the class
	
	//encapsulation provides strategy of extraction.( the other should not know how programmer implement the data) They only get thorugh getter and setter
	//public static void main(String[] args) {
		//User user1 = new User();
		//set
		//user1.username = "sajjan";
		//user1.password = "abc";
		//get
		//System.out.println(user1.username);
		//System.out.println(user1.password);
		//System.out.println("===============");
		//set
		//User user2 = new User();
		//user2.username = "Marwa";
		//user2.password = "123";
		//get
		//System.out.println(user2.username);
		//System.out.println(user2.password);/*
		
		
		

	//}
	
	

}
