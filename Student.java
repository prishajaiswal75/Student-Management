import java.util.Date;
public class Student {
    private String prn;  // Unique ID for each student
    private String name;
    private Date dob;
    private double marks;
    // Constructor to initialize student details
    public Student(String prn, String name, Date dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }
