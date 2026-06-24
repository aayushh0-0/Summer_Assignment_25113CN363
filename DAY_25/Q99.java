import java.util.*;

/*
Question:
Sort an Array of Strings in Alphabetical Order
*/

public class Q99 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Strings ~ ");
        int n = sc.nextInt();

        String a[] = new String[n];

        System.out.println("Enter the Strings ~ ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }

        Arrays.sort(a);

        System.out.println("\nStrings in Alphabetical Order ~ ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }
}