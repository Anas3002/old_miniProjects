/*this app Is owned under the name of the AEH_World Ent.
 * Any one tries to modify it without any 'permition' will be detected and bla bla bla.
 * this App was created in 04/09/2002.
 */
package Maths;
import java.util.Scanner;
public class equation2Deg {
	
	static Scanner reader=new Scanner(System.in);
	
	static double solution(double a,double b,double c) {
		
		double delta=b*b-4*a*c;
		
		double rDelta; //rDelta==racineDelta
		
		if(delta>=0) {
			rDelta=Math.sqrt(delta);
			double s1=(-b-rDelta)/(2*a);
			double s2=(-b+rDelta)/(2*a);
			System.out.println("Cette equation a deux solutions :  "+s1+" et "+s2);
			if(delta==0) {
				System.out.println("Cette equation a une seule solution :  "+s1);
			}
		}else {
			System.out.println("Cette equation n'a aucun solution dans R.");
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Cette est cree pour vous aider a trouver les solutions d'une equation de la form 'ax*x+bx+c=0'.");
		
		System.out.println("Entrer 'a', puis 'b', puis 'c':");
		
		solution(reader.nextDouble(),reader.nextDouble(),reader.nextDouble());

		System.out.println("End App!");
		//momkin nzid des informations mt3l9in bles equation2Deg wles Trinome ftali dyal l'app fost xi 'if()'
		/*matalan
		 * if(answer=="yes"){
		 * 	println(".....bla.....bla......bla......")//relation lli kaynin les truques, etc.
		 * println("End")
		 * }else{
		 * println("End)
		 * }
		 */
	}

}
