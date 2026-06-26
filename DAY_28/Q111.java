import java.util.*;

/*
Question: Ticket Booking System
*/

public class Q111 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int[] id = new int[100];
        String[] name = new String[100];
        String[] movie = new String[100];
        int[] seats = new int[100];
        double[] price = new double[100];
        String[] timing = new String[100];
        int c = 0;
        int bookingId = 1001;
        
        String[] movies = {"Avengers", "Titanic", "Inception", "Avatar", "Batman"};
        String[] timings = {"10:00 AM", "1:00 PM", "4:00 PM", "7:00 PM", "10:00 PM"};
        double[] rates = {250, 300, 200, 350, 280};
        
        while (true) {
            System.out.println("\n===== TICKET BOOKING =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Bookings");
            System.out.println("3. Search");
            System.out.println("4. Cancel");
            System.out.println("5. Available Movies");
            System.out.println("6. Report");
            System.out.println("7. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                System.out.println("\nAvailable Movies:");
                for (int i = 0; i < movies.length; i++) {
                    System.out.println((i+1) + ". " + movies[i] + " - " + rates[i] + "/- (" + timings[i] + ")");
                }
                System.out.print("Select Movie (1-5): ");
                int movieChoice = sc.nextInt() - 1;
                if (movieChoice < 0 || movieChoice >= movies.length) {
                    System.out.println("Invalid choice");
                    continue;
                }
                
                sc.nextLine();
                System.out.print("Customer Name: ");
                String nm = sc.nextLine();
                System.out.print("Number of Seats: ");
                int seat = sc.nextInt();
                
                double total = seat * rates[movieChoice];
                
                id[c] = bookingId++;
                name[c] = nm;
                movie[c] = movies[movieChoice];
                seats[c] = seat;
                price[c] = total;
                timing[c] = timings[movieChoice];
                c++;
                
                System.out.println("\nBooking Confirmed!");
                System.out.println("Booking ID: " + (bookingId-1));
                System.out.println("Movie: " + movies[movieChoice]);
                System.out.println("Timing: " + timings[movieChoice]);
                System.out.println("Seats: " + seat);
                System.out.println("Total: " + total);
            }
            else if (ch == 2) {
                if (c == 0) {
                    System.out.println("No bookings");
                } else {
                    System.out.println("\n+------+------------------+------------------+-------+----------+----------+");
                    System.out.printf("| %-4s | %-16s | %-16s | %-5s | %-8s | %-8s |\n", 
                                    "ID", "Customer", "Movie", "Seats", "Amount", "Timing");
                    System.out.println("+------+------------------+------------------+-------+----------+----------+");
                    for (int i = 0; i < c; i++) {
                        System.out.printf("| %-4d | %-16s | %-16s | %-5d | %-8.2f | %-8s |\n", 
                                        id[i], name[i], movie[i], seats[i], price[i], timing[i]);
                    }
                    System.out.println("+------+------------------+------------------+-------+----------+----------+");
                }
            }
            else if (ch == 3) {
                System.out.print("Enter Booking ID: ");
                int bid = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (id[i] == bid) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.println("\nCustomer: " + name[found]);
                    System.out.println("Movie: " + movie[found]);
                    System.out.println("Seats: " + seats[found]);
                    System.out.println("Amount: " + price[found]);
                    System.out.println("Timing: " + timing[found]);
                }
            }
            else if (ch == 4) {
                System.out.print("Enter Booking ID: ");
                int bid = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (id[i] == bid) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.print("Cancel booking for " + name[found] + "? (y/n): ");
                    sc.nextLine();
                    String confirm = sc.nextLine();
                    if (confirm.equalsIgnoreCase("y")) {
                        for (int i = found; i < c - 1; i++) {
                            id[i] = id[i + 1];
                            name[i] = name[i + 1];
                            movie[i] = movie[i + 1];
                            seats[i] = seats[i + 1];
                            price[i] = price[i + 1];
                            timing[i] = timing[i + 1];
                        }
                        c--;
                        System.out.println("Booking cancelled");
                    } else {
                        System.out.println("Cancelled");
                    }
                }
            }
            else if (ch == 5) {
                System.out.println("\n+------+------------------+----------+----------+");
                System.out.printf("| %-4s | %-16s | %-8s | %-8s |\n", "No.", "Movie", "Price", "Timing");
                System.out.println("+------+------------------+----------+----------+");
                for (int i = 0; i < movies.length; i++) {
                    System.out.printf("| %-4d | %-16s | %-8.2f | %-8s |\n", i+1, movies[i], rates[i], timings[i]);
                }
                System.out.println("+------+------------------+----------+----------+");
            }
            else if (ch == 6) {
                if (c == 0) {
                    System.out.println("No bookings");
                } else {
                    double totalRev = 0;
                    int totalSeats = 0;
                    String popular = movie[0];
                    int maxCount = 0;
                    
                    String[] movieList = new String[c];
                    int[] movieCount = new int[c];
                    int movieTypes = 0;
                    
                    for (int i = 0; i < c; i++) {
                        totalRev += price[i];
                        totalSeats += seats[i];
                        
                        boolean found = false;
                        for (int j = 0; j < movieTypes; j++) {
                            if (movieList[j].equals(movie[i])) {
                                movieCount[j]++;
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            movieList[movieTypes] = movie[i];
                            movieCount[movieTypes] = 1;
                            movieTypes++;
                        }
                    }
                    
                    for (int i = 0; i < movieTypes; i++) {
                        if (movieCount[i] > maxCount) {
                            maxCount = movieCount[i];
                            popular = movieList[i];
                        }
                    }
                    
                    System.out.println("\n+------------------+------------------+");
                    System.out.printf("| %-16s | %-16s |\n", "Metric", "Value");
                    System.out.println("+------------------+------------------+");
                    System.out.printf("| %-16s | %-16d |\n", "Total Bookings", c);
                    System.out.printf("| %-16s | %-16d |\n", "Total Seats", totalSeats);
                    System.out.printf("| %-16s | %-16.2f |\n", "Total Revenue", totalRev);
                    System.out.printf("| %-16s | %-16.2f |\n", "Average Revenue", totalRev/c);
                    System.out.printf("| %-16s | %-16s |\n", "Most Popular", popular);
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