// 1. Rename this class to match what you use in main
class Rectangle1{ 
    private int length;
    private int width;

    public int area() {
        return length * width;
    }
    
    // Adding this so the code doesn't crash on the perimeter call
    public int perimeter() {
        return 2 * (length + width);
    }
}

class Rectangle_access_Main{
    public static void main(String[] args) { 
        // 2. Now it will look at the class ABOVE
        Rectangle1 r1 = new Rectangle1();

        // 3. THIS will now finally cause the "private access" error
        r1.length = 2; 
        r1.width = 3;
        
        System.out.println("Area: " + r1.area());    
    }
}