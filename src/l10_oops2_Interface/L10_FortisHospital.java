package l10_oops2_Interface;

public class L10_FortisHospital implements L10_Aus,L10_US,L10_UK {
	
	//Dec 20th

	@Override
	public void emergencyServices() {
		
		System.out.println("  emergencyServices");
		
		
	}

	@Override
	public void radiologyServices() {
		System.out.println(" radiologyServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("oncologyServices");
		
	}

	@Override
	public void pediatricServices() {
		System.out.println("pediatricServices");
		
	}
	public void orthopediServices() {
		
		System.out.println("orthopediServices");
		
	}
	public void neroServices() {
		System.out.println("neroServices");
	}
	
	

}
