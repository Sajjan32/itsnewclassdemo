package day11.condition.demo;
import java.util.Scanner;
public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		//switch(expression) {
		//case 1:
			//break;
		//case 2:
		//	break;
			//.
//
	//}
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter choice");
		int choice = input.nextInt();
		
		
		
		switch(choice) { //start
		
		case 1:
			System.out.println("addition");
			break;
		case 2:
			System.out.println("subtraction");
			break;
		case 3:
			System.out.println("multipication");
			break;
		case 4:
			System.out.println("division");
			break;
			default:
				System.out.println("wrong choice");
				break;
		} //end
		System.out.println("exit");

}
}
