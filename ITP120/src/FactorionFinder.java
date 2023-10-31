/**
 * This class indicates the four Factorions in the range of 1 to 50000
 * using more Java Methods to generate the output
 *
 * @author huiziqian
 * @version Oct 16, 2023
 */
public class FactorionFinder {

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("The factorions in the range of 1 and 50000 are:");

        for (int i = 1; i <= 50000; i++) {
            if (getFactorion(i)) {
                int originalNumber = i;
                int sumOfFactorials = 0;

                System.out.print(originalNumber + "! = ");

                while (i > 0) {
                    int digit = i % 10;
                    int factorial = calculateFactorial(digit);

                    System.out.print(factorial);

                    i /= 10;

                    if (i > 0) {
                        System.out.print(" + ");
                    }

                    sumOfFactorials += factorial;
                }

                System.out.println(" = " + sumOfFactorials);
            }
        }

        System.out.println("Ending");
    }

    /**
     * The getFactorion method calls the calculateFactorial method for each digit in the number.
     *
     * @param number The factorion number
     * @return boolean
     */
    private static boolean getFactorion(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += calculateFactorial(digit);
            number /= 10;
        }

        return sumOfFactorials == originalNumber;
    }

    /**
     * The calculateFactorial method will calculate the factorial of a given number and return the factorial value to the getFactorion method
     *
     * @param number The digit for which factorial needs to be calculated
     * @return int The factorial value
     */
    private static int calculateFactorial(int number) {
        int factorial = 1;
        int count = 1;

        do {
            factorial *= count;
            count++;
        } while (count <= number);

        return factorial;
    }
}
