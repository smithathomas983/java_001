package l09_oops1_Inheritance_Assignment;

public class L09_TestEmployee {
	public static void main(String[] args) {

		System.out.println("===Fulltime==");
		L09_FullTimeEmployee e1= new L09_FullTimeEmployee();
		System.out.println("Branch No: "+L09_Employee.branchNo);
		System.out.println("Employer Name: "+ e1.employerName);
		e1.name();
		e1.ssn();
		e1.salary();
		e1.offDays();

		System.out.println("=====Part Time====");
		L09_PartTimeEmployee e2= new L09_PartTimeEmployee();
		e2.name();
		e2.ssn();
		e2.salary();
		e2.minHoursPerDay();


		//top casting
		System.out.println("====top casting");
		L09_Employee e3=new L09_PartTimeEmployee();
		e3.name();
		e3.ssn();
		e3.salary();


		System.out.println("===Employee ======");
		L09_Employee e4= new L09_Employee();
		e4.name();
		e4.ssn();
		e4.salary();
	}
}
