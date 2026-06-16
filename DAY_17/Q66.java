import java.util.*;
public class Q66
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of First Array");
        int m=sc.nextInt();
        System.out.println("Enter the Size of Second Array");
        int n=sc.nextInt();
        HashSet<Integer> seta = new HashSet<>();
        System.out.println("Enter the Elements in First Array");
        for(int i = 0; i < m; i++)
        {
            int num=sc.nextInt();
            seta.add(num);
        }
        HashSet<Integer> setb = new HashSet<>();
        System.out.println("Enter the Elements in First Array");
        for(int i = 0; i < n; i++)
        {
            int num=sc.nextInt();
            setb.add(num);
        }
        HashSet<Integer> setc = new HashSet<>();
        for(int num : seta)
        {
            setc.add(num);
        }
        for(int num : setb)
        {
            setc.add(num);
        }
        System.out.println("Union is ~ ");
        for(int num : setc)
        {
            System.out.print(num+" " );
        }
        sc.close();
    }
}