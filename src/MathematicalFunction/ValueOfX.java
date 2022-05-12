package MathematicalFunction;
import java.util.Scanner;
public class ValueOfX {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the value of b");
		double b = keyboard.nextDouble();
		
		System.out.println("Enter the value of a");
		double a = keyboard.nextDouble();
		
		System.out.println("Enter the value of c");
		double c = keyboard.nextDouble();
		
		double x = (- b + Math.sqrt(b*b - 4*a*c))/ (2*a);
		System.out.println(" the calculate value of x is:" + x);
		
	}

}
