package javaBasics;

public class L06_MainMethodOverloading {
	//Dec13th
	
	public static void main(String[] args) {
		System.out.println("default main");
		main(8);
		main("Java");
	}
	public static void main(int a) {
		int c=a;
		System.out.println("Integer main ="+c);
	}
	public static void main(String s) {
		String s1=s;
		System.out.println("String main ="+s1);
	}
	

}
