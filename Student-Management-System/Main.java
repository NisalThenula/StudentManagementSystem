import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while(true) {


            System.out.println("\n1.Add Student");
            System.out.println("2.View Students");
            System.out.println("3.Search Student");
            System.out.println("4.Exit");
            System.out.print("Enter a number: ");



            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println(" ");
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Course: ");
                    String course = sc.nextLine();

                    manager.addStudent(new Student(id,name,course));
                    break;

                case 2:
                    System.out.println(" ");
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.println(" ");
                    System.out.print("Enter ID: ");
                    int searchId = sc.nextInt();

                    Student s = manager.searchStudent(searchId);

                    if(s != null)
                        s.displayInfo();
                    else
                        System.out.println("Student not found!!");
                    break;

                case 4:
                    System.out.println(" ");
                    System.exit(0);
            }
        }
    }
}
