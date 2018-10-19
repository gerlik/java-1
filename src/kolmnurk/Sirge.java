package kolmnurk;

// Kahe tipu vahelise kauguse defineerimine
public class Sirge {
    private Punkt otspunkt1;
    private Punkt otspunkt2;
    private double sirgepikkus;

    public Sirge() {
        this.otspunkt1 = this.otspunkt2 = new Punkt();
    }

    public Sirge(Punkt otspunkt1, Punkt otspunkt2) {
        this.otspunkt1 = otspunkt1;
        this.otspunkt2 = otspunkt2;
    }

    @Override
    public String toString() {
        String result = "Punkt A " + otspunkt1 + "\n"
                + "Punkt B " + otspunkt2 + "\n" +
                "Pikkus: " + this.getSirgepikkus() + "\n";
        return result;
    }

    public double getSirgepikkus() {
        double sirgepikkus = Math.sqrt((otspunkt2.getTipu_y() - otspunkt1.getTipu_y()) *
                (otspunkt2.getTipu_y() - otspunkt1.getTipu_y()) +
                (otspunkt2.getTipu_x() - otspunkt1.getTipu_x()) *
                        (otspunkt2.getTipu_x() - otspunkt1.getTipu_x()));
        sirgepikkus = Math.round(sirgepikkus * 100) / 100.0;
        return sirgepikkus;
    }

    public Punkt getOtspunkt1() {
        return otspunkt1;
    }

    public Punkt getOtspunkt2() {
        return otspunkt2;
    }
}
