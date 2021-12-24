package methodsOfWebDriver;

public class Conversion {
	
	public static void main(String[] args) {
	
		// oops
		String a = "10"; // string values source from app/ excel/xml..etc.
		String b="20";
		
	//	String x ="12.230";
		String c;
		int total;
	
		//concat
		c = a+b;
		System.out.println("Before conversion: " + c);
		
		//conversion --type cast as string
		//int
		int value1  = Integer.parseInt(a);
		int value2 =  Integer.parseInt(b);
		total = value1+value2;
		
		//double
		double val = Double.parseDouble("10.20");
		// float
		float fval = Float.parseFloat("10.23f");
		
		Long.parseLong("866L");
		
		System.out.println("After int conversion: " + total);
		
		// convert to string
		String x = String.valueOf(value1);
		String y = String.valueOf(value2);
		String concat = x+y;
		System.out.println("After string conversion: " + concat);
		
		
	/*	String str1 = String.valueOf(a);
		String str2 = String.valueOf(b);
		System.out.println("before conversion: " + str1+str2);
		
		c = Integer.parseInt(str1)+Integer.parseInt(str2);
		double value = Double.parseDouble(x);
		
		  
		System.out.println("after conversion: " + c);
	}
*/
}
}
