import java.util.*;

public class Q88 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = sc.nextLine().trim();
        System.out.println("String after Removing Space is ~ ");
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                continue;
            }
            System.out.print(a.charAt(i));
        }
        sc.close();
    }
}