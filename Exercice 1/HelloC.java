// • 1.3 faire de même pour le prénom pour obtenir par ex : "bienvenu nom prénom !"




import java.util.Scanner; // Import the Scanner class

	public class HelloC{

		public static void main (String [] args){
		
		System.out.println("bonjour et bienvenu dans mon programme java");
	
		System.out.println ( "quel est votre nom ?" ) ;
	
		Scanner scanner = new Scanner(System.in);

		String nom = scanner.nextLine();
		
		System.out.println ( "quel est votre prénom ?" ) ;

		String prenom = scanner.nextLine();

		System.out.println( "bienvenue" + "  " + nom + " " + prenom);
	
		scanner.close();
	
	
		}
	}

// Save  compile run
