package comprog2;
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String program;
    private String degree;
    private String studentID;
    private double gpa;
    private String course;

    // Constructor with all parameters
    public Student(String firstName, String lastName, int age, String gender,
                   String program, String degree, String studentID, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.program = program;
        this.degree = degree;
        this.studentID = studentID;
        this.gpa = gpa;
    }

    // Default constructor
    public Student() {
        // Empty body
    }

    // Getter and setter methods for all fields
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Method to display student information
    public void displayStudentInformation() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Program: " + program);
        System.out.println("Degree: " + degree);
        System.out.println("Student ID: " + studentID);
        System.out.println("GPA: " + gpa);
        System.out.println("Course: " + course);
    }
}
