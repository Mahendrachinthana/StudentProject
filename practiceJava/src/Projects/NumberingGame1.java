package Projects;
import java.util.Random;
import java.util.Scanner;

public class NumberingGame1 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Please enter a number between 1 and 1000:");

        Random obj = new Random();
        int randomNumber = obj.nextInt(1000) + 1; // Add 1 to avoid generating 0

        int guess;
        int attempts = 0;
        boolean hasGuessed = false;

        while (!hasGuessed) {
            guess = sc.nextInt();
            attempts++;

            // Check if the guess is correct
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                hasGuessed = true;
            } else if (guess < randomNumber) {
                System.out.println("Too low. Try again:");
            } else {
                System.out.println("Too high. Try again:");
            }
        }
        sc.close(); 
    }
}


