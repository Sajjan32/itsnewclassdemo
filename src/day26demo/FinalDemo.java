package day26demo;
// we cannot inherit final class
public /*final */ class FinalDemo {
	//we cannot override final method
public /* final */ void greet () {
	System.out.println("hello, good morning");
}



// final variable must be initialize
//Final variable make variable constant
// we cannot change the value of final
//
// we cannoy use final varibale on constructor

//final int b; // we can initialize through constructor if we dont initialize directly
//public /*final */ FinalDemo(int b) {
//	this.b = b;
//}
}