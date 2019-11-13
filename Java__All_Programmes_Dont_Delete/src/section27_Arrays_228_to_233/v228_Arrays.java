/**
 * Udemy-Section_27_Video_228
 * Date: 2019-Aug-28
 * Different ways to declare Array 
 */
package section27_Arrays_228_to_233;
public class v228_Arrays {
	public static void main(String[] args) {
		/*Declaring a array 
		 * Here new is memory allocation operator 
		 * with memory for 5 integers types
		*/
		
		// int[5] = int[lenght] = So at max this array a[] can hold only 5 values, However index starts from 0.
		int a[] = new int[5];
		 a[0] = 11;
		 a[1] = 22;
		 a[2] = 33;
		 a[3] = 44;
		 a[4] = 55;
		 //a[5] = 59;
		 //a[6] = 87;
		 
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
	/*Declaring a array 
	* Here memory is allocated dynamically , by that i mean depending upon the count of numbers in the array the amount of 
	* memory is allocated.
	*/		 
		 int b[] = {0,1,2,3,4,5};
		 for(int i=0;i<b.length;i++)
		 {
			 System.out.println(b[i]);
		 }

	}

}
