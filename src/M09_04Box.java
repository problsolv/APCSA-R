/**
 * @author Simon Chung
 * @version 10/30/2022
 * @purpose This program uses superclasses and subclasses to create a box with a length,
 * width, and height.
 * (Box Sub/Superclasses)
 */
public class M09_04Box extends M09_04Rectangle {
    private final int height;

    public M09_04Box(int l, int w, int h) {
        super(l, w);
        height = h;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return "Box - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}