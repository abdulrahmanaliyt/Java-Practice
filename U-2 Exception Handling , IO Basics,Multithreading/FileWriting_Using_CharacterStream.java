import java.io.*;

public class FileWriting_Using_CharacterStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileWriter fw = new FileWriter("D:\\Git Coding\\College\\Java Practice\\Sample_Writing.txt");

        fw.write(65); // Writes A
        fw.write(66); // Writes B

        char[] chars1 = {'C', 'D', 'E', 'F'};
        System.out.println(new String(chars1)); // CDEF
        fw.write(chars1); // Writes CDEF

        char[] chars2 = {'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'};
        System.out.println(new String(chars2)); // GHIJKLMN
        fw.write(chars2, 2, 4); // Writes IJKL

        String str = "meerut";
        fw.write(str);

        str = "The Java Language";
        fw.write(str, 4, 4); // Writes "Java"
        fw.close();

        // Reopening in Append Mode
        fw = new FileWriter("D:\\Git Coding\\College\\Java Practice\\Sample_Writing.txt", true);

        // fw.write(chars2, 6, 2); // Appends MN
        fw.append('Q');
        fw.append("PYTHON");
        fw.append("The PYTHON Language", 11, 19); // Appends "Language"

        /* append() also returns the Writer we have just written to so 
           that we can perform multiple appends so it can be chained.
        */
        fw.append("JavaScript").append("C++").append("C#");

        /* append() accepts any CharSequence (like String, StringBuilder,
           StringBuffer), while write() only accepts a String.
        */
        StringBuilder stringBuilder = new StringBuilder("LISP");
        fw.append(stringBuilder);

        fw.close();
    }
}