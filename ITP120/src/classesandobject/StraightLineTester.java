/**
 *
 */
package classesandobject;

import java.util.Arrays;

/**
 * this is a class to test the straight line class
 *
 * @author huiziqian
 * @version Nov 10, 2023
 *
 */
public class StraightLineTester {

    /**
     * Main method
     *
     * @param args ignore
     */
    public static void main(String[] args) {
        int[] pointA = { 0, 0 };
        int[] pointB = { 4, 10 };
        String lineType = "DASHED";
        StraightLine line1 = new StraightLine(pointA, pointB, lineType);
        System.out.println("PointA = " + Arrays.toString(pointA));
        System.out.println("PointB = " + Arrays.toString(pointB));
        System.out.println("Line type = " + lineType);
        System.out.println(line1.draw());
        StraightLine line2 = new StraightLine(pointA, pointB);
        System.out.println(line2.draw());

        int[] pointA1 = { 6, 4 };
        int[] pointB1 = { 14, 19 };
        StraightLine lineA = new StraightLine(pointA1, pointB1, "DASHED");

        int[] pointA2 = { 2, 8 };
        int[] pointB2 = { 4, 12 };
        StraightLine lineB = new StraightLine(pointA2, pointB2, "DOTTED");

        System.out.println("Line A:");
        System.out.printf(lineA.draw());

        System.out.println("Line B:");
        System.out.printf(lineB.draw());

        lineRelationship(lineA, lineB);
    }
    /**
     *This object determine the relationship of two lines
     *
     * @param lineA
     * @param lineB
     */
    public static void lineRelationship(StraightLine lineA, StraightLine lineB) {
        double slope1 = lineA.calculateSlope();
        double slope2 = lineB.calculateSlope();

        if (slope1 == slope2) {
            System.out.println("The lines are parallel.");
        } else if (slope1 * slope2 == -1) {
            System.out.println("The lines are perpendicular.");
        } else {
            System.out.println("The lines intersect each other.");
        }
    }
}
