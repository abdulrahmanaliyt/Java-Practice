abstract class Shape {
	abstract void displayArea();
}
class Rectangle extends Shape {
	int length;
	int width;
	
	Rectangle(int length , int width) {
		this.length = length;
		this.width = width;
	}
	@Override
	void displayArea() {
		int area = length * width;
		System.out.println("Area of Rectangle is: " +area);
		}
	}
public class Abstraction {
	public static void main (String [] args) {
		Shape shape;
		Rectangle rectangle = new Rectangle(3,4);
		shape = rectangle;
		shape.displayArea(); //Calls Overridden method
	}
}
	