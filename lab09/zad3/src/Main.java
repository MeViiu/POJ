import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;

        do {
            System.out.println("Podaj cyfrę odpowiadającą działaniu, które chcesz wykonać:");
            System.out.println("1  Dodawanie");
            System.out.println("2  Odejmowanie");
            System.out.println("3  Mnożenie");
            System.out.println("4  Dzielenie");
            try {
                a = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Niepoprawny wybór. Podaj cyfrę od 1 do 4.");
                continue;
            }
            if (a < 1 || a > 4) {
                System.out.println("Niepoprawny wybór. Podaj cyfrę od 1 do 4.");
            } else {
                System.out.println("Podaj pierwszą liczbę:");
                    int liczba1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Podaj drugą liczbę:");
                    int liczba2 = Integer.parseInt(scanner.nextLine());

                double wynik = 0;
                switch (a) {
                    case 1: {
                        wynik = liczba1 + liczba2;
                        System.out.println("Wynik dodawania na liczbach " + liczba1 + " oraz " + liczba2 + " wynosi " + wynik);
                    }
                    break;
                    case 2: {
                        wynik = liczba1 - liczba2;
                        System.out.println("Wynik odejmowania na liczbach " + liczba1 + " oraz " + liczba2 + " wynosi " + wynik);
                    }
                    break;
                    case 3: {
                        wynik = liczba1 * liczba2;
                        System.out.println("Wynik mnożenia na liczbach " + liczba1 + " oraz " + liczba2 + " wynosi " + wynik);
                    }
                    break;
                    case 4: {
                        if (liczba2 == 0) {
                            System.out.println("Nie można dzielić przez zero.");
                            return;
                        } else {
                            wynik = liczba1 / liczba2;
                            System.out.println("Wynik dzielenia na liczbach " + liczba1 + " oraz " + liczba2 + " wynosi" + wynik);
                        }
                    }
                    break;
                }
            }
        }while(0<a || a>5);
    }
}