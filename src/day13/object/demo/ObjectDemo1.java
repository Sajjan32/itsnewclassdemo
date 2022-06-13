package day13.object.demo;

public class ObjectDemo1 {

	public static void main(String[] args) {
		
		ObjectDemo1 ob1 = new ObjectDemo1 ();
		
		ObjectDemo1 ob2;
		ob2 = new ObjectDemo1();
		
		new ObjectDemo1 (); // Anonymous object
		System.out.println(ob2);
		System.out.println(ob2.hashCode());
		System.out.println("day13.object.demo.ObjectDemo1"+ Integer.toHexString(ob2.hashCode()));
	}

}
