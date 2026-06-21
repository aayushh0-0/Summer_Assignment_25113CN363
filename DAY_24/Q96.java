import java.util.*;

public class Q96 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String ~ ");
        String a = sc.next().trim();

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // Store only unique characters while preserving order
        for (char ch : a.toCharArray()) {
            set.add(ch);
        }

        // Print the string after removing duplicates
        System.out.println("\nString After Removing Duplicate Characters ~ ");
        for (char ch : set) {
            System.out.print(ch);
        }

        sc.close();
    }
}