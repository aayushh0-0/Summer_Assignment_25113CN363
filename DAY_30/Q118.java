import java.util.*;

/*
Question: Mini Library System
*/

public class Q118 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String[] books = new String[100];
        String[] authors = new String[100];
        int[] copies = new int[100];
        int count = 0;
        int bookId = 101;
        
        // Pre-add some books
        books[0] = "Java Programming";
        authors[0] = "James Gosling";
        copies[0] = 5;
        
        books[1] = "Python Basics";
        authors[1] = "Guido Rossum";
        copies[1] = 3;
        
        books[2] = "C Programming";
        authors[2] = "Dennis Ritchie";
        copies[2] = 4;
        count = 3;
        
        while (true) {
            System.out.println("\n===== MINI LIBRARY =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Report");
            System.out.println("8. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                sc.nextLine();
                System.out.print("Book Title: ");
                String title = sc.nextLine();
                System.out.print("Author: ");
                String author = sc.nextLine();
                System.out.print("Copies: ");
                int copy = sc.nextInt();
                
                // Check if book already exists
                int found = -1;
                for (int i = 0; i < count; i++) {
                    if (books[i].equalsIgnoreCase(title)) {
                        found = i;
                        break;
                    }
                }
                
                if (found != -1) {
                    copies[found] += copy;
                    System.out.println("Added " + copy + " more copies. Total: " + copies[found]);
                } else {
                    // Add as new book
                    String tempBook = books[count];
                    String tempAuthor = authors[count];
                    int tempCopy = copies[count];
                    
                    books[count] = title;
                    authors[count] = author;
                    copies[count] = copy;
                    count++;
                    System.out.println("Book added! ID: " + (bookId++));
                }
            }
            else if (ch == 2) {
                if (count == 0) {
                    System.out.println("No books in library");
                } else {
                    System.out.println("\n+------+------------------+------------------+----------+");
                    System.out.printf("| %-4s | %-16s | %-16s | %-8s |\n", 
                                    "No.", "Title", "Author", "Copies");
                    System.out.println("+------+------------------+------------------+----------+");
                    for (int i = 0; i < count; i++) {
                        System.out.printf("| %-4d | %-16s | %-16s | %-8d |\n", 
                                        i+1, books[i], authors[i], copies[i]);
                    }
                    System.out.println("+------+------------------+------------------+----------+");
                }
            }
            else if (ch == 3) {
                sc.nextLine();
                System.out.print("Enter book title: ");
                String title = sc.nextLine();
                int found = -1;
                for (int i = 0; i < count; i++) {
                    if (books[i].equalsIgnoreCase(title)) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Book not found");
                } else {
                    System.out.println("\nTitle: " + books[found]);
                    System.out.println("Author: " + authors[found]);
                    System.out.println("Copies Available: " + copies[found]);
                }
            }
            else if (ch == 4) {
                sc.nextLine();
                System.out.print("Enter book title to borrow: ");
                String title = sc.nextLine();
                int found = -1;
                for (int i = 0; i < count; i++) {
                    if (books[i].equalsIgnoreCase(title)) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Book not found");
                } else if (copies[found] == 0) {
                    System.out.println("No copies available");
                } else {
                    copies[found]--;
                    System.out.println("Borrowed successfully! Remaining: " + copies[found]);
                }
            }
            else if (ch == 5) {
                sc.nextLine();
                System.out.print("Enter book title to return: ");
                String title = sc.nextLine();
                int found = -1;
                for (int i = 0; i < count; i++) {
                    if (books[i].equalsIgnoreCase(title)) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Book not found");
                } else {
                    copies[found]++;
                    System.out.println("Returned successfully! Total: " + copies[found]);
                }
            }
            else if (ch == 6) {
                sc.nextLine();
                System.out.print("Enter book title to delete: ");
                String title = sc.nextLine();
                int found = -1;
                for (int i = 0; i < count; i++) {
                    if (books[i].equalsIgnoreCase(title)) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Book not found");
                } else {
                    System.out.print("Delete " + books[found] + "? (y/n): ");
                    String confirm = sc.nextLine();
                    if (confirm.equalsIgnoreCase("y")) {
                        for (int i = found; i < count - 1; i++) {
                            books[i] = books[i + 1];
                            authors[i] = authors[i + 1];
                            copies[i] = copies[i + 1];
                        }
                        count--;
                        System.out.println("Deleted");
                    } else {
                        System.out.println("Cancelled");
                    }
                }
            }
            else if (ch == 7) {
                if (count == 0) {
                    System.out.println("No books");
                } else {
                    int totalCopies = 0;
                    for (int i = 0; i < count; i++) {
                        totalCopies += copies[i];
                    }
                    
                    System.out.println("\n+------------------+------------------+");
                    System.out.printf("| %-16s | %-16s |\n", "Metric", "Value");
                    System.out.println("+------------------+------------------+");
                    System.out.printf("| %-16s | %-16d |\n", "Total Titles", count);
                    System.out.printf("| %-16s | %-16d |\n", "Total Copies", totalCopies);
                    System.out.printf("| %-16s | %-16.2f |\n", "Avg Copies/Title", (double)totalCopies/count);
                    
                    // Most popular author
                    String[] authorsList = new String[count];
                    int[] authorCount = new int[count];
                    int authTypes = 0;
                    
                    for (int i = 0; i < count; i++) {
                        boolean found = false;
                        for (int j = 0; j < authTypes; j++) {
                            if (authorsList[j].equals(authors[i])) {
                                authorCount[j]++;
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            authorsList[authTypes] = authors[i];
                            authorCount[authTypes] = 1;
                            authTypes++;
                        }
                    }
                    
                    int max = 0;
                    String popular = "";
                    for (int i = 0; i < authTypes; i++) {
                        if (authorCount[i] > max) {
                            max = authorCount[i];
                            popular = authorsList[i];
                        }
                    }
                    System.out.printf("| %-16s | %-16s |\n", "Popular Author", popular);
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