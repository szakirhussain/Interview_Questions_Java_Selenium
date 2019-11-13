/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package section27_v234_v240;

import java.util.Scanner;

public class ThisKeyWord {

	 int a = 20; 
	 /*value a is defined at class level. If there is a variable with the same name in the method we are calling
	 Then the 1st preference would be given to the variable within the method.If we want to call the variable in the 
	 class then we use 'this' key word  
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyWord keyWord = new ThisKeyWord();
		keyWord.GetData();		
	}

	public void GetData() {
		//Try to comment out the below code and see the difference
		int a = 10;
		System.out.println(a);
		System.out.println(this.a);
		
	}
	
}
