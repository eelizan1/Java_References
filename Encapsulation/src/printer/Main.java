package printer;

/**
 * Created by eeliz_000 on 5/16/2017.
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Toner level: " + printer.getTonerlevel());
        printer.fillTonerLevel(60);
        System.out.println("Toner level: " + printer.getTonerlevel());
    }
}
