package day1.assignments;

import java.util.Scanner;

public class AreaOfCircle {

	// area of circle

	public static void main(String[] args) {
		final double Value_Of_Pi = Math.PI;
		System.out.println("Enter the radius of circle");
		Scanner keyboard = new Scanner(System.in);
		double radius = keyboard.nextDouble();
		double Area_Of_Circle = Value_Of_Pi * radius * radius;
		System.out.println("The area of Circle is " + Area_Of_Circle + " Cm^2");

		// area of rectangle
		System.out.println("enter the value of length");
		int Length = keyboard.nextInt();
		System.out.println("Enter the value of breadth");
		int Breadth = keyboard.nextInt();
		int Area_Of_Rectangle = Length * Breadth;
		System.out.println(" The area of rectangle is " + Area_Of_Rectangle);

	}

}
