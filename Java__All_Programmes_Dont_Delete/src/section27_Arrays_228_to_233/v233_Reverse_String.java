/**
 * Udemy-Section_27_Video_233
 * Date: 2019-Aug-31
 * int a;        // This is a declaration
 * a = 0;        // This is an initialization
 * int b = 1;    // This is a declaration and initialization
 */
package section27_Arrays_228_to_233;
public class v233_Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString();
	}
	
	public static void ReverseString() {
		
		String name = "ZAKAZ";
		String revName = "";
		int i,len = name.length();
		
		System.out.println("Length of the String is "+len);
		for (i=len-1; i >=0;i--)
		{
			revName = revName+name.charAt(i);
		}
		System.out.println("String after Reversed is "+revName);
		
		
		if (revName.equals(name))
			
		{System.out.println("The Given String is a Palendrome");}
		
		else
		
		{System.out.println("The Given String is NOT a Palendrome");}
		
		
	} 
	
}
