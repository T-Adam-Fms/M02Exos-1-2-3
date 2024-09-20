
*/2.2 Ajouter la possibilité de savoir si le nombre est pair ou impair


import java.util.Scanner; // Import the Scanner class

public class Test2 {


public static void main Test2 (String [] args){
	
	System.out.println( "enter a number:  ");
	
	Scanner scanner = new Scanner(System.in);
	
	double number = scanner.nextline();
	
		if (number < 0) {		
				System.out.println( "the number is negative" );		
				} else if (number > 0) {
							System.out.println( "the number is positive" );
							} else {
							  	System.out.println( "the number is Zero" );
							   	}
		
		if (number/ 2 == 0){
				System.out.println( "the number is even" );
				}else {
					System.out.println( "the number is odd" );
					}
		scanner.close();
}
				