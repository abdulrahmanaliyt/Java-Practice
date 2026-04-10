import java.io.IOException;
class UnChecked_Exception
{
	public static void myMethod( ) //throws IOException
	{
		throw new NumberFormatException( );
		//throw new IOException( );  //Checked Exception
	}
	public static void main (String args [ ] ) //throws IOException
	{
		myMethod ( ) ;
	}
}