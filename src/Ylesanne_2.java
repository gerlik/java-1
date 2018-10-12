public class Ylesanne_2 {
    public static void main(String[] args) {
        int kogus = 12;
        int praak = 0;
        int korras = 0;
        // Iga teine
        //Iga kolmas
        for (int ese = 0; ese <= kogus; ese++) {
            if (ese % 3 == 0 || ese == 0) {
                korras++;
            } else if (ese % 2 == 0) {
                korras++;
            } else {
                praak++;
                System.out.println("error ese nr: " + ese);
            }
        }
        System.out.println("Korras: " + (korras * 100 / kogus) + "%");
        System.out.println("Korras: " + korras);
        System.out.println("Praak: " + (praak * 100 / kogus) + "%");
        System.out.println("Praak: " + praak);
    }
}
