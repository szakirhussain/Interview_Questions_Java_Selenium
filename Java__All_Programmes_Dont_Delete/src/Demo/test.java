/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package Demo;

import java.util.HashSet;

/**
 * @author Zoya ZR
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {2,2,2,2,5,5,5,7,7,7,7,7};
		HashSet<Integer> hset = new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
		hset.add(a[i]);	
		}
		Object[] dis = hset.toArray();
	

 for (int i=0;i<dis.length;i++)
 {
	 System.out.println(dis[i]);
 }
System.out.println();

for(int i=0;i<dis.length;i++)

{	
	int p = (int) dis[i];
	int count=0;
	for (int j=0;j<a.length;j++)
	{
		if(p==a[j]) 
		{
		count = count+1;
		}
		
	}

System.out.println("Distinct Value "+dis[i] +" is available " +count +" times.");







}
	
 
 
 
 
	
}}
