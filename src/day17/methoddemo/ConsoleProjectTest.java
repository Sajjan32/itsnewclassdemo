package day17.methoddemo;

import java.util.Scanner;

public class ConsoleProjectTest {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		ConsoleProjectDemo obj = new ConsoleProjectDemo();
		String decision = "";
		
		do {
			System.out.println("Enter operation: info || evenodd || factorial");
			String choice = keyboard.next();
		
		switch (choice){
			
			case "info":
				System.out.println("Enter name");
				String name = keyboard.next();
				System.out.println("enter age");
				int age = keyboard.nextInt();
				System.out.println("enter salary");
				double salary = keyboard.nextDouble();
				System.out.println("enter eligible");
				boolean isEligible = keyboard.nextBoolean();
				obj.displayInfo(name, age, salary, isEligible);
				break;
			
			case "evenodd":
				System.out.println("Enter the number:");
				int n =keyboard.nextInt();
				obj.findEvenOdd(n);
				break;
				
			case "factorial":
				
				System.out.println("Enter the number:");
				int number =keyboard.nextInt();
				int factorial = obj.findFactorial(number);
				System.out.println("Factorial of n is   " + factorial);
				break;
				
			default :
				System.out.println("Wrong selection!!! TRY AGAIN");
					break;
	} 
		System.out.println("Do you want to continue ? press Y|N"); 
		decision = keyboard.next();
		
		

	} while (decision.equalsIgnoreCase("Y"));
		System.out.println("BYE BYE");

}
}
