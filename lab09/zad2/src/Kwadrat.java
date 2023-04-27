class Kwadrat extends Figura2D {
    Kwadrat(int bok) {
        super(new int[]{bok, bok, bok, bok});
    }

    @Override
    public double poleCalkowite() {
        return krawedzie[0] * krawedzie[1];
    }
}