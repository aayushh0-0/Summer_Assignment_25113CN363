import java.util.*;

public class Q75 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rows in Matrix");
        int m = sc.nextInt();

        System.out.println("Enter the Number of Columns in Matrix");
        int n = sc.nextInt();

        int a[][] = new int[m][n];

        // Input matrix elements
        System.out.println("Enter the Elements in Matrix ~");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Store transpose of matrix
        int t[][] = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                t[j][i] = a[i][j];
            }
        }

        // Print transpose matrix
        System.out.println("Transpose of Matrix is ~");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}