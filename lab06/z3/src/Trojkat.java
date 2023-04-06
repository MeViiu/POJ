public class Trojkat {
    public double a;
    public double h;
    public Trojkat() {
        this.a = 1;
        this.h = 2;
    }
    public Trojkat(double h) {
        this();
        this.h = h;
    }
    public void obliczPole() {
        double pole = 0.5 * a * h;
        System.out.println("Pole trójkąta: " + pole);
    }
}