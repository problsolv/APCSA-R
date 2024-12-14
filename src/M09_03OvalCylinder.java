/**
 * @author Simon Chung
 * @version 10/22/2022
 * @purpose This program uses subclasses to create an oval cylinder with a center, radii,
 * and a height.
 * (Oval Cylinder Subclass)
 */
public class M09_03OvalCylinder extends M09_03Oval {
    private final int height;

    public M09_03OvalCylinder(int x, int y, int rad1, int rad2, int h) {
        super(x, y, rad1, rad2);
        height = h;
    }

    public int getHeight() {
        return height;
    }
}