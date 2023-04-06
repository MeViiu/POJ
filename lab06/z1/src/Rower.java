public class Rower extends Pojazd {
    private String rodzajRoweru;

    public Rower(int liczbaKol, String kolor, String sygnal, String rodzajRoweru) {
        super(liczbaKol, kolor, sygnal);
        this.rodzajRoweru = rodzajRoweru;
    }

    @Override
    public void informacje() {
        super.informacje();
        System.out.println("Rodzaj roweru: " + rodzajRoweru);
    }
}