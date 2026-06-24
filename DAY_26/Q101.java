import java.util.*;

/*
Question:
Number Guessing Game
*/

public class Q101 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        // Generate a random number between 1 and 100
        int target = rand.nextInt(100) + 1;

        int guess;
        int attempts = 0;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Guess a Number Between 1 and 100");

        while (true) {
            System.out.print("\nEnter Your Guess ~ ");
            guess = sc.nextInt();

            attempts++;

            if (guess < target) {
                System.out.println("📉 Too Low! Try Again.");
            } else if (guess > target) {
                System.out.println("📈 Too High! Try Again.");
            } else {
                System.out.println("\n🎉 Congratulations!");
                System.out.println("You Guessed the Correct Number ~ " + target);
                System.out.println("Total Attempts ~ " + attempts);
                break;
            }
        }

        sc.close();
    }
}