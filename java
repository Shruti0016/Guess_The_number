import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 5;
        int score = 0;
        
        boolean playAgain = true;
        
        while (playAgain) {
            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Guess the number between " + minRange + " and " + maxRange + ":");
            int attempts = 0;
            
            while (attempts < attemptsLimit) {
                int guess = scanner.nextInt();
                attempts++;
                
                if (guess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (guess < generatedNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            
            if (attempts == attemptsLimit) {
                System.out.println("Oops! You've reached the maximum number of attempts. The number was: " + generatedNumber);
            }
  System.out.println("Your current score: " + score);
            System.out.println("Do you want to play again? (yes/no)");
            String playAgainChoice = scanner.next();
            playAgain = playAgainChoice.equalsIgnoreCase("yes");
        }
        
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
