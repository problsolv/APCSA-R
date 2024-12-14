/**
 * @author Simon Chung
 * @version 10/30/2022
 * @purpose This program uses subclasses to create a cube with a length which is also the
 * width and height.
 * (Cube Subclass)
 */
public class M09_04Cube extends M09_04Box {
    private final int length;

    public M09_04Cube(int l) {
        super(l, l, l);
        length = l;
    }

    public int getlength() {
        return length;
    }

    public String toString() {
        return "Cube - " + getlength() + " X " + getlength() + " X " + getlength();
    }
}