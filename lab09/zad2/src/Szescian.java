class Szescian extends Figura3D {
    Szescian(int bok) {
        super(new int[]{bok, bok, bok, bok, bok, bok, bok, bok});
    }

    @Override
    public double poleCalkowite() {
        return 6 * krawedzie[0] * krawedzie[0];
    }

    @Override
    double objetosc() {
        return krawedzie[0] * krawedzie[0] * krawedzie[0];
    }
}