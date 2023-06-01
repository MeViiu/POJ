class Osoba implements Comparable<Osoba> {
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "{" + imie + ", " + nazwisko + "}";
    }

    @Override
    public int compareTo(Osoba o) {
        return o.nazwisko.compareTo(this.nazwisko);
    }
}