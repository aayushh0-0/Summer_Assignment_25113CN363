import java.util.*;

/*
Question: Bank Account System
*/

public class Q110 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int[] acc = new int[100];
        String[] name = new String[100];
        double[] bal = new double[100];
        String[] type = new String[100];
        int c = 0;
        int id = 1001;
        
        while (true) {
            System.out.println("\n===== BANK SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. View All");
            System.out.println("3. Search");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Delete");
            System.out.println("7. Report");
            System.out.println("8. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                System.out.print("Name: ");
                sc.nextLine();
                String nm = sc.nextLine();
                System.out.print("Initial Deposit: ");
                double amt = sc.nextDouble();
                sc.nextLine();
                System.out.print("Account Type (Saving/Current): ");
                String tp = sc.nextLine();
                
                acc[c] = id++;
                name[c] = nm;
                bal[c] = amt;
                type[c] = tp;
                c++;
                System.out.println("Account Created! Acc No: " + (id-1));
            }
            else if (ch == 2) {
                if (c == 0) {
                    System.out.println("No accounts");
                } else {
                    System.out.println("\n+------+------------------+----------+------------------+");
                    System.out.printf("| %-4s | %-16s | %-8s | %-16s |\n", "Acc No", "Name", "Balance", "Type");
                    System.out.println("+------+------------------+----------+------------------+");
                    for (int i = 0; i < c; i++) {
                        System.out.printf("| %-4d | %-16s | %-8.2f | %-16s |\n", acc[i], name[i], bal[i], type[i]);
                    }
                    System.out.println("+------+------------------+----------+------------------+");
                }
            }
            else if (ch == 3) {
                System.out.print("Enter Account No: ");
                int ac = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (acc[i] == ac) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.println("\nName: " + name[found]);
                    System.out.println("Balance: " + bal[found]);
                    System.out.println("Type: " + type[found]);
                }
            }
            else if (ch == 4) {
                System.out.print("Enter Account No: ");
                int ac = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (acc[i] == ac) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.print("Amount to Deposit: ");
                    double amt = sc.nextDouble();
                    bal[found] += amt;
                    System.out.println("Deposited! New Balance: " + bal[found]);
                }
            }
            else if (ch == 5) {
                System.out.print("Enter Account No: ");
                int ac = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (acc[i] == ac) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.print("Amount to Withdraw: ");
                    double amt = sc.nextDouble();
                    if (amt > bal[found]) {
                        System.out.println("Insufficient balance");
                    } else {
                        bal[found] -= amt;
                        System.out.println("Withdrawn! New Balance: " + bal[found]);
                    }
                }
            }
            else if (ch == 6) {
                System.out.print("Enter Account No: ");
                int ac = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (acc[i] == ac) {
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
                        for (int i = found; i < c - 1; i++) {
                            acc[i] = acc[i + 1];
                            name[i] = name[i + 1];
                            bal[i] = bal[i + 1];
                            type[i] = type[i + 1];
                        }
                        c--;
                        System.out.println("Deleted");
                    } else {
                        System.out.println("Cancelled");
                    }
                }
            }
            else if (ch == 7) {
                if (c == 0) {
                    System.out.println("No accounts");
                } else {
                    double total = 0, max = bal[0], min = bal[0];
                    String maxName = name[0], minName = name[0];
                    int saving = 0, current = 0;
                    
                    for (int i = 0; i < c; i++) {
                        total += bal[i];
                        if (bal[i] > max) {
                            max = bal[i];
                            maxName = name[i];
                        }
                        if (bal[i] < min) {
                            min = bal[i];
                            minName = name[i];
                        }
                        if (type[i].equalsIgnoreCase("Saving")) saving++;
                        else current++;
                    }
                    
                    System.out.println("\n+------------------+------------------+");
                    System.out.printf("| %-16s | %-16s |\n", "Metric", "Value");
                    System.out.println("+------------------+------------------+");
                    System.out.printf("| %-16s | %-16d |\n", "Total Accounts", c);
                    System.out.printf("| %-16s | %-16d |\n", "Saving Accounts", saving);
                    System.out.printf("| %-16s | %-16d |\n", "Current Accounts", current);
                    System.out.printf("| %-16s | %-16.2f |\n", "Total Balance", total);
                    System.out.printf("| %-16s | %-16.2f |\n", "Average Balance", total/c);
                    System.out.printf("| %-16s | %-16.2f |\n", "Highest Balance", max);
                    System.out.printf("| %-16s | %-16s |\n", "Richest", maxName);
                    System.out.printf("| %-16s | %-16.2f |\n", "Lowest Balance", min);
                    System.out.printf("| %-16s | %-16s |\n", "Poorest", minName);
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