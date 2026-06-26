import java.util.*;

/*
Question: Marksheet Creation System
*/

public class Q108 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int[] r = new int[100];
        String[] n = new String[100];
        int[] eng = new int[100];
        int[] math = new int[100];
        int[] sci = new int[100];
        int[] cs = new int[100];
        int[] hindi = new int[100];
        int[] total = new int[100];
        double[] per = new double[100];
        String[] grade = new String[100];
        int c = 0;
        int id = 1;
        
        while (true) {
            System.out.println("\n===== MARKSHEET SYSTEM =====");
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
                System.out.print("English: ");
                int e = sc.nextInt();
                System.out.print("Mathematics: ");
                int m = sc.nextInt();
                System.out.print("Science: ");
                int s = sc.nextInt();
                System.out.print("Computer Science: ");
                int cs1 = sc.nextInt();
                System.out.print("Hindi: ");
                int h = sc.nextInt();
                
                int tot = e + m + s + cs1 + h;
                double p = (double)tot / 5;
                String g;
                if (p >= 90) g = "A+";
                else if (p >= 80) g = "A";
                else if (p >= 70) g = "B+";
                else if (p >= 60) g = "B";
                else if (p >= 50) g = "C";
                else if (p >= 40) g = "D";
                else g = "F";
                
                r[c] = id++;
                n[c] = nm;
                eng[c] = e;
                math[c] = m;
                sci[c] = s;
                cs[c] = cs1;
                hindi[c] = h;
                total[c] = tot;
                per[c] = p;
                grade[c] = g;
                c++;
                System.out.println("Added! Roll: " + (id-1));
                System.out.println("Total: " + tot + " | Percentage: " + p + " | Grade: " + g);
            }
            else if (ch == 2) {
                if (c == 0) {
                    System.out.println("No records");
                } else {
                    System.out.println("\n+------+------------------+-------+-------+-------+-------+-------+-------+----------+-------+");
                    System.out.printf("| %-4s | %-16s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-8s | %-5s |\n", 
                                    "Roll", "Name", "Eng", "Math", "Sci", "CS", "Hindi", "Total", "Percent", "Grade");
                    System.out.println("+------+------------------+-------+-------+-------+-------+-------+-------+----------+-------+");
                    for (int i = 0; i < c; i++) {
                        System.out.printf("| %-4d | %-16s | %-5d | %-5d | %-5d | %-5d | %-5d | %-5d | %-8.2f | %-5s |\n", 
                                        r[i], n[i], eng[i], math[i], sci[i], cs[i], hindi[i], total[i], per[i], grade[i]);
                    }
                    System.out.println("+------+------------------+-------+-------+-------+-------+-------+-------+----------+-------+");
                }
            }
            else if (ch == 3) {
                System.out.print("Enter Roll: ");
                int roll = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (r[i] == roll) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.println("\nName: " + n[found]);
                    System.out.println("English: " + eng[found]);
                    System.out.println("Mathematics: " + math[found]);
                    System.out.println("Science: " + sci[found]);
                    System.out.println("Computer Science: " + cs[found]);
                    System.out.println("Hindi: " + hindi[found]);
                    System.out.println("Total: " + total[found]);
                    System.out.println("Percentage: " + per[found]);
                    System.out.println("Grade: " + grade[found]);
                }
            }
            else if (ch == 4) {
                System.out.print("Enter Roll: ");
                int roll = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (r[i] == roll) {
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
                    System.out.print("English: ");
                    int e = sc.nextInt();
                    System.out.print("Mathematics: ");
                    int m = sc.nextInt();
                    System.out.print("Science: ");
                    int s = sc.nextInt();
                    System.out.print("Computer Science: ");
                    int cs1 = sc.nextInt();
                    System.out.print("Hindi: ");
                    int h = sc.nextInt();
                    
                    int tot = e + m + s + cs1 + h;
                    double p = (double)tot / 5;
                    String g;
                    if (p >= 90) g = "A+";
                    else if (p >= 80) g = "A";
                    else if (p >= 70) g = "B+";
                    else if (p >= 60) g = "B";
                    else if (p >= 50) g = "C";
                    else if (p >= 40) g = "D";
                    else g = "F";
                    
                    n[found] = nm;
                    eng[found] = e;
                    math[found] = m;
                    sci[found] = s;
                    cs[found] = cs1;
                    hindi[found] = h;
                    total[found] = tot;
                    per[found] = p;
                    grade[found] = g;
                    System.out.println("Updated");
                }
            }
            else if (ch == 5) {
                System.out.print("Enter Roll: ");
                int roll = sc.nextInt();
                int found = -1;
                for (int i = 0; i < c; i++) {
                    if (r[i] == roll) {
                        found = i;
                        break;
                    }
                }
                if (found == -1) {
                    System.out.println("Not found");
                } else {
                    for (int i = found; i < c - 1; i++) {
                        r[i] = r[i + 1];
                        n[i] = n[i + 1];
                        eng[i] = eng[i + 1];
                        math[i] = math[i + 1];
                        sci[i] = sci[i + 1];
                        cs[i] = cs[i + 1];
                        hindi[i] = hindi[i + 1];
                        total[i] = total[i + 1];
                        per[i] = per[i + 1];
                        grade[i] = grade[i + 1];
                    }
                    c--;
                    System.out.println("Deleted");
                }
            }
            else if (ch == 6) {
                if (c == 0) {
                    System.out.println("No records");
                } else {
                    int sumTotal = 0;
                    double sumPer = 0;
                    int maxMarks = total[0], minMarks = total[0];
                    String maxName = n[0], minName = n[0];
                    int pass = 0, fail = 0;
                    
                    for (int i = 0; i < c; i++) {
                        sumTotal += total[i];
                        sumPer += per[i];
                        if (total[i] > maxMarks) {
                            maxMarks = total[i];
                            maxName = n[i];
                        }
                        if (total[i] < minMarks) {
                            minMarks = total[i];
                            minName = n[i];
                        }
                        if (grade[i].equals("F")) fail++;
                        else pass++;
                    }
                    
                    System.out.println("\n+------------------+------------------+");
                    System.out.printf("| %-16s | %-16s |\n", "Metric", "Value");
                    System.out.println("+------------------+------------------+");
                    System.out.printf("| %-16s | %-16d |\n", "Students", c);
                    System.out.printf("| %-16s | %-16d |\n", "Passed", pass);
                    System.out.printf("| %-16s | %-16d |\n", "Failed", fail);
                    System.out.printf("| %-16s | %-16.2f |\n", "Avg Total", (double)sumTotal/c);
                    System.out.printf("| %-16s | %-16.2f |\n", "Avg Percentage", sumPer/c);
                    System.out.printf("| %-16s | %-16d |\n", "Highest", maxMarks);
                    System.out.printf("| %-16s | %-16s |\n", "Topper", maxName);
                    System.out.printf("| %-16s | %-16d |\n", "Lowest", minMarks);
                    System.out.printf("| %-16s | %-16s |\n", "Lowest Scorer", minName);
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