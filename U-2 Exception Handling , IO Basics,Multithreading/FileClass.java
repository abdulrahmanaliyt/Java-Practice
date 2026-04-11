import java.io.File;
class FileClass
{ 
	public static void main(String [ ] args )
	{
		File javaDir = new File("D:\\Git Coding\\College\\Java Practice");
		File file1 = new File("D:\\Git Coding\\College\\Java Practice","file1.txt");
		File dir2 = new File(javaDir, "dir1");

		System.out.println("JavaDir: "+javaDir.exists( ) );
		System.out.println("File 1: "+file1.exists( ) );
		System.out.println("Dir 2: "+dir2.exists( ) );
	}
}