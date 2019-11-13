/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package section29_Java_OOOPS;
public class Exception_Try_MultipleCatches_2 {

	/**
	 * A Try can have Multiple catches. Each catch catching the unique exception
	 * Even though there are multiple catches depending on the error in try the respective catch will be followed and executed
	 * Try to run the code by triggering various exception individually 
	 */
	public static void main(String[] args) {
		
		Exception_Try_MultipleCatches_2 tcmul = new Exception_Try_MultipleCatches_2();
		tcmul.trycatchmul();
	}

	public static void trycatchmul() {
		
		
		try {
			//Array IndexOutOfBounds Exception
			int x[] = new int[2];
			System.out.println("Print the value of a " +x[3]);
			
			//ArithmeticException
			int a=10,b=0,c;
			c= a/b;			
			}
		
		catch(ArithmeticException AE) 
		{System.out.println("I am inside theArithmeticException ");}
		
		catch(ArrayIndexOutOfBoundsException AOBE) 
		{System.out.println("I am inside ArrayIndexOutOfBoundException");} 
		
		catch(Exception E)
		{System.out.println("I am inside General Exception");}
				
		
		
	}
	
	
	
	
	
	
}
