package javaBasics;

import java.util.ArrayList;

public class L04_ArrayList {
	public static void main(String[] args) {
		
		//Dec 11th
		//Dynamic array...ArrayList...its a default class that is already available in java
		
		ArrayList<Object> ar=new ArrayList<Object>();
		System.out.println(ar.size());
		ar.add(100);
		ar.add(300);
		ar.add("smitha");
		
		System.out.println(ar); 
		
		System.out.println("///for loop");
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		//System.out.println();
		
		//cheching what will happen if one value is removed from array list
		
		System.out.println("cheching what will happen if one value is removed from array list");
		ar.remove(0);
		System.out.println("array size= "+ar.size());
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

		System.out.println(ar.get(0));
		
	}

	
}
