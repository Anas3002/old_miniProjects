package Maths;
import java.util.Scanner;

public class euclidean_Division {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Avec cette application, vous pouver trouver l'ecriture euclidienne du division a/b,"
				+ "\ncette ecriture sera de la for;e: a = b*q + r");
		System.out.println("entrer a:");
		int a = reader.nextInt();
		System.out.println("entrer b:");
		int b = reader.nextInt(), q = 0, r = 0;
		System.out.print(a + "=" + b + "*");
		while (a >= b) {
			a = a - b;
			q += 1;
			r = a;
		}
		System.out.print(q + " + " + r);
	}

}
//ajouter la notion TRY_CATCH !!!


