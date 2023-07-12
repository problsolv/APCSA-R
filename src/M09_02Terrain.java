/**
 * @author Simon Chung
 * @version 10/15/2022
 * @purpose This program uses superclasses to create a terrain with dimensions.
 * (Terrain Superclass)
 */
public class M09_02Terrain {
    private final int length, width;

    public M09_02Terrain(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public String getTerrainSize() {
        return "Land has dimensions " + length + " X " + width;
    }
}