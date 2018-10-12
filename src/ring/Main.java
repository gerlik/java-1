package ring;

public class Main {
    public static void main(String[] args) {

        Ring ring1 = new Ring(12, 12);
        System.out.println(ring1.getKeskpunkt_x() + " x " + ring1.getKeskpunkt_y() + "; " + ring1.getRaadius());
        ring1.pindala(ring1.getRaadius());
    }
}
