/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package section29_Java_OOOPS;
public class Exception_Try_Catch {

	/**
	 * This TryCatch Meachanism is used when we need to run the code even though we know that we will get an error (excpetion)
	 * One try block can be followed by multiple catch blocks
	 * catch should be followed by try and no other code should be present in between them.
	 * ==SYNTAX==
	 * Try 
	 * {
	 * Code1: Code that will fail or that has exception
	 * }
	 * Catch(Exception e)****** e here can be any other variable
	 * {
	 * Code2: Runs this piece of code
	 * }
	 * 
	 * So in the above case if the code1 has failed or has an exception then it will instead of failing/blcoking there it 
	 * will run the code2
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception_Try_Catch TryCatch = new Exception_Try_Catch();
		//TryCatch.ExcecptionError();
		TryCatch.TryCatchMethod();
		
	}

	
	public static void ExcecptionError() {
		
		int a = 10,b=0,c;
		c = a/b;
		System.out.println("Value of C is "+c);
	
	}
	
	
	public static void TryCatchMethod() {
		
		int a = 10,b=0,c;
		
		try {
		
			//Code1 
			c = a/b;
			System.out.println("Code fails here");
		}
		
		catch(Exception e)
		{
			//Code2
			System.out.println("Code in the Catch Block is executed and Arithmetic Execption Error is ignored deliberately");
			
		}
	
	
		
	
	}
	
	
	
	
}
