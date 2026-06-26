import java.util.*;

/*
Question: Salary Management System
*/

public class Q107 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int[] e = new int[100];
        String[] n = new String[100];
        double[] b = new double[100];
        double[] h = new double[100];
        double[] d = new double[100];
        double[] t = new double[100];
        int c = 0;
        int id = 101;
        
        while (true) {
            System.out.println("\n===== SALARY SYSTEM =====");
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
                System.out.print("Basic Salary: ");
                double bs = sc.nextDouble();
                
                double hra = bs * 0.3;
                double da = bs * 0.2;
                double total = bs + hra + da;
                
                e[c] = id++;
                n[c] = nm;
                b[c] = bs;
                h[c] = hra;
                d[c] = da;
                t[c] = total;
                c++;
                System.out.println("Added! ID: " + (id-1));
                System.out.println("HRA: " + hra + " | DA: " + da + " | Total: " + total);
            }
            else if (ch == 2) {
                if (c == 0) {
                    System.out.println("No records");
                } else {
                    System.out.println("\n+------+------------------+----------+----------+----------+----------+");
                    System.out.printf("| %-4s | %-16s | %-8s | %-8s | %-8s | %-8s |\n", 
                                    "ID", "Name", "Basic", "HRA", "DA", "Total");
                    System.out.println("+------+------------------+----------+----------+----------+----------+");
                    for (int i = 0; i < c; i++) {
                        System.out.printf("| %-4d | %-16s | %-8.2f | %-8.2f | %-8.2f | %-8.2f |\n", 
                                        e[i], n[i], b[i], h[i], d[i], t[i]);
                    }
                    System.out.println("+------+------------------+----------+----------+----------+----------+");
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
                    System.out.println("\nName: " + n[found]);
                    System.out.println("Basic: " + b[found]);
                    System.out.println("HRA: " + h[found]);
                    System.out.println("DA: " + d[found]);
                    System.out.println("Total Salary: " + t[found]);
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
                    System.out.print("New Basic Salary: ");
                    double bs = sc.nextDouble();
                    
                    double hra = bs * 0.3;
                    double da = bs * 0.2;
                    double total = bs + hra + da;
                    
                    n[found] = nm;
                    b[found] = bs;
                    h[found] = hra;
                    d[found] = da;
                    t[found] = total;
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
                        b[i] = b[i + 1];
                        h[i] = h[i + 1];
                        d[i] = d[i + 1];
                        t[i] = t[i + 1];
                    }
                    c--;
                    System.out.println("Deleted");
                }
            }
            else if (ch == 6) {
                if (c == 0) {
                    System.out.println("No records");
                } else {
                    double sumB = 0, sumH = 0, sumD = 0, sumT = 0;
                    double max = t[0], min = t[0];
                    String maxName = n[0], minName = n[0];
                    
                    for (int i = 0; i < c; i++) {
                        sumB += b[i];
                        sumH += h[i];
                        sumD += d[i];
                        sumT += t[i];
                        if (t[i] > max) {
                            max = t[i];
                            maxName = n[i];
                        }
                        if (t[i] < min) {
                            min = t[i];
                            minName = n[i];
                        }
                    }
                    
                    System.out.println("\n+------------------+------------------+");
                    System.out.printf("| %-16s | %-16s |\n", "Metric", "Value");
                    System.out.println("+------------------+------------------+");
                    System.out.printf("| %-16s | %-16d |\n", "Employees", c);
                    System.out.printf("| %-16s | %-16.2f |\n", "Total Basic", sumB);
                    System.out.printf("| %-16s | %-16.2f |\n", "Total HRA", sumH);
                    System.out.printf("| %-16s | %-16.2f |\n", "Total DA", sumD);
                    System.out.printf("| %-16s | %-16.2f |\n", "Total Salary", sumT);
                    System.out.printf("| %-16s | %-16.2f |\n", "Average Salary", sumT/c);
                    System.out.printf("| %-16s | %-16.2f |\n", "Highest", max);
                    System.out.printf("| %-16s | %-16s |\n", "Highest Paid", maxName);
                    System.out.printf("| %-16s | %-16.2f |\n", "Lowest", min);
                    System.out.printf("| %-16s | %-16s |\n", "Lowest Paid", minName);
                    System.out.println("+------------------+------------------+");
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