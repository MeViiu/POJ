abstract class Figura {
    int[] krawedzie;

    Figura(int[] krawedzie) {
        this.krawedzie = krawedzie;
        if (krawedzie.length == 0) {
            throw new IllegalArgumentException("Nie można utworzyć figury bez krawędzi");
        }
    }

    abstract public double poleCalkowite();

    public int sumaKrawedzi() {
        int suma = 0;
        for (int krawedz : krawedzie) {
            suma += krawedz;
        }
        return suma;
    }
}