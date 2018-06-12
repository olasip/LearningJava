package Exercises.basic;

public class B2 {
	public static void main(String[] args) {
		
		System.out.println("Zad.1.");
		int a = 0;
		do {
			a += 2;
		} while (a < 5);
		System.out.println(a);
		
		
		System.out.println("\nZad.2.");
		int x = 4;
		for (int i = 1; i < 5; ++i) {
			if (x % i == 1 ) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
