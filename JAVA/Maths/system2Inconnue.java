package Maths;
import java.util.Scanner;
public class system2Inconnue {

	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {		
		//   | a1x+b1y=c1
		//   | a2x+b2y=c2
		
		System.out.println("/Eng/   This App Will Help you to Find The Solutions Of the System : ");
		System.out.println("/Fr_/   Cette application vous aide a trouver les solution d'un systeme de la form : ");
		System.out.print("  | ax+by=c \n  | a'x+b'y=c' \n");
		//Inputs
		System.out.print("\nEnter a :");
		double a1 = reader.nextDouble();
		System.out.print("Enter b :");
		double b1 = reader.nextDouble();
		System.out.print("Enter c :");
		double c1 = reader.nextDouble();
		System.out.print("\nEnter a' :");
		double a2 = reader.nextDouble();
		System.out.print("Enter b' :");
		double b2 = reader.nextDouble();
		System.out.print("Enter c' :");
		double c2 = reader.nextDouble();
		//operations
		double bigDelta = a1 * b2 - a2 * b1;
		double deltaX = c1 * b2 - c2 * b1;
		double deltaY = a1 * c2 - a2 * c1;
		if (bigDelta == 0) {
			if (deltaX == 0 && deltaY == 0) {
				System.out.println("\nThis system have an infinity solutions.");
				System.out.println("Ce systeme admet une infinitee de solutions.");
				System.out.println("S=IR*IR");
			} else {
				System.out.println("\nThis system don't have any solution.");
				System.out.println("Ce systeme n'admet aucun solutions.");
				System.out.println("S={}");
			}
		} else {
			double x = deltaX / bigDelta;
			double y = deltaY / bigDelta;
			System.out.println("\nThis system's Solution is: ");
			System.out.println("Ce systeme admet une seule solution: ");
			System.out.println("S={(" + x + ";" + y + ")}");
		}
	}
}