import java.util.*;
public class Q76 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Order of Square Matrix");
        int n = sc.nextInt();

        int a[][] = new int[n][n];

        // Input matrix elements
        System.out.println("Enter the Elements in Matrix ~");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int lSum = 0;
        int rSum = 0;

        // Calculate diagonal sums
        for (int i = 0; i < n; i++) {
            lSum += a[i][i];
            rSum += a[i][n - 1 - i];
        }

        // Print diagonal sums
        System.out.println("Left Diagonal Sum = " + lSum);
        System.out.println("Right Diagonal Sum = " + rSum);

        sc.close();
    }
}