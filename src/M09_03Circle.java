/**
 * @author Simon Chung
 * @version 10/22/2022
 * @purpose This program uses superclasses to create a circle with a center and a radius.
 * (Circle Superclass)
 */
public class M09_03Circle {
    private final int x, y, radius;

    public M09_03Circle(int p_x, int p_y, int r) {
        x = p_x;
        y = p_y;
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public String getCenter() {
         return "center is at (" + x + ", " + y + ")";
    }
}