import java.util.*;

public class Q93 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String");
        String a = sc.next().trim().toLowerCase();

        System.out.println("Enter Second String");
        String b = sc.next().trim().toLowerCase();

        // Lengths must be equal
        if (a.length() != b.length()) {
            System.out.println("Oops!, Not a Rotation");
            sc.close();
            return;
        }

        String temp = a.concat(a);
        // Check rotation
        if (temp.contains(b)) {
            System.out.println(b + " is Rotation of ~ " + a);
        } else {
            System.out.println("Oops!, Not a Rotation");
        }
        sc.close();
    }
}