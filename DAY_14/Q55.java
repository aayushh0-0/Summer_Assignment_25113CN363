import java.util.*;
public class Q55
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Elements of Array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array is ~ ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        int lar= a[0];
        int seclar=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>lar)
            {
                seclar=a[i];
                if(seclar<lar)
                {
                    lar=seclar;
                    seclar=a[i];
                }
            }
        }
        System.out.println("\nSecond Largest Element is ~ "+seclar);
    }
}