package printer;

/**
 * Created by eeliz_000 on 5/16/2017.
 */
public class Printer {
    // fields
    private int tonerlevel = 100;
    private int pagesPrinted;
    private boolean isDuplex;

    // constructor
    public Printer(int tonerlevel, boolean isDuplex) {
        if(tonerlevel > -1 && tonerlevel <= 100) {
            this.tonerlevel = tonerlevel;
        }
        this.isDuplex = isDuplex;
    }

    /*
        METHODS
     */

    public void fillTonerLevel(int value) {
        if(((this.tonerlevel + value) > 100) || ((this.tonerlevel + value) < 0)) {
            System.out.println("Toner amount is out of bounds");
        } else {
            this.tonerlevel = this.tonerlevel + value;
        }
    }

    public void printPage(int amount) {
        int pagesToPrint = pagesPrinted + amount;
        if(isDuplex()) {
            this.pagesPrinted = pagesPrinted + (pagesToPrint / 2);
            System.out.println("Printing in duplex mode");
        } else {
            this.pagesPrinted = pagesPrinted + amount;
            System.out.println("Not printing in duplex mode");
        }
    }

    /*
        GETTERS SETTERS
     */

    public int getTonerlevel() {
        return tonerlevel;
    }

    public void setTonerlevel(int tonerlevel) {
        this.tonerlevel = tonerlevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

}
