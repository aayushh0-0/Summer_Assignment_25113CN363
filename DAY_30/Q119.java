import java.util.*;

/*
Question: Mini Employee Management System
*/

public class Q119 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int[] id = new int[100];
        String[] name = new String[100];
        String[] dept = new String[100];
        double[] salary = new double[100];
        int count = 0;
        int empId = 101;
        
        // Pre-add some employees
        id[0] = empId++;
        name[0] = "John Smith";
        dept[0] = "IT";
        salary[0] = 50000;
        
        id[1] = empId++;
        name[1] = "Sarah Jones";
        dept[1] = "HR";
        salary[1] = 45000;
        
        id[2] = empId++;
        name[2] = "Mike Brown";
        dept[2] = "Finance";
        salary[2] = 48000;
        count = 3;
        
        while (true) {
            System.out.println("\n===== EMPLOYEE SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Department Wise");
            System.out.println("7. Report");
            System.out.println("8. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                sc.nextLine();
                System.out.print("Name: ");
                String nm = sc.nextLine();
                System.out.print("Department: ");
                String dp = sc.nextLine();
                System.out.print("Salary: ");
                double sal = sc.nextDouble();
                
                id[count] = empId++;
                name[count] = nm;
                dept[count] = dp;
                salary[count] = sal;
                count++;
                System.out.println("Added! ID: " + (empId-1));
            }
            else if (ch == 2) {
                if (count == 0) {
                    System.out.println("No employees");
                } else {
                    System.out.println("\n+------+------------------+------------------+----------+");
                    System.out.printf("| %-4s | %-16s | %-16s | %-8s |\n", 
                                    "ID", "Name", "Department", "Salary");
                    System.out.println("+------+------------------+------------------+----------+");
                    for (int i = 0; i < count; i++) {
                        System.out.printf("| %-4d | %-16s | %-16s | %-8.2f |\n", 
                                        id[i], name[i], dept[i], salary[i]);
                    }
                    System.out.println("+------+------------------+------------------+----------+");
                }
            }
            else if (ch == 3) {
                System.out.print("Enter ID: ");
                int eid = sc.nextInt();
                int found = -1;
                for (int i = 0; i < count; i++) {
                    if (id[i] == eid) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.println("\nName: " + name[found]);
                    System.out.println("Department: " + dept[found]);
                    System.out.println("Salary: " + salary[found]);
                }
            }
            else if (ch == 4) {
                System.out.print("Enter ID: ");
                int eid = sc.nextInt();
                int found = -1;
                for (int i = 0; i < count; i++) {
                    if (id[i] == eid) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    sc.nextLine();
                    System.out.print("New Name [" + name[found] + "]: ");
                    String nm = sc.nextLine();
                    if (!nm.isEmpty()) name[found] = nm;
                    
                    System.out.print("New Department [" + dept[found] + "]: ");
                    String dp = sc.nextLine();
                    if (!dp.isEmpty()) dept[found] = dp;
                    
                    System.out.print("New Salary [" + salary[found] + "]: ");
                    String sal = sc.nextLine();
                    if (!sal.isEmpty()) salary[found] = Double.parseDouble(sal);
                    
                    System.out.println("Updated");
                }
            }
            else if (ch == 5) {
                System.out.print("Enter ID: ");
                int eid = sc.nextInt();
                int found = -1;
                for (int i = 0; i < count; i++) {
                    if (id[i] == eid) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.print("Delete " + name[found] + "? (y/n): ");
                    sc.nextLine();
                    String confirm = sc.nextLine();
                    if (confirm.equalsIgnoreCase("y")) {
                        for (int i = found; i < count - 1; i++) {
                            id[i] = id[i + 1];
                            name[i] = name[i + 1];
                            dept[i] = dept[i + 1];
                            salary[i] = salary[i + 1];
                        }
                        count--;
                        System.out.println("Deleted");
                    } else {
                        System.out.println("Cancelled");
                    }
                }
            }
            else if (ch == 6) {
                if (count == 0) {
                    System.out.println("No employees");
                } else {
                    String[] depts = new String[count];
                    int[] counts = new int[count];
                    int deptTypes = 0;
                    
                    for (int i = 0; i < count; i++) {
                        boolean found = false;
                        for (int j = 0; j < deptTypes; j++) {
                            if (depts[j].equals(dept[i])) {
                                counts[j]++;
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            depts[deptTypes] = dept[i];
                            counts[deptTypes] = 1;
                            deptTypes++;
                        }
                    }
                    
                    System.out.println("\n+------------------+----------+");
                    System.out.printf("| %-16s | %-8s |\n", "Department", "Employees");
                    System.out.println("+------------------+----------+");
                    for (int i = 0; i < deptTypes; i++) {
                        System.out.printf("| %-16s | %-8d |\n", depts[i], counts[i]);
                    }
                    System.out.println("+------------------+----------+");
                }
            }
            else if (ch == 7) {
                if (count == 0) {
                    System.out.println("No employees");
                } else {
                    double total = 0, max = salary[0], min = salary[0];
                    String maxName = name[0], minName = name[0];
                    
                    for (int i = 0; i < count; i++) {
                        total += salary[i];
                        if (salary[i] > max) {
                            max = salary[i];
                            maxName = name[i];
                        }
                        if (salary[i] < min) {
                            min = salary[i];
                            minName = name[i];
                        }
                    }
                    
                    System.out.println("\n+------------------+------------------+");
                    System.out.printf("| %-16s | %-16s |\n", "Metric", "Value");
                    System.out.println("+------------------+------------------+");
                    System.out.printf("| %-16s | %-16d |\n", "Total Employees", count);
                    System.out.printf("| %-16s | %-16.2f |\n", "Total Salary", total);
                    System.out.printf("| %-16s | %-16.2f |\n", "Average Salary", total/count);
                    System.out.printf("| %-16s | %-16.2f |\n", "Highest Salary", max);
                    System.out.printf("| %-16s | %-16s |\n", "Highest Paid", maxName);
                    System.out.printf("| %-16s | %-16.2f |\n", "Lowest Salary", min);
                    System.out.printf("| %-16s | %-16s |\n", "Lowest Paid", minName);
                    System.out.println("+------------------+------------------+");
                }
            }
            else if (ch == 8) {
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