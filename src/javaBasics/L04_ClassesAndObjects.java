package javaBasics;

public class L04_ClassesAndObjects {
	//Dec 11th

	int a=3;//class or global variable

	public static void main(String[] args) {


		int b=5;//local variable
		System.out.println("b= "+b);

		// creating an object  for the class
		//new L04_ClassesAndObjects() is the class and obj1 is the object/reference name
		L04_ClassesAndObjects obj1=new L04_ClassesAndObjects();

		// to call a class/local variable or methods we need to call it by an object...
		System.out.println(obj1.a);
		obj1.Name();



		L04_ClassesAndObjects obj2=new L04_ClassesAndObjects();
		System.out.println("value of a for obj2 ="+ (obj2.a=5));

	}

	public void Name() {
		System.out.println("Inside Name method");
		System.out.println("calling class variable a = "+a);
	}


}
