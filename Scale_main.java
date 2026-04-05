interface IOperations
{
	int SCALE_FACTOR = 2;

	int scale(int a);
	int add(int a,int b);
	int multiply(int a, int b);
	
}
abstract class ClsOperations implements IOperations
{
	public int add (int a, int b )
	{
		return a+b;
	}
	
	public int scale(int a)
	{
		return a*SCALE_FACTOR;
	}
	int subtract (int a, int b)
	{
		return a-b;
	}
}
class MyClass extends ClsOperations
{
	public int multiply(int a, int b)
	{
		return a*b;
	}
}
class Scale_main
{
	public static void main(String args[])
	{
	MyClass obj = new MyClass();
	System.out.println(obj.add(3,4));
	System.out.println(obj.multiply(3,4));
	System.out.println(obj.subtract(3,4));
	System.out.println(obj.scale(3));
	}
}