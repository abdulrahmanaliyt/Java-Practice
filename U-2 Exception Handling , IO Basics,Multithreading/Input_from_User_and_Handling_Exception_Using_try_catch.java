import java.io.*;
class Input_from_User_and_Handling_Exception_Using_try_catch
{
	public static void main(String args [ ] ) //throws IOException
	{
		String str = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a String : ");
		try{
			str = br.readLine( );
			// Move this inside so it only runs if reading was successful
			System.out.println("Length of Input String: "+str.length());
		}
		catch (IOException ioe)
		{
			System.out.println("Error reading input: " + ioe);
		}

	}
}