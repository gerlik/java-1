package ring;

import static java.lang.Math.*;

public class Ring {
    private int keskpunkt_x;
    private int keskpunkt_y;
    private int raadius;
    private String toon;

    // Defaults
    public Ring() {
        this(0, 0, 0, "värvitu");
    }

    public Ring(int keskpunkt_x, int keskpunkt_y, int raadius, String toon) {
        this.keskpunkt_x = keskpunkt_x;
        this.keskpunkt_y = keskpunkt_y;
        this.raadius = raadius;
        this.toon = toon;
    }

    // Set your own radius for colorless circle
    public Ring(int raadius) {

        this(0, 0, raadius, "värvitu");
    }

    // Set your own radius and location for colorless circle
    public Ring(int keskpunkt_x, int keskpunkt_y) {

        this(keskpunkt_x, keskpunkt_y, 1, "värvitu");
    }

    // Circumference
    public void ymbermoot(int raadius) {
        double circumference = 2 * raadius * PI;
        System.out.println("Ümbermõõt: " + circumference);
    }

    // Area
    public static void pindala(int raadius) {
        double area = PI * raadius * raadius;
        System.out.println("Pindala: " + area);
    }

    @Override
    public String toString() {
        String result = "Asukoht: " + getKeskpunkt_x() + " x " + getKeskpunkt_y() + "\n" +
                "Raadius: " + getRaadius() + "\n" +
                "Värv: " + getToon() + "\n";
        return result;
    }

    public static int calculateRadiusSum(int raadius1, int raadius2) {
        return raadius1 + raadius2;
    }

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public int getRaadius() {
        return raadius;
    }

    public void setRaadius(int raadius) {
        this.raadius = raadius;
    }

    public String getToon() {
        return toon;
    }

    public void setToon(String toon) {
        this.toon = toon;
    }

    public int getKeskpunkt_x() {
        return keskpunkt_x;
    }

    public void setKeskpunkt_x(int keskpunkt_x) {
        this.keskpunkt_x = keskpunkt_x;
    }

    public int getKeskpunkt_y() {
        return keskpunkt_y;
    }

    public void setKeskpunkt_y(int keskpunkt_y) {
        this.keskpunkt_y = keskpunkt_y;
    }
}
