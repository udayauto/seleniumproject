package methods.types;

import utility.PropertyReader;

public class StaticMethodEx {

	// methods
	// regular
	//var
	int a = 20, b = 30, c;
	static int z, x=50, y=30;
	
	
	

	// regular method --non static
	public void add() {

		c = a + b;
		System.out.println("sum value: " + c);
	}

	// static method
	public static void sub() {

		z = x - y;
		System.out.println("sub value: " + z);
	}

	//constructor
		public StaticMethodEx() {
			
			System.out.println("This is a constructor method");
		}
		
	public static void main(String[] args) throws Exception {

		//regular method require object initialization
		StaticMethodEx obj = new StaticMethodEx();
		obj.add(); //calling
				
		//static --invoked directly or using a class name
		StaticMethodEx.sub();

	}

}
