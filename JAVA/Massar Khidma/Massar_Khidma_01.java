
//
//	had lkod ghaykherej lik lmo3edalat dyal lmawad
//

package firstProject;

import java.util.Scanner;

public class Massar_Khidma_01 {
	static Scanner reader = new Scanner(System.in);
	
	static int mo3dalHissabi () {
		//	System.out.println("Dekhel lmo3amil dyal ....");
		
		System.out.println("Dekhel 3adad lForod lli dwezti Fhad lmada:");
		// 3dad lforod
		int n = reader.nextInt();
		// list syal n9at
		double[] n9atdForod = new double[n];
		// t3mar dyalha
		for (int i = 1; i < n+1; i++) {
			System.out.print("Dekhel ne9ta dyal lferd " + i + " :");
			n9atdForod[i-1] = reader.nextDouble();
		}
		// mjmo3n9at
		double s = 0.0;
		for (int i = 0; i < n; i++) {
			s = n9atdForod[i] + s;
		}
		// mo3edal lmada
		double mo3dalDlMadda = s / n;
		
		System.out.println("lmo3dal dyalek fl mada lwla howa :" + mo3dalDlMadda);
		
		return 0;
	}
	
	public static void main(String[]args) {
		//	int[] coefficient = new int[8];
		System.out.println("xhal mn mada ghathseblha ne9ta");
		for (int i = 0; i < reader.nextInt(); i++) {
			System.out.println("Dekhel lmadda lli ghathseblha n9atha");
			mo3dalHissabi();
		}
		System.out.println("End");
	}
 
}


/*
//	ArrayList<String> langAR = new ArrayList<String>(),
//	langFR = new ArrayList<String>(),
//	educationIslamic = new ArrayList<String>(),
//	histoire_Geographie = new ArrayList<String>(),
//	mathematique = new ArrayList<String>(),
//	phisic_Chimie = new ArrayList<String>(),
//	science_Vie_Terre = new ArrayList<String>(),
//	informatique = new ArrayList<String>();
//	while (true) {
//	langAR.add(reader.nextLine());
//	//itmaybeworkingwithasimplearray
//	}
*/