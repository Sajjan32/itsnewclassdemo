package day20.encpsulationdemo;

public class Student {
	
	String stuName;
	int roll;
	
	public Student (String stuName, int roll) {
		//stuName = this.stuName;
		//roll = this.roll;
		
		this.stuName = stuName;
		this.roll = roll;
	}
	public void displayInfo() {
		System.out.println(stuName);
		System.out.println(roll);
	}

	public static void main(String[] args) {
		Student s1 = new Student ("ram", 22);
		s1.displayInfo();
	}

}
