package javaBasics;

public class L06_AMain {
	public static void main(String[] args) {

		//Dec 13th
		// main method  from a class can be called in another class using classname
		
		System.out.println("Inside A class main");
		L06_BMain.main(args);
		
		
	}
	}


