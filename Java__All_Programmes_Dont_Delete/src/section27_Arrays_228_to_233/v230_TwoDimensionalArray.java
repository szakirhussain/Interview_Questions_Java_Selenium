/**
 * Udemy-Section_27_Video_230
 * Date: 2019-Aug-28
 */
package section27_Arrays_228_to_233;
public class v230_TwoDimensionalArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*finding the length of the Array
* a.lenght = gives the #of Rows Count
* a[i].length = gives the #of Column counts in that row
* ****We need to understand that each row may have different number of columns
* ****So we can get the #of Rows count easily = a.lenth gives the number of rows in the Array
* ******As mentioned above #of Columns may vary from row to row = in order find the #of Columns in that row we use below 
* ******a[RowInWhichYouNeedToKnowtheColumnCount].length
* ******By Default a.lenght= gives the number of the rows in the array
*/		
		rowLenth();		//a.lenght . Gives the #Rows in the Array
		//columnLength(); // a[i].length .Gives the #Columns in the Array at the Row 'i'
		//printArray(); 	//with different column counts in each row. Try to print with normal two for loops we will land on error page
	}
public static void  rowLenth(){
int a[][] = {
			{1,2,3,4},
			{2,5,3},
			{3,8,9,5,5},
			{4,0,5,6,4,6},
			{5,8,3}
			};

System.out.println("The Row Count of the 2D Array a is "+a.length);
}	
public static void  columnLength(){
int a[][] = {
			{1,2,3,4},
			{2,5,3},
			{3,8,9,5,5},
			{4,0,5,6,4,6},
			{5,8,3}
			};
for (int i=0;i<a.length;i++)
{
System.out.println("The Column Count of the 2D Array a is "+a[i].length);
}

}

public static void  printArray(){
int a[][] = {
			{1,2,3,4},
			{2,2},
			{3,8,3},
			{4},
			{5,8,3}
			};
//Now that you know how to calculate the #of rows and columns in a given row we can easily print the Array

for(int x=0;x<a.length;x++) // #x is of Rows

{
 for(int y=0;y<a[x].length;y++) //y is #Columns in the given row
	 
 {
	 System.out.println("The values in the Array are "+a[x][y]);
 }
	 
	 
	
	
}
	
	
	


}



	}

