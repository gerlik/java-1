package kolmnurk;

// Kolmnurga loomine
public class Kolmnurk {
    private Punkt punkt1; // Tippude osukohapunktid tasandil
    private Punkt punkt2;
    private Punkt punkt3;

    private Sirge sirge1; // Kolmnurga küljed
    private Sirge sirge2;
    private Sirge sirge3;

    public Kolmnurk() {
        this.punkt1 = this.punkt2 = this.punkt3 = new Punkt();
        this.sirge1 = this.sirge2 = this.sirge3 = new Sirge();
    }

    public Kolmnurk(Punkt punkt1, Punkt punkt2, Punkt punkt3) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
        this.punkt3 = punkt3;
        this.sirge1 = new Sirge(punkt1, punkt2);
        this.sirge2 = new Sirge(punkt1, punkt3);
        this.sirge3 = new Sirge(punkt2, punkt3);
    }

    public Kolmnurk(Sirge sirge1, Sirge sirge2, Sirge sirge3) {
        this.sirge1 = sirge1;
        this.sirge2 = sirge2;
        this.sirge3 = sirge3;
    }

    // Isendimeetod
    public String mediaalKolmnurk() {
        if (sirge1.getSirgepikkus() == sirge2.getSirgepikkus() && sirge2.getSirgepikkus() == sirge3.getSirgepikkus() &&
                sirge1.getSirgepikkus() == sirge3.getSirgepikkus()) {
            return "Saab moodustada";
        } else {
            return "Ei saa moodustada";
        }
    }

    @Override
    public String toString() {
        String result = "Kolmnurk: " + "\n" +
                "Esimene sirge: " + sirge1.getSirgepikkus() + "\n" +
                "Teine sirge: " + sirge2.getSirgepikkus() + "\n" +
                "Kolmas sirge: " + sirge3.getSirgepikkus() + "\n" +
                this.mediaalKolmnurk();
        return result;
    }
}
