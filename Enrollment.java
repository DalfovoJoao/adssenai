public class Enrollment {
    private final String studentName;
    private final String courseName;
    private double firstGrade;
    private double secondGrade;

    public Enrollment(String studentName, String courseName) {
        if (studentName == null || studentName.isBlank() || courseName == null || courseName.isBlank()) {
            throw new IllegalArgumentException("Student and course names are required.");
        }
        this.studentName = studentName.trim();
        this.courseName = courseName.trim();
    }

    public void setGrades(double firstGrade, double secondGrade) {
        validateGrade(firstGrade);
        validateGrade(secondGrade);
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
    }

    private void validateGrade(double grade) {
        if (!Double.isFinite(grade) || grade < 0 || grade > 10) {
            throw new IllegalArgumentException("Grades must be between 0 and 10.");
        }
    }

    public double calculateAverage() {
        return (firstGrade + secondGrade) / 2;
    }

    public boolean isApproved() {
        return calculateAverage() >= 7.0;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }
}
