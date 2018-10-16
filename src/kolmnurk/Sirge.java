package kolmnurk;

// Kahe tipu vahelise kauguse defineerimine
public class Sirge {
    private Punkt otspunkt1;
    private Punkt otspunkt2;
    private double sirgepikkus;

    public Sirge(Punkt otspunkt1, Punkt otspunkt2, double sirggepikkus) {
        this.otspunkt1 = otspunkt1;
        this.otspunkt2 = otspunkt2;
        this.sirgepikkus = sirgepikkus;
    }

    public Sirge(Punkt otspunkt1, Punkt otspunkt2) {
        this.otspunkt1 = otspunkt1;
        this.otspunkt2 = otspunkt2;
    }

    @Override
    public String toString() {
        String result = "Sirge pikkus: " + getSirgepikkus(otspunkt1, otspunkt2) + "\n";
        return result;
    }

    public double getSirgepikkus(Punkt otspunkt1, Punkt otspunkt2) {
        double sirgepikkus = 12;

        // return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));

        return sirgepikkus;
    }
}
