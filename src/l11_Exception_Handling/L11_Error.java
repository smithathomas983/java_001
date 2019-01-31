package l11_Exception_Handling;

public class L11_Error {

	public static void main(String[] args) {

		
		System.out.println("=====Error====");
		
		try {
			int i=1/0;
			System.out.println(i);
		}catch(Error e){
			e.printStackTrace();
		}
		
		System.out.println("=====Error====");
		System.out.println("=====Error====");
	}

}
