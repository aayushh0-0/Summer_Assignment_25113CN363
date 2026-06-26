import java.util.*;

/*
Question: Employee Management System
*/

public class Q106 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int[] e = new int[100];
        String[] n = new String[100];
        double[] s = new double[100];
        String[] d = new String[100];
        int c = 0;
        int id = 101;
        
        while (true) {
            System.out.println("\n===== EMPLOYEE SYSTEM =====");
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
                System.out.print("Salary: ");
                double sal = sc.nextDouble();
                sc.nextLine();
                System.out.print("Department: ");
                String dp = sc.nextLine();
                
                e[c] = id++;
                n[c] = nm;
                s[c] = sal;
                d[c] = dp;
                c++;
                System.out.println("Added! ID: " + (id-1));
            }
            else if (ch == 2) {
                if (c == 0) {
                    System.out.println("No records");
                } else {
                    System.out.println("\n+------+------------------+----------+------------------+");
                    System.out.printf("| %-4s | %-16s | %-8s | %-16s |\n", "ID", "Name", "Salary", "Department");
                    System.out.println("+------+------------------+----------+------------------+");
                    for (int i = 0; i < c; i++) {
                        System.out.printf("| %-4d | %-16s | %-8.2f | %-16s |\n", e[i], n[i], s[i], d[i]);
                    }
                    System.out.println("+------+------------------+----------+------------------+");
                }
            }
            else if (ch == 3) {
                System.out.print("Enter ID: ");
                int empId = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (e[i] == empId) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.println("Name: " + n[found]);
                    System.out.println("Salary: " + s[found]);
                    System.out.println("Department: " + d[found]);
                }
            }
            else if (ch == 4) {
                System.out.print("Enter ID: ");
                int empId = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (e[i] == empId) {
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
                    System.out.print("New Salary: ");
                    double sal = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("New Department: ");
                    String dp = sc.nextLine();
                    
                    n[found] = nm;
                    s[found] = sal;
                    d[found] = dp;
                    System.out.println("Updated");
                }
            }
            else if (ch == 5) {
                System.out.print("Enter ID: ");
                int empId = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (e[i] == empId) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    for (int i = found; i < c - 1; i++) {
                        e[i] = e[i + 1];
                        n[i] = n[i + 1];
                        s[i] = s[i + 1];
                        d[i] = d[i + 1];
                    }
                    c--;
                    System.out.println("Deleted");
                }
            }
            else if (ch == 6) {
                if (c == 0) {
                    System.out.println("No records");
                } else {
                    double sum = 0, max = s[0], min = s[0];
                    for (int i = 0; i < c; i++) {
                        sum += s[i];
                        if (s[i] > max) max = s[i];
                        if (s[i] < min) min = s[i];
                    }
                    System.out.println("\n+-----------+----------+");
                    System.out.printf("| %-9s | %-8s |\n", "Metric", "Value");
                    System.out.println("+-----------+----------+");
                    System.out.printf("| %-9s | %-8d |\n", "Total", c);
                    System.out.printf("| %-9s | %-8.2f |\n", "Average", sum/c);
                    System.out.printf("| %-9s | %-8.2f |\n", "Max", max);
                    System.out.printf("| %-9s | %-8.2f |\n", "Min", min);
                    System.out.println("+-----------+----------+");
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