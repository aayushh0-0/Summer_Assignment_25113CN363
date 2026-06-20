import java.util.*;

public class Q81 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = sc.next();
        
        //Storing the Strings Character into Array
        char b[] = a.toCharArray();
        int len = 0;
        for (char letter : b) {
            len++;
        }
        System.out.println("Length of String is ~ " + len);
        sc.close();
    }
}