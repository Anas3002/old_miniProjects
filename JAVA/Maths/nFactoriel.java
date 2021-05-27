package Maths;
import java.util.Scanner;
public class nFactoriel {
	static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Entrer le nombre que vous voulez calculer leur factoriel (n!):");
		int n = reader.nextInt();
		int nO = n;//pour conserver la valeur de n;
		int r = n;//temporerement;
		while(n>1) {
			r = r * (n - 1);
			n--;
		}
		System.out.println(nO + "! = " + r);
	}
}
