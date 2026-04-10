class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Dynamic_Method_Dispatch{
    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        Shape shapeRef;

        shapeRef = shape;
        shapeRef.draw(); // Output: Drawing a shape

        shapeRef = rectangle;
        shapeRef.draw(); // Output: Drawing a rectangle

        shapeRef = circle;
        shapeRef.draw(); // Output: Drawing a circle
    }
}