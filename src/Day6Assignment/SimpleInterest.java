package Day6Assignment;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner( System.in);
		System.out.println("we are calculating simple interest now");
		double P , T;
		System.out.println("Enter the amount of principal");
		P = keyboard.nextDouble();
		System.out.println("Enter the Time period");
		T = keyboard.nextDouble();
		final double R = 12;
	double SimpleInterest =  ( P * T * R * 1/100);
		System.out.println("The simple interest of amount " + P + " for " + T + "Period is " + SimpleInterest);
		
		
		
		
		

	}

}
