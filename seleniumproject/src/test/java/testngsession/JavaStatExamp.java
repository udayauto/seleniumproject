package testngsession;

public class JavaStatExamp {
	
	static int a=10;
	static int b=20;
	static int c;
	
	public void add() {
		System.out.println(c=a+b);
	}
	
	public static void sub() {
		System.out.println(c=b-a);
	}
	
	
	public static void main(String[] args) {
		
		JavaStatExamp obj = new JavaStatExamp();
		obj.add();
		
		JavaStatExamp.sub();
		
	}
	
	

}
