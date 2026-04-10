class A
{
	// private int x=10;	
	protected int x;

	A()
	{
		System.out.println("Super Class Constructor");
		x= 10;
	}

	int getX()
	{
		return x;
	}
}
class B extends A
{
	int y;
	B()
	{
	System.out.println("Sub class Constructor");
	y=20;
	}

	void display()
	{
	System.out.println(x+" and "+ y);
	System.out.println(getX());

	}
}
class Constructor_in_Inheritance
{
	public static void main(String [] args)
	{

	B obj = new B();
	obj.display(); 
	}
}
