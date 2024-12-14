/**
 * @author Simon Chung
 * @version 10/30/2022
 * @purpose This program uses subclasses to create a gift box with a length, width, height,
 * and a special message.
 * (Gift Box Subclass)
 */
public class M09_04Gift extends M09_04Box {
    private final String message;

    public M09_04Gift(int l, int w, int h, String m) {
        super(l, w, h);
        message = m;
    }

    public String getMessage() {
        return message;
    }

    public String toString() {
        return "Gift box - " + getMessage() + " " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}