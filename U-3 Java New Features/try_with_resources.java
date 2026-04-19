import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class try_with_resources
{
	public static void main(String[] args) throws IOException
	{
		try (FileInputStream fis = new FileInputStream("Sample.txt");
		FileOutputStream fos = new FileOutputStream("SampleCopy.txt")) 
		{
			int read = fis.read();
			while (read != -1) 
			{
			fos.write(read);
			read = fis.read();
			}
		} 
		catch (IOException e) 
		{
		System.out.println(e);
		}
	}
}