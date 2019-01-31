package javaBasics_Assignments;

import java.util.ArrayList;

public class L04A_ArrayLists {

	public static void main(String[] args) {

		//Integer ArrayList

		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(100);
		a1.add(200);
		a1.add(300);
		a1.add(400);
		a1.add(500);
		System.out.println("Integer ArrayList");
		System.out.println("Size of the ArrayList = "+a1.size());
		System.out.println(a1);
		for(int count=0;count<a1.size();count++) {

			System.out.println(a1.get(count));
		}



		//double ArrayList

		ArrayList<Double> a2= new ArrayList<Double>();
		a2.add(23.56);
		a2.add(34.76);
		a2.add(2343.86);
		a2.add(23.0);
		a2.add(34.76);

		System.out.println("Double ArrayList");
		System.out.println("Size of the ArrayList = "+a2.size());
		System.out.println(a2);
		for(int count=0;count<a2.size();count++) {

			System.out.println(a2.get(count));
		}


		//Char ArrayList
		ArrayList<Character> a3= new ArrayList<Character>();
		a3.add('s');
		a3.add('8');
		a3.add('m');
		a3.add('0');
		a3.add('t');

		System.out.println("Character ArrayList");
		System.out.println("Size of the ArrayList = "+a3.size());
		System.out.println(a3);
		for(int count=0;count<a3.size();count++) {

			System.out.println(a3.get(count));
		}

		//String ArrayList
		ArrayList<String> a4= new ArrayList<String>();
		a4.add("Tom");
		a4.add("Sam");
		a4.add("Ann");
		a4.add("Rose");
		a4.add("Mary");

		System.out.println("String ArrayList");
		System.out.println("Size of the ArrayList = "+a4.size());
		System.out.println(a4);
		for(int count=0;count<a4.size();count++) {

			System.out.println(a4.get(count));
		}
		
		ArrayList<Boolean> a5= new ArrayList<Boolean>();
		a5.add(true);
		a5.add(false);
		a5.add(false);
		a5.add(true);
		a5.add(false);

		System.out.println("Boolean ArrayList");
		System.out.println("Size of the ArrayList = "+a5.size());
		System.out.println(a5);
		for(int count=0;count<a5.size();count++) {

			System.out.println(a5.get(count));
		}
		
		ArrayList<Object> a6= new ArrayList<Object>();
		a6.add("Smitha");
		a6.add(4535323);
		a6.add(45.98);
		a6.add('v');
		a6.add(true);

		System.out.println("Object ArrayList");
		System.out.println("Size of the ArrayList = "+a6.size());
		System.out.println(a6);
		for(int count=0;count<a6.size();count++) {

			System.out.println(a6.get(count));
		}


        //Float ArrayList
		ArrayList<Float> a8= new ArrayList<Float>();
		a8.add(424.242f);
		a8.add(535.323f);
		a8.add(98.098f);
		a8.add(5256.265f);
		a8.add(3534.543f);

		System.out.println("Float ArrayList");
		System.out.println("Size of the ArrayList = "+a8.size());
		System.out.println(a8);
		for(int count=0;count<a8.size();count++) {

			System.out.println(a8.get(count));
		}
		
		
		
		
/*
        //Long ArrayList
		ArrayList<Long> a7= new ArrayList<Long>();
		a7.add((long) 424242);
		a7.add((long) 4535323);
		a7.add((long) 459898);
		a7.add((long) 5256265);
		a7.add((long) 353454354);

		System.out.println("Long ArrayList");
		System.out.println("Size of the ArrayList = "+a7.size());
		System.out.println(a7);
		for(int count=0;count<a7.size();count++) {

			System.out.println(a7.get(count));
		}*/
		
		
			
		/*//byte ArrayList
		ArrayList<Byte> a9= new ArrayList<Byte>();
		a9.add((byte) 3);
		a9.add((byte) 87);
		a9.add((byte) 76);
		a9.add((byte) 23);
		a9.add((byte) 26);

		System.out.println("Byte ArrayList");
		System.out.println(a9);
			for(int count=0;count<a9.size();count++) {

				System.out.println(a9.get(count));
			}
 */






	}

}
