/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-04
 * =====Scenario===== 
 * There are two variables with the same name in the parent and child. Then if we want to call the variable from the parent
 * Explicitly then we use the key word super. 
 */
package section27_v234_v240;
public class SuperKeyWord_Child_variable extends SuperKeyWord_Parent_variable {

	public static void main(String[] args) {
		SuperKeyWord_Child_variable Child = new SuperKeyWord_Child_variable();
		Child.namePrint();
	}

	
	public void namePrint() 
	
	{
			String name = "Child_Zoya";
			System.out.println("The name inside the child is "+name);
			System.out.println("The name inside the Parent is "+super.name);
			
	}
	
	
}
