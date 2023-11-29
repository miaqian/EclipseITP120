/**
 *
 */
package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a one-sentence summary of your class here. Follow it with additional details about its
 * purpose and how to use it.
 *
 * @author huiziqian
 * @version Nov 17, 2023
 *
 */
public class ReadFromFile {

    /**
     * Place a description of your method here.
     *
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("src/fileio/counties.txt");

        int count = countLines(file);
        System.out.println(count);
        String[] linesArray = new String[count];

        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNext()) {
                String[] line = reader.nextLine().split(",");
                line[0] = Character.toUpperCase(line[0].charAt(0))+line[0].substring(1);
                System.out.printf("%-20s%20s\n", line[0], line[1]);
            }

            reader.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static int countLines(File file) {
            // TODO Auto-generated method stub
        int count = 0;
        Scanner reader1;
        try {
            reader.hasNextLine();
        }
        return 0;
    }

}
