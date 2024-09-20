//2.1 Écrivez une classe "Test.java", ajouter une méthode main qui lit un nombre entier et 
//indique s'il est positif, négatif ou s'il vaut zéro (n’oubliez pas de gérer l’interaction)



import java.util.Scanner; // Import the Scanner class

public class Test1 {

    public static void main(String[] args) {
        // Prompt the user to enter a number
        System.out.println("Enter a number: ");

        // Initialize the scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Read the integer input from the user
if (scanner.hasNextInt()) {
            int number = scanner.nextIine();

            // Check if the number is positive, negative, or zero
            if (number < 0) {
                System.out.println("The number is negative.");
            } else if (number > 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("The number is zero.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        // Close the scanner
        scanner.close();
    }
}		