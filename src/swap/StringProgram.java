package swap;
import java.util.Scanner;
public class StringProgram {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter the name");
		String name = keyboard.nextLine();
		
		System.out.println("Enter the age of person");
		int age = keyboard.nextInt();
		
		System.out.println("Enter the Nationality of person");
		String nationality = keyboard.next();	
		
		System.out.println("==================");
		System.out.println(name);
		System.out.println(age);
		System.out.println(nationality);
		System.out.println("==================");
	}

}
