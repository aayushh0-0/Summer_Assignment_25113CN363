import java.util.*;

/*
Question: Smart Hostel Management System
*/

public class Q120 {
    static Scanner sc = new Scanner(System.in);
    
    static int[] roomNo = new int[100];
    static String[] studentName = new String[100];
    static String[] gender = new String[100];
    static String[] phone = new String[100];
    static String[] checkIn = new String[100];
    static String[] checkOut = new String[100];
    static double[] fees = new double[100];
    static int count = 0;
    
    static int[] availableRooms = {101, 102, 103, 104, 105, 201, 202, 203, 204, 205};
    static String[] roomType = {"Single AC", "Single Non-AC", "Double AC", "Double Non-AC", 
                               "Single AC", "Single Non-AC", "Double AC", "Double Non-AC",
                               "Single AC", "Double AC"};
    static double[] roomPrice = {1500, 1000, 2500, 1800, 1500, 1000, 2500, 1800, 1500, 2500};
    static boolean[] isBooked = new boolean[10];
    
    public static void main(String args[]) {
        System.out.println("\n===== HOSTEL MANAGEMENT SYSTEM =====");
        
        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Update 5.Delete 6.Availability 7.Report 8.Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            
            if (ch == 1) addStudent();
            else if (ch == 2) viewAll();
            else if (ch == 3) searchStudent();
            else if (ch == 4) updateStudent();
            else if (ch == 5) deleteStudent();
            else if (ch == 6) checkAvailability();
            else if (ch == 7) generateReport();
            else if (ch == 8) { System.out.println("Bye!"); break; }
            else System.out.println("Invalid");
        }
        sc.close();
    }
    
    static void addStudent() {
        System.out.println("\nAvailable Rooms:");
        System.out.println("Room\tType\t\tPrice\tStatus");
        int avail = 0;
        for (int i = 0; i < 10; i++) {
            if (!isBooked[i]) {
                System.out.println(availableRooms[i] + "\t" + roomType[i] + "\t" + roomPrice[i] + "\tFree");
                avail++;
            }
        }
        if (avail == 0) { System.out.println("No rooms available!"); return; }
        
        System.out.print("Enter Room No: ");
        int room = sc.nextInt();
        int idx = -1;
        for (int i = 0; i < 10; i++) {
            if (availableRooms[i] == room) { idx = i; break; }
        }
        if (idx == -1 || isBooked[idx]) { System.out.println("Invalid or booked"); return; }
        
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gender (M/F): ");
        String gen = sc.nextLine();
        System.out.print("Phone: ");
        String ph = sc.nextLine();
        System.out.print("Check-in: ");
        String in = sc.nextLine();
        System.out.print("Check-out: ");
        String out = sc.nextLine();
        
        isBooked[idx] = true;
        roomNo[count] = room;
        studentName[count] = name;
        gender[count] = gen;
        phone[count] = ph;
        checkIn[count] = in;
        checkOut[count] = out;
        fees[count] = roomPrice[idx];
        count++;
        System.out.println("Added! Room: " + room + " Fees: " + roomPrice[idx]);
    }
    
    static void viewAll() {
        if (count == 0) { System.out.println("No records"); return; }
        System.out.println("\nRoom\tName\t\tGender\tPhone\t\tCheck-in\tCheck-out\tFees");
        for (int i = 0; i < count; i++) {
            System.out.println(roomNo[i] + "\t" + studentName[i] + "\t" + gender[i] + "\t" + 
                             phone[i] + "\t" + checkIn[i] + "\t" + checkOut[i] + "\t" + fees[i]);
        }
    }
    
    static void searchStudent() {
        if (count == 0) { System.out.println("No records"); return; }
        System.out.print("Enter Room No: ");
        int room = sc.nextInt();
        int found = -1;
        for (int i = 0; i < count; i++) {
            if (roomNo[i] == room) { found = i; break; }
        }
        if (found == -1) { System.out.println("Not found"); return; }
        System.out.println("Name: " + studentName[found]);
        System.out.println("Gender: " + gender[found]);
        System.out.println("Phone: " + phone[found]);
        System.out.println("Check-in: " + checkIn[found]);
        System.out.println("Check-out: " + checkOut[found]);
        System.out.println("Fees: " + fees[found]);
    }
    
    static void updateStudent() {
        if (count == 0) { System.out.println("No records"); return; }
        System.out.print("Enter Room No: ");
        int room = sc.nextInt();
        int found = -1;
        for (int i = 0; i < count; i++) {
            if (roomNo[i] == room) { found = i; break; }
        }
        if (found == -1) { System.out.println("Not found"); return; }
        
        sc.nextLine();
        System.out.print("New Name [" + studentName[found] + "]: ");
        String name = sc.nextLine();
        if (!name.isEmpty()) studentName[found] = name;
        
        System.out.print("New Phone [" + phone[found] + "]: ");
        String ph = sc.nextLine();
        if (!ph.isEmpty()) phone[found] = ph;
        
        System.out.print("New Check-in [" + checkIn[found] + "]: ");
        String in = sc.nextLine();
        if (!in.isEmpty()) checkIn[found] = in;
        
        System.out.print("New Check-out [" + checkOut[found] + "]: ");
        String out = sc.nextLine();
        if (!out.isEmpty()) checkOut[found] = out;
        
        System.out.println("Updated");
    }
    
    static void deleteStudent() {
        if (count == 0) { System.out.println("No records"); return; }
        System.out.print("Enter Room No: ");
        int room = sc.nextInt();
        int found = -1;
        for (int i = 0; i < count; i++) {
            if (roomNo[i] == room) { found = i; break; }
        }
        if (found == -1) { System.out.println("Not found"); return; }
        
        System.out.print("Delete " + studentName[found] + "? (y/n): ");
        sc.nextLine();
        String confirm = sc.nextLine();
        if (confirm.equalsIgnoreCase("y")) {
            for (int i = 0; i < 10; i++) {
                if (availableRooms[i] == room) { isBooked[i] = false; break; }
            }
            for (int i = found; i < count - 1; i++) {
                roomNo[i] = roomNo[i + 1];
                studentName[i] = studentName[i + 1];
                gender[i] = gender[i + 1];
                phone[i] = phone[i + 1];
                checkIn[i] = checkIn[i + 1];
                checkOut[i] = checkOut[i + 1];
                fees[i] = fees[i + 1];
            }
            count--;
            System.out.println("Deleted");
        }
    }
    
    static void checkAvailability() {
        System.out.println("\nRoom\tType\t\tPrice\tStatus");
        int booked = 0;
        for (int i = 0; i < 10; i++) {
            String status = isBooked[i] ? "Booked" : "Available";
            System.out.println(availableRooms[i] + "\t" + roomType[i] + "\t" + roomPrice[i] + "\t" + status);
            if (isBooked[i]) booked++;
        }
        System.out.println("\nTotal: 10 | Booked: " + booked + " | Available: " + (10 - booked));
    }
    
    static void generateReport() {
        if (count == 0) { System.out.println("No records"); return; }
        
        int male = 0, female = 0;
        double totalFees = 0;
        for (int i = 0; i < count; i++) {
            if (gender[i].equals("M")) male++;
            else female++;
            totalFees += fees[i];
        }
        
        System.out.println("\n===== REPORT =====");
        System.out.println("Total Students: " + count);
        System.out.println("Male: " + male + " | Female: " + female);
        System.out.printf("Total Revenue: %.2f\n", totalFees);
        System.out.printf("Average Fees: %.2f\n", totalFees/count);
        
        int booked = 0;
        for (int i = 0; i < 10; i++) if (isBooked[i]) booked++;
        System.out.println("Occupancy: " + booked + "/10 (" + (booked*10) + "%)");
        
        System.out.println("\nRoom Type Distribution:");
        String[] types = {"Single AC", "Single Non-AC", "Double AC", "Double Non-AC"};
        for (String type : types) {
            int occ = 0, total = 0;
            for (int i = 0; i < 10; i++) {
                if (roomType[i].equals(type)) {
                    total++;
                    if (isBooked[i]) occ++;
                }
            }
            System.out.println(type + ": " + occ + "/" + total);
        }
    }
}