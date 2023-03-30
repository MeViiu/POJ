import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote = new Remote(tv);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilot");
        System.out.println("Wpisz 'on' aby włączyć telewizor, 'off' aby wyłączyć telewizor");
        System.out.println("Wpisz 'up' aby podgłosić, 'down' aby ściszyć");
        System.out.println("Wpisz 'chup' aby zmienić kanał o jeden, 'chdw' aby zmienić kanał o jeden");

        while (true) {
            String input = scanner.nextLine();
            switch (input) {
                case "on":
                    remote.turnOn();
                    break;
                case "off":
                    remote.turnOff();
                    break;
                case "up":
                    remote.changeVolumeUp();
                    break;
                case "down":
                    remote.changeVolumeDown();
                    break;
                case "chup":
                    remote.changeChannelUp();
                    break;
                case "chdw":
                    remote.changeChannelDown();
                    return;
                default:
                    System.out.println("Nie ma takiej opcji");
            }
        }
    }
}