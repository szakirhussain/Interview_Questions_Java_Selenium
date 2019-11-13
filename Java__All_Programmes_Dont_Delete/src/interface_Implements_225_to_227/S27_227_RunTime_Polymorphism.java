/**
 * Udemy-Section_27_Video_227
 * Date: 2019-Aug-27
 */
package interface_Implements_225_to_227;
public class S27_227_RunTime_Polymorphism implements S27_225_1_Interface {
public static void main(String[] args) { 
		 //see the difference 
//This will show all the methods present in the class here and the class being implemented	 
		 S27_227_RunTime_Polymorphism imp = new S27_227_RunTime_Polymorphism();
		 imp.method1();
		 imp.method2();
		 imp.method3();
		 imp.within();
		 
//This will display only the methods that are present in the S27_225_1_Interface but not the current class
		 S27_225_1_Interface interfce = new S27_227_RunTime_Polymorphism();
		 interfce.method1();
		 interfce.method2();
		 interfce.method3();
		 
/* apple ale = new current();
 * Code "apple ale" 		== Here ale.<will display all the methods present in the apple class> but not the methods from current() class 
 * Code "new current();"	== code is used for memory allocation in the class current(); 
 */ 	 	 
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
	


