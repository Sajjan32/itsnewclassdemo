package day28.stringdemo;

public class StringDemo5 {

	public static void main(String[] args) {
		String sentence = "Hello, I am Sajjan Silwal, I am from Nepal.";
		System.out.println(sentence);
		String [] words = sentence.split(" ");
		for (String w: words) {
			System.out.println(w);
		}
		 words = sentence.split(",");
		for (String w: words) {
			System.out.println(w);
		}

	}

}
