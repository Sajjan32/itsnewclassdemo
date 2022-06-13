package day23.arraydemo;
import java.util.Scanner;
public class ArrayDemo6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		final int ROWS =3;
		final int COLUMNS=3;
		
		int [][] arr= new int [ROWS][COLUMNS];
		for (int i =0; i<ROWS;i++) {
			for (int j=0; j<COLUMNS; j++) {
				System.out.println("Enter element");
				arr[i][j] = keyboard.nextInt();
			}
		}
		for (int i =0; i<ROWS;i++) {
			for (int j=0; j<COLUMNS; j++) {
				System.out.print(arr[i][j] + " "); 
			}
			System.out.println();
		}
		
	}

}
