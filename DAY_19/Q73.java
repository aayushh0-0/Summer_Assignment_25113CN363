import java.util.*;

public class Q73 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rows in Matrix");
        int m = sc.nextInt();

        System.out.println("Enter the Number of Columns in Matrix");
        int n = sc.nextInt();

        int a[][] = new int[m][n];
        int b[][] = new int[m][n];

        // Input first matrix
        System.out.println("Enter the Elements in Matrix 1 ~");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter the Elements in Matrix 2 ~");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Store the sum in the first matrix itself
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = a[i][j] + b[i][j];
            }
        }

        // Print the resultant matrix
        System.out.println("Addition of Matrix is ~");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}