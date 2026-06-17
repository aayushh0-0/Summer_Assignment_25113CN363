import java.util.*;

public class Q80 {
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

        // Print column-wise sums
        System.out.println("Column-wise Sum is ~");
        for (int j = 0; j < n; j++) {
            int cSum = 0;

            for (int i = 0; i < m; i++) {
                cSum += a[i][j];
            }

            System.out.println("Column " + (j + 1) + " ~ " + cSum);
        }

        sc.close();
    }
}