import java.util.*;

public class Q91 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String");
        String a = sc.nextLine().replace(" ", "").toLowerCase();

        System.out.println("Enter Second String");
        String b = sc.nextLine().replace(" ", "").toLowerCase();

        // If lengths are different, strings cannot be anagrams
        if (a.length() != b.length()) {
            System.out.println("String is Not Anagram");
            sc.close();
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of first string
        for (char ch : a.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Decrease frequency using second string
        for (char ch : b.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        // Check whether all frequencies become 0
        for (int val : map.values()) {
            if (val != 0) {
                System.out.println("String is Not Anagram");
                sc.close();
                return;
            }
        }

        System.out.println("String is Anagram");

        sc.close();
    }
}