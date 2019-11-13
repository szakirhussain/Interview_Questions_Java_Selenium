package section27_219_to_225;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Note the Naming convention S27_219 = Section 27, Video number = 219 in the Udemy app

public class S27_219_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//In this programe we are validating whether the amount is paid or not
		String str = "AMOUNT $ PAID to ZakiR Hussain.";
		
		//***CharAT*** Finding the character the given index 
		char c = str.charAt(7);
		System.out.println("The CharAt at 7th posisiton is "+c);
		
		//***IndexOf*** Finding the index of the given character 
		int x = str.indexOf("Z");
		System.out.println("The indexOf $ sysmbol is "+x);
		
		//***subString*** Getting the substring from the given position
		String hero = str.substring(17);
		System.out.println("The substring from 17th Posision is "+hero);
		System.out.println("Take care of the below numbering 17 and 22");
		
		//**SubString**** subsring with start and end point
		String hero1 = str.substring(17, 22);
		System.out.println("The String is "+hero1);
		
		
		
		
		
		
		
		
	}

}
