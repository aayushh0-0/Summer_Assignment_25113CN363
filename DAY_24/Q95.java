import java.util.*;

public class Q95 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String a = sc.nextLine().trim();

        // Split sentence into words
        String b[] = a.split(" ");

        String longest = "";

        // Find the longest word
        for (String word : b) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        // Print the result
        System.out.println("Longest Word is ~ " + longest);

        sc.close();
    }
}