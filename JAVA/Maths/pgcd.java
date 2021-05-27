package Maths;
import java.util.Scanner;
public class pgcd {

	static int max(int a,int b) {
		if (a > b) {
			return(a);
		}else {
			return(b);
		}
	}
	static int min(int a,int b) {
		if (a <= b) {
			return(a);
		}else {
			return(b);
		}
	}
	static Scanner reader = new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("Ce code vous permette a trouver le pgcd de deux entiers naturels.");
        System.out.print("\nEntrer les deux nombre que vous voulez calcouler leur PGCD (plus grand commun diviseur):");
        int n1 = reader.nextInt(), n2 = reader.nextInt();//Inputs
        int a = n1, b = n2;
        while (a != b) {
            if (a > b) {
                int r = a - b;
                a = max(r,b);
                b = min(r,b);
            } else {
                int r = b - a;
                a = max(r,b);
                b = min(r,b);
            }
        }
        System.out.println("PGCD(" + n1 + "," + n2 + ")=" + a);
    }
}