/**
 *
 */
package fileio;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Write a one-sentence summary of your class here.
 * Follow it with additional details about its purpose
 * and how to use it.
 *
 * @author huiziqian
 * @version Nov 17, 2023
 *
 */
public class CopyFile {

    /**
     * Place a description of your method here.
     *
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub
        File readFile = new File("src/fileio/counties.txt");

        Scanner reader = new Scanner(readFile);

        File writeFile = new File("src/fileio/countiesCopy.txt");
        PrintWriter pw = new PrintWriter(writeFile);



    }

}
