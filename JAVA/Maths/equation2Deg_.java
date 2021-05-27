package equtionResolver;

import java.util.Scanner;

public class equation2Deg {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Cette App est cree pour aider vous a trouver les racines d'un polynome de deuxiemme degree(trinome), de la forme: ax^2+bx+c");

		//declaration des variable.

		System.out.println("Entrer la valeur de 'a' : ");

		double a = reader.nextDouble();

		System.out.println("entrer la valeur de 'b' : ");

		double b = reader.nextDouble();

		System.out.println("entrer la valeur de 'c' : ");

		double c = reader.nextDouble();

		//Commencement.

		double delta = b * b - 4 * a * c;

		if (delta>0) {

			double racineDelta = Math.sqrt(delta); // sqrt == la racine carree.

			double racine1 = (-b - racineDelta) / (2 * a);

            String stRacine1;

            stRacine1 = String.valueOf(racine1);

			double racine2 = (-b + racineDelta) / (2 * a);

            String stRacine2;

            stRacine2 = String.valueOf(racine2);

			System.out.println("Le 1er racine est : " + stRacine1);

			System.out.println("le 2me racine est : " + stRacine2);

		}
		if (delta==0) {

			double racine = -b / (2 * a);

            String stRacine;

            stRacine = String.valueOf(racine);

			System.out.println("ce polynome a un seule racine : " + racine);

		}
        if (delta<0) {

			System.out.println("ce polynome n'a aucun racine dans R");

		}

		System.out.println("End.");
	}
}
