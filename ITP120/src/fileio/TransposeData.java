/**
 *
 */
package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This object is to READ the data from population.txt file and transpose the rows into columns. The
 * transposed data will be saved to a new file called transposed.txt
 *
 * @author huiziqian
 * @version Nov 28, 2023
 *
 */
public class TransposeData {

    /**
     * Main method
     *
     * @param args ignore
     */
    public static void main(String[] args) {
        File inputFile = new File("src/fileio/population.txt");
        File outputFile = new File("src/fileio/transposed.txt");

        try {
            Scanner reader = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter(outputFile);

            String[] area = new String[100];
            String[] areaPopulation = new String[100];
            int count = 0;

            while (reader.hasNextLine() && count < area.length) {
                String[] line = reader.nextLine().split(" ");
                if (line.length >= 2) {
                    area[count] = line[0];
                    areaPopulation[count] = line[1];
                    count++;
                }
            }

            for (int i = 0; i < count; i++) {
                writer.printf("%-15s", area[i]);
            }
            writer.println();

            for (int i = 0; i < count; i++) {
                writer.printf("%-15s", areaPopulation[i]);
            }
            writer.println();

            reader.close();
            writer.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
