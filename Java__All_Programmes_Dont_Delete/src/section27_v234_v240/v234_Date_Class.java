/**
 * Udemy-Section_27_Video_234
 * Date: 2019-Aug-31
 * In this we deal with the Date function
 * To make our work simple we will a function called SimpleDateFormat 
 * Please follow the below link for the codes of SimpleDateFormat
 * https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
 * 
 * 
 */
package section27_v234_v240;

import java.text.SimpleDateFormat;
import java.util.Date;

public class v234_Date_Class {

	

	public static void main(String[] args) {
		// Date and SimpleDateFormat Functions
		date();
		SimpleDateFrmt();
	}
	
	public static void date() {
		
		Date dt = new Date();
		System.out.println("The date Today is "+dt.toString());
		
		
	}
	
	public static void SimpleDateFrmt() {
		
		Date dt = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("M/d/YYYY");
		SimpleDateFormat sdf2 = new SimpleDateFormat("M/d/YYYY hh:mm:ss");
		
		
	System.out.println("The Date Prescribed in the Format_1 is "+sdf1.format(dt));	
	System.out.println("The Date Prescribed in the Format_2 is "+sdf2.format(dt));
	}
}
 