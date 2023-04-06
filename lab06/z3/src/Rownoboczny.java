
public class Rownoboczny extends Trojkat {
    public Rownoboczny(double a) {
        super();
        this.a = a;
        this.h = 0;
    }
    public void obliczPole() {
        double pole = Math.pow(a, 2) * Math.sqrt(3) / 4;
        System.out.println("Pole trójkąta równobocznego: " + pole);
    }
}