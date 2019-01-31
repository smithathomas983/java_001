package l11_Exception_Handling;

public class L11_ThrowsException {
	
	public static void main(String[] args) {
		L11_ThrowsException e1= new L11_ThrowsException();
		System.out.println("throws");
		try
		{
		e1.div1();}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("throws");
	}
	
	public void div1() throws Exception{
		div2();
	}
	public void div2()throws Exception{
		int i=1/0;
		System.out.println(i);
		
	}
}

