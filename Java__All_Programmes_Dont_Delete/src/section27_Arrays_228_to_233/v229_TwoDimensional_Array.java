/**
 * Udemy-Section_27_Video_229
 * Date: 2019-Aug-28
 */
package section27_Arrays_228_to_233;
public class v229_TwoDimensional_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//try printing this array you using two for loops blindingly we will land on the error page or we will not get the complete values.
//Refer the next video 230 for clear under standing of the rows and columns in the Array
		int b[][] = {
				{1,2,3,4},
				{4,5,6},
				{7,8,9,5,6},
				{9,0,5,6,4,8},
				{7,8,9}
				};
			
		//7 8 6
		//2 3 6
		int[][] a = new int[2][3];
		a[0][0] = 01;
		a[0][1] = 02;
		a[0][2] = 03;
		a[1][0] = 11;
		a[1][1] = 12;
		a[1][2] = 13;		
	
		//loop for the Row
		for(int i=0;i<2;i++)
		
	{
		//loop for the Column
		for(int j=0;j<3;j++)
		{
			System.out.println("The value at a[i][j] is "+a[i][j]);
			
		}
	
	}

}
}
