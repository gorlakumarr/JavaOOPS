package oops;

public class OOPS_1_Inheritence extends OOPS_1_Inheritence_Parent {
	public static void main(String[] args) {

		// 1
		OOPS_1_Inheritence_Parent parent = new OOPS_1_Inheritence_Parent();
		parent.m1();
//		parent.m2();
		/*
		 * The method m2() is undefined for the type OOPS_1_Inheritence_Parent
		 */

		/*
		 * With the Parent reference we can call only parent members but not Child
		 */

		// 2
		OOPS_1_Inheritence_Child child = new OOPS_1_Inheritence_Child();
		child.m1();
		child.m2();
		/*
		 * With the Child reference we can call both parent members and child
		 */

		// 3
		OOPS_1_Inheritence_Parent p = new OOPS_1_Inheritence_Child();
		p.m1();
//		p.m2();
		/*
		 * With the Parent reference we can call only parent members but not Child
		 */
		/*
		 * The method m2() is undefined for the type OOPS_1_Inheritence_Parent
		 */

		// 4
		// OOPS_1_Inheritence_Child p = new OOPS_1_Inheritence_Parent();
		// Type mismatch: cannot convert from OOPS_1_Inheritence_Parent to
		// OOPS_1_Inheritence_Child
	}
}