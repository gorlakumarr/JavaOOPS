package javaSessionsBasics;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);

		System.out.println(ar.size());

		ar.add(500);
		ar.add(600);

		System.out.println(ar.size());

		ar.add("Tom");
		System.out.println(ar.size());

		for (Object object : ar) {
			System.out.println(object);
		}
	}
}
