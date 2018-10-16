package kolmnurk;

// Testid
public class KolmnurkTasandil {
    public static void main(String[] args) {
        Punkt esimene = new Punkt(2, 4, 2);
        System.out.println(esimene);

        Punkt teine = new Punkt(1, 1, 2);
        System.out.println(teine);

        Punkt kolmas = new Punkt(3, 1, 2);
        System.out.println(kolmas);

        Sirge sirge1 = new Sirge(esimene, teine);
        System.out.println(sirge1);

        Sirge sirge2 = new Sirge(esimene, kolmas);
        System.out.println(sirge2);

        Sirge sirge3 = new Sirge(teine, kolmas);
        System.out.println(sirge3);

        Kolmnurk kolmnurk1 = new Kolmnurk(esimene, teine, kolmas, sirge1, sirge2, sirge3);
        System.out.println(kolmnurk1);

    }

}
