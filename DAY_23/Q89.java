import java.util.*;

public class Q89 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String a = sc.nextLine();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        // Store frequency of each character
        for (char ch : a.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find the first non-repeating character
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First Non Repeating Character is ~ " + entry.getKey());
                sc.close();
                return;
            }
        }

        // If no non-repeating character exists
        System.out.println("No Non Repeating Character Found");

        sc.close();
    }
}