package javaBasics;

public class L06_StatinAndNonStatic {


	//Static variable
	static String school="Carmel" ;
	static String medium="English";


	//non Static/class variables
	String grade="8th";
	int totalKids=50;



	public static void main(String[] args) {

		//Dec13th

		//Static  Variable or Functions can be call directly or by class name
		System.out.println("School name= "+school);
		System.out.println("School Medium is "+L06_StatinAndNonStatic.medium);
		int girls=girlsCount();
		System.out.println("No of girls in 8th grade= "+girls);


		L06_StatinAndNonStatic obj1=new L06_StatinAndNonStatic();
		System.out.println("Total kids in 8th grade= "+obj1.totalKids);
		int boys =boysCount(obj1.totalKids);
		System.out.println("No of boys in 8th grade= "+boys);




	}

	public static int girlsCount() {
		int g1=30;
		return g1;
	}
	public static int boysCount(int a) {

		int boysCount=a-girlsCount();
		return boysCount;
	}

}
