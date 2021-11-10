package javaSessionsBasics;

public class FinalizeConcept {

	public static void main(String[] args) {
		FinalConcept concept1 = new FinalConcept();
		FinalConcept concept2 = new FinalConcept();

		System.out.println(concept1);
		System.out.println(concept2);

		concept1 = null;
		concept2 = null;

		System.out.println(concept1);
		System.out.println(concept2);

		System.gc(); // Runs The Garbage Collector
	}
}
