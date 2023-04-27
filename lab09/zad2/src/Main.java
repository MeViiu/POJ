public class Main {
    public static void main(String[] args) {
        try {
            Prostokat prostokat = new Prostokat(2, 5);
            Kwadrat kwadrat = new Kwadrat(3);
            Prostopadloscian prostopadloscian = new Prostopadloscian(2, 3, 4);
            Szescian szescian = new Szescian(2);

            // kwadrat
            System.out.println("Pole całkowite kwadratu: " + kwadrat.poleCalkowite());
            System.out.println("Suma krawędzi kwadratu: " + kwadrat.sumaKrawedzi());

            //Prostokat
            System.out.println("Pole całkowite prostokąta: " + prostokat.poleCalkowite());
            System.out.println("Suma krawędzi prostokąta: " + prostokat.sumaKrawedzi());

            //Prostopadloscian
            System.out.println("Pole całkowite prostopadłościanu: " + prostopadloscian.poleCalkowite());
            System.out.println("Suma krawędzi prostopadłościanu: " + prostopadloscian.sumaKrawedzi());
            System.out.println("Objętość prostopadłościanu: " + prostopadloscian.objetosc());

            //Szescian
            System.out.println("Pole całkowite sześcianu: " + szescian.poleCalkowite());
            System.out.println("Suma krawędzi sześcianu: " + szescian.sumaKrawedzi());
            System.out.println("Objętość sześcianu: " + szescian.objetosc());

            Kwadrat kwadratZero = new Kwadrat(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Nie można utworzyć obiektu z bokiem równym 0!");
        }
    }
}