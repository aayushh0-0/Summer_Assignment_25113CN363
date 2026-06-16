import java.util.*;

public class Q72 {
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

        // Bubble Sort in Descending Order
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if current element is smaller than next element
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted Array in Descending Order is ~ ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}