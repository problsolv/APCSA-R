/**
 * @author Simon Chung
 * @version 10/22/2022
 * @purpose This program uses superclasses and subclasses to create all sorts of circular
 * 2D and 3D objects with centers, radii, and heights.
 * (Client Class)
 */
public class M09_03CircleTester {
    public static void showCenter(M09_03Circle circle, String name) {
        System.out.println("For this " + name + circle.getCenter() + ".");
    }

    public static void main(String [ ] args) {
        String[] names = {"Circle", "Cylinder", "Oval", "OvalCylinder"};
        M09_03Circle circle = new M09_03Circle(2, 4, 4);
        M09_03Cylinder cylinder = new M09_03Cylinder(10, 15, 3, 5);
        M09_03Oval oval = new M09_03Oval(25, 10, 10, 6);
        M09_03OvalCylinder ovalCylinder = new M09_03OvalCylinder(40, 10, 20, 10, 7);

        M09_03Circle[] circles = {circle, cylinder, oval, ovalCylinder};
        for (int i = 0; i < names.length; i++) {
            showCenter(circles[i], names[i] + " ");
        }

        System.out.println();
        System.out.println("The radius of this " + names[0] + " is " + circle.getRadius() + ".");
        System.out.println("The height of this " + names[1] + " is " + cylinder.getHeight() + ".");
        System.out.println("The radii of this " + names[2] + " is " + oval.getRadius() + " and " + oval.getRadius2() + ".");
        System.out.println("The height of this " + names[3] + " is " + ovalCylinder.getHeight() + ".");
    }
}