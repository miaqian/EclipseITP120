package Project2;

import java.util.Scanner;

/**
 *
 * The class should output numbers whose sum of proper divisors form a cyclic sequence that begins
 * and ends with the same number. The numbers that result in a 2-cycle sequence: 220, 284 The
 * numbers result in a 4-cycle sequence: 1547860, 1727636, 1305184, 1264460 The numbers result in a
 * 5-cycle sequence: 12496, 14288, 15472, 14536, 14264 The only known numbers that result in a
 * 28-cycle sequence are: 14316, 19116, 31704, 47616, 83328, 177792, 295488, 629072, 589786, 294896,
 * 358336, 418904, 366556, 274924, 275444, 243760, 376736, 381028, 285778, 152990, 122410, 97946,
 * 48976, 45946, 22976, 22744, 19916, 17716. All other numbers will result in an infinite loop. Your
 * logic will only need to work for the numbers listed above.
 *
 *
 * @author huiziqian
 * @version Oct 24, 2023
 *
 */
public class CyclicSequence {
    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNum = input.nextInt();
        generateSequence(inputNum);
        input.close();
    }

    /**
     *
     * This method takes a number as a parameter and outputs the other numbers in the sequence.
     *
     * @param start
     */
    public static void generateSequence(int start) {
        System.out.print("Enter start value: ");
        int current = start;
        System.out.println(current);

        System.out.println("The cyclic sequence is as follows:");
        System.out.println(current);
        while (true) {
            int next = sumProperDivisors(current);
            if (next == start) {
                break;
            }
            current = next;
            System.out.println(next);
        }
    }

    /**
     *
     * This method calculate the sum of all the number's proper divisors
     *
     * @param number
     * @return sum
     */
    public static int sumProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
