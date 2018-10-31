package practice.encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDublex;

    public Printer(int tonerLevel, boolean isDublex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.tonerLevel = tonerLevel;
        this.isDublex = isDublex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerLevel > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.isDublex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing n duplex");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
