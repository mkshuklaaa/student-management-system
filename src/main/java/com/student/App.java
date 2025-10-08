package com.student;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n=== STUDENT MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter course: ");
                    String course = sc.nextLine();
                    dao.addStudent(new Student(name, age, course));
                    break;

                case 2:
                    dao.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int idu = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String n = sc.nextLine();
                    System.out.print("Enter new age: ");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new course: ");
                    String c = sc.nextLine();
                    dao.updateStudent(idu, n, a, c);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int idd = sc.nextInt();
                    dao.deleteStudent(idd);
                    break;

                case 5:
                    System.out.println("👋 Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}
