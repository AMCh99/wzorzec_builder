public class Piwnica {

    private final int powierzchnia;
    private final String zawartosc;

    public Piwnica(int powierzchnia, String zawartosc) {
        this.powierzchnia = powierzchnia;
        this.zawartosc = zawartosc;

    }

    public int getPowierzchnia() {
        return powierzchnia;
    }

    public String getZawartosc() {
        return zawartosc;
    }
}
