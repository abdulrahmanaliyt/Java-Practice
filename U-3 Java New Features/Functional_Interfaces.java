//Functional Interfaces

interface IOperations
{
	int myOperation (int a );
}
class MyOperations implements IOperations
{
	@Override
	public int myOperation(int a )
	{
		return a*a;
	}
}
class Functional_Interfaces
{
	public static void main (String [ ] args )
	{
		IOperations ref;
		ref = new MyOperations( );
		System.out.println(ref.myOperation(4));
	}
}
