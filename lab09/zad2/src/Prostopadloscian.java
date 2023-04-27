class Prostopadloscian extends Figura3D {
    Prostopadloscian(int a, int b, int h) {
        super(new int[]{a, b, a, b, h, h, h, h});
    }

    @Override
    public double poleCalkowite() {
        return 2 * krawedzie[0] * krawedzie[1] + 2 * krawedzie[0] * krawedzie[4] + 2 * krawedzie[1] * krawedzie[4];
    }

    @Override
    double objetosc() {
        return krawedzie[0] * krawedzie[1] * krawedzie[4];
    }
}