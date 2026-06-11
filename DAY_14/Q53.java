import java.util.*;

public class Q53 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Elements in Array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array is");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the Element you Want to Search");
        int tar = sc.nextInt();
        int pos = 0;
        boolean search = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == tar) {
                search = true;
                pos = i;
            }
        }
        if (search) {
            System.out.println("Number Found! at index position ~ " + pos);
        } else {
            System.out.println("Number Not Found!");

        }
        sc.close();
    }
}