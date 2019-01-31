package javaBasics;

public class L08_DataConversion {
	//Dec 17th

	public static void main(String[] args) {

		// String to int
		String s1= "100";
		
		System.out.println(s1+20);
		
		int i= Integer.parseInt(s1);
		System.out.println(i+20);
		
		//Number format exception
		/*String s2="100A";
		System.out.println(Integer.parseInt(s2));*/
		
		//String to double
		String s3="100.25";
		System.out.println(s3+40);
		double d1=Double.parseDouble(s3);
		System.out.println(d1+40);
		
		//Int to String
		int j= 100;
		System.out.println(j+50);
		String s4= String.valueOf(j);
		System.out.println(s4+50);
		
	}

}
