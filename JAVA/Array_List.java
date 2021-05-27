package firstTests_;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		ArrayList<String> places = new ArrayList<String>();
		
		System.out.println("Tape four places' name you like.");
		
		for ( int i = 0; i<4; i++) {
		
			places.add(reader.nextLine());
			
		}
		
		System.out.println("The Places that you like are : " + places);
		
		System.out.println("remove one places of it");
		
		System.out.println("type '1' to remove the first places you enter; '2' to the second; '3'for the thurd; '4' for the fourth.");
		
		places.remove(reader.nextInt());
		
		System.out.println("the Three auter places are :" + places);

	}

}
