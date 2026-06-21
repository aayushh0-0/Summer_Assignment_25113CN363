import java.util.*;

public class Q94 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String a = sc.nextLine() + " ";

        int count = 1;

        // Count consecutive characters
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == a.charAt(i + 1)) {
                count++;
            } else {
                // Print character and its frequency
                System.out.print(a.charAt(i) + "" + count);
                count = 1;
            }
        }

        sc.close();
    }
}