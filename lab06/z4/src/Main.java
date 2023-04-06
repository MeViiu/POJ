public class Main {
    public static void main(String[] args) {
        Produkt prod1 = new Produkt("Mleko", 2, 10);
        Produkt prod2 = new Produkt("Chleb", 3, 5);
        System.out.println("|    Nazwa    |    Cena     |    Ilość    |");
        System.out.println(prod1.toString());
        System.out.println(prod2.toString());
    }
}
