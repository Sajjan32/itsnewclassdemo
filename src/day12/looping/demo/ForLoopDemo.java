package day12.looping.demo;

public class ForLoopDemo {
  // int a = 5  instance variable
	public static void main(String[] args) {
		
		// to use of repetation
		//for (initilization; condition; update(increment/decrement))
		int sum = 0;
		int n = 10 ; //local variable
		for (int i=1;i<=n;i++) {
			sum = sum + i;
			
			
		}
		System.out.println("Sum of nth num is " + sum);
		
		
		

	}

}
