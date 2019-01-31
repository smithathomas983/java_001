package javaBasics;

public class L07_StringFunctions {

	public static void main(String[] args) {
		//Dec 16th

		String str= "Your transaction is done sucessfully";


		// to find the length of the string
		int length=str.length();
		System.out.println("Length of the String = "+length);


		// HI no is total length-1...
		//StringOutOfBoundException
		// to find the character at a particular index
		int x=10;
		char ch1=str.charAt(x);
		System.out.println("Charcater at "+ x+" index = "+ch1);


		// to find a particular char index number...
		//-1 means not in the string
		String str2="r";

		//1st occurrence
		int y=0;
		y=str.indexOf(str2,y);
		System.out.println("1st Index of "+str2+" = "+y);

		//2nd Occurrence
		System.out.println("2nd Index of "+str2+" = "+str.indexOf(str2, y+1));


		//to find the starting index of a word
		String str3="done";
		System.out.println("word '"+str3+"' starts from "+ str.indexOf(str3)+" index");

		//ex:
		String name="   Welcome Tom   ";
		if (name.indexOf("Tom")>0) {
			System.out.println("PASS");

		}else {
			System.out.println("FAIL");
		}

		//to trim edges
		System.out.println("trimed output of ["+ name +"] = "+name.trim());

		//to replace one character with another
		System.out.println( "replacing character 'o' with 'p' "+name.replace("o","p"));

		//date format using replace()
		String date="12-17-2018";
		System.out.println("Formated date is "+dateFormat(date));


		//substring
		System.out.println("substring :"+name.substring(3, 10));

		//equals
		String s1="smitha";
		String s2="Susan";
		String s3="Smitha";
		System.out.println(s1.equals(s2)); 
		System.out.println(s1.equalsIgnoreCase(s3)); 


		//contains
		if(name.contains("Tom")) {
			System.out.println("Contains Pass");
		}else {
			System.out.println("Contains fAIL");
		}
		//split

		String employeeData="Tom-25-Dell-TX-QA Lead";
		String employeeData2="Mia-John-22-JCP-AZ-Manager";
		getEmployeeData(employeeData);
		getEmployeeData(employeeData2);

		getEmployeeName(employeeData2);

	}

	public static String dateFormat(String str) {
		str= str.replace("-","/");
		return str;

	}

	public static void getEmployeeData(String employeeData) {
		System.out.println("=====Employee Data======");
		String str1[]=employeeData.split("-");
		for(int i=0;i<str1.length;i++) {
			System.out.println(str1[i]);
		}
	}
	public static void getEmployeeName(String employeeName) {

		System.out.println("============");
		String str1[]=employeeName.split("-");

		System.out.println("Employee name : "+str1[0]+" "+str1[1]);

	}
}
