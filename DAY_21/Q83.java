import java.util.*;
public class Q83
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a= sc.next().toLowerCase();
        int vow=0;
        int con=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
            {
                vow++;
            }
            else
            {
                con++;
            }
        }
        System.out.println("Number of Vowels     ~ "+vow);
        System.out.println("Number of Consonants ~ "+con);
        sc.close();
    }
}