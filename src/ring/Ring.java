package ring;

import java.text.DecimalFormat;

import static java.lang.Math.*;

public class Ring {
    private int keskpunkt_x;
    private int keskpunkt_y;
    private int raadius;
    private String toon;

    private static DecimalFormat df2 = new DecimalFormat(".##");

    public Ring() {
        this(0, 0, 0, "värvitu");

    }

    public Ring(int keskpunkt_x, int keskpunkt_y, int raadius, String toon) {
        this.keskpunkt_x = keskpunkt_x;
        this.keskpunkt_y = keskpunkt_y;
        this.raadius = raadius;
        this.toon = toon;
    }

    public Ring(int raadius) {
        this(0, 0, raadius, "värvitu");
    }

    public Ring(int keskpunkt_x, int keskpunkt_y) {
        this(keskpunkt_x, keskpunkt_y, 1, "värvitu");
    }

    public Ring(String toon) {
        this(0, 0, 1, toon);
    }

    public void ymbermoot(int raadius) {
        double moot = 2 * raadius * PI;
        System.out.println("Ümbermõõt: " + moot);
    }

    public void pindala(int raadius) {
        double S = PI * raadius * raadius;
        System.out.println("Pindala: " + S);
    }

    //private String toString() { }

    // TODO Comparing method

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
