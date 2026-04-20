// The record automatically creates: 
// final fields, a constructor, getters (without the 'get' prefix), 
// equals(), hashCode(), and toString().
record Student(int rollNo, String name) { }

public class Records_Keyword{
    public static void main(String[] args) {
        Student student1 = new Student(1, "Anubhav");
        Student student2 = new Student(1, "Anubhav");

        // 1. Accessing data (Notice: it's rollNo(), not getRollNo())
        System.out.println("Roll No: " + student1.rollNo());
        System.out.println("Name: " + student1.name());

        // 2. Structural Equality (Records compare data, not memory addresses)
        System.out.println("Are they equal? " + student1.equals(student2));

        // 3. HashCodes (Generated based on the field values)
        System.out.println("Student1 HashCode: " + student1.hashCode());
        System.out.println("Student2 HashCode: " + student2.hashCode());

        // 4. Automatic toString()
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
    }
}