package day11.condition.demo;
import java.util.Scanner;
public class ElseIfDemo {

	public static void main(String[] args) {
		//bitwise operator &,|,!
		//<< >> <<< shift operator
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Enter the marks");
			int marks = keyboard.nextInt();
	if (marks>=80 && marks<=100) {
		System.out.println("Distnction");
			
		} else if (marks>=60 && marks<=79) {
			System.out.println("first");
		}else if (marks>= 40 && marks<=59) {
			System.out.println("second");
			
		}else {
			System.out.println("fail");
			
		}
	System.out.println("exit");

	}

}
