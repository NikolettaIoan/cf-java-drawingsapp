package gr.aueb.cf.model;

/**
 * The {@link  Point} class depicts a two-dimensional
 * <i>point</i> with <b>x</b> and  <b>y</b> coordinates that
 * are considered integers. All points such as (0,0) or (-200, 500) or
 * (100, 5000) could be instantiated by this class.
 *
 * @author Nik
 * @since 1.0
 * @version 2.1
 * @see <a>href="https://codingfactory.aueb.gr/" </a>
 */
public class Point {
    /**
     * The x-coordinate
     */
    private int x;

    /**
     * The y-coordinate
     */
    private int y;

    /**
     * Instantiates a newly created point,
     * so that it depicts a (0,0) point.
     */
    public Point() {
    }

    /**
     * Constructs a new point based on
     * specific x ,y coordinates
     *
     * @param x     x-coordinate
     * @param y     y-coordinate
     *
     * @since 1.5
     * @version 2.1
     */

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Provides access to x-coordinate
     *
     * @return the value of x - coordinate
     */

    public int getX() {
        return x;
    }

    /**
     * Mutates x-coordinate
     *
     * @param x the value of x-coordinate
     */

    public void setX(int x) {
        this.x = x;
    }

    /**
     * Provides access to y-coordinate
     *
     * @return the value of y - coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Mutates y-coordinate
     *
     * @param y the value of y-coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Transformation point state to String
     *
     * @return  the transformed state (x,y)
     *
     * @deprecated
     */
    public String convertToString(){
        return "(" + x + "," + y + ")";
    }
}
