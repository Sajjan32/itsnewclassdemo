package day12.looping.demo;

public class NestedLoopDemo {

	public static void main(String[] args) {
		for (int i = 1; i<3; i++) { //outer loop
			
			for(int j=1;j<=3;j++) { //inner loop
				System.out.println(i + " " + j);
			}
			System.out.println("==========");
		}
		
		

	}

}
