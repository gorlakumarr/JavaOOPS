package javaSessionsBasics;

/**
 * Why Pasword should be stored in char array instead of string?
 */

public class PaswordStore {
	public static void main(String[] args) {
		String str = "Password";
		System.out.println("Pass :" + str);

		char[] c = new char[] { 'P', 'a', 's', 's', 'w', 'o', 'r', 'd' };
		System.out.println("Pass :" + c.toString());
	}
}
