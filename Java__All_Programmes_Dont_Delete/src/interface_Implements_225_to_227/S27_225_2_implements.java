/**
 * Udemy-Section_27_Video_
 * Date: 2019-Aug-
 */
package interface_Implements_225_to_227;


 public class S27_225_2_implements implements S27_225_1_Interface  {
//By this i mean that the class S27_225_2_implements will implement each and every methods in the S27_225_1_Interface
	 public static void main(String[] args) {
		 
		 
		 S27_225_2_implements imp = new S27_225_2_implements();
		 imp.method1();
		 imp.method2();
		 imp.method3();
		 imp.within();
		 
	 }
	public void method1()
	
	{System.out.println("Hi, I am menthod1 from Interface Implelemnted");}
	
	public  void method2()
	
	{System.out.println("Hi, I am menthod2 from Interface Implelemnted");}	
	
	public  void method3()
	
	{System.out.println("Hi, I am menthod3 from Interface Implelemnted");}
	
	public void within()
	{System.out.println("Hi, I am not from Interface Implelemnted. but still can be part of implements");}
	
 }


