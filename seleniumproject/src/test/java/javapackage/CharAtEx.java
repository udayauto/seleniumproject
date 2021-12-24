package javapackage;

public class CharAtEx {
	public static void main(String[] args) {
		String str[] = { "CTS", "TCS", "Congnizant" };
		for (int i = 0; i < str.length; i++) {

			if (str[i].charAt(0) == 'C') // if (str[i].startsWith("C"))
			{
				System.out.println(str[i]);
			}
		} // if (str[i].contains("C")) --> for all the mathes.
	}

}
