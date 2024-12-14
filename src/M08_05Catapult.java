/**
 * @author Simon Chung
 * @version 10/06/2022
 * @purpose This program uses 2D Arrays to create objects of projectiles being launched by
 * a catapult to calculate the range of the projectile using Math.sin and toRadians.
 * There are 2 factors involved are the speed and the degrees that it is launched.
 * (Implementation Class)
 */
public class M08_05Catapult {
	private final double speed, angle, range;

	public M08_05Catapult(double speed, double angle) {
		this.speed = speed;
		this.angle = angle;
		range = (Math.pow((getSpeed() / 2.237), 2) * Math.sin(2 * Math.toRadians(getAngle())) / 9.81) * 3.281;
	}

	public double getSpeed() {
		return speed;
	}

	public double getAngle() {
		return angle;
	}

	public double getRange() {
		return range;
	}

	public String toString() {
		return String.format("%-13.02f", getRange());
	}
}