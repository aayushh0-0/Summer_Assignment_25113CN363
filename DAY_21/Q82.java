import java.util.*;

public class Q82 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // for taking a Whole Sentence
        System.out.println("Enter a String");
        String a = sc.nextLine();
        char b[] = a.toCharArray();


        // Using Double Pointer
        int l = 0;
        int r = a.length() - 1;
        while (l < r) {
            char temp = b[l];
            b[l] = b[r];
            b[r] = temp;

            l++;
            r--;
        }

        
        System.out.println("Reversed String is ~ "+ new String(b));
        sc.close();
    }
}