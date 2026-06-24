import java.util.*;

/*
Question:
Sort an Array of Strings According to Their Length
*/

public class Q100 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Strings ~ ");
        int n = sc.nextInt();

        String a[] = new String[n];

        System.out.println("Enter the Strings ~ ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.next().trim();
        }

        // Sort strings according to their length
        Arrays.sort(a, (x, y) -> x.length() - y.length());

        System.out.println("\nStrings Sorted According to Length ~ ");

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }
}