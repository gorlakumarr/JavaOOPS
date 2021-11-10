package javaSessionsBasics;

public class NullConcept {
	static Object obj;
	static String str;
	static NullConcept concept;

	public static void main(String[] args) {

		// 1. Case sensitive
//		Object object = null;

		// 2. Default reference value will be null.
		System.out.println(obj);
		System.out.println(str);
		System.out.println(concept);

		// 3.
//		Integer i = null;
//		int j = i;// java.lang.NullPointerException

		// 4. Instance of
		Integer i = null;
		Integer j = 10;
		System.out.println(j instanceof Integer);// true
		System.out.println(i instanceof Integer);// false

		// 5. Static v/s Non Static
		concept = null;
		concept.sum();
		send();

		// 6. == and !=
		System.out.println(null != null); // false
		System.out.println(null == null); // true

		// 7.
		String str = null;
		Integer integer = null;
		Double d = null;

		String s1 = (String) null;
		System.out.println(s1 + "1k23");
//		System.out.println(s1.length());// java.lang.NullPointerException:
	}

	public static void sum() {
		System.out.println("sum Method");
	}

	public static void send() {
		System.out.println("send Method");
	}
}
