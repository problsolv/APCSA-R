/**
 * @author Simon Chung
 * @version 10/06/2022
 * @purpose This program uses 2D Arrays to create objects of projectiles being launched by
 * a catapult to calculate the range of the projectile using Math.sin and toRadians.
 * There are 2 factors involved are the speed and the degrees that it is launched.
 * (Client Class)
 */
public class M08_05CatapultTester {
	public static void main(String [ ] args) {
		double[] speeds = {10, 15, 20, 25, 30, 35, 40, 45, 50};
		double[] angles = {20, 25, 30, 35, 40, 45, 50, 55, 60};
		M08_05Catapult[][] projectiles = new M08_05Catapult[speeds.length][angles.length];

		for (int i = 0; i < projectiles.length; i++) {
			M08_05Catapult[] combined = new M08_05Catapult[angles.length];
			for (int j = 0; j < angles.length; j++) {
				M08_05Catapult temp = new M08_05Catapult(speeds[i], angles[j]);
				combined[j] = temp;
			}
			projectiles[i] = combined;
		}

		System.out.printf("%75s%n", "Projectile Distance (feet)");
		System.out.printf("    %-12s", "MPH");
		for (double angle : angles) {
			System.out.printf("%-13s", angle + "°");
		}
		System.out.println("\n———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————");
		for (int i = 0; i < speeds.length; i++) {
			System.out.printf("   %-13.02f", speeds[i]);
			for (int j = 0; j < angles.length; j++) {
				System.out.print(projectiles[i][j]);
			}
			System.out.println();
		}
	}
}