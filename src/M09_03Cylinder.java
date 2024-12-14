/**
 * @author Simon Chung
 * @version 10/22/2022
 * @purpose This program uses subclasses to create an oval cylinder with a center, radius,
 * and height.
 * (Cylinder Subclass)
 */
public class M09_03Cylinder extends M09_03Circle {
    private final int height;

    public M09_03Cylinder(int x, int y, int rad, int h) {
        super(x, y, rad);
        height = h;
    }

    public int getHeight() {
        return height;
    }
}