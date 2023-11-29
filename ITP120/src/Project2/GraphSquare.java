/**
 *
 */
package Project2;

import java.util.Scanner;

/**
 * This program accepts 4 sets of coordinates from the user. Each set of coordinates have x and y
 * values.this class will determine if the 4 points can form either a square or rectangle
 *
 * @author huiziqian
 * @version Nov 1, 2023
 *
 */
public class GraphSquare {

    /**
     * Main method
     *
     * @param args ignore
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input coordinates for Point A");
        int xA = input.nextInt();
        int yA = input.nextInt();

        System.out.println("Input coordinates for Point B");
        int xB = input.nextInt();
        int yB = input.nextInt();

        System.out.println("Input coordinates for Point C");
        int xC = input.nextInt();
        int yC = input.nextInt();

        System.out.println("Input coordinates for Point D");
        int xD = input.nextInt();
        int yD = input.nextInt();

        int[] pointA = { xA, yA };
        int[] pointB = { xB, yB };
        int[] pointC = { xC, yC };
        int[] pointD = { xD, yD };

        boolean isSquareOrRectangle = compareDistance(pointA, pointB, pointC, pointD);
        boolean checkSlope = compareSlope(pointA, pointB, pointC, pointD);

        if (isSquareOrRectangle && checkSlope) {

            double distanceAB = calculateDistance(pointA, pointB);
            double distanceBC = calculateDistance(pointB, pointC);

            if (distanceAB == distanceBC) {
                System.out.println("The distances (AB, BC, CD and AD) are all equal");
                System.out.println("The slope of the line AB is the same as CD");
                System.out.println("The slope of the line AD is the same as BC");
                System.out.println(
                    "The slope of the diagonals (AC and DB) are perpendicular to each other");
                System.out.println();
                System.out.println("The 2D figure is a Square.");

            } else {
                System.out.println("The length of the lines AB and CD are equal\n"
                    + "The length of the lines AD and BC are equal\n"
                    + "The slope of the line AB is the same CD\n"
                    + "The slope of the line AD is the same BC\n"
                    + "The slope of the diagonals (AC and DB) are not perpendicular to each other\n"
                    + "The 2D figure is a Rectangle.\n");
            }
        } else {
            System.out.println("Not a Square nor a rectangle.");
        }
        draw(pointA, pointB, pointC, pointD);

        input.close();
    }

    /**
     * calculate distance of two points
     *
     * @param point1 first point as an array[x1, y2]
     * @param point2 second point as an array [x2, y2]
     *
     * @return The distance between two points
     */
    private static double calculateDistance(int[] point1, int[] point2) {
        int x1 = point1[0];
        int y1 = point1[1];
        int x2 = point2[0];
        int y2 = point2[1];

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * compare distance of two points
     *
     * @param pointA
     * @param pointB
     * @param pointC
     * @param pointD
     *
     * @return false
     */
    private static boolean compareDistance(int[] pointA, int[] pointB, int[] pointC, int[] pointD) {
        double distanceAB = calculateDistance(pointA, pointB);
        double distanceBC = calculateDistance(pointB, pointC);
        double distanceCD = calculateDistance(pointC, pointD);
        double distanceDA = calculateDistance(pointD, pointA);
        double diagonalAC = calculateDistance(pointA, pointC);
        double diagonalBD = calculateDistance(pointB, pointD);

        if (distanceAB == distanceBC && distanceBC == distanceCD && distanceCD == distanceDA) {
            return diagonalAC == diagonalBD;
        }

        if (distanceAB == distanceCD && distanceBC == distanceDA) {
            return diagonalAC == diagonalBD;
        }
        return false;
    }

    /**
     *
     * takes 4 integer parameters and returns a double
     *
     * @param point1
     * @param point2
     * @return double slope
     */
    private static double calculateSlope(int[] point1, int[] point2) {
        int x1 = point1[0];
        int y1 = point1[1];
        int x2 = point2[0];
        int y2 = point2[1];

        if (x2 - x1 == 0) {
            return Double.POSITIVE_INFINITY;
        }
        return (double) (y2 - y1) / (x2 - x1);
    }

    /**
     *
     * Check if two lines are perpendicular
     *
     * @param slope1
     * @param slope2
     * @return check for negative reciprocals
     */
    private static boolean arePerpendicular(double slope1, double slope2) {
        if (slope1 == Double.POSITIVE_INFINITY) {
            return slope2 == 0;
        } else if (slope2 == Double.POSITIVE_INFINITY) {
            return slope1 == 0;
        }
        return slope1 * slope2 == -1;
    }

    /**
     * compare the slope of all the lines
     *
     * @param pointA
     * @param pointB
     * @param pointC
     * @param pointD
     * @return boolean
     */
    private static boolean compareSlope(int[] pointA, int[] pointB, int[] pointC, int[] pointD) {
        double slopeAB = calculateSlope(pointA, pointB);
        double slopeBC = calculateSlope(pointB, pointC);
        double slopeCD = calculateSlope(pointC, pointD);
        double slopeDA = calculateSlope(pointD, pointA);

        return arePerpendicular(slopeAB, slopeBC) && arePerpendicular(slopeBC, slopeCD)
            && arePerpendicular(slopeCD, slopeDA) && arePerpendicular(slopeDA, slopeAB);
    }

    /**
     *
     * draw the square or rectangle
     *
     * @param pointA
     * @param pointB
     * @param pointC
     * @param pointD
     *
     */
    private static void draw(int[] pointA, int[] pointB, int[] pointC, int[] pointD) {
        int rows = (int) Math.ceil(Math.max(calculateDistance(pointA, pointB),
            calculateDistance(pointB, pointC)));
        int columns = (int) Math.ceil(Math.max(calculateDistance(pointA, pointD),
            calculateDistance(pointC, pointD)));

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
