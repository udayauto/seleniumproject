package javapackage;
public class StaticKeyword {
	// Static variable 
	static int a = 20; 
	static int b = 10;
	
	// Static Methods (2 types of Methods: static and non-static)
	protected static void add() {
		// Local variable used within method only, not outside of the method. 
		int c = a+b;
		System.out.println("addition total value: " + c);
	} 
	 void sub() { // non-static method
		// Local variable used within method only, not outside of the method. 
		int c = a-b;
		System.out.println("subtraction total value: " + c);
	}
	public static void main(String[] args) {
	StaticKeyword obj = new StaticKeyword();
	System.out.println(StaticKeyword.a);System.out.println(StaticKeyword.b);
	StaticKeyword.add();
	obj.sub();
	
	}

}
