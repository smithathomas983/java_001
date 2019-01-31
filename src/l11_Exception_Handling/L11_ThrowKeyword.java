package l11_Exception_Handling;

public class L11_ThrowKeyword {
public static void main(String[] args) {
	//throw keyword is used when we want to customize  the exception
	
	System.out.println("+++++++");
	
	try {
		throw new Exception("Smitha Exception");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("+++++++");
} 
}
