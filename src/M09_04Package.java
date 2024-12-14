/**
 * @author Simon Chung
 * @version 10/30/2022
 * @purpose This program uses subclasses to create a package with a length, width, height,
 * and a tracking ID.
 * (Package Subclass)
 */
public class M09_04Package extends M09_04Box {
    private final String packageID;

    public M09_04Package(int l, int w, int h, String pid) {
        super(l, w, h);
        packageID = pid;
    }

    public String getPackageID() {
        return packageID;
    }

    public String toString() {
        return "Package - " + getPackageID() + " " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}