/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package advacened_Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Iterator_ArrayList_HashSet {

	/**
	 * Iterator has two things which are used mostly - Next and HasNext
	 * Next will start from 0 index and continue till end
	 * Every time next is run - it moved to the next element
	 * 
	 */
	public static void main(String[] args) {
		
		Iterator_HashSet();
		Iterator_ArrayList();

	}

	/**
	 * 
	 */
	private static void Iterator_HashSet() {
		HashSet<String> hsmale = new HashSet<String>();
		HashSet<String> hsfemale = new HashSet<String>();
		HashSet<String> hsall = new HashSet<String>();
		
		
		hsmale.add("Younus");
		hsmale.add("Zakir");
		hsmale.add("Saddam");
		hsmale.add("Murtuza");
		System.out.println(hsmale); // Not in order 
		
		hsfemale.add("Ameena");
		hsfemale.add("Zoya");
		hsfemale.add("Rizwana");
		hsfemale.add("Parveen");
		hsfemale.add("BlueStone");
		System.out.println(hsfemale);
		
		System.out.println("Impementing the addall method here");
		hsall.addAll(hsmale);
		hsall.addAll(hsfemale);
		System.out.println(hsall);
		
		//Using an Iterator to print the values in the set "hsALL"
		//System.out.println(hsall.iterator());
		Iterator<String>  itall =  hsall.iterator();
		
		while(itall.hasNext())
		{
			System.out.println(itall.next());
		}
		
		
		System.out.println("****************END of HashSet*********************");
		System.out.println("");
		
		
	}

	/**
	 * 
	 */
	private static void Iterator_ArrayList() {
		
		ArrayList<String> arfruits = new ArrayList<String>();
		arfruits.add("Apple");
		arfruits.add("Grape");
		arfruits.add("Mango");
		arfruits.add("Banana");
		System.out.println("List Displays the elements in the Same oreder as they are added");
		System.out.println(arfruits); // Printed in the order they are added
		
		Iterator<String> it = arfruits.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
