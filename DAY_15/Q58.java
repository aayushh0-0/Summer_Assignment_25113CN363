import java.util.*;

public class Q58 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the Elements in Array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Original Array");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        // using Two Pointers

        System.out.println("\nEnter the Value of K to be Left Rotated");
        int k = sc.nextInt();
        k=k%n;                   //for Avoiding Out of Bound Exception
        reverse(a,0,k-1);     //reversing the First Array till k  
        reverse(a,k,n-1);       //reversing the second Array till n from k 
        reverse(a,0,n-1);    //reversing the Entire Array

        System.out.println("Rotated Array");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }

    static void reverse(int a[], int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}