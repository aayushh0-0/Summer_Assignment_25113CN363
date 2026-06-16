import java.util.*;

public class Q67 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of First Array");
        int m = sc.nextInt();

        System.out.println("Enter the Size of Second Array");
        int n = sc.nextInt();

        // Store unique elements of both arrays
        HashSet<Integer> seta = new HashSet<>();
        HashSet<Integer> setb = new HashSet<>();

        System.out.println("Enter the Elements in First Array");
        for (int i = 0; i < m; i++) {
            seta.add(sc.nextInt());
        }

        System.out.println("Enter the Elements in Second Array");
        for (int i = 0; i < n; i++) {
            setb.add(sc.nextInt());
        }

        // Print common elements
        System.out.println("Intersection is ~");
        for (int num : seta) {
            if (setb.contains(num)) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}