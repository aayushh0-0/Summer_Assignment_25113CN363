import java.util.*;

public class Q85 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String a = sc.nextLine();

        boolean palin = true;

        // Using Two Pointers
        int l = 0;
        int r = a.length() - 1;

        while (l < r) {
            if (a.charAt(l) != a.charAt(r)) {
                palin = false;
                break;
            }

            l++;
            r--;
        }

        // Print the result
        if (palin) {
            System.out.println("Yes, It is Palindrome String");
        } else {
            System.out.println("No, It is Not Palindrome String");
        }

        sc.close();
    }
}