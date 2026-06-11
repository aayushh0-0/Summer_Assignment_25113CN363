import java.util.*;

public class Q61 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        int a[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter the Value of Array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            map.put(a[i], 1);
        }
        System.out.println("Array is ~ ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nNumbers Not Present Are ~ ");
        for (int i = 1; i <= a[n-1]; i++) {
            if (!map.containsKey(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}