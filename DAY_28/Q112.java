import java.util.*;

/*
Question: Contact Management System
*/

public class Q112 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int[] id = new int[100];
        String[] name = new String[100];
        String[] phone = new String[100];
        String[] email = new String[100];
        String[] group = new String[100];
        int c = 0;
        int contactId = 1;
        
        while (true) {
            System.out.println("\n===== CONTACT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View All");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                sc.nextLine();
                System.out.print("Name: ");
                String nm = sc.nextLine();
                System.out.print("Phone: ");
                String ph = sc.nextLine();
                System.out.print("Email: ");
                String em = sc.nextLine();
                System.out.print("Group (Family/Friend/Work/Other): ");
                String gp = sc.nextLine();
                
                id[c] = contactId++;
                name[c] = nm;
                phone[c] = ph;
                email[c] = em;
                group[c] = gp;
                c++;
                System.out.println("Added! ID: " + (contactId-1));
            }
            else if (ch == 2) {
                if (c == 0) {
                    System.out.println("No contacts");
                } else {
                    System.out.println("\n+------+------------------+------------------+------------------+------------------+");
                    System.out.printf("| %-4s | %-16s | %-16s | %-16s | %-16s |\n", 
                                    "ID", "Name", "Phone", "Email", "Group");
                    System.out.println("+------+------------------+------------------+------------------+------------------+");
                    for (int i = 0; i < c; i++) {
                        System.out.printf("| %-4d | %-16s | %-16s | %-16s | %-16s |\n", 
                                        id[i], name[i], phone[i], email[i], group[i]);
                    }
                    System.out.println("+------+------------------+------------------+------------------+------------------+");
                }
            }
            else if (ch == 3) {
                sc.nextLine();
                System.out.print("Search by Name or Phone: ");
                String search = sc.nextLine().toLowerCase();
                int found = 0;
                for (int i = 0; i < c; i++) {
                    if (name[i].toLowerCase().contains(search) || phone[i].contains(search)) {
                        System.out.println("\nID: " + id[i]);
                        System.out.println("Name: " + name[i]);
                        System.out.println("Phone: " + phone[i]);
                        System.out.println("Email: " + email[i]);
                        System.out.println("Group: " + group[i]);
                        found++;
                    }
                }
                if (found == 0) {
                    System.out.println("No contacts found");
                } else {
                    System.out.println("Found " + found + " contact(s)");
                }
            }
            else if (ch == 4) {
                System.out.print("Enter ID: ");
                int cid = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (id[i] == cid) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    sc.nextLine();
                    System.out.println("\nCurrent Details:");
                    System.out.println("Name: " + name[found]);
                    System.out.println("Phone: " + phone[found]);
                    System.out.println("Email: " + email[found]);
                    System.out.println("Group: " + group[found]);
                    
                    System.out.println("\nEnter new details (press Enter to skip):");
                    System.out.print("New Name [" + name[found] + "]: ");
                    String nm = sc.nextLine();
                    if (!nm.isEmpty()) name[found] = nm;
                    
                    System.out.print("New Phone [" + phone[found] + "]: ");
                    String ph = sc.nextLine();
                    if (!ph.isEmpty()) phone[found] = ph;
                    
                    System.out.print("New Email [" + email[found] + "]: ");
                    String em = sc.nextLine();
                    if (!em.isEmpty()) email[found] = em;
                    
                    System.out.print("New Group [" + group[found] + "]: ");
                    String gp = sc.nextLine();
                    if (!gp.isEmpty()) group[found] = gp;
                    
                    System.out.println("Updated");
                }
            }
            else if (ch == 5) {
                System.out.print("Enter ID: ");
                int cid = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (id[i] == cid) {
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
                            phone[i] = phone[i + 1];
                            email[i] = email[i + 1];
                            group[i] = group[i + 1];
                        }
                        c--;
                        System.out.println("Deleted");
                    } else {
                        System.out.println("Cancelled");
                    }
                }
            }
            else if (ch == 6) {
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