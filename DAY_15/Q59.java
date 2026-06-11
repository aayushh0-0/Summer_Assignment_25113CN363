import java.util.*;
public class Q59
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Elements in Array ~ ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println(" Original Array is ~ ");
        for(int num:a)
        {
            System.out.print(num+" ");
        }
        
        System.out.println("\nEnter the Value of k by Which you want to Right Rotate an Array ~ ");
        int k=sc.nextInt();
        k=k%n;
        reverse(a,k+1,n-1);
        reverse(a,0,k);
        reverse(a,0,n-1);

         System.out.println(" Right Rotated Array is ~ ");
        for(int num:a)
        {
            System.out.print(num+" ");
        }

    }
    static void reverse(int a[],int l,int r)
    {
        while(l<r)
        {
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
    }
}