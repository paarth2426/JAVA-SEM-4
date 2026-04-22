// Base Class: Person
class Person {
    protected String name;
    protected int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived Class: Student (Inherits from Person)
class Student extends Person {
    protected int rollNumber;
    protected double marks;

    // Constructor for Student
    public Student(String name, int age, int rollNumber, double marks) {
        super(name, age); // Calling base class constructor
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayStudentInfo() {
        displayPersonInfo(); // Reusing base class method
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks + "%");
    }
}

// Further Extended Class: GraduateStudent (Inherits from Student)
class GraduateStudent extends Student {
    private String specialization;

    // Constructor for GraduateStudent
    public GraduateStudent(String name, int age, int rollNumber, double marks, String specialization) {
        super(name, age, rollNumber, marks); // Calling Student constructor
        this.specialization = specialization;
    }

    // Method to display complete information
    public void displayFullProfile() {
        System.out.println("--- Graduate Student Profile ---");
        displayStudentInfo(); // Reusing Student (and Person) methods
        System.out.println("Specialization: " + specialization);
        System.out.println("--------------------------------");
    }
}

// Main Class to test the logic
public class StudentManagementSystem {
    public static void main(String[] args) {
        // Creating an instance of GraduateStudent
        GraduateStudent grad = new GraduateStudent("Alice Smith", 24, 101, 88.5, "Data Science");

        // Displaying inherited and specific properties
        grad.displayFullProfile();
    }
}
