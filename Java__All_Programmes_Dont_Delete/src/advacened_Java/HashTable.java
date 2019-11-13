/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package advacened_Java;

/**
 * HashTable is same as the HasMap but has three major difference
 * 	1.Synchronization or Thread Safe.
 * 	2.Null Keys & Values
 * 	3.Iterating the values
 * 
 * *******Multithreading in Java
	Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. 
	Each part of such program is called a thread. So, threads are light-weight processes within a process.
 * 
 * - ===Synchronization or Thread safe===
 * HashMap is not synchronized and Not Thread Safe Where as HashTable is both Synchronized and Thread Safe. By this we mean that
 * multiple threads can access HashMap at one time where as only Thread can access the HashTable at one time
 * HASHMAP IS NOT BETTER FOR MULTITHREADIN APPLICAITON - as the data keeps on changing and can be accessed by multiple threads at one go and ammend the same
 * HASHTABLE IS BETTER FOR MULTITHREADING APPLICAIOTN - as the data remains constant
 * 
 * - ===Null Keys & Values ===
 * HashMap - Allows one Null key and any number of Null Values
 * HashTable Does not allow Null keys and Null Values
 * 
 *  
 * - ===Iterating the values ===
 * HashMap - Values are iterated by Iterator() 
 * HashTable Values are iterated by Enumerator()
 *  
 *  
 * 
 *
 */
public class HashTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
