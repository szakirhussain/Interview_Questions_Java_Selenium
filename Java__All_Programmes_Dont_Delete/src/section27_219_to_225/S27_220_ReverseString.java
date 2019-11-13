/**
 * This is from Section 27 of the Udemy Video - Video number is 
 * Reverse String 
 * String is Palendrome or Not
 * equals(arguments) function should be used to validate whether the given strings are equal or not
 */
package section27_219_to_225;

public class S27_220_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reversestring();
		//Palendrome();
		
		
	}

	public static void Reversestring()
	
	{
		String name = "ZakiR";
		int len 	= name.length();
		String revName = "";
		
		//Here in the for Loop i = len-1 because the charIndex will start from 0;
		for (int i=len-1;i>=0;i--)
			
		{
			System.out.println(name.charAt(i));
			revName = revName + name.charAt(i);
		}
			
		System.out.println(revName);
		
	
	}
	
	public static void Palendrome()
	
	{
		String name = "AZIZA";
		int len 	= name.length();
		String revName = "";
		
		//Here in the for Loop i = len-1 because the charIndex will start from 0;
		for (int i=len-1;i>=0;i--)
			
		{
			System.out.println(name.charAt(i));
			revName = revName + name.charAt(i);
		}
			
		System.out.println(revName);
		
		if(name.equals(revName))
			
		{
			System.out.println("Given name is Palendrome");
		}
		
		else 
			
		{
			System.out.println("Given name is Not Palendrome");
		}
		
	}
	
	
}
