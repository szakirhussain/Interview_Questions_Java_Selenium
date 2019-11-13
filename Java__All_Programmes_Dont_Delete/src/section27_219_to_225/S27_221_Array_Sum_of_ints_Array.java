/**
 * Udemy-Section_27_Video_221
 * Creating Array
 * 
 */
package section27_219_to_225;

public class S27_221_Array_Sum_of_ints_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int len = a.length;
		int i,sum=0;
		
		for (i=0;i<len;i++)
			
		{
			sum = sum + a[i];
			
		}
		System.out.println(sum);
		
	}

}
