package javapackage;

public class VariablesTypes {
	// instance variable 
	int a = 10; 
	int b = 20;
	
	// Methods
	public void add() {
		// Local variable used within method only, not outside of the method. 
		int c = a+b;
		System.out.println("total value: " + c);
	}
	
	public static void main(String[] args) {
		VariablesTypes obj = new VariablesTypes();
		System.out.println("a value:" + obj.a);
		System.out.println("b value:" + obj.b);	
		obj.add();
	}

}
