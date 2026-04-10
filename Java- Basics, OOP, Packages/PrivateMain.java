interface IDBOps
{
	default void insert() {
		System.out.println("Record updated !");
		log("INSERT");
	}
	default void update() {
		System.out.println("Record updated !");
		log("UPDATE");
	}
	private void log(String op)
	{
		System.out.println("Operation Logged: "+op);
	}
}
class MyClass implements IDBOps
{
}
class PrivateMain 
{
	public static void main (String args [ ] )
	{
	MyClass obj = new MyClass();
	obj.insert();
	obj.update();
	}
}
	