package javaBasics_Assignments;

public class L05A_ArithemeticFuntions {
	public static void main(String[] args) {


		L05A_ArithemeticFuntions ob=new L05A_ArithemeticFuntions();
		//addition
		int x=32;
		int y=1;

		System.out.println("//Arithemetic Operations with "+x+" and "+y);
		int a=ob.addition(x,y);
		System.out.println(+x+" + "+y+" = "+ a);

		int b= ob.subtraction(x, y);
		System.out.println(+x+" - "+y+" = "+ b);

		int c=ob.multiplication(x, y);
		System.out.println(+x+" * "+y+" = "+ c);

		ob.division(x, y);
		// System.out.println(x+" / "+y+" = "+ ( ob.division(x,y)));
	}
	public int addition(int a,int b) {
		int c=a+b;
		return c;
	}
	public int subtraction(int a, int b) {
		int c=a-b;
		return c;
	}
	public int multiplication(int a, int b){
		int c=a*b;
		return c;
	}
	public int division(int a, int b) {
		if(b==0) {
			System.out.println(a+" / "+b+" = "+" division by 0 is undefined");
			return b;
		}
		int c=a/b;
		System.out.println(a+" / "+b+" = "+c);
		return c;	
	}
}
