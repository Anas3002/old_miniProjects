
package Maths;

import java.util.Scanner;

public class trinomeRacines {
	
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
			
			double racine2 = (-b + racineDelta) / (2 * a);
			
			System.out.println("Le 1er racine est : " + racine1);
			
			System.out.println("le 2me racine est : " + racine2);
		}
		
		if (delta==0) {
		
			double racine = -b / (2 * a);
			
			System.out.println("ce polynome a un seule racine : " + racine);
		}
		
		if (delta<0) {
		
			System.out.println("ce polynome n'a aucun racine dans R");
		}
				
		System.out.println("End.");
	}
}
