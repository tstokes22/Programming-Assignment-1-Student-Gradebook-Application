public class Student {
    private String name;

    private String course;

    private double test1;

    private double test2;

    private double test3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setScores(double t1, double t2, double t3) {
        this.test1 = t1;
        this.test2 = t2;
        this.test3 = t3;
    }

    public double getTest1() {
        return test1;
    }

    public double getTest2() {
        return test2;
    }

    public double getTest3() {
        return test3;
    }

    public double getAverage(double t1, double t2, double t3){
        return (t1 + t2 + t3) / 3;
    }

    public String getLetterGrade(double averageScore) {
        if (averageScore >= 90.0){
            return "A";
        }else if (averageScore >= 80.0){
            return "B";
        }else if (averageScore >= 70.0) {
            return "C";
        }else if (averageScore >= 60.0) {
            return "D";
        }else return "F";
    }

    public void getStudentReport(Student student){
        System.out.print("\n--- Student Report ---\n");
        System.out.print("Name: " + student.getName() + '\n');
        System.out.print("Course: " + student.getCourse() + '\n');
        System.out.print("Test scores: " + student.getTest1() + ", " + student.getTest2() + ", " + student.getTest3() + '\n');
        System.out.printf("Test Average: %.2f", student.getAverage(student.getTest1(), student.getTest2(), student.getTest3()));
        System.out.print("\nGrade: " + student.getLetterGrade(student.getAverage(student.getTest1(), student.getTest2(), student.getTest3())) + '\n');
    }
}
