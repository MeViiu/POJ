import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String tekst = scan.nextLine();
        Map<Character, Integer> wynik = Samogloski.zliczSamogloski(tekst);
        System.out.println("Wystapienia samoglosek w tekscie: "+wynik);

    }
}