interface IOperations 
{
	int add (int a, int b);
	default int scale(int a)
	{
		return a*2;
	}
	default int scale(int a)
	{
		return a*3;
	}
}
class ClsOperations implements IOperations
{
	public int add(int a ,int b)
	{
		return a+b;
	}
}
class Default_keyword
{
	public static void main( String args [ ] )
	{
		ClsOperations obj = new ClsOperations();
		System.out.println(obj.add(4,5));
		System.out.println(obj.scale(3));
	}
}
