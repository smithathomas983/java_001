package javaBasics_Assignments;

public class L02A_GreatestOf4Values {
	public static void main(String[] args) {
		
		
		// find the greater of the 4 values
		int i=176624;
		int j=35;
		int k=777;
		int l=6;

		if((i>j) && (i>k)&& (i>l)) {
	     	System.out.println("greatest value = "+i );
		}	
		else if(j>k &&j>l) {
			System.out.println("greatest value = "+j);
		}else if(k>l) {
			System.out.println("greatest value = "+k);
		}else {
			System.out.println("greatest value = "+l);
		}


	}

}
