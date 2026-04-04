class A
{
	// private int x=10;	
	protected int x=10;
	int getX()
	{
		return x;
	}
}
class B extends A
{
	void display()
	{
//Access_Class.java:13: error: x has private access in A
	System.out.println(x);
	System.out.println(getX());

	}
}
class Access_Class
{
	public static void main(String [] args)
	{

	B obj = new B();
	obj.display(); 
	}
}
