public class Throw_Keyword
{
	public static void main ( String [ ] args )
	{
		try
		{
			throw new NullPointerException("Object refrence points to null!");
		}
		catch (NullPointerException npe)
		{
			System.out.println(npe);
		}
	}
}