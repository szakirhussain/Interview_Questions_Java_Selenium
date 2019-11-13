/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package section27_v234_v240;

import java.util.Scanner;

public class Scanner_KeyWord {
	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//Initialization is must so we will give Null/0 values first
		String str = "";
		int i=0;
		
		//Reading from the key Board;
		System.out.println("Please enter a String");
		str = sc.nextLine();
		System.out.println("Please Enter a Integer");
		i	= Integer.parseInt(sc.nextLine());
		
		
		//Printing the values in the Console
		System.out.println("String which you have Entered is "+str);
		System.out.println("Integer Which you have Entered is "+i);		
	}

	}
