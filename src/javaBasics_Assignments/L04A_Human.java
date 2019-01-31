package javaBasics_Assignments;

public class L04A_Human {
	
	int legs=2;
	int hands=2;
	
	public static void main(String[] args) {
		
		String gender1="Male";
		String gender2="Female";
		
		L04A_Human h1=new L04A_Human ();
		System.out.println("1st human");
		System.out.println("Gender= "+gender2);
		System.out.println("hands= "+h1.hands);
		System.out.println("legs= "+h1.legs);
		h1.dance();
		h1.read();
		h1.swim();
		
		System.out.println("///////////////////////");
		
		L04A_Human h2=new L04A_Human ();
		System.out.println("2nd human");
		System.out.println("Gender= "+gender1);
		System.out.println("hands= "+h2.hands);
		System.out.println("legs= "+h2.legs);
		h2.swim();
		h2.read();
		
		
		
	}
	
	public void read() {
		System.out.println("This Human can Read");
		
	}
	public void swim() {
		System.out.println("This Human can Swim");
		
	}
	public void dance() {
		System.out.println("This Human can Dance");
		
	}
	

}
