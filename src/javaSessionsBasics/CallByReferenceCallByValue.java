package javaSessionsBasics;

public class CallByReferenceCallByValue {

	int p;
	int q;

	public static void main(String[] args) {

		CallByReferenceCallByValue obj = new CallByReferenceCallByValue();
		int x = 10;
		int y = 20;
		int i = obj.swap(x, y); // (x,y) -> // Call by Value or Pass By Value
		System.out.println(i);

		obj.p = 50;
		obj.q = 60;

		System.out.println("Before swap");
		System.out.println(obj.p);
		System.out.println(obj.q);

		obj.swap(obj);

		System.out.println("After swap");
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	public int swap(int a, int b) {
		a = 30;
		b = 40;
		int c = a + b;
		return c;
	}

	// Call by Reference or Pass By Reference
	public void swap(CallByReferenceCallByValue t) {
		int temp;
		temp = t.p; // temp=50
		t.p = t.q; // t.p=60
		t.q = temp;// t.q=50
	}
}
