/**
 * Udemy-Section_27_Video_
 * Date: 2019-Aug-
 */
package section27_Arrays_228_to_233;
public class v231_min_Max_numberin_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minInArray();
		maxInArray();
	}
	public static void  minInArray(){
		int a[][] = {
					{1,2,3,4},
					{2,5,3},
					{3,8,8,1,5},
					{4,0,5,6,4,6},
					{5,8,3}
					};
		int min = a[0][0];
		for (int x=0;x<a.length;x++) // #of Rows in Array
		{
			for(int y=0;y<a[x].length;y++)
				
			{
				if (a[x][y]<min)
				{
					min = a[x][y];
				}
			}
			
		}
		
		System.out.println("The Smallest number in Array is "+min);
		
			}	

	public static void  maxInArray(){
		int a[][] = {
					{1,2,3,4},
					{2,5,3},
					{3,8,9,1,5},
					{4,0,5,6,4,6},
					{5,8,3}
					};
		int max = a[0][0];
		for (int x=0;x<a.length;x++) // #of Rows in Array
		{
			for(int y=0;y<a[x].length;y++)
				
			{
				if (a[x][y]>max)
				{
					max = a[x][y];
				}
			}
			
		}
		
		System.out.println("The largest number in Array is "+max);
		
			}	
	
	

}
