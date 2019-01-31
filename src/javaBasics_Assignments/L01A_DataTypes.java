package javaBasics_Assignments;

public class L01A_DataTypes {
	public static void main(String[] args) {
		// 12/6/2018...DataTypes

		// Primitive data types byte, short, int, long, float,double, char, boolean

		// int...4 bytes
		int i1 = 10000;
		int i2 = 56700;
		int i3 = i1 + i2;
		int i4 = 90000;
		int i5 = 50010;
		int i6 = 56700;
		int i7 = i1 + i2 + i5;
		int i8 = 7543;
		int i9 = 35900;
		int i10 = i4 - i8;
		System.out.println("************int***********");
		System.out.println("mut*(i7*i4) =" + " " + (i7 * i4));
		System.out.println("div(i5/i1=" + " " + (i5 / i1));
		System.out.println("i2+100 =" + " " + i2 + 100);
		System.out.println("add(i3+100) =" + " " + (i2 + 100));
		System.out.println("sub i8-i10=   " + i8 + -i10);
		System.out.println("sub (i8-i10)=   " + (i8 - i10));
		System.out.println("int sum=" + " " + (i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10));

		// byte...1 byte
		byte b1 = 25;
		byte b2 = 35;
		byte b3 = 0;
		byte b4 = -25;
		byte b5 = 56;
		byte b6 = 34;
		byte b7 = 8;
		byte b8 = 125;
		byte b9 = -48;
		byte b10 = -75;
		System.out.println("***********byte***********");
		System.out.println("b1 b2 b3 b4 =" + " " + b1 + b2 + b3 + b4);
		System.out.println("byte Sum2 =" + " " + (b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9 + b10));
		System.out.println("byte Sub=" + "  " + (b1 - b2 - b3 - b4 - b5 - b6 - b7 - b8 - b9 - b10));
		System.out.println("b7-b2=" + " " + (b7 - b2));
		System.out.println("b1/b8=  " + (b1 / b8));
		System.out.println("b10*b3= " + (b10 * b3));

		// short....2bytes
		short sh1 = 345;
		short sh2 = 985;
		short sh3 = 3985;
		short sh4 = 4865;
		short sh5 = 475;
		short sh6 = 9687;
		short sh7 = 3353;
		short sh8 = 9077;
		short sh9 = 1234;
		short sh10 = 765;
		System.out.println("**********Short**********");
		System.out.println("sh1sh2sh3sh4=  " + sh1 + sh2 + sh3 + sh4);
		System.out.println("short sum= " + (sh1 + sh2 + sh3 + sh4 + sh5 + sh6 + sh7 + sh8 + sh9 + sh10));
		System.out.println("sub(sh10-sh8)= " + (sh10 - sh8));
		System.out.println("Mut(sh3*sh5)=  " + (sh3 * sh5));
		System.out.println("div(sh4/sh1)=  " + (sh4 / sh1));

		// long 8 bytes
		long l1 = 98757779;
		long l2 = 78757479;
		long l3 = 98784779;
		long l4 = 98766779;
		long l5 = 98757779;
		long l6 = 78757479;
		long l7 = 98784779;
		long l8 = 98766779;
		long l9 = 98784779;
		long l10 = 98766779;
		System.out.println("**********long**********");
		System.out.println("long sum= " + (l1 + l2 + l3 + l4 + l5 + l6 + l7 + l8 + l9 + l10));
		System.out.println("sub(l1-l2)= " + (l1 - l2));
		System.out.println("Mut(l7*l4)=  " + (l7 * l4));
		System.out.println("div(l10/l1)=  " + (l10 / l1));
		System.out.println("div(l4/i1 )=  " + (l4 / i1));

		// float 4 bytes...for numbers that have fractional parts(decimals)....add f as
		// suffix
		float f1 = 10.855f;
		float f2 = 34.35f;
		float f3 = 7874.3985f;
		float f4 = 97.5612f;
		float f5 = 8530.009f;
		float f6 = 3441.39755f;
		float f7 = 85763.39f;
		float f8 = 439.0975f;
		float f9 = 4640.835f;
		float f10 = 34.35f;
		System.out.println("**********float**********");
		System.out.println("float sum= " + (f1 + f2 + f3 + f4 + f5 + f6 + f7 + f8 + f9 + f10));
		System.out.println("sub(f2-f10)= " + (f2 - f10));
		System.out.println("Mut(f7*f4)=  " + (f7 * f4));
		System.out.println("div(f5/f8)=  " + (f5 / f8));

		// double 8 bytes....for numbers that have fractional parts(decimals)...
		System.out.println("************double**********");
		double f = f1 + f2 + f3 + f4 + f5 + f6 + f7 + f8 + f9 + f10;
		System.out.println("float sum in double " + f);
		double d1 = 106656.256;
		double d2 = 867654.8675443;
		double d3 = 978656.28656;
		double d4 = 223567.563;
		double d5 = 78654.322323;
		double d6 = 85645.8685755;
		double d7 = 87675.875446;
		double d8 = 6755.9786878666666;
		double d9 = 7564.98676;
		double d10 = 86677.45543;
		System.out.println("double sum= " + (d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10));
		System.out.println("sub(d2-f7)= " + (d2 - d7));
		System.out.println("Mut(d8*d3)=  " + (d8 * d3));
		System.out.println("div(d4/d9)=  " + (d4 / d9));

		// char 2 bytes......
		char ch1 = 'A';
		char ch2 = 'p';
		char ch3 = '&';
		char ch4 = 'l';
		char ch5 = 'e';
		char ch6 = '1';
		char ch7 = 'P';
		char ch8 = 'u';
		char ch9 = '2';
		char ch10 = 'm';
		System.out.println("*********char*****");
		System.out.println(
				ch6 + " " + ch1 + ch2 + ch2 + ch4 + ch5 + " " + ch3 + " " + ch9 + " " + ch7 + ch4 + ch8 + ch10);
		System.out.println("add(ch10+ch5)= " + (ch10 + ch5));
		System.out.println("add ch10+ch5=" + ch10 + ch5);

		// boolean can only have a value of either true of false
		boolean bl1 = true;
		boolean bl2 = false;
		System.out.println(bl1);
		System.out.println(bl2);

		// String is not a data type....its a class ...to store sequence of characters
		String s1 = "Apples";
		String s2 = "Lesson One";
		String s3 = "Bananas";
		String s5 = "Hello";
		String s6 = "1000";
		String s7 = "&";
		String s8 ="";
		String s9 = "100";
		String s10 = "Assignment ";
		System.out.println("***********String************");
		System.out.println(s1 + " " + s7 + " " + s3);
		System.out.println("Add s6+s9= " + s6 + s9);
		System.out.println("Add (s6+s9)=" + (s6 + s9));
		System.out.println("" + s2 + " " + s10);
		System.out.println(s2 +" "+s5);
		System.out.println(s2 + s8 + s5);
		s8=s7;
	
		System.out.println(s2 + s8 + s5);
	}

}
