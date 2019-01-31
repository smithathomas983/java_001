package javaBasics;

public class L02_GreatestOf3Values {
	//Dec 6th

	public static void main(String[] args) {
		//Dec 6th

		int i=160;
		int j=150;
		int k= 175;
		if ((i>j)&&(i>k)) {
			System.out.println("the highest value is i="+i);
		}else if(j>k) {
			System.out.println("the highest value is j="+j);
		}else {
			System.out.println("the highest value is k="+k);
		}


		System.out.println("/////////printing in order//////////");
		if ((i>j)&&(i>k)) {
			System.out.println("the highest value is i="+i);
			if(j>k) {
				System.out.println("the 2nd highest value is j="+j);
				System.out.println("the lowest value is k="+k);
			}else {
				System.out.println("the 2nd highest value is k="+k);
				System.out.println("the lowest value is j="+j);
			}
		}else if(j>k) {
			System.out.println("the highest value is j="+j);
			if(k>i) {
				System.out.println("the 2nd highest value is k="+k);
				System.out.println("the lowest value is i="+i);
			}else {
				System.out.println("the 2nd highest value is i="+i);
				System.out.println("the lowest value is k="+k);
			}
		}else {
			System.out.println("the highest value is k="+k);
			if(j>i) {
				System.out.println("the 2nd highest value is j="+j);
				System.out.println("the lowest value is i="+i);
			}else {
				System.out.println("the 2nd highest value is i="+i);
				System.out.println("the lowest value is j="+j);
			}
		}
	}

}
