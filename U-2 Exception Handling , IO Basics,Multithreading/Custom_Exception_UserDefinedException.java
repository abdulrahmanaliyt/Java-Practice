class InvalidMarksException extends Exception
{

}
class Custom_Exception_UserDefinedException
{
	public static void main (String [ ] args ) throws InvalidMarksException 
	{
		//int marks = 12;
		int marks = -12;
		if (marks < 0 )
			throw new InvalidMarksException();
		else 
			System.out.println("Marks: "+marks);
	}
}