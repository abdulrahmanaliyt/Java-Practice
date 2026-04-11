//First of all create file with name Sample.txt in CurrentWorkinfDirectory

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReading_all_available_Bytes_Stream{
	public static void main(String [ ] args) throws FileNotFoundException, IOException {
		System.out.println("Looking in: " + new java.io.File(".").getAbsolutePath());
		
		FileInputStream fis = new FileInputStream("Sample.txt");
		
		System.out.println("Available Bytes in file : "+fis.available());

		int byteRead = fis.read( );
		System.out.println((char)byteRead);
		byteRead = fis.read( );
		System.out.println((char)byteRead);
		byteRead = fis.read( );
		System.out.println((char)byteRead);
		byteRead = fis.read( );
		System.out.println((char)byteRead);

		byte [ ] fourBytesRead = new byte [ 4 ];
		fis.read(fourBytesRead);
		System.out.println(new String(fourBytesRead));

		System.out.println("Available Bytes: "+fis.available( ) );

		fis.skip(2);
		fis.read(fourBytesRead);
		System.out.println(new String(fourBytesRead));

		System.out.println(fis.read(fourBytesRead,2,2));
		fis.read(fourBytesRead, 0, 2);
		System.out.println(new String(fourBytesRead));

		System.out.println("Available Bytes: "+fis.available( ) );

		byte [ ] twoBytesRead = fis.readNBytes(2);
		System.out.println(new String(twoBytesRead));

		System.out.println("Available Bytes: "+fis.available( ) );
		
		//reading all available
		byte[] allBytes = fis.readAllBytes();
		System.out.println(new String(allBytes));

		System.out.println("Available Bytes: "+fis.available( ) );

		fis.close( );
	}
}