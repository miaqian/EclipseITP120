/**
 *
 */
package intro;

import java.util.Scanner;

/**
 * this class is to determine if the number of books provided can fit into that shelf. there are two
 * different thickness books(hard cover and paperback) used if else if construct
 *
 * @author huiziqian
 * @version Sep 17, 2023
 *
 */
public class BookShelf {

    /**
     * main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the book shelf in feet: ");
        int rowLength = input.nextInt();

        System.out.println("Enter the number of hardcover books: ");
        int hardcoverNum = input.nextInt();

        System.out.println("Enter the number of paperback books: ");
        int paperbackNum = input.nextInt();

        int hardLength = hardcoverNum * 5;
        int paperLength = paperbackNum * 1;
        int shelfLength = rowLength * 12;

        if (rowLength < 0 || hardcoverNum < 0 || paperbackNum < 0) {
            System.out.println("Please put in a positive number.");
            System.exit(0);
        }

        System.out.println();
        System.out.println("Arranging books on a shelf...");
        System.out.printf("Length of bookshelf in feet:  %2d\n", rowLength);
        System.out.printf("Number of Hardcover books:  %2d\n", hardcoverNum);
        System.out.printf("Number of Paperback books:  %2d\n", paperbackNum);

        if (hardLength + paperLength <= shelfLength) {
            System.out.printf(
                "It is possible to fill the shelf of length %d feet with %d hardcover and %d paperback books",
                rowLength, hardcoverNum, paperbackNum);
        } else {
            System.out.printf(
                "It is not possible to fill the shelf of length %d feet with %d hardcover and %d paperback books",
                rowLength, hardcoverNum, paperbackNum);
        }

        input.close();
    }

}
