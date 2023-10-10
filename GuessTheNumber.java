import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean isGuessed = false;

        while (!isGuessed) {
            System.out.println("Guess the number between 1 and 100:");
            int userNumber = scanner.nextInt();
            attempts++;

            if (userNumber == randomNumber) {
                isGuessed = true;
                System.out.println("Congratulations! You guessed the correct number.");
            } else if (userNumber < randomNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        }

        System.out.println("It took you " + attempts + " attempts to guess the correct number.");
        scanner.close();
    }
}