package day12.looping.demo;
import java.util.Scanner;
public class WhileLoopDemo2 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	boolean flag = true;
	
	while (flag) { // use for infinite loop & the condition must be true to run program
		System.out.println("Enter name: ");
		String name = input.next();
		System.out.println(name);
		if (name.equals("Sajjan")){
			flag = false;
		}
		
	}
	System.out.println("Loop terminated");

	}

}
