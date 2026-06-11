import java.util.*;

public class Q63 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        int a[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter the Elements in Array ~ ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            map.put(a[i],0);
        }
        System.out.println("The Array is ~ ");
        for(int num:a)
        {
            System.out.print(num+" ");
        }
        System.out.println("\nEnter the Target for Sum Pair");
        int tar=sc.nextInt();
        for(int num:a)
        {
            int need=tar-num;
            if(map.containsKey(need))
            {
                System.out.println(num+" + "+need+" --> "+tar);
                map.remove(num);
            }
        }
        sc.close();
    }
}