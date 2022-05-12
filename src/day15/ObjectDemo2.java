package day15;

public class ObjectDemo2 {

	public static void main(String[] args) {
		System.out.println(new ObjectDemo2());//packagename.classname@hexadecimal number
		
		ObjectDemo2 ob1 = new ObjectDemo2(); // ob1 is reference variable
		System.out.println(ob1);
		
		ObjectDemo2 ob2; //reference variable
		ob2 = new ObjectDemo2(); // object
		System.out.println(ob2);
		System.out.println(ob2.hashCode());
		System.out.println("day15.ObjectDemo2@" + Integer.toHexString(ob2.hashCode()));

	}

}
