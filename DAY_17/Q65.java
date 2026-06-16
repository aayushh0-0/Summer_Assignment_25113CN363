import java.util.*;

public class Q65 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array 1");
        int m = sc.nextInt();
        int a[] = new int[m];

        System.out.println("Enter the Size of Array 2");
        int n = sc.nextInt();
        int b[] = new int[n];

        // Input first array
        System.out.println("Enter the Elements in First Array");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        // Input second array
        System.out.println("Enter the Elements in Second Array");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // Create merged array
        int c[] = new int[m + n];
        int j = 0;

        // Copy elements into merged array
        for (int i = 0; i < m + n; i++) {
            if (i < m) {
                c[i] = a[i];
            } else {
                c[i] = b[j];
                j++;
            }
        }

        // Display merged array
        System.out.println("The Merged Array is ~ ");
        for (int i = 0; i < m + n; i++) {
            System.out.print(c[i] + " ");
        }

        sc.close();
    }
}