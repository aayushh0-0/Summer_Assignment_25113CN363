import java.util.*;
public class Q64
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        int a[] = new int[n];
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Enter the Elements in Array ~ ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            set.add(a[i]);
        }

        for(int num:set)
        {
            System.out.print(num+" ");
        }
        sc.close();
    }
}