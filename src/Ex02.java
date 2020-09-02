import java.io.File;
import java.util.Scanner;

public class Ex02
{
    private Scanner scan;

    public Ex02()
    {
        try
        {
            this.scan = new Scanner(new File("resources/Strings.txt"));
        }
        catch(Exception e)
        {
            System.out.println("This happened: " + e);
        }

        countLines();
    }

    private void countLines()
    {
        int counter = 0;
        while(scan.hasNextLine())
        {
            scan.nextLine();
            counter++;
        }

        System.out.println("Number of lines in file: " + counter);
    }
}
