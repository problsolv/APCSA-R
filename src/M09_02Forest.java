/**
 * @author Simon Chung
 * @version 10/15/2022
 * @purpose This program uses subclasses to create a forest with dimensions and trees.
 * (Forest Subclass)
 */
public class M09_02Forest extends M09_02Terrain {
    private final int trees;

    public M09_02Forest(int length, int width, int trees) {
        super(length, width);
        this.trees = trees;
    }

    public int getTrees() {
        return trees;
    }
}