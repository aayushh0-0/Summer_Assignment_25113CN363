import java.util.*;

public class Q100 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array ~ ");
        int n = sc.nextInt();
        System.out.println("Enter the Strings ~ ");
        String a[] = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        
        Arrays.sort(a, (x, y) -> x.length() - y.length());
        System.out.println("Sorted ~");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        sc.close();
    }
}