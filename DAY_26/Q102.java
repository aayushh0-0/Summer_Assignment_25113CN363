import java.util.*;

/*
Question:
Voting Eligibility System
*/

public class Q102 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name ~ ");
        String name = sc.nextLine().trim();

        System.out.println("Enter Your Age ~ ");
        int age = sc.nextInt();

        System.out.println("\nVoting Eligibility Result ~ ");

        if (age >= 18) {
            System.out.println("Congratulations " + name + "!");
            System.out.println("You Are Eligible to Vote. ✅");
        } else {
            System.out.println("Sorry " + name + "!");
            System.out.println("You Are Not Eligible to Vote. ❌");
            System.out.println("You Can Vote After " + (18 - age) + " Year(s).");
        }

        sc.close();
    }
}