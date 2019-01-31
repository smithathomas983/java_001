package javaBasics_Assignments;

public class L03A_LoopsAndArrays {

	public static void main(String[] args) {
		
		


		//print values from 10 to 1
		int i=10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}

		//print odd numbers from 1 to 10
		System.out.println("//////////////////////////");
		System.out.println("odd values");
		for(int j=1;j<10;j=j+2) {
			System.out.println(j);

		}
		
		//print alternate array list
		System.out.println("///////////////");
		System.out.println("Array");
		int array[]=new int[10];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=50;
		array[5]=60;
		array[6]=70;
		array[7]=80;
		array[8]=90;
		array[9]=100;
		for(int k=0;k<array.length;k=k+2) {
			System.out.print(array[k]+" ");
		}

		//odd and even numbers
		System.out.println("///////////////////");
		System.out.println("even and odd numbers");
		int array2[]=new int[8];
		array2[0]=76;
		array2[1]=34;
		array2[2]=763;
		array2[3]=766;
		array2[4]=762;
		array2[5]=567;
		array2[6]=234;
		array2[7]=100;
		for(int x=0;x<array2.length;x++) {
			if(array2[x]%2==0) {
				System.out.println(array2[x]+"  is an even number");
			}else {
				System.out.println(array2[x]+"  is an odd number");
			}
		}
	}

}

