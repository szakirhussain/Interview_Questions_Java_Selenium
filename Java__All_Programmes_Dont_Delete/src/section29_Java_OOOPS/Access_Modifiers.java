/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package section29_Java_OOOPS;
public class Access_Modifiers {

	/**
	 * There are four types of Access Modifiers
	 * 1.Public		- We can access if from any where. We just need to import the package/Class by creating a object for that method/variable.
	 * 2.Private	- Restricted to that particular class in which it is present. Cannot access from other class also from same package.
	 * 3.Protected	- Default + Extends (Can be accessed from diff pckg as well But still we need to Inherit(Extend)
	 * 4.Default 	- We can access this from anywhere in the package. It is Limited only to that particular package
	 * 
	 * The above applies for both methods ands variables
	 * 
	 * We can create objects for the class - From that object we will call the methods present in that class
	 * Say if method method123() is from class abc123() which is in package in Pack123().
	 * Now you are willing to use method123() in Pack456()
	 * 
	 * Solution:
	 * You are inside a Package Pack456;
	 * Import Pack123.Class123;
	 * Class123 cp = new Class123;
	 * 
	 * cp.method123();
	 * 
	 * To make it simple 
	 * Which ever method you are trying to access - 
	 * import the Class of that if the method is in the same package
	 * Import the packaget.targetclass() in which the method is present if it is from different package 
	 * 
	 * We will create objects only for the class and use the methods in that class by means of that object
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//defaultmethod();
		//privatemethod();
		//publicmethod();
		//protectedmethod();
		test();
	}

	
	protected static void protectedmethod() {
					System.out.println("I am inside a Protected class");
					System.out.println("Default + Extends (Can be accessed from diff pckg as well But still we need to Inherit(Extend)");}
	
	public static void publicmethod() {
					System.out.println("I am inside a public Class");
					System.out.println("We can access if from any where. We just need to import the package/Class by creating a object for that method/variable.");}
					
	private static void privatemethod() {
					System.out.println("I am inside a private Class");
					System.out.println("Default + Extends (Can be accessed from diff pckg as well But still we need to Inherit(Extend)");}

	static void defaultmethod() {
					System.out.println("I am inside a Default Class");
					System.out.println("We can access this from anywhere in the package. It is Limited only to that particular package");}

	public static void test(){
		
		Access_Modifiers AM = new Access_Modifiers();
		AM.defaultmethod();
		
		
	}
	
}
