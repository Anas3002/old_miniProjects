package Maths;
import java.util.Scanner;
public class pair_impair {

	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ce Code vous permet de savoir la parite d'un nombre.");
		System.out.print("Entrer un nombre: ");
		int n = reader.nextInt();
		if (n % 2 == 0) {
			System.out.println("Le nombre " + n + " est pair");
		} else {
			System.out.println("Le nombre " + n + " est impair");
		}
	}

}
