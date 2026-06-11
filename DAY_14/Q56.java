import java.util.*;
public class Q56
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        int a[] = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean dupcheck=false;
        System.out.println("Enter the Elements in Array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        System.out.println("Duplicates are ~");
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>1)
            {
                dupcheck=true;
                System.out.print(entry.getKey()+" ");
            }
        }
        if(!dupcheck)
        {
            System.out.println("No Duplicates Found");
        }
    }
}