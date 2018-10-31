package practice.encapsulation;

public class PrinterMain {
    public static void main(String[] args) {
        Printer printer1 = new Printer(15, true);
        System.out.println("Page count: " + printer1.getPagesPrinted());
        int pagesPrinted = printer1.printPages(4);
        System.out.println("Pages printed: " + pagesPrinted);

        pagesPrinted = printer1.printPages(2);
        System.out.println("Pages printed: " + pagesPrinted);
        System.out.println(printer1.getPagesPrinted());
    }
}
