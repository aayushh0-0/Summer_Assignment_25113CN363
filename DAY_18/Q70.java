import java.util.*;

public class Q70 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        int a[] = new int[n];

        // Input array elements
        System.out.println("Enter the Elements in Array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            // Find the smallest element
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            // Swap elements
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        // Print sorted array
        System.out.println("Sorted Array is ~ ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}