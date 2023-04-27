class Prostokat extends Figura2D {
    Prostokat(int a, int b) {
        super(new int[]{a, b, a, b});
    }

    @Override
    public double poleCalkowite() {
        return krawedzie[0] * krawedzie[1];
    }
}