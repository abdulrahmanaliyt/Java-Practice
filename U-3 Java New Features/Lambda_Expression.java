//Functional Interfaces

@FunctionalInterface
interface IOperations
{
	int myOperation (int a );
	// void anotherMethod(); // This would now cause a compiler error!
}
class Lambda_Expression
{
	public static void main (String [ ] args )
	{
		//Lambda_Expression declaration
		//IOperations ref = (int a ) -> { return a*a; };	

		// No 'int' needed, no braces, no 'return'
		
		/* more consize
		if a lambda has only one expression, 
		you can remove the int type (it's inferred), 
		the curly braces, and the return keyword. */

		IOperations ref = a -> a * a;
		System.out.println(ref.myOperation(4));
	}
}
