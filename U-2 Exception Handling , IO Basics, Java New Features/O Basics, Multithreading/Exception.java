class Exception
{
	public static void main ( String args [ ] ) 
	{
		int d = 20;
		d = d/0;
		System.out.println("d = "+d);
/* 
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exception.main(Exception.java:6)
*/
	}
}