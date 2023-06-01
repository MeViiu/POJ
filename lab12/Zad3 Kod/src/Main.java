import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Osoba> listaOsob = new ArrayList<>();
        listaOsob.add(new Osoba("Jan", "Kowalski"));
        listaOsob.add(new Osoba("Anna", "Nowak"));
        listaOsob.add(new Osoba("Marek", "Zalewski"));
        listaOsob.add(new Osoba("Ewa", "Adamczyk"));

        System.out.println("Stan listy przed sortowaniem:");
        for (Osoba osoba : listaOsob) {
            System.out.println(osoba);
        }

        Collections.sort(listaOsob);

        System.out.println("\nStan listy po sortowaniu:");
        for (Osoba osoba : listaOsob) {
            System.out.println(osoba);
        }
    }
}