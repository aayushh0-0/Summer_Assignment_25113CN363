import java.util.*;

public class Q92 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String a = sc.nextLine().trim();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        // Store frequency of each character
        for (char ch : a.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int max = 0;

        // Find maximum frequency
        for (int val : map.values()) {
            if (val > max) {
                max = val;
            }
        }

        // Find the character having maximum frequency
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println("Maximum Occurrence is of ~ "
                        + entry.getKey() + " --> " + max);
                break;
            }
        }

        sc.close();
    }
}