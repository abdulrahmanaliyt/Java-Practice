class Rectangle_2 { 
    private int length;
    private int width;
    
    public void setLength(int len) {
        length = len;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int wid) {
        width = wid;
    }

    public int getWidth() {
        return width;
    }

    // Adding the area method since it was called in main
    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }
}

class Rectangle_Get_Set_Main {
    public static void main(String[] args) { 
        
        Rectangle_2 r1 = new Rectangle_2();

        // Use parentheses () to call the methods
        r1.setLength(2); 
        r1.setWidth(3);
        
        // Using the getter just to show how it works
        System.out.println("Width is: " + r1.getWidth());
        System.out.println("Area: " + r1.area());    
    }
}