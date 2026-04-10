class MyClass
{
	int operand1;
	int operand2;
	
	int add()
	{
		return operand1 + operand2;
	}
}
class MainMethodClass
{
	public static void main(String args[])
	{
	MyClass obj = new MyClass();
	obj.operand1 = 2;
	obj.operand2 = 3;
	System.out.println("Result is: "+obj.add());
	}
}