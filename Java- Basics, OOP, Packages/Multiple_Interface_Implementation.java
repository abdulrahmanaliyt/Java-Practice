interface A
{
	void show();
}
interface B
{
	void show();
}
class MyClass implements A,B
{
	public void show()
	{
		System.out.println("The show() method");
	}
	public void methodA()
	{
		System.out.println("The showA() method");
	}
	public void methodB()
	{
		System.out.println("The showB() method");
	}
}
class Multiple_Interface_Implementation
{
	public static void main (String args [] )
	{
		MyClass obj = new MyClass();
		obj.show();
		obj.methodA();
		obj.methodB();
	}
}