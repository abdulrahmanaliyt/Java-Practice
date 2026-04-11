class InvalidMarksException extends Exception
{ 
	String desc;
	InvalidMarksException (String message)
	{
		super(message);
		desc = message;
	}
	public String toString( )
	{
		return "Invalid Marks: "+desc;
	}
}
class InvalidMarksException_UserDefinedException
{
	public static void main (String [ ] args ) 
	{
		//int marks = 12;
		int marks = -12;
		try 
		{
			if (marks < 0 )
				throw new InvalidMarksException("You have awarded negative marks");
			else 
				System.out.println("Marks: "+marks);
		}
		catch(InvalidMarksException ime)
		{
			System.out.println(ime);
			System.out.println(ime.getMessage());
			ime.printStackTrace( );
		}
	}
}