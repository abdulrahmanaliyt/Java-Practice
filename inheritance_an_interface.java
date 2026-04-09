// Define the interface Department
interface Department {
    void displayDeptDetails();
}

// Define the base class Person
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class Teacher inheriting from Person and implementing Department
class Teacher extends Person implements Department {
    String employeeId;
    String deptName;

    Teacher(String name, int age, String employeeId, String deptName) {
        super(name, age); // Call base class constructor
        this.employeeId = employeeId;
        this.deptName = deptName;
    }

    // Implementing interface method
    @Override
    public void displayDeptDetails() {
        System.out.println("Department: " + deptName);
    }

    void displayTeacherDetails() {
        displayPersonDetails(); // Call method from Person
        System.out.println("Employee ID: " + employeeId);
        displayDeptDetails();    // Call method from Department
    }
}

// Main class to run the demonstration
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Alice Smith", 35, "T101", "Computer Science");
        
        System.out.println("--- Teacher and Department Details ---");
        t1.displayTeacherDetails();
    }
}
