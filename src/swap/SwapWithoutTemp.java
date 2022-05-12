package swap;

import java.util.Scanner;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = keyboard.nextInt();
		
		System.out.println("Enter the value of b");
		int b = keyboard.nextInt();
		
		System.out.println(" The value of a before swapping:" + a);
		System.out.println(" The value of b before swapping:" + b);
		
		a = a + b;
		b = a- b ;
		a = a-b;
		
		System.out.println("The value of a after swapping is " + a);
		System.out.println("The value of b after swapping is " + b);
		

	}

}
