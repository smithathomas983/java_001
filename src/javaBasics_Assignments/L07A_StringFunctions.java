package javaBasics_Assignments;

public class L07A_StringFunctions {

	public static void main(String[] args) {

		String str1="Wish you all a Merry Merry Christmas";
		System.out.println("String is---'"+str1+"'");
		System.out.println("Length of the string is "+ str1.length());


		char ch1='r';
		indexOfString(str1,ch1);
	}

	public static void indexOfString(String str1,char ch1) {

		System.out.println("======Occurrences of '"+ch1+"' in the string==========");

		int count=0;

		int j=str1.indexOf(ch1);
		if(j>0) {
			for(int i=j; i<str1.length();i++) {

				char ch2=str1.charAt(i);
				if(ch2==ch1) {

					int index =str1.indexOf(ch1,i);
					System.out.println((count+1)+" Occurrence of '"+ch1+"' is on index No: "+index);
					count++;

				}
			}
		}else {
			System.out.println(ch1+" is not present in the string");
		}

		System.out.println("Total Occurrence of '"+ch1+"' = "+ count);

	}}
