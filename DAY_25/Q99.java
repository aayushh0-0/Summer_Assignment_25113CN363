import java.util.*;
public class Q99
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array ~ ");
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}