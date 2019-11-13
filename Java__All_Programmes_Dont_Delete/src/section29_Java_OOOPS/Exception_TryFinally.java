/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package section29_Java_OOOPS;
public class Exception_TryFinally {


	/**
	 * Finally is piece of code that will be executed for must
	 * Say Try block has 10 lines of code. Exception occurred at line 4. And was handled by catch block 
	 * But you are still interested to run the piece of code from 7 to 10;
	 * Then we can paste this code in the Finally block	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		Exception_TryFinally tcmul = new Exception_TryFinally();
		tcmul.tryfinally();
	}

	public static void tryfinally() {
		
		
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
		
		finally 
		{
			System.out.println("I am inside the finally block");
			int a=10,b=0,c;
			c= a/b;	
			System.out.println("I am inside the finally block2");
			}
		}
		
		
		
	}
	
	