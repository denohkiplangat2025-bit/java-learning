import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

                 // how to read a file using Java ( 3 popular options)
        //  1. BufferedReader + FileReader = Best for reading text files line-by-line.
        //  2. FileInputStream = Best for binary files(e.g., images, audio files)
        //  3. RandomAccessFile = Best for read/write specific portions of a large file

        String filePath = "C:\\Users\\USER\\Desktop\\test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
        }

    }
}
