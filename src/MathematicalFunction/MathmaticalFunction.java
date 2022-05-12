package MathematicalFunction;
import java.util.Scanner;

public class MathmaticalFunction {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);	
	double s,u,t,a;
	System.out.println("Enter the initial velocity:"); 
	u= keyboard.nextDouble();
	
	System.out.println("Enter the time:");
	t = keyboard.nextDouble();
	
	System.out.println("Enter the accleration:");
	a= keyboard.nextDouble();
	
	s = u * t + 0.5* a *t * t;
	
	System.out.println("The calculate value of distance is:" + s);
	}

}
