import java.util.*;

public class Q92 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a=sc.nextLine().trim();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char ch:a.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max=0;
        for(int val:map.values())
        {
            if(val>max)
            {
                max=val;
            }
        }
        System.out.println("Maximum Occurence is of ~ "+map.keySet(max));
    }
}