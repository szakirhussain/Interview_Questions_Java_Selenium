/**
 * Udemy-Section_27_Video_226
 * Date: 2019-Aug-27
 */
package interface_Implements_225_to_227;
public class S27_226_Multipleimplementation implements S27_225_1_Interface,S27_225_2_Interface2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//This will display all the methods from current and the other implemented interfaces
		S27_226_Multipleimplementation current = new S27_226_Multipleimplementation();
		current.local();
		current.method1();
		current.method21();
				
		//This will display all the methods only from the interface1 class
		S27_225_1_Interface interface1 = new S27_226_Multipleimplementation();
		interface1.method1();
		interface1.method2();
		interface1.method3();
		
		
		
		//Will display only methods from interface2 class
		S27_225_2_Interface2 interface2 = new S27_226_Multipleimplementation();
		interface2.method21();
		interface2.method22();
		interface2.method23();
		
	}

	@Override
	public void method1() {System.out.println("Method from S27_225_1_Interface ");}

	@Override
	public void method2() {System.out.println("Method from S27_225_1_Interface ");}

	@Override
	public void method3() {System.out.println("Method from S27_225_1_Interface ");}

	@Override
	public void method21(){System.out.println("Method from S27_225_2_Interface2 ");}

	@Override
	public void method22() {System.out.println("Method from S27_225_2_Interface2 ");}

	@Override
	public void method23() {System.out.println("Method from S27_225_2_Interface2 ");}
	
	public void local() {System.out.println("Method from Local_S27_226_Multipleimplementation Class ");}

}
