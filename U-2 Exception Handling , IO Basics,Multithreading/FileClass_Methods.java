import java.io.File;
import java.io.IOException;
class FileClass_Methods
{ 
	public static void main(String [ ] args ) throws IOException
	{
		File javaDir = new File("D:\\Git Coding\\College\\Java Practice");
		File file1 = new File("D:\\Git Coding\\College\\Java Practice","file1.txt");
		File dir2 = new File(javaDir, "dir1");

		System.out.println("Is JavaDir Exists: "+javaDir.exists( ) );
		System.out.println("Is File 1 Exists: "+file1.exists( ) );
		System.out.println("IsDir 2 Exists: "+dir2.exists( ) );

		System.out.println("JavaDir is File: "+javaDir.isFile( ) );
		System.out.println("JavaDir is Directory: "+javaDir.isDirectory( ) );

		System.out.println("File1 is File: "+file1.isFile( ) );
		System.out.println("File1 is Directory: "+file1.isDirectory( ) );

		System.out.println("File1 can read: "+file1.canRead( ) );
		System.out.println("File1 can write: "+file1.canWrite( ) );

		System.out.println("File1 File Name: "+file1.getName( ) );
		System.out.println("File1 Path: "+file1.getPath( ) );
		System.out.println("Lenth of file1 : "+file1.length( ) );

		//Creating new file
		File newFile = new File(javaDir,"newFile.txt");
		System.out.println("Is New File Creation Successful : "+newFile.createNewFile());

		//creating new directory
		File newDir = new File(javaDir,"newDir");
		System.out.println("Is New Directory Creation Successful : "+newDir.mkdir());	

		//Deleting already created newDir 
		System.out.println("Is newDir Deleted: "+newDir.delete());

		String [ ] names = javaDir.list();
		for (String name:names)
			System.out.println("List of Files and Folder in JavaDir : "+name);
	}
}