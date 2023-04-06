public class Main {
    public static void main(String[] args) {
        Pojazd[] pojazdy = new Pojazd[3];
        pojazdy[0] = new Samochod(4, "czerwony", "pip-pip", "diesel");
        pojazdy[1] = new Rower(2, "zielony", "brzdęk", "górski");
        pojazdy[2] = new Samochod(4, "niebieski", "buu-buu", "benzyna");

        for (Pojazd pojazd : pojazdy) {
            pojazd.informacje();
            System.out.println();
        }
    }
}