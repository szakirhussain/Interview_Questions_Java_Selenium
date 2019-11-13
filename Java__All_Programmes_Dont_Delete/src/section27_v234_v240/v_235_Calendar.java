/**
 * Udemy-Section_27_Video_235
 * Date: 2019-Sep-03
 * SimpleDateFormat accepts both Date and Calendar as inputs but there are methods in the calendar function.
 * we need to use correct input depending upon the requirement. 
 */
package section27_v234_v240;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class v_235_Calendar {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	calender();
	}
public static void calender() {
	
	Calendar cld = Calendar.getInstance();
	

	System.out.println(cld.AM); //if AM it returns 1, else 0
	System.out.println(cld.ZONE_OFFSET);
	System.out.println(cld.DATE);
	System.out.println(cld.DAY_OF_MONTH);
	System.out.println(cld.DAY_OF_WEEK_IN_MONTH);
	
	
	
}



}
