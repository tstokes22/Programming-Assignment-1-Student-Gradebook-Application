import java.util.Scanner;

public class StudentGradebookApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student full name: ");
        String name = input.nextLine();

        System.out.print("Enter course name: ");
        String course = input.nextLine();

        System.out.print("Enter score for Test 1: ");
        while (!input.hasNextDouble()) {
            System.out.print("Invalid input not a number! \n");
            System.out.print("Enter score for Test 1: ");
            input.next();
        }
        double test1 = input.nextDouble();

        System.out.print("Enter score for Test 2: ");
        while (!input.hasNextDouble()) {
            System.out.print("Invalid input not a number! \n");
            System.out.print("Enter score for Test 2: ");
            input.next();
        }
        double test2 = input.nextDouble();

        System.out.print("Enter score for Test 3: ");
        while (!input.hasNextDouble()) {
            System.out.print("Invalid input not a number! \n");
            System.out.print("Enter score for Test 3: ");
            input.next();
        }
        double test3 = input.nextDouble();

        Student student = new Student();

        student.setName(name);
        student.setCourse(course);
        student.setScores(test1, test2, test3);

        student.getStudentReport(student);
    }
}