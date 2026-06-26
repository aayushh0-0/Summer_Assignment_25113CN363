import java.util.*;

/*
Question: Inventory Management System
*/

public class Q116 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int[] id = new int[100];
        String[] name = new String[100];
        int[] qty = new int[100];
        double[] price = new double[100];
        int c = 0;
        int itemId = 101;
        
        while (true) {
            System.out.println("\n===== INVENTORY SYSTEM =====");
            System.out.println("1. Add Item");
            System.out.println("2. View All");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Low Stock");
            System.out.println("7. Report");
            System.out.println("8. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                sc.nextLine();
                System.out.print("Item Name: ");
                String nm = sc.nextLine();
                System.out.print("Quantity: ");
                int q = sc.nextInt();
                System.out.print("Price: ");
                double p = sc.nextDouble();
                
                id[c] = itemId++;
                name[c] = nm;
                qty[c] = q;
                price[c] = p;
                c++;
                System.out.println("Added! ID: " + (itemId-1));
            }
            else if (ch == 2) {
                if (c == 0) {
                    System.out.println("No items");
                } else {
                    System.out.println("\n+------+------------------+----------+----------+");
                    System.out.printf("| %-4s | %-16s | %-8s | %-8s |\n", 
                                    "ID", "Name", "Quantity", "Price");
                    System.out.println("+------+------------------+----------+----------+");
                    for (int i = 0; i < c; i++) {
                        System.out.printf("| %-4d | %-16s | %-8d | %-8.2f |\n", 
                                        id[i], name[i], qty[i], price[i]);
                    }
                    System.out.println("+------+------------------+----------+----------+");
                }
            }
            else if (ch == 3) {
                System.out.print("Enter ID: ");
                int item = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (id[i] == item) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.println("\nName: " + name[found]);
                    System.out.println("Quantity: " + qty[found]);
                    System.out.println("Price: " + price[found]);
                    System.out.println("Value: " + (qty[found] * price[found]));
                }
            }
            else if (ch == 4) {
                System.out.print("Enter ID: ");
                int item = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (id[i] == item) {
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
                    
                    System.out.print("New Quantity [" + qty[found] + "]: ");
                    String q = sc.nextLine();
                    if (!q.isEmpty()) qty[found] = Integer.parseInt(q);
                    
                    System.out.print("New Price [" + price[found] + "]: ");
                    String p = sc.nextLine();
                    if (!p.isEmpty()) price[found] = Double.parseDouble(p);
                    
                    System.out.println("Updated");
                }
            }
            else if (ch == 5) {
                System.out.print("Enter ID: ");
                int item = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (id[i] == item) {
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
                            id[i] = id[i + 1];
                            name[i] = name[i + 1];
                            qty[i] = qty[i + 1];
                            price[i] = price[i + 1];
                        }
                        c--;
                        System.out.println("Deleted");
                    } else {
                        System.out.println("Cancelled");
                    }
                }
            }
            else if (ch == 6) {
                if (c == 0) {
                    System.out.println("No items");
                } else {
                    System.out.print("Enter low stock threshold: ");
                    int threshold = sc.nextInt();
                    int found = 0;
                    System.out.println("\n+------+------------------+----------+----------+");
                    System.out.printf("| %-4s | %-16s | %-8s | %-8s |\n", 
                                    "ID", "Name", "Quantity", "Price");
                    System.out.println("+------+------------------+----------+----------+");
                    for (int i = 0; i < c; i++) {
                        if (qty[i] <= threshold) {
                            System.out.printf("| %-4d | %-16s | %-8d | %-8.2f |\n", 
                                            id[i], name[i], qty[i], price[i]);
                            found++;
                        }
                    }
                    if (found == 0) {
                        System.out.println("No low stock items");
                    }
                    System.out.println("+------+------------------+----------+----------+");
                }
            }
            else if (ch == 7) {
                if (c == 0) {
                    System.out.println("No items");
                } else {
                    int totalQty = 0;
                    double totalValue = 0;
                    int maxQty = qty[0], minQty = qty[0];
                    String maxName = name[0], minName = name[0];
                    
                    for (int i = 0; i < c; i++) {
                        totalQty += qty[i];
                        totalValue += (qty[i] * price[i]);
                        if (qty[i] > maxQty) {
                            maxQty = qty[i];
                            maxName = name[i];
                        }
                        if (qty[i] < minQty) {
                            minQty = qty[i];
                            minName = name[i];
                        }
                    }
                    
                    System.out.println("\n+------------------+------------------+");
                    System.out.printf("| %-16s | %-16s |\n", "Metric", "Value");
                    System.out.println("+------------------+------------------+");
                    System.out.printf("| %-16s | %-16d |\n", "Total Items", c);
                    System.out.printf("| %-16s | %-16d |\n", "Total Quantity", totalQty);
                    System.out.printf("| %-16s | %-16.2f |\n", "Total Value", totalValue);
                    System.out.printf("| %-16s | %-16.2f |\n", "Avg Value/Item", totalValue/c);
                    System.out.printf("| %-16s | %-16d |\n", "Max Stock", maxQty);
                    System.out.printf("| %-16s | %-16s |\n", "Max Stock Item", maxName);
                    System.out.printf("| %-16s | %-16d |\n", "Min Stock", minQty);
                    System.out.printf("| %-16s | %-16s |\n", "Min Stock Item", minName);
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