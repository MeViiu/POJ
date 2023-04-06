public class Produkt {
    private String nazwa;
    private double cena;
    private int ilosc;
    public Produkt(String nazwa, double cena, int ilosc) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
    }
    @Override
    public String toString() {
        return String.format("| %10s | %10.2f | %5d |", nazwa, cena, ilosc);
    }
}