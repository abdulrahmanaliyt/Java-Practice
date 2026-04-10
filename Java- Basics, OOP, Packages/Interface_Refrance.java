interface IOperations
{	
	int add(int a,int b);		
}
class ClsOperations implements IOperations
{
	public int add (int a, int b )
	{
		return a+b;
	}
}
class ClsOperations2 implements IOperations
{
	public int add(int a,int b)	
	{
		return a*a + b*b;
	}
}
public class Interface_Refrance
{
	public static void main(String args[])
	{
	IOperations ref;
	ClsOperations obj1 = new ClsOperations();
	ClsOperations2 obj2 = new ClsOperations2();
	
	ref = obj1;
	System.out.println(ref.add(2,3));
	ref = obj2;
	System.out.println(ref.add(2,3));	
	}
}