import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Generate a random number between 1 and 100
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generate number between 1 and 100
        
        // Variables to store user's guess and number of attempts
        int guess;
        int attempts = 0;
        
        // Prompt the user to guess the number
        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            // Check if the guess is correct, too low, or too high
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
            } else if (guess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        } while (guess != randomNumber);
        
        // Close the Scanner object
        scanner.close();
    }
}
