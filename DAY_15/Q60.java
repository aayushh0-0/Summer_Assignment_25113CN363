import java.util.*;

public class Q60 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the Elements in Array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Original Array is ~ ");
        for (int num : a) {
            System.out.print(num + " ");
        }

        int j = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }

        System.out.println("\nArray after moving zeros to end ~ ");
        for (int num : a) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}