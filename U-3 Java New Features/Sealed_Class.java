// 1. Sealed superclass restricting inheritance to specific subclasses
sealed class Shape permits Circle, Triangle, Rectangle {
    void display() {
        System.out.println("Shape - The sealed super class.");
    }
}

// 2. Final subclass: No further inheritance allowed
final class Circle extends Shape {
    @Override
    void display() {
        System.out.println("Circle - The final subclass.");
    }
}

// 3. Non-sealed subclass: Opens the hierarchy back up to any class
non-sealed class Triangle extends Shape {
    @Override
    void display() {
        System.out.println("Triangle - The non-sealed subclass.");
    }
}

// 4. Sealed subclass: Restricts its own inheritance to Square
sealed class Rectangle extends Shape permits Square {
    @Override
    void display() {
        System.out.println("Rectangle - The sealed subclass.");
    }
}

// 5. Final subclass of the sealed Rectangle
final class Square extends Rectangle {
    @Override
    void display() {
        System.out.println("Square - The final subclass of sealed Rectangle.");
    }
}

public class Sealed_Class {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        shape.display();
        circle.display();
        triangle.display();
        rectangle.display();
        square.display();
    }
}