public class Throw_Keyword_getMessage
{
	public static void main ( String [ ] args )
	{
		try
		{
			throw new NullPointerException("Throwing NullPointerException! :");
		}
		catch (NullPointerException npe)
		{
			System.out.println(npe.getMessage());
		}
	}
}