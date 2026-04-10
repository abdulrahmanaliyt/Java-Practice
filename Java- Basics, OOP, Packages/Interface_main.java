interface IOperations
{
	int add(int a,int b);
	int multiply(int a, int b);
}
class ClsOperations implements IOperations
{
	public int add (int a, int b )
	{
		return a+b;
	}
	public int multiply(int a, int b)
	{
		return a*b;
	}
	int subtract (int a, int b)
	{
		return a-b;
	}
}
class Interface_main
{
	public static void main(String args[])
	{
	ClsOperations obj = new ClsOperations();
	System.out.println(obj.add(3,4));
	System.out.println(obj.multiply(3,4));
	System.out.println(obj.subtract(3,4));
	}
}