import java.io.*;
class Input_from_User
{
	public static void main(String args [ ] ) throws IOException
	{
		String str;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a String : ");
		str = br.readLine( );
		System.out.println("Length of Input String: "+str.length());
	}
}