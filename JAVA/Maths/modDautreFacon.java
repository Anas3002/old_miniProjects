package Maths;
import java.util.Scanner;

public class modDautreFacon {

	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = reader.nextInt(), b= reader.nextInt();
		System.out.print(a + " mod " + b + " = ");
		if (a < b) {
			System.out.print(a);
		} else {
			while (a >= b) {
				a = a - b;
			}
			System.out.print(a);
		}
	}
}