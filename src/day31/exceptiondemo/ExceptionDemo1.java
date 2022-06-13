package day31.exceptiondemo;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		/*int [] arr = new int[] {4,5,6};
		for (int i =0; i<= arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		System.out.println("============");
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println ("Enter a");
		int a = keyboard.nextInt();
		System.out.println("Enter b");
		int b = keyboard.nextInt();
		System.out.println(a/b);
		
		
		String s1 ="";
		char c = s1.charAt(2);
		System.out.println(c);
		
		String s2 = null;
		System.out.println(s2.toLowercase());
		
		FileInputStream fis = new FileInputStream();
		
	}

}
