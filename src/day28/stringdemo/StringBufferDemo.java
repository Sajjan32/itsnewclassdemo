package day28.stringdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Good");
		System.out.println(sb);
		sb.append(" Evening");
		System.out.println(sb);
		sb.insert(4, "d");
		System.out.println(sb);
		sb.insert(0, "Hello");
		System.out.println(sb);
		sb.delete(0, 5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
