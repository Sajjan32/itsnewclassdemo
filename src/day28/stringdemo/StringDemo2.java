package day28.stringdemo;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1 ="Nepal";
		String s2 = "Nepal";
		String s3 = new String("Nepal");
		String s4 = new String("Nepal");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s4));
	
	if (s1.compareTo(s2)==0) {
		System.out.println("equals");
	} else {
		System.out.println("not e");

	}
	if (s1.compareTo(s4)==0) {
		System.out.println("equals");
	} else {
		System.out.println("not e");

	}
	
	

}
}
