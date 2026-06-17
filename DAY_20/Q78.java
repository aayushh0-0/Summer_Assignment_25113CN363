import java.util.*;

public class Q78 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Matrix");
        int n = sc.nextInt();

        int a[][] = new int[n][n];

        // Input matrix elements
        System.out.println("Enter the Elements in Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        System.out.println("The Matrix is ~ ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        boolean sym = true;

        // Check whether a[i][j] is equal to a[j][i]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    sym = false;
                    break;
                }
            }
        }

        // Print the result
        if (sym) {
            System.out.println("Matrix is Symmetric");
        } else {
            System.out.println("Oops!, Matrix is Not Symmetric");
        }

        sc.close();
    }
}