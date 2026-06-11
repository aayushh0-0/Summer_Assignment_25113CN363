import java.util.*;
public class Q62
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        int a[] = new int[n];
        int maxfreq=0;
        int maxfreqnum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        System.out.println("Enter the Elements in Array ~ ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        System.out.println("Array is ~");
        for(int num:a)
        {
            System.out.print(num+" ");
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>maxfreq)
            {
                maxfreq=entry.getValue();
                maxfreqnum=entry.getKey();
            }
        }
        System.out.println("\nMaximum Frequency is of "+maxfreqnum+" i.e. "+maxfreq);
        sc.close();
    }
}