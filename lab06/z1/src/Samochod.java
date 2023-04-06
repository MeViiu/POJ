public class Samochod extends Pojazd {
    private String rodzajSilnika;

    public Samochod(int liczbaKol, String kolor, String sygnal, String rodzajSilnika) {
        super(liczbaKol, kolor, sygnal);
        this.rodzajSilnika = rodzajSilnika;
    }

    @Override
    public void informacje() {
        super.informacje();
        System.out.println("Rodzaj silnika: " + rodzajSilnika);
    }
}