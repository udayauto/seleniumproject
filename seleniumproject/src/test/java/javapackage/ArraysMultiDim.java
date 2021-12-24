package javapackage;

public class ArraysMultiDim {
	
	public static void main(String[] args) {
		
		//array syntax
		int a[][] = {{10, 20, 30}, {40, 50, 60}, {40, 50, 60}};
		//System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
				
			}
			
		}
		

	}

}
