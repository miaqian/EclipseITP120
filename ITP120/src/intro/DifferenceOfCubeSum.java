/**
 *
 */
package intro;

import java.util.Scanner;

/**
 * this class indicate the calculation of finding the difference between the sum of cubes of the
 * first n natural numbers(1 to 100) and the cube of the sum of the n numbers. using for loop
 * because the result could be minus, so i used math.abs() in the result
 *
 * @author huiziqian
 * @version Oct 1, 2023
 *
 */
public class DifferenceOfCubeSum {

    /**
     * main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please give an UPPER LIMIT in the range of 2 and 100: ");
        int upperLimit = input.nextInt();

        long cubeOfNum = 1;
        long sumOfTheCubes = 0;

        long sumOfNum = 0;
        long cubeOfTheSum = 0;

        for (int i = 1; i <= upperLimit; i++) {
            cubeOfNum = i * i * i;
            sumOfTheCubes = sumOfTheCubes + cubeOfNum;
        }

        for (int j = 1; j <= upperLimit; j++) {
            sumOfNum = sumOfNum + j;
        }
        cubeOfTheSum = sumOfNum * sumOfNum * sumOfNum;
        long difOfScAndCs = Math.abs(sumOfTheCubes - cubeOfTheSum);
        System.out.println();
        System.out
            .println("The difference between the sum of the cubes from 1 to " + upperLimit + "\r" +
                "and the the cube of the sum of numbers from 1 to " + upperLimit + " is "
                + difOfScAndCs);
        input.close();
    }

}
