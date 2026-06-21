import java.util.*;

public class Q90 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String a = sc.nextLine().trim();

        HashSet<Character> set = new HashSet<>();

        // Find the first repeating character
        for (char ch : a.toCharArray()) {
            if (set.contains(ch)) {
                System.out.println("First Repeating Character is ~ " + ch);
                sc.close();
                return;
            }

            set.add(ch);
        }

        // If no repeating character exists
        System.out.println("No Repeating Character Found");

        sc.close();
    }
}