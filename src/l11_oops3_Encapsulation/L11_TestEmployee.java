package l11_oops3_Encapsulation;

public class L11_TestEmployee {
	public static void main(String[] args) {
		L11_EmployeeData e1= new L11_EmployeeData();
		e1.setName("Smitha");
		String name= e1.getName();
		System.out.println("Name: "+name);
		
		e1.setAge(35);
		int age= e1.getAge();
		System.out.println("Age: "+age);
		
		
		e1.setEmpId("1001");
		String empId= e1.getEmpId();
		System.out.println("Emp Id: "+ empId);
		
		
		
	}

}
