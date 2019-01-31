package javaBasics;

public class L03_Arrays {

	public static void main(String[] args) {
		
	
	//Dec 6th
	
	int i[]=new int[4];
	i[0]=10;
	i[1]=20;
	i[2]=30;
	i[3]=40;
	System.out.println(i[3]);
	
	//ArrayIndexOutOfBoundsException
	// to find the size of an array use arrayname.length
	//a null array vaule is 0
	System.out.println("size of the array= "+i.length);
	
	System.out.println("//all the element of an array ");
	//use for loop
	for(int j=0;j<i.length;j++) {
		System.out.print (i[j]+" ");
	}
	
	System.out.println();
	System.out.println("double array");
	
	double d[]=new double[2];
	d[0]=10;
	d[1]=23.56;
	for(int j=0;j<d.length;j++) {
		System.out.println (d[j]+" ");
	}
	System.out.println("char array");
	char c[]=new char[3];
	c[0]='s';
	c[1]='5';
	c[2]='M';
	for(int j=0;j<c.length;j++) {
		System.out.print (c[j]+" ");
	}
	System.out.println();
	
	//disadvantages of array....
	//1.only store similar datatype....to overcome  this we use object array
	//2.size is fixed...to overcome both the disadvantages we usedynamic array called arraylist
	
	System.out.println("object array");
	//object is a class in java
	Object o[]=new Object[5];
	o[0]=1;
	o[1]="smitha";
	o[2]='G';
	o[3]=12.54;
	o[4]=true;

	
	for(int j=0;j<o.length;j++) {
		System.out.print (o[j]+" ");
	}
	
	
	
	
	
	
	
	}
	
}
