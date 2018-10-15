package ring;

import static ring.Ring.calculateDistance;
import static ring.Ring.calculateRadiusSum;

public class Main {
    public static void main(String[] args) {

        // Test defaults
        Ring colorlessRing = new Ring();
        System.out.println(colorlessRing);

        // Test radius
        Ring radiusRing = new Ring(5);
        System.out.println(radiusRing);

        // Test location
        Ring locationRing = new Ring(0, 0);
        System.out.println(locationRing);

        // Test full custom circle
        Ring fullRing = new Ring(2, 0, 1, "punane");
        System.out.println(fullRing);

        compare(fullRing.getKeskpunkt_x(), fullRing.getKeskpunkt_y(),
                locationRing.getKeskpunkt_x(), locationRing.getKeskpunkt_y(),
                fullRing.getRaadius(), locationRing.getRaadius());

    }

    public static void compare(int keskpunkt_x1,
                               int keskpunkt_y1,
                               int keskpunkt_x2,
                               int keskpunkt_y2,
                               int raadius1,
                               int raadius2) {
        int sum = calculateRadiusSum(raadius1, raadius2);
        double distance = calculateDistance(keskpunkt_x1, keskpunkt_y1, keskpunkt_x2, keskpunkt_y2);
        if (sum == distance) {

            // Circles touch
            System.out.print("Ringidel on kokkupuutepunkt");
        } else if (sum > distance) {

            // Circles overlap
            System.out.print("Ringidel on ühist pindala");
        } else {

            // Circles are far off of each other
            System.out.print("Ringid on üksteisest eemal");
        }
    }


}
