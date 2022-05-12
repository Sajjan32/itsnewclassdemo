package Day6Assignment;
import java.util.Scanner;
public class DaySix {

	
	//9.	Write a program that converts pounds into kg. The program prompts the user to enter a number of pounds, converts it to kg and displays the result [1 pound is 0.454 kg].
	//10.	Write a Program for the following Mathematical Function.
		 

	public static void main(String[] args) {
		//Write a program to convert Fahrenheit to Celsius 
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter the temperature in Fahernheit");
		double F = keyboard.nextDouble();
		double C = (F - 32)* 5/9;
		System.out.println("The temperature in Celcius is " + C);
		
		// Celsius to Fahrenheit.
		
		
		
		
		
		System.out.println("Enter the temperature in Celcius");
		 C = keyboard.nextDouble();
		 F = (C * 1.8) +32;
		
		System.out.println("The temperature in Fahrenheit is " + F);
		
	}

}
