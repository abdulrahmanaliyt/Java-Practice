import java.io.IOException;
class Checked_Exception
{
	public static void myMethod( ) throws IOException
	{
		throw new IOException( );  //Checked Exception
	}
	public static void main (String args [ ] ) throws IOException
	{
		myMethod ( ) ;
	}
}