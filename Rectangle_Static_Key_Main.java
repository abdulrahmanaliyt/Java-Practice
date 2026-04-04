class Rectangle {
    private int length;
    private int width;
    
    // 1. Declare the static variable (Mandatory)
    static int objectCount; 

    static {
        objectCount = 0;
        System.out.println("--- Static block executed: Class loaded ---");
    }

    // 2. Static method to show the shared count
    static void showObjCount() {
        System.out.println("Total Rectangle Objects created so far: " + objectCount);
    }

    Rectangle() {
        length = 2;
        width = 2;
        objectCount++;
    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        objectCount++;
    }

    Rectangle(int dim) {
        this.length = dim;
        this.width = dim;
        objectCount++;
    }

    public int getLength() { return length; }
    public int getWidth() { return width; }
    public int area() { return length * width; }
}

class Rectangle_Static_Key_Main {
    public static void main(String[] args) {
        // --- Rectangle 1 (Default) ---
        Rectangle r1 = new Rectangle();
        System.out.println("Length of r1: " + r1.getLength());
        System.out.println("Width of r1: " + r1.getWidth());
        System.out.println("Area of r1: " + r1.area());
        Rectangle.showObjCount();
        System.out.println("---------------------------");

        // --- Rectangle 2 (Parameterized) ---
        Rectangle r2 = new Rectangle(5, 6);
        System.out.println("Length of r2: " + r2.getLength());
        System.out.println("Width of r2: " + r2.getWidth());
        System.out.println("Area of r2: " + r2.area());
        Rectangle.showObjCount();
        System.out.println("---------------------------");

        // --- Rectangle 3 (Square) ---
        Rectangle r3 = new Rectangle(7);
        System.out.println("Length of r3: " + r3.getLength());
        System.out.println("Width of r3: " + r3.getWidth());
        System.out.println("Area of r3: " + r3.area());
        Rectangle.showObjCount();
    }
}