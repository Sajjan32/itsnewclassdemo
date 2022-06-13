package day28.stringdemo; //defined in java.lang package and cannot be extended because it is final class.an object of String class
							// is represented by immutable sequence of characters

public class StringDemo1 {

	public static void main(String[] args) {
		//implict creation
		String s1 = "Nepal";
		System.out.println(s1);
		
		//explict creation (by using constructor)
		
		String s2 = new String ();
		System.out.println(s2);
		
		String s3 = new String("Hello");
		System.out.println(s3);
		
		char [] ch = {'a', 'b', 'c'};
		String s4 = new String (ch);
		System.out.println(s4);
		
		byte[] bb = {65, 66, 67};
		String s5 = new String (bb);
		System.out.println(s5);

}
}
