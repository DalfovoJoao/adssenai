import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student Grade Management ===");
        System.out.print("Student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Course name: ");
        String courseName = scanner.nextLine();

        try {
            Enrollment enrollment = new Enrollment(studentName, courseName);
            System.out.print("First grade (0-10): ");
            double firstGrade = Double.parseDouble(scanner.nextLine());
            System.out.print("Second grade (0-10): ");
            double secondGrade = Double.parseDouble(scanner.nextLine());
            enrollment.setGrades(firstGrade, secondGrade);

            System.out.println("\n--- Student Report ---");
            System.out.println("Student: " + enrollment.getStudentName());
            System.out.println("Course: " + enrollment.getCourseName());
            System.out.printf("Average: %.2f%n", enrollment.calculateAverage());
            System.out.println("Status: " + (enrollment.isApproved() ? "Approved" : "Not approved"));
        } catch (NumberFormatException error) {
            System.out.println("Invalid input. Please enter numbers for grades.");
        } catch (IllegalArgumentException error) {
            System.out.println("Error: " + error.getMessage());
        }
    }
}
