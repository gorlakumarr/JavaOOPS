package oops;

public class ObjectCasting_Test {
	public static void main(String[] args) {

		Object o = new String("Str");
//		StringBuffer stringBuffer = (StringBuffer) o;// Exception in thread "main" java.lang.ClassCastException:
//		System.out.println(stringBuffer);

		String s1 = new String("Str1");
//		StringBuffer buffer = (StringBuffer) s1;//Cannot cast from String to StringBuffer
//		System.out.println(buffer);

		String s2 = new String("Str2");
//		StringBuffer sb = (String) s2; //Type mismatch: cannot convert from String to StringBuffer
//		System.out.println(sb);

		Object o1 = new String("Str");
		String str = (String) o1;
		System.out.println(str);

		/*
		 * Type Casting
		 * 
		 * A b = (C) d
		 * 
		 * --> Compiler Check 1:- Type d and C must have some relation. Either Parent to
		 * Child or Vice Versa
		 * 
		 * --> Compiler Check 2:- Type C Object must be either same as A or Child of A
		 * 
		 * --> JVM Check:- Runtime object of d must be either same as C or its Child
		 * type. Otherwise we will get Class Cast Exception.
		 * 
		 */
	}
}
