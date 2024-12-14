/**
 * @author Simon Chung
 * @version 10/15/2022
 * @purpose This program uses subclasses to create a winter mountain with dimensions,
 * mountains, and temperature.
 * (Winter Mountain Subclass)
 */
public class M09_02WinterMountain extends M09_02Mountain {
    private final double temp;

    public M09_02WinterMountain(int length, int width, int mountains, double temp) {
        super(length, width, mountains);
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }
}