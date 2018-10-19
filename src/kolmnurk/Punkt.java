package kolmnurk;

// Tipu defineerimine
public class Punkt {
    private double tipu_x; // Tipu koordinaadid
    private double tipu_y;
    private int veerand; // Veerand, kus tipp asub I II III IV

    public Punkt() {
        this.tipu_x = 0.0;
        this.tipu_y = 0.0;
    }

    public Punkt(double tipu_x, double tipu_y, int veerand) {
        this.tipu_x = tipu_x;
        this.tipu_y = tipu_y;
        this.veerand = veerand;
    }

    @Override
    public String toString() {
        String result = this.getTipu_x() + ";" + this.getTipu_y() + "\n" +
                "Asub veerandis: " + this.getVeerand() + "\n";
        return result;
    }

    public double getTipu_x() {
        return tipu_x;
    }

    public double getTipu_y() {
        return tipu_y;
    }

    public int getVeerand() {
        if (tipu_x > 0 && tipu_y > 0) veerand = 1;
        else if (tipu_x > 0 && tipu_y < 0) veerand = 2;
        else if (tipu_x < 0 && tipu_y < 0) veerand = 3;
        else if (tipu_x < 0 && tipu_y > 0) veerand = 4;
        else veerand = 0;
        return veerand;
    }
}
