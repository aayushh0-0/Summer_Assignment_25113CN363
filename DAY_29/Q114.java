import java.util.*;

/*
Question: Array Operations Management System
*/

public class Q114 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n = 0;
        
        while (true) {
            System.out.println("\n===== ARRAY OPERATIONS =====");
            System.out.println("1. Create Array");
            System.out.println("2. Display");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete at Position");
            System.out.println("5. Search");
            System.out.println("6. Sort");
            System.out.println("7. Reverse");
            System.out.println("8. Statistics");
            System.out.println("9. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                System.out.print("Enter size: ");
                n = sc.nextInt();
                System.out.println("Enter " + n + " elements:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("Array created!");
            }
            else if (ch == 2) {
                if (n == 0) {
                    System.out.println("Array is empty");
                } else {
                    System.out.print("Array: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                }
            }
            else if (ch == 3) {
                if (n >= 100) {
                    System.out.println("Array full!");
                    continue;
                }
                System.out.print("Enter position (0 to " + n + "): ");
                int pos = sc.nextInt();
                if (pos < 0 || pos > n) {
                    System.out.println("Invalid position");
                    continue;
                }
                System.out.print("Enter value: ");
                int val = sc.nextInt();
                for (int i = n; i > pos; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[pos] = val;
                n++;
                System.out.println("Inserted!");
            }
            else if (ch == 4) {
                if (n == 0) {
                    System.out.println("Array is empty");
                    continue;
                }
                System.out.print("Enter position (0 to " + (n-1) + "): ");
                int pos = sc.nextInt();
                if (pos < 0 || pos >= n) {
                    System.out.println("Invalid position");
                    continue;
                }
                for (int i = pos; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                n--;
                System.out.println("Deleted!");
            }
            else if (ch == 5) {
                if (n == 0) {
                    System.out.println("Array is empty");
                    continue;
                }
                System.out.print("Enter value to search: ");
                int val = sc.nextInt();
                int found = -1;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == val) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.println("Found at position " + found);
                }
            }
            else if (ch == 6) {
                if (n == 0) {
                    System.out.println("Array is empty");
                    continue;
                }
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.println("Sorted!");
            }
            else if (ch == 7) {
                if (n == 0) {
                    System.out.println("Array is empty");
                    continue;
                }
                for (int i = 0; i < n / 2; i++) {
                    int temp = arr[i];
                    arr[i] = arr[n - 1 - i];
                    arr[n - 1 - i] = temp;
                }
                System.out.println("Reversed!");
            }
            else if (ch == 8) {
                if (n == 0) {
                    System.out.println("Array is empty");
                    continue;
                }
                int sum = 0, max = arr[0], min = arr[0];
                for (int i = 0; i < n; i++) {
                    sum += arr[i];
                    if (arr[i] > max) max = arr[i];
                    if (arr[i] < min) min = arr[i];
                }
                System.out.println("\n+------------------+------------------+");
                System.out.printf("| %-16s | %-16s |\n", "Metric", "Value");
                System.out.println("+------------------+------------------+");
                System.out.printf("| %-16s | %-16d |\n", "Size", n);
                System.out.printf("| %-16s | %-16d |\n", "Sum", sum);
                System.out.printf("| %-16s | %-16.2f |\n", "Average", (double)sum/n);
                System.out.printf("| %-16s | %-16d |\n", "Maximum", max);
                System.out.printf("| %-16s | %-16d |\n", "Minimum", min);
                System.out.println("+------------------+------------------+");
            }
            else if (ch == 9) {
                System.out.println("Bye!");
                break;
            }
            else {
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}