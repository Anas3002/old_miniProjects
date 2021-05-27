package Maths;

import java.util.Scanner;
public class equation1Deg {
	static Scanner reader= new Scanner(System.in);
	static double solution(double a,double b) {
		System.out.println("This equation's solution is :" + (-b/a));
		return 0;
	}
	public static void main(String[] args) {
		System.out.println("This app will helps you to find out the solution of Equations like 'ax+b=0' (x is unknown).");
		System.out.println("Enter 'a' then 'b' :");
		solution(reader.nextDouble(),reader.nextDouble());
		
	}

}
