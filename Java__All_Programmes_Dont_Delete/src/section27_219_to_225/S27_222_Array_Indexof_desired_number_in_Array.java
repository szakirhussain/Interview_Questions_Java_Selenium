/**
 * Udemy-Section_27_Video_222
 * finding the index of given number
 * Difference between printf and println
 * Usage of the Break key word
 * 
 */
package section27_219_to_225;

public class S27_222_Array_Indexof_desired_number_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {11,22,33,44,55,66,77,88};
		//find the index of number 44
		
		int len = a.length;
		int i,j=44;
		
		for (i=0;i<len;i++)
			
		{
			System.out.println(i);
			if(a[i] == j)
			{
			System.out.printf("The index of the number "+j);	
			System.out.println(" is "+i);
			break;	
			}
				
		}  
		
		
		
	}

}
