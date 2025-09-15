import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student by ID");
            System.out.println("5. Show All Students");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice;
            if(sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                System.out.println("❌ Invalid input! Please enter a number.");
                sc.nextLine(); // clear invalid input
                continue;
            }

            sc.nextLine(); // clear leftover newline after nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine(); // full name
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); // clear buffer before grade
                    System.out.print("Enter grade: ");
                    String grade = sc.nextLine();
                    dao.addStudent(new Student(name, age, grade));
                    break;

                case 2:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter name: ");
                    name = sc.nextLine();
                    System.out.print("Enter age: ");
                    age = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter grade: ");
                    grade = sc.nextLine();
                    dao.updateStudent(uid, name, age, grade);
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    dao.deleteStudent(did);
                    break;

                case 4:
                    System.out.print("Enter ID to search: ");
                    int sid = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    dao.getStudentById(sid);
                    break;

                case 5:
                    dao.getAllStudents();
                    break;

                case 6:
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
