/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package interview_Questions;

/**
 * Spliting the array based on the given condition
 *
 */
public class Split_String {
	public static void main(String[] args) {
		
		String a = "ZakiR Hussain shaikR";
		
		String[]  b = a.split(" ");
		System.out.println("C is split into "+b.length);
		for(int i=0;i<b.length;i++)
		{		System.out.println(b[i]); }
		
		
		
		System.out.println();
		
		String[]  c = a.split("R");
		System.out.println("C is split into "+c.length);
		for(int j=0;j<c.length;j++)
		{		System.out.println(c[j]); }
		
		System.out.println();
		System.out.println("Now trimming the space infront of the letter H from the above result");
		String trim = c[1].trim();
		System.out.println(trim);
	}

}
