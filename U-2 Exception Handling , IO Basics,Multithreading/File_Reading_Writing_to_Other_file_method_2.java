import java.io.*;
class File_Reading_Writing_to_Other_file_method_2
{
	public static void main(String [] args) throws FileNotFoundException, IOException
	{
		FileReader fis = new FileReader("Sample.txt");
		FileWriter fos = new FileWriter("SampleCopy.txt");
		

		int ch ;
		ch = fis.read( );
		while(ch !=-1)
		{
			System.out.print( (char)ch);
			fos.write(ch);
			ch = fis.read();
		}
		fis.close( );
		fos.close( );
	}
}