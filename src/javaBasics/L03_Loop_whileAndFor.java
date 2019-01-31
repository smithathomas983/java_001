package javaBasics;

public class L03_Loop_whileAndFor {

	public static void main(String[] args) {
		
		//Dec 9th
		
		
		 int i=1;
		 System.out.println("////Print all odd numbers less than 10");
		 while(i<10) {
			 System.out.println(i);
			 i=i+2;
		 }
		 System.out.println("////print all even numbers less than 10");
		 int j=0;
		 while(j<10) {
			 System.out.println(j);
			 j=j+2;
		 }

		 
		 for (i=1;  i<10;i=i+2){
			 System.out.println(i);
		 }
	}

}
