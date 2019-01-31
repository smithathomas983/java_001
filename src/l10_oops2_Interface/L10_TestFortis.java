package l10_oops2_Interface;

public class L10_TestFortis {
	public static void main(String[] args) {
		
		L10_FortisHospital l1= new L10_FortisHospital();
		l1.emergencyServices();
		l1.oncologyServices();
		l1.orthopediServices();
		l1.radiologyServices();
		l1.neroServices();
		
		
		System.out.println("=====US=====");
		
		L10_US l2=new L10_FortisHospital();
		
		int fee=L10_US.min_Fee_US;
		System.out.println("US min fee= "+fee);
			
		l2.emergencyServices();
		l2.oncologyServices();
		l2.radiologyServices();
		
	}

}
