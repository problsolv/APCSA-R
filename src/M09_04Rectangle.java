/**
 * @author Simon Chung
 * @version 10/30/2022
 * @purpose This program uses superclasses to create a rectangle with a length and width.
 * (Rectangle Superclass)
 */
public class M09_04Rectangle {
    private final int length, width;

    public M09_04Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String toString() {
        return "Rectangle - " + length + " X " + width;
    }
}