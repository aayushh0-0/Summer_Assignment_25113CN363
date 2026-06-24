import java.util.*;

/*
Question:
Quiz Application
*/

public class Q104 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("=================================");
        System.out.println("         QUIZ APPLICATION");
        System.out.println("=================================");

        // Question 1
        System.out.println("\nQ1. What is the Capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");
        System.out.print("Enter Your Answer ~ ");
        int ans1 = sc.nextInt();

        if (ans1 == 2) {
            score++;
            System.out.println("Correct Answer!");
        } else {
            System.out.println("Wrong Answer! Correct Answer is Delhi.");
        }

        // Question 2
        System.out.println("\nQ2. Which Language is Used for Android Development?");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C");
        System.out.println("4. HTML");
        System.out.print("Enter Your Answer ~ ");
        int ans2 = sc.nextInt();

        if (ans2 == 1) {
            score++;
            System.out.println("Correct Answer!");
        } else {
            System.out.println("Wrong Answer! Correct Answer is Java.");
        }

        // Question 3
        System.out.println("\nQ3. Which Data Structure Stores Key-Value Pairs?");
        System.out.println("1. Array");
        System.out.println("2. Stack");
        System.out.println("3. HashMap");
        System.out.println("4. Queue");
        System.out.print("Enter Your Answer ~ ");
        int ans3 = sc.nextInt();

        if (ans3 == 3) {
            score++;
            System.out.println("Correct Answer!");
        } else {
            System.out.println("Wrong Answer! Correct Answer is HashMap.");
        }

        // Question 4
        System.out.println("\nQ4. Which Loop Executes At Least Once?");
        System.out.println("1. for");
        System.out.println("2. while");
        System.out.println("3. do-while");
        System.out.println("4. enhanced for");
        System.out.print("Enter Your Answer ~ ");
        int ans4 = sc.nextInt();

        if (ans4 == 3) {
            score++;
            System.out.println("Correct Answer!");
        } else {
            System.out.println("Wrong Answer! Correct Answer is do-while.");
        }

        // Question 5
        System.out.println("\nQ5. What is the Size of int in Java?");
        System.out.println("1. 2 Bytes");
        System.out.println("2. 4 Bytes");
        System.out.println("3. 8 Bytes");
        System.out.println("4. 16 Bytes");
        System.out.print("Enter Your Answer ~ ");
        int ans5 = sc.nextInt();

        if (ans5 == 2) {
            score++;
            System.out.println("Correct Answer!");
        } else {
            System.out.println("Wrong Answer! Correct Answer is 4 Bytes.");
        }

        double percentage = (score * 100.0) / 5;

        System.out.println("\n=================================");
        System.out.println("           QUIZ RESULT");
        System.out.println("=================================");
        System.out.println("Score      ~ " + score + "/5");
        System.out.println("Percentage ~ " + percentage + "%");

        if (percentage >= 80) {
            System.out.println("Performance ~ Excellent");
        } else if (percentage >= 60) {
            System.out.println("Performance ~ Good");
        } else if (percentage >= 40) {
            System.out.println("Performance ~ Average");
        } else {
            System.out.println("Performance ~ Needs Improvement");
        }

        System.out.println("\nThank You For Playing!");

        sc.close();
    }
}