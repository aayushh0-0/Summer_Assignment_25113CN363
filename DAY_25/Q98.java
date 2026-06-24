import java.util.*;

/*
Question:
Find Common Characters Between Two Strings

Example:
String 1 = programming
String 2 = gaming

Output:
gamin
*/

public class Q98 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String ~ ");
        String a = sc.nextLine().toLowerCase().replace(" ", "");

        System.out.println("Enter Second String ~ ");
        String b = sc.nextLine().toLowerCase().replace(" ", "");

        // Check for empty strings
        if (a.isEmpty() || b.isEmpty()) {
            System.out.println("Invalid Input! String Cannot Be Empty.");
            sc.close();
            return;
        }

        LinkedHashSet<Character> seta = new LinkedHashSet<>();
        LinkedHashSet<Character> setb = new LinkedHashSet<>();

        // Store characters of second string
        for (char ch : b.toCharArray()) {
            seta.add(ch);
        }

        // Find common characters
        for (char ch : a.toCharArray()) {
            if (seta.contains(ch)) {
                setb.add(ch);
            }
        }

        System.out.println("\nCommon Characters ~ ");

        // Edge Case: No common characters found
        if (setb.isEmpty()) {
            System.out.println("No Common Characters Found!");
            sc.close();
            return;
        }

        // Print common characters
        for (char ch : setb) {
            System.out.print(ch);
        }

        sc.close();
    }
}