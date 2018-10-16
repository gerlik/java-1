package kolmnurk;

// Tipu defineerimine
public class Punkt {
    private double tipu_x; // Tipu koordinaadid
    private double tipu_y;

    private int veerand; // veerand kus tipp asub I II III IV

    public Punkt(double tipu_x, double tipu_y, int veerand) {
        this.tipu_x = tipu_x;
        this.tipu_y = tipu_y;
        this.veerand = veerand;
    }

    @Override
    public String toString() {
        String result = getTipu_x() + " x " + getTipu_y() + "\n" +
                "Asub veerandis: " + getVeerand() + "\n";
        return result;
    }

    public double getTipu_x() {
        return tipu_x;
    }

    public double getTipu_y() {
        return tipu_y;
    }

    public int getVeerand() {
        return veerand;
    }
}
