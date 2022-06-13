package day23.arraydemo;
import java.util.Scanner;
public class ArrayDemo2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		int [] arr = new int[3];
		// to take input
		for (int i=0; i<arr.length; i++) {
			System.out.println("Enter element");
			arr[i] = keyboard.nextInt();
			//System.out.println(arr[i]);
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//to print an element of an array
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
	}

}
}
