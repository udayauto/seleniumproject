package javapackage;

public class StringFunctions {
	
	public static void main(String[] args) {
	/** String Functions
	 */
		String name = "Selenium Java";// String is a class in java
	
		String str1 = "Welcome";
		String str2 = "Selenium";
		
		// Length of string
		int len =  name.length();
		System.out.println(len);
		
		// lower case
		System.out.println(name.toLowerCase());
		
		// upper case
		System.out.println(name.toUpperCase());
		
		// starts-with
		System.out.println(name.startsWith("S"));
		
		// sub-string
		System.out.println(name.substring(0,8));
		
		// concat 
		System.out.println(str1.concat(str2));
		System.out.println(str1+" " + str2);
		
		// Equals 
		String expectedValue = "Login Successful";
		String actualValue = "Login successful";
		System.out.println(expectedValue.equals(actualValue));// exact Match
		System.out.println(expectedValue.equalsIgnoreCase(actualValue));
		
		// indexOf
		System.out.println("index: " + expectedValue.indexOf("S"));
		
		// contains
		System.out.println(actualValue.contains("Login"));
		String url = "https://www.google.com";
		System.out.println(url.contains("google.com"));
		//charAt
		
		String learn = "Selenium Java";
		System.out.println("char at : "+learn.charAt(1));
		//System.out.println("char at : "+learn.charAt(20)); //out of boundary exception
		
		// replace 
		System.out.println("After replacement:" + expectedValue.replace("S", "s"));
		System.out.println("After replacement:" + expectedValue.replaceAll(expectedValue, "Hello JAVA"));
		
		// reverse
		StringBuilder strb = new StringBuilder("WebDriver");
		//System.out.println(strb.reverse());
		//System.err.println(strb.append(" "+ "Selenium"));
		System.out.println(strb.delete(0, 3));
	}

}
