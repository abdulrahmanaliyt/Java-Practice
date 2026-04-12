import java.io.*;
public class FileWriting_Using_ByteStream
{
	public static void main (String [ ] args ) throws FileNotFoundException,IOException 
		{
		FileOutputStream fos = new FileOutputStream ("D:\\Git Coding\\College\\Java Practice\\Sample_Writing.txt");
		fos.write(65); //writes A
		fos.write(66); //writes B

		byte [ ] bytes1 = {67,68,69,70};
		System.out.println(new String(bytes1)); //CDEF
		fos.write(bytes1); //writes CDEF

		byte [ ] bytes2 = {71,72,73,74,75,76,77,78};
		System.out.println(new String(bytes2)); //GHIJKLMN
		fos.write(bytes2, 2, 4); //writes IJKL

		fos.close( );
		
		fos = new FileOutputStream ("D:\\Git Coding\\College\\Java Practice\\Sample_Writing.txt",true);
		fos.write(bytes2, 6, 2); //Appends MN

		//writing actual messge // not part of byteStream
		String msg = " Hello World";
		fos.write(msg.getBytes());

		fos.close();
	}
}