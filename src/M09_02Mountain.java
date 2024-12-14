/**
 * @author Simon Chung
 * @version 10/15/2022
 * @purpose This program uses superclasses and subclasses to create a mountain with
 * dimensions and mountains.
 * (Mountain Sub/Superclasses)
 */
public class M09_02Mountain extends M09_02Terrain {
    private final int mountains;

    public M09_02Mountain(int length, int width, int mountains) {
        super(length, width);
        this.mountains = mountains;
    }

    public int getMountain() {
        return mountains;
    }
}