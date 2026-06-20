import java.util.*;

public class Q87 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String a = sc.nextLine().trim();

        char b[] = a.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        // Store frequency of each character
        for (char ch : b) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print character frequencies
        System.out.println("Frequencies of Character is ~ ");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getKey() == ' ') {
            } else {
                System.out.println(entry.getKey() + " --> " + entry.getValue());
            }
        }
        sc.close();
    }
}