package l11_Exception_Handling;

public class L11_TryCatch {
	
	public static void main(String[] args) {
		
		
		
		int i=10;
		
		int j=0;
		System.out.println("==try catch===");
		

		try {
			System.out.println(i/j);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("==try catch===");
	}

}
