/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-04
 * ====Secnario====== There are methods with same name in the parent and child
 * Child extends(inherits) parent
 * Then if we call the method(duplicate name exists in the parent as well) - it will call method from the child. 
 * 
 * 
 */
package section27_v234_v240;
public class SuperKeyWord_Child_Method extends SuperKeyWord_Parent_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperKeyWord_Child_Method Child = new SuperKeyWord_Child_Method();
		Child.duplicate();
		}

	public void duplicate() {
	
		System.out.println("I am method in the Child");
		super.duplicate();
		
	}
	
	
}
