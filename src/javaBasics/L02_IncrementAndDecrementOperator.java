package javaBasics;

public class L02_IncrementAndDecrementOperator {

	public static void main(String[] args) {
		//Dec 6th
		//post increment
		int i=1;
		int j=i++;
		System.out.println("////Post increment...i=1 and j=i++/////");
		System.out.println("i="+i);
		System.out.println("j= "+j);


		//pre increment
		int x=1;
		int y=++x;
		System.out.println("///pre increment....x=1 and y=++x");
		System.out.println("x="+x);
		System.out.println("y= "+y);

		//post decrement
		int m=1;
		int n=m--;
		System.out.println("post drecrement.....m=1 and n=m--");
		System.out.println("m= "+m);
		System.out.println("n= "+n);


		//pre decrement
		int a=1;
		int b=--a;
		System.out.println("pre decrement....a=1 and b=--a");
		System.out.println("a= "+a);
		System.out.println("b= "+b);		
	}

}
