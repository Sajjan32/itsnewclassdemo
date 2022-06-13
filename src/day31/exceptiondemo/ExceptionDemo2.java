package day31.exceptiondemo;
import java.util.Scanner;
public class ExceptionDemo2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number1");
		int a = keyboard.nextInt();
		System.out.println("Enter number2");
		int b = keyboard.nextInt();
		try {
		int result = divide (a,b);
		System.out.println("Division is " + result);
		} catch (ArithmeticException ae) {
			System.out.println("inside catch");
		}
		System.out.println("==============");
	}

	
	
	public static void divide (int num1 , int num2) {
		int div = num1 / num2;
		return div;
	}

}
