
// • 1.2 puis ajouter "quel est votre nom ?" + saisir le nom puis afficher "salut nom" // 


import java.util.Scanner; // Import the Scanner class

public class HelloB {

	public static void main (String [] args){
		
		System.out.println("bonjour et bienvenu dans mon programme java");
	
		System.out.println ( "quel est votre nom ?:    " ) ;
	
		Scanner in = new Scanner(System.in);

		String name = in.nextLine();

		System.out.println ( "salut" + " " + name);
		
		in.close();// bon pratique
	
		}
}

// Save , compile, run
