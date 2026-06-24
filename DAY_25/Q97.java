import java.util.*;

/*
Question:
Merge Two Sorted Arrays
*/

public class Q97 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of First Array ~ ");
        int m = sc.nextInt();

        int a[] = new int[m];

        System.out.println("Enter the Size of Second Array ~ ");
        int n = sc.nextInt();

        int b[] = new int[n];

        System.out.println("Enter the Elements of First Array ~ ");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the Elements of Second Array ~ ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int c[] = new int[m + n];
        int j = 0;

        for (int i = 0; i < (m + n); i++) {
            if (i < m) {
                c[i] = a[i];
            } else {
                c[i] = b[j];
                j++;
            }
        }

        Arrays.sort(c);

        System.out.println("\nMerged Sorted Array ~ ");
        for (int i = 0; i < (m + n); i++) {
            System.out.print(c[i] + " ");
        }

        sc.close();
    }
}