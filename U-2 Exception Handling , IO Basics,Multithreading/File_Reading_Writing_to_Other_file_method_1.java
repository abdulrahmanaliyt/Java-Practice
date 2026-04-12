import java.io.*;
class File_Reading_Writing_to_Other_file_method_1
{
	public static void main(String [] args) throws FileNotFoundException, IOException
	{
		FileInputStream fis = new FileInputStream("Sample.txt");
		FileOutputStream fos = new FileOutputStream("SampleCopy.txt");
		

		int ch ;
		ch = fis.read( );
		while(ch !=-1)
		{
			System.out.println( (char)ch);
			fos.write(ch);
			ch = fis.read();
		}
		fis.close( );
		fos.close( );
	}
}