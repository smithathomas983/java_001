package javaBasics_Assignments;

public class L06A_CarsStaticAndNonStatic {

	static int wheelNo=4;
	String region="US";

	String carDealer="CarMax";

	public static void main(String[] args) {
		L06A_CarsStaticAndNonStatic obj=new L06A_CarsStaticAndNonStatic();

		System.out.println("No of wheels"+wheelNo);
		System.out.println("Region="+obj.region);
		System.out.println("Car Dealer is "+obj.carDealer);
		
		int carDealerId=L06A_CarsUtil.carMaxId();
		System.out.println("Car Dealer Id= "+carDealerId);
		
		int lexusP=lexus();
		System.out.println("Lexus price= "+lexusP);
		
		int hondaP=obj.honda();
		System.out.println("Honda price= "+hondaP);


	}

	public static int lexus() {
		int price=60000;
		return price ;
	}
	public int honda() {
		int price=50000;
		return price ;

	}



}
