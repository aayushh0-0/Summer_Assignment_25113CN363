import java.util.*;

public class Q83 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String a = sc.next().toLowerCase();

        int vow = 0;
        int con = 0;

        // Count vowels and consonants
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                vow++;
            }

            // Check for consonants
            else if (ch >= 'a' && ch <= 'z') {
                con++;
            }
        }

        // Print the result
        System.out.println("Number of Vowels     ~ " + vow);
        System.out.println("Number of Consonants ~ " + con);

        sc.close();
    }
}