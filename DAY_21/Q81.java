import java.util.*;

public class Q81 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String ~ ");
        String a = sc.next();

        // Store string characters into an array
        char b[] = a.toCharArray();

        int len = 0;

        // Count characters manually
        for (char ch : b) {
            len++;
        }

        System.out.println("Length of the String ~ " + len);

        sc.close();
    }
}