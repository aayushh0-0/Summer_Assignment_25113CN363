import java.util.*;

/*
Question: Menu Driven Calculator
*/

public class Q113 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        
        while (true) {
            System.out.println("\n===== CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            
            if (ch == 6) {
                System.out.println("Bye!");
                break;
            }
            
            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();
            
            if (ch == 1) {
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
            }
            else if (ch == 2) {
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
            }
            else if (ch == 3) {
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
            }
            else if (ch == 4) {
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                }
            }
            else if (ch == 5) {
                result = num1 % num2;
                System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
            }
            else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}