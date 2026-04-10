class Rectangle {
    int length, width;

    int perimeter() {
        return 2 * (length + width);
    }

    int area() {
        return length * width;
    }
}

class RectangleMain {
    public static void main(String[] args) { 

        	Rectangle r1 = new Rectangle();
 	Rectangle r2 = new Rectangle();
 	Rectangle r3 = new Rectangle();

        	r1.length = 2;
       	r1.width = 3;

        	r2.length = 3;
       	r2.width = 3;

        	r3.length = 5;
       	r3.width = 1;
        
        // Added a '+' before "and perimeter"
        	System.out.println("Rectangle:1 -> Area is = " + r1.area() + " and perimeter is = " + r1.perimeter());
	System.out.println("Rectangle:2 -> Area is = " + r2.area() + " and perimeter is = " + r2.perimeter());
	System.out.println("Rectangle:3 -> Area is = " + r3.area() + " and perimeter is = " + r3.perimeter());
    }
}