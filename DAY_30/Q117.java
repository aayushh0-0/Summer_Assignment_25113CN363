import java.util.*;

/*
Question: Student Record System using Arrays and Strings
*/

public class Q117 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Arrays to store student data
        int[] roll = new int[100];
        String[] name = new String[100];
        int[] marks = new int[100];
        int count = 0;
        int nextRoll = 1;
        
        while (true) {
            System.out.println("\n===== STUDENT RECORD =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Top Scorer");
            System.out.println("7. Statistics");
            System.out.println("8. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                sc.nextLine();
                System.out.print("Name: ");
                String nm = sc.nextLine();
                System.out.print("Marks: ");
                int mk = sc.nextInt();
                
                roll[count] = nextRoll++;
                name[count] = nm;
                marks[count] = mk;
                count++;
                System.out.println("Added! Roll: " + (nextRoll-1));
            }
            else if (ch == 2) {
                if (count == 0) {
                    System.out.println("No records");
                } else {
                    System.out.println("\n+------+------------------+-------+");
                    System.out.printf("| %-4s | %-16s | %-5s |\n", "Roll", "Name", "Marks");
                    System.out.println("+------+------------------+-------+");
                    for (int i = 0; i < count; i++) {
                        System.out.printf("| %-4d | %-16s | %-5d |\n", roll[i], name[i], marks[i]);
                    }
                    System.out.println("+------+------------------+-------+");
                }
            }
            else if (ch == 3) {
                System.out.print("Enter Roll: ");
                int r = sc.nextInt();
                int found = -1;
                for (int i = 0; i < count; i++) {
                    if (roll[i] == r) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.println("\nName: " + name[found]);
                    System.out.println("Marks: " + marks[found]);
                }
            }
            else if (ch == 4) {
                System.out.print("Enter Roll: ");
                int r = sc.nextInt();
                int found = -1;
                for (int i = 0; i < count; i++) {
                    if (roll[i] == r) {
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
                    
                    System.out.print("New Marks [" + marks[found] + "]: ");
                    String mk = sc.nextLine();
                    if (!mk.isEmpty()) marks[found] = Integer.parseInt(mk);
                    
                    System.out.println("Updated");
                }
            }
            else if (ch == 5) {
                System.out.print("Enter Roll: ");
                int r = sc.nextInt();
                int found = -1;
                for (int i = 0; i < count; i++) {
                    if (roll[i] == r) {
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
                            roll[i] = roll[i + 1];
                            name[i] = name[i + 1];
                            marks[i] = marks[i + 1];
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
                    System.out.println("No records");
                } else {
                    int max = marks[0];
                    int pos = 0;
                    for (int i = 1; i < count; i++) {
                        if (marks[i] > max) {
                            max = marks[i];
                            pos = i;
                        }
                    }
                    System.out.println("\n+------+------------------+-------+");
                    System.out.printf("| %-4s | %-16s | %-5s |\n", "Roll", "Name", "Marks");
                    System.out.println("+------+------------------+-------+");
                    System.out.printf("| %-4d | %-16s | %-5d |\n", roll[pos], name[pos], marks[pos]);
                    System.out.println("+------+------------------+-------+");
                    System.out.println("🏆 Topper!");
                }
            }
            else if (ch == 7) {
                if (count == 0) {
                    System.out.println("No records");
                } else {
                    int sum = 0, max = marks[0], min = marks[0];
                    int pass = 0, fail = 0;
                    
                    for (int i = 0; i < count; i++) {
                        sum += marks[i];
                        if (marks[i] > max) max = marks[i];
                        if (marks[i] < min) min = marks[i];
                        if (marks[i] >= 40) pass++;
                        else fail++;
                    }
                    
                    System.out.println("\n+------------------+------------------+");
                    System.out.printf("| %-16s | %-16s |\n", "Metric", "Value");
                    System.out.println("+------------------+------------------+");
                    System.out.printf("| %-16s | %-16d |\n", "Total Students", count);
                    System.out.printf("| %-16s | %-16d |\n", "Passed", pass);
                    System.out.printf("| %-16s | %-16d |\n", "Failed", fail);
                    System.out.printf("| %-16s | %-16.2f |\n", "Average Marks", (double)sum/count);
                    System.out.printf("| %-16s | %-16d |\n", "Highest Marks", max);
                    System.out.printf("| %-16s | %-16d |\n", "Lowest Marks", min);
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