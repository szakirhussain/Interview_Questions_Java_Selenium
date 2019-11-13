/**
 * Array List 
 * SYNTAX = 
 * ArrayList<type> objecname = new ArrayList<type>();
 * type Code = Integer , String
 * 
 *  */
package advacened_Java;

import java.util.ArrayList;
/* 1.LIST--Below three classes implement the List Interface - Will accept duplicate values
* 			Array List
* 			Linked List
* 			Vector
*/


public class ArrayListClass {
public static void main(String[] args) {
		ArrayList_Method();
		//Array_Method();
	}

public static void ArrayList_Method() {
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	//We can add using the simple method add which is present within
	//No need to allocate memory- it is Dynamic where as Array type is Fixed
	al.add(21);
	al.add(26);
	al.add(10);
	
	//adding new integer in the required position (2ns in this case)
	al.add(1, 8);
	System.out.println("See 8 got printed in the second postion even though you have added in the later point of time");
	System.out.println(al);
	
	//finding if the required integer(10 in this case) is present in the group or not
	//This is boolean function it returns true if it is present else false
	al.contains(10);
	System.out.println(al.contains(10));
	System.out.println(al.contains(0));
	

	/*Now do the same thing using Array and try to print all the elements in the Array and find if required element is 
	Present or not. Feel the difference. You will require a lot of code (for loops) to do the same.*/
	
	
	
}

public static void Array_Method() {
	int a[] = new int[4];
	 a[0] = 21;
	 a[1] = 8;
	 a[2] = 26;
	 a[3] = 10;
	 
	 System.out.println(a.length);
	 for (int i=0;i<=a.length;i++) {
		 System.out.println("Array is "+a[i]);
	 }
	 

}}
