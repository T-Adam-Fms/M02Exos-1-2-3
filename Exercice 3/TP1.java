//TP 1 : [BaseTP1Game] Écrire un programme demandant à l'utilisateur s'il souhaite jouer à notre 
//jeu, si non alors sortir du programme, si oui, alors proposer de saisir un chiffre entre 1 et 100 et dire 
//à chaque itération si le chiffre est plus petit ou plus grand. Une fois le chiffre trouvé, afficher un 
//message : vous avez trouvé en x coups !

//													STEPS TO CREAT THE PROGRAM

// creat file  and call liberaries class and main method

import java.util.scanner;
import java.math.random;

public class TP1 {
	public static void main (String [] args){
	
		//call the scanner Ask user (if he want play game)	and scan the answer
		
		Scanner scanner = new scanner(System.in);
		System.out.printline(" Do you wish to play GUESS NUMBER game:  YES, NO");
		String answer = scanner.nextLine().toLowercase();
		
		//If he answer YES ask him to type nr between 1&100 and read it
		System.out.printline(" Thank you for sharing, please type a number integer between 1&100:");
				
		// let the machine to generate a nr
		int catchNr= (int) (Math.random()*100 ) +1;
		
		// creat counter 
		int i = 0;
		
			while(givenNr != catchNr) {
				int givenNr = scanner.nextInt(); // in order to recognize the variable
				i++	//increment counter
								
				// comare the two nrs if user give lower ask him to gusee heiger and count the nr of try
				if(givenNr > catchNr) 
					System.out.printline("Try a lower nr");
				
				// comare the two nrs if user give heiger ask him to gusee lower and count the nr of try
				if(givenNr < catchNr) 
					System.out.printline("Try a heiger nr");
					
			}
			
			// if the user give the right nr " congratulate him telling "u succeeded after X trying nrs
			System.out.printline("Congratualtion, you found the good nr in"+ " "+ i +" "+ " tries");
			
			// ask user to try another game
			System.out.printline("Do you want try another round:");
			
			String answer = scanner.nextLine().toLowercase();
			
			
	}
	System.out.printline("GOOD BYE");

}




// ask user to try another game
