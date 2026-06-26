import java.util.*;

/*
Question: Library Management System
*/

public class Q109 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int[] id = new int[100];
        String[] title = new String[100];
        String[] author = new String[100];
        int[] qty = new int[100];
        int c = 0;
        int bookId = 101;
        
        while (true) {
            System.out.println("\n===== LIBRARY SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Report");
            System.out.println("7. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                System.out.print("Title: ");
                sc.nextLine();
                String t = sc.nextLine();
                System.out.print("Author: ");
                String a = sc.nextLine();
                System.out.print("Quantity: ");
                int q = sc.nextInt();
                
                id[c] = bookId++;
                title[c] = t;
                author[c] = a;
                qty[c] = q;
                c++;
                System.out.println("Added! ID: " + (bookId-1));
            }
            else if (ch == 2) {
                if (c == 0) {
                    System.out.println("No books");
                } else {
                    System.out.println("\n+------+------------------+------------------+----------+");
                    System.out.printf("| %-4s | %-16s | %-16s | %-8s |\n", "ID", "Title", "Author", "Quantity");
                    System.out.println("+------+------------------+------------------+----------+");
                    for (int i = 0; i < c; i++) {
                        System.out.printf("| %-4d | %-16s | %-16s | %-8d |\n", id[i], title[i], author[i], qty[i]);
                    }
                    System.out.println("+------+------------------+------------------+----------+");
                }
            }
            else if (ch == 3) {
                System.out.print("Enter ID: ");
                int bookIdSearch = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (id[i] == bookIdSearch) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.println("\nTitle: " + title[found]);
                    System.out.println("Author: " + author[found]);
                    System.out.println("Quantity: " + qty[found]);
                }
            }
            else if (ch == 4) {
                System.out.print("Enter ID: ");
                int bookIdUpdate = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (id[i] == bookIdUpdate) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    sc.nextLine();
                    System.out.print("New Title: ");
                    String t = sc.nextLine();
                    System.out.print("New Author: ");
                    String a = sc.nextLine();
                    System.out.print("New Quantity: ");
                    int q = sc.nextInt();
                    
                    title[found] = t;
                    author[found] = a;
                    qty[found] = q;
                    System.out.println("Updated");
                }
            }
            else if (ch == 5) {
                System.out.print("Enter ID: ");
                int bookIdDelete = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (id[i] == bookIdDelete) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    for (int i = found; i < c - 1; i++) {
                        id[i] = id[i + 1];
                        title[i] = title[i + 1];
                        author[i] = author[i + 1];
                        qty[i] = qty[i + 1];
                    }
                    c--;
                    System.out.println("Deleted");
                }
            }
            else if (ch == 6) {
                if (c == 0) {
                    System.out.println("No books");
                } else {
                    int totalBooks = 0;
                    for (int i = 0; i < c; i++) {
                        totalBooks += qty[i];
                    }
                    System.out.println("\n+------------------+------------------+");
                    System.out.printf("| %-16s | %-16s |\n", "Metric", "Value");
                    System.out.println("+------------------+------------------+");
                    System.out.printf("| %-16s | %-16d |\n", "Total Titles", c);
                    System.out.printf("| %-16s | %-16d |\n", "Total Copies", totalBooks);
                    System.out.printf("| %-16s | %-16.2f |\n", "Avg Copies/Title", (double)totalBooks/c);
                    
                    // Most common author
                    String[] authors = new String[c];
                    int[] counts = new int[c];
                    int authCount = 0;
                    for (int i = 0; i < c; i++) {
                        boolean found = false;
                        for (int j = 0; j < authCount; j++) {
                            if (authors[j].equals(author[i])) {
                                counts[j]++;
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            authors[authCount] = author[i];
                            counts[authCount] = 1;
                            authCount++;
                        }
                    }
                    int max = 0;
                    String popular = "";
                    for (int i = 0; i < authCount; i++) {
                        if (counts[i] > max) {
                            max = counts[i];
                            popular = authors[i];
                        }
                    }
                    System.out.printf("| %-16s | %-16s |\n", "Popular Author", popular);
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