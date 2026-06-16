import java.util.*;
public class Q73
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows in Matrix");
        int m=sc.nextInt();
        System.out.println("Enter the number of Columns in Matrix");
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        System.out.println("Enter the Elements in Matrix 1 ~");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the Elements in Matrix 2 ~");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Addition of Matrix is ~ ");
        int c[][]= new int [m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}