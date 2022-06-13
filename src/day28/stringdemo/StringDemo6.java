package day28.stringdemo;

import java.util.StringTokenizer;

public class StringDemo6 {

	public static void main(String[] args) {
		String sentence = "Hello, I am Sajjan Silwal, I am from Nepal.";
		StringTokenizer st = new StringTokenizer(sentence);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("=============");
		
		st = new StringTokenizer(sentence, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		

	}

}
