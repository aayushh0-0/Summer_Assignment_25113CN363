import java.util.*;

public class Q77 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rows of Matrix 1");
        int r1 = sc.nextInt();

        System.out.println("Enter the Number of Columns of Matrix 1");
        int c1 = sc.nextInt();

        int a[][] = new int[r1][c1];

        // Input first matrix
        System.out.println("Enter the Elements in Matrix 1");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the Number of Rows of Matrix 2");
        int r2 = sc.nextInt();

        System.out.println("Enter the Number of Columns of Matrix 2");
        int c2 = sc.nextInt();

        int b[][] = new int[r2][c2];

        // Input second matrix
        System.out.println("Enter the Elements in Matrix 2");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Check if multiplication is possible
        if (c1 != r2) {
            System.out.println("Matrix Multiplication is Not Possible");
            sc.close();
            return;
        }

        int c[][] = new int[r1][c2];

        // Matrix multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Print resultant matrix
        System.out.println("Matrix Multiplication is ~");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}