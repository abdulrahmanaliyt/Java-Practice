import java.io.*;

public class FileReadingCharacterStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        FileReader fr = new FileReader("Sample.txt");
        
        // Reading single characters
        int charRead = fr.read();
        System.out.print((char)charRead);    // a
        
        charRead = fr.read();
        System.out.print((char)charRead);    // b
        
        charRead = fr.read();
        System.out.print((char)charRead);    // c
        
        charRead = fr.read();
        System.out.println((char)charRead);  // d

        // Reading into a character array
        char[] fourCharsRead = new char[4];
        fr.read(fourCharsRead);
        System.out.println(new String(fourCharsRead)); // EFGH

        // Skipping characters
        fr.skip(2); // Skips i, j

        fr.read(fourCharsRead);
        System.out.println(new String(fourCharsRead)); // klMN

        // Reading with offsets
        fr.read(fourCharsRead, 2, 2); // Reads O, P at index position 2, 3
        fr.read(fourCharsRead, 0, 2); // Reads q, r at index position 0, 1
        System.out.println(new String(fourCharsRead)); // qrOP

        fr.close();
    }
}