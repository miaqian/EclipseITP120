/**
 *
 */
package classesandobject;


/**
 * this program display a dotted line or a dashed line
 *
 * @author huiziqian
 * @version Nov 9, 2023
 *
 */
public class StraightLine {
    private int[] pointA;
    private int[] pointB;
    private String lineType;

    /**
     * Constructor
     *
     * @param pointA
     * @param pointB
     * @param lineType
     *
     */
    public StraightLine(int[] pointA, int[] pointB, String lineType) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.lineType = lineType;
    }

    /**
     * Construct a new StraightLine object.
     *
     * @param pointA
     * @param pointB
     */
    public StraightLine(int[] pointA, int[] pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.lineType = "DOTTED";
    }

    /**
     * Simple getter method.
     *
     * @return the pointA value
     */
    public int[] getPointA() {
        return pointA;
    }

    /**
     * Simple getter method.
     *
     * @return the pointB value
     */
    public int[] getPointB() {
        return pointB;
    }

    /**
     * Simple setter method.
     *
     * @param pointA the value to set
     */
    public void setPointA(int[] pointA) {
        this.pointA = pointA;
    }

    /**
     * Simple setter method.
     *
     * @param pointB the value to set
     */
    public void setPointB(int[] pointB) {
        this.pointB = pointB;
    }

    /**
     * Simple getter method.
     *
     * @return the line_type value
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * simple setter method
     *
     * @param lineType
     */
    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    /**
     * Simple setter method.
     *
     * @param lineType the value to set
     */
    public void lineType(String lineType) {
        this.lineType = lineType;
    }

    /**
     * calculates the slope of the line
     *
     * @return (double) (y2 - y1) / (x2 - x1);
     *
     */
    public double calculateSlope() {
        int x1 = pointA[0];
        int y1 = pointA[1];
        int x2 = pointB[0];
        int y2 = pointB[1];
        if (x2 - x1 == 0) {
            return Double.POSITIVE_INFINITY;
        }
        return (double) (y2 - y1) / (x2 - x1);
    }

    /**
     * calculate the distance
     *
     * @return distance
     */
    public int calculateDistance() {
        int distance;
        int x1 = pointA[0];
        int y1 = pointA[1];
        int x2 = pointB[0];
        int y2 = pointB[1];
        distance = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    /**
     * draw the line
     *
     * @return line
     */
    public String draw() {
        double distance = Math.round(calculateDistance());
        double slope = calculateSlope();
        String direction = (slope >= 0) ? "upward" : "downward";

        String lineDisplay;
        switch (lineType.toUpperCase()) {
            case "DOTTED":
                lineDisplay = ".";
                break;
            case "DASHED":
                lineDisplay = "-";
                break;
            default:
                lineDisplay = "-";
                break;
        }
        StringBuilder line = new StringBuilder();
        int numSpaces = (int) Math.abs(slope * 2);
        if (slope < 0) {
            for (int i = 0; i < distance; i++) {
                for (int j = 0; j < Math.abs(i * numSpaces); j++) {
                    line.append(" ");
                }
                line.append(lineDisplay).append("\n");
            }
        }
        if (slope > 0) {
            for (int i = 0; i < distance; i++) {
                for (int j = 0; j < numSpaces * (distance - i - 1); j++) {
                    line.append(" ");
                }
                line.append(lineDisplay).append("\n");
            }
        }

        return String.format("Draw a %s line %s:\n%s", lineType, direction, line.toString());
    }

}
