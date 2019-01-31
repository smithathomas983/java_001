package javaBasics;

public class L02_ConditionalOperators {

	public static void main(String[] args) {
		
		//Dec 6th
		
		int a=117;
		int b=117;
		
		if(a==b) {
			System.out.println("a is equal to b");
		}else if(a>b) {
			System.out.println("a is greater than b");
		}
		 if(a>=b) {
			System.out.println("a is greater than or equal to b");
		}else if(a<b) {
			System.out.println("a is less than b");
		}
		 if(a<=b) {
			System.out.println("a is less than or equal to b");
		}else if(a!=b) {
			System.out.println("a is not equal to b");
		}

	}

}
