import java.util.Scanner;

public class Ylesanne_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sisesta palun 1 arv.");
        int number = input.nextInt();
        System.out.print("Sisestatud arv: " + number);
        input.nextLine();

        int summa = 0;
        while (number > 0) {
            summa = summa + number % 10;
            number = number / 10;
        }
        System.out.println("\n" + "Ristsumma: " + summa);
    }
}
