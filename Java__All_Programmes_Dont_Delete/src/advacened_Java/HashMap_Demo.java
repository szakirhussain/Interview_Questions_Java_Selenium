/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package advacened_Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class HashMap_Demo {

	/**
	 * Map = This has both Key and Value for reference
	 * While printing using the iterator using next we will have challenges as it has both key ane value
	 */
	public static void main(String[] args) {
		
		HashMap_StrStr();
		//HashMap_IntStr();
		
		

	}

	/**
	 * 
	 */
	private static void HashMap_IntStr() {
		
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(21, "Rizwana");
		hmap.put(26, "Zoya");
		hmap.put(8, "Zakir");
		hmap.put(10,"BlueStone");
		System.out.println(hmap.get(26));
		System.out.println(hmap.keySet());
	
		//Now to use iterator and all the other methods () we convert this map into a set
		
		Set hmapset = hmap.entrySet();
		System.out.println(hmapset);
		System.out.println();
		
		
		Iterator itmapset  = hmapset.iterator();
		Iterator itmapset2  = hmapset.iterator();
		
		while(itmapset.hasNext()) 
		{
		System.out.println(itmapset.next());
		
		}
		
		System.out.println();
		while(itmapset2.hasNext()) 
		{
		Map.Entry mp2 = (Map.Entry)itmapset2.next();
		System.out.println(mp2.getKey());
		System.out.println(mp2.getValue());
		}
			
		//Now print the key value and the String Separately
		
		
		
	}

	/**
	 * 
	 */
	private static void HashMap_StrStr() {
		
		
		HashMap<Integer,String> hm2 = new HashMap<Integer, String>();
		hm2.put(10, "BlueStone");
		hm2.put(21, "Rizwana");
		hm2.put(26, "Zoya");
		hm2.put(8, "ZakiR");
		System.out.println("=======Welocme to Method2========");
		
		//Converting the HashMap into set - we need the key word ENTRYSET
		
		Set hm2Set = hm2.entrySet();
		System.out.println("Set is "+hm2Set +" After converting from HashMap");
		System.out.println();
		//Now that we have a set - Adding a creator for that
		Iterator ithm2Set = hm2Set.iterator();
		
		//Now that we have a iterator we will print all the values individually 
		System.out.println("===Priting the values from the set===");
		while(ithm2Set.hasNext()) {
			System.out.println(ithm2Set.next());
		}
		System.out.println();
		System.out.println("===Question : Print the Key and Values seperatly===");
		
		
		Iterator it = hm2Set.iterator();
		while(it.hasNext()) {
			//Casting the values
			Map.Entry<Integer, String> mp2 =  (Map.Entry)it.next();
			mp2.getKey(); // give key
			mp2.getValue(); //gives value
			System.out.println(mp2.getKey());
			System.out.println(mp2.getValue());
			
			
		}
		
		
	}

}
