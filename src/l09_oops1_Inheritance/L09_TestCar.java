package l09_oops1_Inheritance;

public class L09_TestCar {
	public static void main(String[] args) {
		
	
	
	L09_Car_Parent c1= new L09_Car_Parent();
	
	c1.engine();
	c1.start();
	c1.stop();
	
	//Static method
	L09_Car_Parent.tyre();
	
	 L09_BMW b1= new  L09_BMW();
	 b1.doors();
	 b1.engine();
	 b1.start();
	 
	 //top casting
	 L09_Car_Parent c2= new  L09_BMW();
	 c2.engine();
	 c2.start();
	 c2.stop();
	 //child methods cant access
	// c2.doors();
	 
	 //down casting not allowed in java...will throw ClassCast Exception
	//eg:  L09_BMW b2= (L09_BMW) new L09_Car_Parent();
	 

}}
