package Maths;
import java.util.Scanner;

public class divisibility {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Ce Code vous aide a determiner la divisibilitee d'un nombre par les nombres entre 1 et 100.");
		
		System.out.print("Entrer un nombre: ");
		
		int n = reader.nextInt();
		
		System.out.print("\nLe nombre " + n + " est divisible par: " );
		
		boolean[] divisible = new boolean[100];
		for (int i = 0; i < 100; i++) {
			if (n < i + 1) break;// n < (i + 1) ==> n mod (i + 1) == n; alors c'cest pas l'appele de continuer!
			divisible[i] = n % (i + 1) == 0;// it means that n div (i + 1) == k, k de N.
			if (divisible[i]) {//if (divisible[i]) == if (divisible[i] == true)
				System.out.print(i + 1 + " ");
			}
		}

		// pause execution for 2 sec.
		/* long start = System.currentTimeMillis();
		 * long end = start + 2*1000; // 2 seconds * 1000 ms/sec
		 * while (System.currentTimeMillis() < end)
		 * {
		 * 	// run
		 * }
		*/
		
	}

}
