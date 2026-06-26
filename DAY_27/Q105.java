import java.util.*;

/*
Question: Student Record Management System
*/

public class Q105 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int[] r = new int[100];
        String[] n = new String[100];
        int[] m = new int[100];
        int c = 0;
        int id = 1;
        
        while (true) {
            System.out.println("\n===== STUDENT SYSTEM =====");
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Report");
            System.out.println("7. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                System.out.print("Name: ");
                sc.nextLine();
                String nm = sc.nextLine();
                System.out.print("Marks: ");
                int mk = sc.nextInt();
                
                r[c] = id++;
                n[c] = nm;
                m[c] = mk;
                c++;
                System.out.println("Added! Roll: " + (id-1));
            }
            else if (ch == 2) {
                if (c == 0) {
                    System.out.println("No records");
                } else {
                    System.out.println("\n+------+------------------+-------+");
                    System.out.printf("| %-4s | %-16s | %-5s |\n", "Roll", "Name", "Marks");
                    System.out.println("+------+------------------+-------+");
                    for (int i = 0; i < c; i++) {
                        System.out.printf("| %-4d | %-16s | %-5d |\n", r[i], n[i], m[i]);
                    }
                    System.out.println("+------+------------------+-------+");
                }
            }
            else if (ch == 3) {
                System.out.print("Enter Roll: ");
                int roll = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (r[i] == roll) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.println("\n+------+------------------+-------+");
                    System.out.printf("| %-4s | %-16s | %-5s |\n", "Roll", "Name", "Marks");
                    System.out.println("+------+------------------+-------+");
                    System.out.printf("| %-4d | %-16s | %-5d |\n", r[found], n[found], m[found]);
                    System.out.println("+------+------------------+-------+");
                }
            }
            else if (ch == 4) {
                System.out.print("Enter Roll: ");
                int roll = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (r[i] == roll) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.print("New Name: ");
                    sc.nextLine();
                    String nm = sc.nextLine();
                    System.out.print("New Marks: ");
                    int mk = sc.nextInt();
                    n[found] = nm;
                    m[found] = mk;
                    System.out.println("Updated");
                }
            }
            else if (ch == 5) {
                System.out.print("Enter Roll: ");
                int roll = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (r[i] == roll) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    for (int i = found; i < c - 1; i++) {
                        r[i] = r[i + 1];
                        n[i] = n[i + 1];
                        m[i] = m[i + 1];
                    }
                    c--;
                    System.out.println("Deleted");
                }
            }
            else if (ch == 6) {
                if (c == 0) {
                    System.out.println("No records");
                } else {
                    int sum = 0, max = m[0], min = m[0];
                    for (int i = 0; i < c; i++) {
                        sum += m[i];
                        if (m[i] > max) max = m[i];
                        if (m[i] < min) min = m[i];
                    }
                    System.out.println("\n+-----------+---------+");
                    System.out.printf("| %-9s | %-7s |\n", "Metric", "Value");
                    System.out.println("+-----------+---------+");
                    System.out.printf("| %-9s | %-7d |\n", "Total", c);
                    System.out.printf("| %-9s | %-7.2f |\n", "Average", (double)sum/c);
                    System.out.printf("| %-9s | %-7d |\n", "Max", max);
                    System.out.printf("| %-9s | %-7d |\n", "Min", min);
                    System.out.println("+-----------+---------+");
                }
            }
            else if (ch == 7) {
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