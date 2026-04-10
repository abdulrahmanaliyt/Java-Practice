class Rectangle {
    private int length;
    private int width;

    // Default Constructor
    Rectangle() {
        length = 2;
        width = 2;
    }

    // Parameterized Constructor
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Constructor for a Square (Single dimension)
    Rectangle(int dim) {
        this.length = dim;
        this.width = dim;
    }

    public void setLength(int length) {
        this.length = length;
    }

   
    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    int area() {
        return length * width;
    }
}

class Rectangle_Constructor_Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Length of r1: " + r1.getLength());
        System.out.println("Width of r1: " + r1.getWidth());
        System.out.println("Area of r1: " + r1.area());
        System.out.println("---");

        Rectangle r2 = new Rectangle(5, 6);
        System.out.println("Length of r2: " + r2.getLength());
        System.out.println("Width of r2: " + r2.getWidth());
        System.out.println("Area of r2: " + r2.area());
        System.out.println("---");

        Rectangle r3 = new Rectangle(7);
        System.out.println("Length of r3: " + r3.getLength());
        System.out.println("Width of r3: " + r3.getWidth());
        System.out.println("Area of r3: " + r3.area());
    }
}