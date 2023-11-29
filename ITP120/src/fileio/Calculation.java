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
public class Calculation {

    /**
     * Place a description of your method here.
     *
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("src/fileio/arithmetic.txt");

        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String[] line = reader.nextLine().split(",");

                int num1 = Integer.parseInt(line[0]);
                int num2 = Integer.parseInt(line[2]);
                switch (line[1]) {
                    case "+":
                        System.out.println(num1 + num2);
                        break;
                    case "-":
                        System.out.println(num1 - num2);
                        break;
                    case "*":
                        System.out.println(num1 * num2);
                        break;
                    case "/":
                        System.out.println(num1 / num2);
                        break;
                }

            }
            reader.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
