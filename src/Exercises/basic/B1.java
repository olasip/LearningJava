package Exercises.basic;

public class B1 {
	public static void main(String[] args) {
		
		System.out.println("Zad.1.");
		StringBuilder sb = new
		StringBuilder("Hello");
		sb.append("World"); // append = add
		System.out.println(sb);
		
		System.out.println("\nZad.2.");
		int x = 0;
		int[] a = {5,3,4};
		a[1] = --x; // 3 is exchanged for --x 
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);		
		}
		
		System.out.println("\nZad.3.");
		System.out.println("ala lubi kota".substring(9,13)); // .substring extracts characters from text 
		
		
		
	}

}
