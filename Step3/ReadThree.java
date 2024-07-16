package Step3;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadThree
{
    public static void main(String[] args)
    {
        try{
            System.out.print("Writing to file ... ");
            // Create the file to write to
            PrintWriter fileOut = new PrintWriter("/Users/coreye/Projects/FileIOJava/Step3/output.txt");
            // Write text just like we would to the console
            fileOut.print("Coreye");
            // Close out file/Very important to close out the file!!!!!!!
            fileOut.close();

            System.out.println("Done!");
            
            // Read in file to verify it
            Scanner fileIn = new Scanner(new File("/Users/coreye/Projects/FileIOJava/Step3/output.txt"));
            
            System.out.println("Reading from file ... ");
            while (fileIn.hasNext()) 
            {
                String lineIn = fileIn.nextLine(); 
                System.out.println(lineIn);
            }
            System.out.println("Done!");
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
