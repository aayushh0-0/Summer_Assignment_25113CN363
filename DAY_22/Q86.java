import java.util.*;
public class Q86 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = sc.nextLine();
        String b[] = a.split(" ");
        System.out.println("Number of Words is ~ "+b.length);
        sc.close();
    }
}