/**
 * @author Simon Chung
 * @version 10/15/2022
 * @purpose This program uses superclasses and subclasses to create all sorts of terrain with
 * land dimensions and physical features.
 * (Client Class)
 */
public class M09_02LandTester {
    public static void main(String [ ] args) {
        M09_02Terrain terrain = new M09_02Terrain(150, 240);
        M09_02Forest forest = new M09_02Forest(400, 400, 180);
        M09_02Mountain mountain = new M09_02Mountain(600, 200, 12);
        M09_02WinterMountain winterMountain = new M09_02WinterMountain(500, 500, 30, 12.34);

        System.out.println(terrain.getTerrainSize() + ".\n");

        System.out.println("Forest " + forest.getTerrainSize() + " and has " +
                forest.getTrees() + " trees.\n");

        System.out.println("Mountain " + mountain.getTerrainSize() + " and has " +
                mountain.getMountain() + " mountains.\n");

        System.out.println("Winter Mountain " + winterMountain.getTerrainSize() +
                " and has " + winterMountain.getMountain() +
                " mountains and a temperature of " + winterMountain.getTemp() + " degrees.");
    }
}