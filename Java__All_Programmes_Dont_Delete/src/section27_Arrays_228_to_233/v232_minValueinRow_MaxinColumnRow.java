/**
 * Udemy-Section_27_Video_231
 * Date: 2019-August-29
 */
package section27_Arrays_228_to_233;
public class v232_minValueinRow_MaxinColumnRow {
public static void main(String[] args) {
		//we will find smallest value in the Array and then find the largest value in the row of the given column
		example1(); 
	}
public static void example1() {
	//we will find smallest value in the Array and then find the largest value in the row of the given column
	int y = 0;
	int a[][] = {
				{1,2,3,7,9},
				{4,5,6,8,8},
				{5,4,4,0,5},
				{1,2,8,3,5},
				{5,2,3,2,6}
			
				}; 
	int i,j,x=0,min = a[0][0];
		
	for (i=0;i<a.length;i++)
	{
		for(j=0;j<a[i].length;j++)
			
		{
			if(a[i][j]<min)
				
			{
				min = a[i][j];
				x = i;
				 y = j;
			}
		}
			
	}
	
	System.out.println("Min Values in the Array is "+min);
	System.out.println("Row of Min Value is "+x);
	System.out.println("Column of the Min Values is "+y);
	
	
	int maxCol = a[0][y];	
	
	for(i=0;i<a.length;i++)
		
	{
		if(a[i][y]>maxCol)
			
		{
			maxCol = a[i][y];			
		}
	}
	System.out.printf("Max values in the Column "+y);
	System.out.println(" is "+maxCol);
	
	
	
	
	
	
}



}
