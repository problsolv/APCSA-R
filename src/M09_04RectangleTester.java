/**
 * @author Simon Chung
 * @version 10/30/2022
 * @purpose This program uses superclasses and subclasses to create all sorts of rectangular
 * 2D and 3D objects with widths, lengths, and heights.
 * (Client Class)
 */
public class M09_04RectangleTester {
    public static void showEffectBoth(M09_04Rectangle rectangle) {
        System.out.println(rectangle);
    }

    public static String testEqual(M09_04Rectangle one, M09_04Rectangle two) {
        String str = "\n" + one;
        int vol1 = one.getLength() * one.getWidth() * ((M09_04Box)one).getHeight();
        int vol2 = two.getLength() * two.getWidth() * ((M09_04Box)two).getHeight();
        if (vol1 == vol2) {
            str += " IS";
        }
        else {
            str += " is NOT";
        }
        str +=  " the same size as " + two;
        return str;
    }
    public static void main(String [ ] args) {
        M09_04Rectangle rect1 = new M09_04Rectangle(12, 20);
        M09_04Rectangle rect2 = new M09_04Rectangle(10, 15);
        M09_04Rectangle cube1 = new M09_04Box(4, 4, 4);
        M09_04Rectangle box = new M09_04Box(4, 12, 8);
        M09_04Rectangle cube2 = new M09_04Cube(4);
        M09_04Rectangle gift = new M09_04Gift(18, 1, 1, "Happy Birthday!");
        M09_04Rectangle pack = new M09_04Package(20, 40, 10, "RHHSFJR56434A");

        M09_04Rectangle[] rectangles = {rect1, rect2, cube1, box, cube2, gift, pack};

        System.out.println("My shapes:\n");
        for (M09_04Rectangle rectangle : rectangles) {
            showEffectBoth(rectangle);
        }

        System.out.println("\nTest for equality:");
        System.out.println(testEqual(cube1, cube2));
        System.out.println(testEqual(box, gift));
        System.out.println(testEqual(pack, gift));
    }
}