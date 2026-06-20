import java.util.*;
public class Q81
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = sc.next();
        char b[] = a.toCharArray();
        int count=0;
        for(char letter : b)
        {
            count++;
        }
        System.out.println("Length of String is ~ " +count);
    }
}