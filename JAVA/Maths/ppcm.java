package Maths;

import java.util.Scanner;

public class ppcm {

	static Scanner reader = new Scanner(System.in);
	public static void main(String[]args) {
		System.out.println("Ce code vous permette a trouver le ppcm de deux entiers naturels.");
		System.out.print("\nEntrer les deux nombre que vous voulez calcouler leur PPCM (plus petit commun multiple):");
		int n1 = reader.nextInt(), n2 = reader.nextInt();//Input
		int a, b, a2 = 0, b2 = 1;//Calc aider/assistant
		if (n1 < n2) {
			a = n2;
			b = n1;
		} else {
			a = n1;
			b = n2;
		}//result: a>b

		for (int i = 1; i <= a * b; i++) {//si a et b sont premier entre eux alors ppcm(a;b)=a*b
			if(a2 == b2) {
				break;
			}
			a2 = i * a;
			for (int j = 1; j <= a * b; j++) {
				b2 = j * b;
				if (a2 <= b2) break;
				//if (a2 == b2) break;
			}
		}
		System.out.println(a2);
	}
}