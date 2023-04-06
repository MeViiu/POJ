public class Pojazd {
    private int liczbaKol;
    private String kolor;
    private String sygnal;

    public Pojazd(int liczbaKol, String kolor, String sygnal) {
        this.liczbaKol = liczbaKol;
        this.kolor = kolor;
        this.sygnal = sygnal;
    }

    public void informacje() {
        System.out.println("Liczba kół: " + liczbaKol);
        System.out.println("Kolor: " + kolor);
        System.out.println("Sygnał: " + sygnal);
    }
}