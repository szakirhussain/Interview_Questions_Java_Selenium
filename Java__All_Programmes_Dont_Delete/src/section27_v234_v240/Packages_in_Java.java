/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package section27_v234_v240;
import section27_Arrays_228_to_233.Package_in_Java3;
public class Packages_in_Java {

	
	/**
	 * Packages- set of classes and Interfaces.
	 * If A,B two classes belong to same package. Then we can use methods in A in B by simply creating the Object for that class
	 * What is A,B does not belong to same class?
	 * Then we need to import that package and that class in which the method you need to user. syntax is below
	 * import Package_name.Class_Name;
	 */ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xyz();
	}

	
	static Package_in_Java2 pkg_within = new Package_in_Java2();
	static Package_in_Java3 pkg_outside = new Package_in_Java3(); //we need to import the package for this
	
	public static void xyz() {
		
		pkg_within.whithinPackage();
		pkg_outside.OutsidepackagePackage();
			
		}
	
	
}
