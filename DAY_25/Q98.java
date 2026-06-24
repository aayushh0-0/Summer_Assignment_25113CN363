import java.util.*;
public class Q98
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String ~ ");
        String a=sc.nextLine();
        System.out.println("Enter Second String ~ ");
        String b=sc.nextLine();
        LinkedHashSet<Character> seta = new LinkedHashSet<>();
        LinkedHashSet<Character> setb = new LinkedHashSet<>();
        System.out.println("Common Characters Are ~");
        for(char ch :b.toCharArray())
        {
            seta.add(ch);
        }
        for(char ch :a.toCharArray())
        {
            if(seta.contains(ch))
            {
                setb.add(ch);
            }
        }
        for(char ch :setb)
        {
            System.out.print(ch);
        }
    }
}