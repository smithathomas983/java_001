package l11_Exception_Handling;

public class L11_Throwable {
	public static void main(String[] args) {
		//Dec 26th
		
		//Throwable class is the super class for Error and Exception class
		
		System.out.println("=====Throwable====");
		
		try {
			int i=1/0;
			System.out.println(i);
		}
		catch(Throwable e) {
			e.printStackTrace();
			
		}
		System.out.println("=====Throwable====");
		
		
	}

}
