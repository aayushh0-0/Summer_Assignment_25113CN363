import java.util.*;

public class Q67 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of First Array");
        int m = sc.nextInt();
        int a[] = new int[m];
        System.out.println("Enter the Size of Second Array");
        int n = sc.nextInt();
        int b[] = new int[n];
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter the  Elements in Array 1");
        for (int num : a) {
            num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("Enter the  Elements in Array 1");
        for (int num : b) {
            num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("Intersection is ~");
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.print(entry.getKey()+" ");
            }
        }
        sc.close();
    }
}