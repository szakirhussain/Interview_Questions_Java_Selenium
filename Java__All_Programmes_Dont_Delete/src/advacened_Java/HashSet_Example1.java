/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package advacened_Java;

import java.util.HashSet;

public class HashSet_Example1 {
/**
 * There are three types of collections in Java LIST , SET, MAP
 * ==== SET === HashSet, LinkedHashSet, TreeSet these implement the SET interface
 * ###These do not accept the duplicate values (where as ArrayList does accept)
 * There is no guarantee that the elements will be placed in order
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashsetInteger();
		HashSetString();
	}

/**
 * 
 */
private static void HashSetString() {
	HashSet<String> hsString = new HashSet<String>();
	hsString.add("Apple");
	hsString.add("Boy");
	hsString.add("Cat");
	hsString.add("Cat");
	System.out.println("See below it ignores the duplciate values "+hsString);
	
	System.out.println("");
	System.out.println("The Size of the HashSet is 'See the Count carefully' "+hsString.size());
	
}


private static void HashsetInteger() {
	
	
}

}
