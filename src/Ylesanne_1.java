import java.lang.reflect.Array;

/* Ülesanne 1 */
public class Ylesanne_1 {
    public static void main(String[] args) {
        int row = 10;
        int counter = 10;
        for (row = 9; row >= 0; row--) {
            for (int j = 9; j >= 0; j--) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n");

        int size = 10;
        for (int roww = 0; roww < size; roww++) {
            for (int col = 0; col < size; col++) {
/*  1              if (col > roww) {
                    System.out.print(size - col - 1);
                } else {
                    System.out.print(size - roww - 1);
                }*/
/*  2              if (col > roww) {
                    System.out.format("%2d", size - 1 - col);
                } else {
                    System.out.format("%2d", size - 1 - roww);
                }*/
                System.out.format("%2d", size - 1 - (col > roww ? col : roww));

                // või importida ja teha System.out.format("%2d",size -1 - Math.max(row,col));

            }
            System.out.println();
        }
    }

}
