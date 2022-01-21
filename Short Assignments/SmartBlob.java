/**
 * Blob program for SA1 -- smarter blob movement (straight line for fixed number of steps before switching)
 *
 * @author Jivan Achar, uses code from CS10 (Blob superclass)
 * CS 10, January 7, 2022
 */

public class SmartBlob extends Blob {

    int steps, stepsSince;

    /**
     *
     * @param x: x location of center of blob
     * @param y: y location of center of blob
     */
    public SmartBlob(double x, double y) {
        super(x, y);
        this.steps = (int)(6*Math.random()) + 4;
    }


    /**
     *
     * @param x: x location of center
     * @param y: y location of center
     * @param r: radius of blob
     */
    public SmartBlob(double x, double y, double r, int steps) {
        super(x, y, r);
        this.steps = steps;
    }

    public int getSteps() {
        return steps;
    }

    /**
     *
     * @return string to verify that SmartBlob code works
     */
    @Override
    public String toString() {
        return "SmartBlob{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                ", dx=" + dx +
                ", dy=" + dy +
                ", dr=" + dr +
                ", steps=" + steps +
                ", stepsSince=" + stepsSince +
                '}';
    }

    /**
     * override step to control blob behavior
     */
    @Override
    public void step() {
        if (stepsSince == steps) {
            dx = 2 * (Math.random() - .5);
            dy = 2 * (Math.random() - .5);
            stepsSince = 0;
        }

        stepsSince += 1;
        x += dx;
        y += dy;
        r += dr;
    }
}
