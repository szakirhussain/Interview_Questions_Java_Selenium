/**
 * Udemy-Section_27_Video_223
 * Date: 2019-Aug-27
 * Extends is the key word used for Inheritance
 * This is different from the calling a function from other class
 * We can inherit == Methods and Variables as well
 * we will create a object for this class itself then call the methods from child class
 */
package section27_219_to_225;


public class S27_223_1_Inheritance_Parent extends S27_223_2_Inheritance_Child  {

	public static void main(String[] args) {
		
		S27_223_1_Inheritance_Parent parent = new S27_223_1_Inheritance_Parent();
		
		parent.Masters();
		parent.Batchleros();
		//S27_223_1_Inheritance_Parent extends S27_223_2_Inheritance_Child and
		//S27_223_2_Inheritance_Child extends S27_220_ReverseString
		//So S27_223_1_Inheritance_Parent extends S27_223_2_Inheritance_Child and S27_220_ReverseString
		parent.Reversestring();
		//int parenti = parent.childi;
		parent.Inter();
	}

}
