package MathematicalFunction;
import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		double a , b, c, s, Area;
		System.out.println("Enter the side of the triangle a:");
		a= keyboard.nextDouble();
		
		System.out.println("Enter the side of triangle b:");
		b = keyboard.nextDouble();
		
		System.out.println("Enter the side of triangle c:");
		c = keyboard.nextDouble();
		
		s= 0.5* (a + b + c);
		System.out.println("The value of distance is:" + s );
		
		Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The calculate value of Area is:" + Area);
	}

}
