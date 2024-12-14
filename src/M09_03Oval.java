/**
 * @author Simon Chung
 * @version 10/22/2022
 * @purpose This program uses superclasses and subclasses to create an oval with a center
 * and radii.
 * (Oval Sub/Superclasses)
 */
public class M09_03Oval extends M09_03Circle {
    private final int radius2;

    public M09_03Oval(int x, int y, int rad1, int rad2) {
        super(x, y, rad1);
        radius2 = rad2;
    }

    public int getRadius2() {
        return radius2;
    }
}