package day11.condition.demo;

import java.util.Scanner;

public class SwitchCaseDemo4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter choice");
		String choice =input.next();
		
		 
		 switch (choice) {
		 case "add":
			 
			 System.out.println("sum is  " );
			 break;
		 
		 case "sub":
			
			 System.out.println("subtraction is " );
			
		 case "multiply":
			 
			 System.out.println("Multiply is " );
			 
		 case "division":
			
			 System.out.println("Division is " );
			 
			 
		 default:
				 System.out.println("Wrong choice");
				 break;
		 }

	}

}
