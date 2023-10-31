/**
 *
 */
package intro;

/**
 * this class generate pentagonal numbers and numbers divisible by 5 and 7
 *
 *
 * @author huiziqian
 * @version Oct 17, 2023
 *
 */
public class PentagonalNums {

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        int totalCount = 50;
        int row = 10;
        int count = 0;
        int n = 1;

        while (count < totalCount) {
            int pentagonalNumber = getPentagonalNumber(n);
            if (pentagonalNumber % 5 == 0 && pentagonalNumber % 7 == 0) {
                System.out.printf("%10d", pentagonalNumber);
                count++;

                if (count % row == 0) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
            n++;
        }

    }

    /**
     *
     * calculate using the expression n* (3*n-1)/2 to get PentagonalNumbers
     *
     * @param n
     * @return res
     */

    public static int getPentagonalNumber(int n) {
        int res = n * (3 * n - 1) / 2;
        return res;
    }

}