package javaBasics;

public class L08_Constructors {
	//Dec 17th

	String name;
	int age;
	public static void main(String[] args) {

		L08_Constructors obj=new L08_Constructors();
		obj.officeAddress();
		
		L08_Constructors obj2= new L08_Constructors("Sam", 25);
		System.out.println("Name and Age : "+obj2.name+" "+obj2.age);
		obj2.officeAddress();

	}

	// COcnstructor have the same name as the class name
	// Constructor is called when an object is created
	//Even if there is no constructor written in  the code , default constructor is called.
	//Default means withour passing any parameters
	public  L08_Constructors() {
		System.out.println("Default Constructor");
		name="Smitha";
	}
	
	
	// Constructor can be overloaded by passing different parameter
	// mostly constructors are used to initialize class variables
	// creating a constuctor using class variables
	public L08_Constructors(String name,int age) {
     // this keyword is used to indicate class variable
		this.name=name;
		this.age=age;
		}
	public void  officeAddress() {
		String n=name;
		System.out.println("Adrress : "+ n+" "+ "PO Box 453,TX");
	}


}
