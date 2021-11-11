package oops;
/*
 * Method resolution takes care by jvm based on runtime object
 * 
 * runtime polymorphism/ dynamic polymorphism/late binding
 * 
 */

/*
 * Rules:-
 * 
 * -->Method Signature must be matched
 * 
 * -->Return types must be same.Co variant return types are also allowed.
 * Ex:
 *
 * Object (Parent Return Type) --> String/StringBuffer/StringBuilder (Child return type)
 * Number (Parent Return Type) --> Number/Integer/Float (Child return type)
 * 
 * Not allowed : String --> Object
 * 
 * -->overriding not applicable for private method.But it's valid
 * 
 * -->overriding not applicable for final method
 * 	  final -> non final :: not accepted
 * 
 * 	  non final -> final :: accepted
 * 	  abstract -> non abstract :: accepted
 *    non abstract -> abstract :: accepted 
 *    synchronized -> non synchronized :: accepted 
 *    non synchronized -> synchronized :: accepted 
 * 
 * --> we can't reduce the scope of modifier while overriding. But we can increase the scope
 * 
 * -->if Child throws any checked exception compulsory parent throw its child -- exception or its parent exception
 *	  For unchecked exceptions there is no rule.
 * 
 * --> Method Hiding:- 
 * 	Method resolution takes care by Compiler based on reference object 
 * 	:: static -> static :: Method Hiding
 *	:: static -> non static :: not overridden
 *  :: non static -> static :: not overridden		
 * 
 * --> 
 *
 * --> 
 */

class Parent {
	public void property() {
		System.out.println("Parent Property");
	}

	public void marriage() {// Overridden Method
		System.out.println("Parent Marriage");
	}

	public void gold_1() {
		System.out.println("Parent Gold_1");
	}

	public static void gold() {
		System.out.println("Parent Gold");
	}

}

class Child extends Parent {
	public void marriage() {
		System.out.println("Child Marriage");// Overriding Method
	}

//	public void gold() {
//		System.out.println("Child Gold");
//	}
//
//	public static void gold_1() {
//		System.out.println("Parent Gold");
//	}

	public static void gold() {
		System.out.println("Child Gold");
	}
}

public class OOPS_1_Overriding extends OOPS_1_Inheritence_Parent {
	public static void main(String[] args) {
		// 1
		Parent p = new Parent();
		p.marriage();// Parent Marriage
		p.gold();

		// 2
		Child c = new Child();
		c.marriage();// Child Marriage
		c.gold();

		// 3
		Parent pc = new Child();
		pc.marriage();// Child Marriage
		pc.gold();
	}
}