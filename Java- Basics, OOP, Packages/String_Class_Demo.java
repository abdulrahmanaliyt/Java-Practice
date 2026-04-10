//use javac -d folder_name class_name.java to automatically create folder while compling  of com/examplemyproject
//use for executing java pacakage_name.Class_name

/*

Compiling Java Classes into Package Directories
Two Ways to Organize .class Files in Packages:
1. Manual Method
Compile the Java file normally
javac MyClass.java
Create the required directory structure matching the package name.
For package mypack; create mypack/ directory.
Move the .class file manually to mypack directory.
2. Using -d Option (Recommended)
Compile and automatically create the package directory
structure.
javac -d classes MyClass.java
If MyClass.java contains package mypack;
The file is stored as:
classes/mypack/MyClass.class

CLASSPATH Setting for Packages
To run Java programs that use user-defined packages, the Java runtime needs to know
where to find those packages.
Three Ways to find the packages:
1. Default: Current Working Directory
By default, Java looks in the current working directory.
If your package is in a subdirectory of the current
directory, Java will find it automatically.
2. Using the CLASSPATH Environment Variable
You can define the path to your package directory using the
system's CLASSPATH environment variable.
Important: The CLASSPATH should contain the path up to the
package folder, not the package name itself.

CLASSPATH Setting for Packages
Three Ways to find the packages:
2. Using the CLASSPATH Environment Variable
Example:
If the package is in D:\docs\JavaPrograms\Java\classes\mypack then set
CLASSPATH = D:\docs\JavaPrograms\Java\classes
3. Using ‘-classpath’ or ‘–cp’ Option
While compiling and running, you can specify the class path
using the -classpath or -cp option.
Example:
java -classpath D:\docs\JavaPrograms\Java\classes mypack.MyClass

	
class String_Class_Demo
{
	public static void main(String  ... args )
	{
		String str = "Meerut";
		String str1 = new String();
		str1 = str;
		System.out.println(str1);
		String str2 = new String("Delhi");
		System.out.println(str2);

		char [ ] arr = {'P', 'U', 'N', 'E'};
		String str3 = new String(arr);
		System.out.println(str3);

		byte [ ] byteArr = { 65,91,66,92};
		String str4 = new String(byteArr );
		System.out.println(str4);
		//Meerut
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.substring(0,4));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		//str = str1
		String str5 = new String(str);
		System.out.println(str.equals(str));
		System.out.println(str==str5);
		str5= "meeRut";
		System.out.println(str.equalsIgnoreCase(str5));

		System.out.println(str.lastIndexOf("e"));
		System.out.println(str.startsWith("M"));
		System.out.println(str.endsWith("m"));
		System.out.println("    Abdul  ".trim());
		System.out.println("abdul Ramhan".replace('a','A'));

	}

}
