import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {

            System.out.println("\n===== Student Result Manager =====");
            System.out.println("1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Show Top Performer");
            System.out.println("4.Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    manager.addStudent(
                        new Student(id, name, marks)
                    );

                    System.out.println("Student Added!");
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    manager.findTopper();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
