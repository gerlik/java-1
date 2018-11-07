package ylesanne1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Output: triangle,
// Restriction: use only 1 loop
public class Kolmnurk {
    public static void main(String[] args) {
        int rows = 5;
        int amountOfSpaces = rows - 1;
        int amountOfSymbols = rows * 2 - 1;
        String symbols = "", spaces = "";

        spaces = String.join("", Collections.nCopies(amountOfSpaces, " "));
        symbols = String.join("", Collections.nCopies(amountOfSymbols, "x"));
        symbols = spaces + symbols;

        for (int i = 0; i < rows; i++) {
            System.out.println(symbols.substring(i, rows + 2 * i));
        }

    }
}
