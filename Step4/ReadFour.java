package Step4;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour {
    public static void main(String[] args) {
        try {
            Scanner fileIn = new Scanner(new File("/Users/coreye/Projects/FileIOJava/Step4/input.txt"));

            while (fileIn.hasNext())
            {
                // Reads the entire line as a string
                String lineIn = fileIn.nextLine();
                // Split the line into a String array
                String[] input = lineIn.split(",");
                int sum = 0;
                for (int i = 0; i < input.length; i ++) {
                    sum += Integer.parseInt(input[i]);
                }
                System.out.printf("Running total = %d \n", sum);
            }
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}