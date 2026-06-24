import java.util.*;

public class Q103{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        double balance = 10000.00;

        System.out.println("=================================");
        System.out.println("         ATM SIMULATION");
        System.out.println("=================================");

        System.out.print("Enter Your PIN ~ ");
        
        // Prevent crash if PIN input is not an integer
        if (!sc.hasNextInt()) {
            System.out.println("\nInvalid Input! PIN must be numbers only.");
            sc.close();
            return;
        }
        
        int pin = sc.nextInt();

        if (pin != correctPin) {
            System.out.println("\nInvalid PIN! Access Denied.");
            sc.close();
            return;
        }

        System.out.println("\nLogin Successful!");

        while (true) {
            System.out.println("\n=================================");
            System.out.println("            MAIN MENU");
            System.out.println("=================================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("=================================");
            System.out.print("Enter Your Choice ~ ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        // %.2f formats the double to exactly 2 decimal places
                        System.out.printf("\nCurrent Balance ~ Rs. %.2f\n", balance);
                        break;

                    case 2:
                        System.out.print("\nEnter Amount to Deposit ~ Rs. ");
                        double deposit = sc.nextDouble();

                        if (deposit <= 0) {
                            System.out.println("Invalid Amount!");
                        } else {
                            balance += deposit;
                            System.out.println("Amount Deposited Successfully.");
                            System.out.printf("Updated Balance ~ Rs. %.2f\n", balance);
                        }
                        break;

                    case 3:
                        System.out.print("\nEnter Amount to Withdraw ~ Rs. ");
                        double withdraw = sc.nextDouble();

                        if (withdraw <= 0) {
                            System.out.println("Invalid Amount!");
                        } else if (withdraw > balance) {
                            System.out.println("Insufficient Balance!");
                        } else {
                            balance -= withdraw;
                            System.out.println("Amount Withdrawn Successfully.");
                            System.out.printf("Remaining Balance ~ Rs. %.2f\n", balance);
                        }
                        break;

                    case 4:
                        System.out.println("\nThank You For Using Our ATM.");
                        System.out.println("Visit Again!");
                        sc.close();
                        return;

                    default:
                        System.out.println("\nInvalid Choice! Please Try Again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nCritical Error: Please enter numbers only!");
                sc.nextLine(); // Clear the bad input from the scanner buffer
            }
        }
    }
}