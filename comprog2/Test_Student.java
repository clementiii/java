package comprog2;
public class Test_Student {
    public static void main(String[] args) {
        // Create object of Student class using constructor
        Student student1 = new Student("John", "Doe", 22, "Male", "Computer Science", "BS", "CSE101", 3.5);

        // Create object of Student class using default constructor and set other details
        Student student2 = new Student();
        student2.setFirstName("Alice");
        student2.setLastName("Smith");
        student2.setAge(20);
        student2.setGender("Female");
        student2.setProgram("Information Technology");
        student2.setCourse("IT Service Management");
        student2.setStudentID("ITM101");
        student2.setGPA(3.9);

        // Create object of Student class using constructor and set other details
        Student student3 = new Student("Bob", "Johnson", 21, "Male", "Information Technology", "BS", "ITM101", 3.7);
        student3.setCourse("IT Service Management");

        // Display details of student1
        System.out.println("Student 1 Details:");
        System.out.println("Name: " + student1.getFirstName() + " " + student1.getLastName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Gender: " + student1.getGender());
        System.out.println("Program: " + student1.getProgram());
        System.out.println("Course: " + student1.getCourse());
        System.out.println("Student ID: " + student1.getStudentID());
        System.out.println("GPA: " + student1.getGPA());

        // Display details of student2 using displayStudentInformation() method
        System.out.println("\nStudent 2 Details:");
        student2.displayStudentInformation();

        // Display details of student3 using displayStudentInformation() method
        System.out.println("\nStudent 3 Details:");
        student3.displayStudentInformation();
    }
}
