package Maths;

import java.util.Scanner;
public class absoluteValue {
	static Scanner reader=new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("Ce code vous permette de calculer la valeur absolue d'un nombre.");
        System.out.println("Entrer les deux nombre que vous voulez calcouler sa valeur absolue:");
        double n=reader.nextDouble();
        double abs=n;
        if (n>=0){
            abs=n;
        }else{
            abs=-n;
        }
        System.out.println("La valeur absolue de "+n+" est: |"+n+"|="+abs);
     }
	
}
