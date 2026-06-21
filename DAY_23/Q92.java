import java.util.*;

public class Q92 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");

        // Remove leading, trailing and middle spaces
        String a = sc.nextLine().trim().replace(" ", "");
        System.out.println("String After Removing Space is ~ " + a);
        sc.close();
    }
}