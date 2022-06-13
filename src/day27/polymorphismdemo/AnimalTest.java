package day27.polymorphismdemo;
import java.util.Scanner;

// run time polymorphism
// which can be acheived by overriding methods




public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = null;
		
	//	animal = new Dog();
		//animal.makeSound();
		
		//animal = new Tiger ();
		//animal.makeSound();
		
		Scanner key = new Scanner (System.in);
		System.out.println("choose animal");
		String animalType = key.next();
		
		switch(animalType) {
		
		case "dog":
			animal = new Dog();
			break;
			
		case "tiger":
			animal = new Tiger();
			break;
			
			default:
				System.out.println("Wrong Selection");
				break;
		}
		 if (animal!=null) {
			 animal.makeSound();
		 }
		

	}

}
