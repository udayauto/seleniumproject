package javapackage;

public class ArrayExample {

	public static void main(String[] args) {

		// Array
		
		int a[] = new int[100]; //arrays fixed in size
		
		// 10 ---memory 10 values
		
		// a= {10,20,30,40,50};
		
		
		String names[] = { "Sanjeev", "Bharat", "Anil", "Vidya", "Mahesh" };

		/*
		 * int i; int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		 */
		/*
		 * int count = a.length;
		 * 
		 * System.out.println("count is : " + count);
		 * 
		 * for (i = 0; i <count ; i++) { System.out.println(a[i]); }
		 */
		int count = names.length;
		
		System.out.println("count of string names array is: " + count);

		for (int i = 0; i < count; i++) {
			System.out.println(names[i]);
		}
	}

}
