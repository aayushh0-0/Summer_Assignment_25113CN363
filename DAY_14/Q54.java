import java.util.*;

public class Q54
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements in Array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The Array is ~ ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num :a)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println("Frequency of ~ "+entry.getKey()+" --> "+entry.getValue());
        }
        sc.close();
    }
}
