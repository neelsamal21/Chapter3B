
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class Speeches here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Speeches
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanFile = new Scanner(new File("Abraham Lincoln A House Divided.txt"));
        
        while(scanFile.hasNextLine())
        {
            String data = scanFile.nextLine();
            System.out.println(data);
        }
    }
}
