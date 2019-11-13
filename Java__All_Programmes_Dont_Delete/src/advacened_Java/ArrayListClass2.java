/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package advacened_Java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass2 {

	public static void main(String[] args) {
		ArrayListMethod1();
		Iterator2();

	}

	/**
	 * 
	 */


	public static void ArrayListMethod1() {
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("ZakiR");
		al2.add("Rizwana");
		al2.add("BlueStone");
		al2.add(1,"Zoya");
		al2.add(1, "Zoya"); //Careful here
		
		System.out.println("Printing the list of the element in the Array ");
		System.out.println(al2);
		
		System.out.println(" ");
		al2.contains("ZakiR");
		System.out.println("Here we are validating the contans Method of the Array List");
		System.out.println(al2.contains("ZakiR"));
		System.out.println(al2.contains("ABCDEF"));
		
		
		System.out.println("");
		System.out.println("Knowing the index of the given element Zoya here");
		al2.indexOf("Zoya");
		System.out.println(al2.indexOf("Zoya"));
		
		System.out.println("");
		System.out.println("Size of the Array - This will be keep in changing dynamically");
		System.out.println(al2.size());
		
		
		
	}
	private static void Iterator2() {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
			
		ar2.add("ZakiR");
		ar2.add("Rizwana");
		ar2.add("BlueStone");
		ar2.add("Zoya");
		ar2.add("Zoya");
		System.out.println("List will accept duplicate values");
		
		//Creating a iterator
		Iterator it = ar2.iterator();
		
		//Printing the value in the Set
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
	}
	
}
