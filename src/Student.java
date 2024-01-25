public class Student extends Person {
    private double gpa;
    private static final double STIPEND = 36660.00;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String getPosition() {
        return "Student";
    }

    // returns the stipend if the gpa is greater than 2.67, or zero otherwise
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return STIPEND;
        } else {
            return 0.0;
        }
    }

    // returns a formatted string with the class name and the super toString method
    public String toString() {
        return "Student: " + super.toString();
    }
}
