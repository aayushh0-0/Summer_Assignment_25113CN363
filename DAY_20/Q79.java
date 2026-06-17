import java.util.*;

public class Q79 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rows");
        int m = sc.nextInt();

        System.out.println("Enter the Number of Columns");
        int n = sc.nextInt();

        int a[][] = new int[m][n];

        // Input matrix elements
        System.out.println("Enter the Elements in Matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        System.out.println("The Matrix is ~ ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of Rows is ~ ");
        int sum = 0;

        for (int i = 0; i < m; i++) {
            sum = 0;

            for (int j = 0; j < n; j++) {
                sum += a[i][j];
            }

            System.out.println("Row " + (i + 1) + " ~ " + sum);
        }

        sc.close();
    }
}