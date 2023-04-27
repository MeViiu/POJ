public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Kot();
        animals[1] = new Pies();
        animals[2] = new Krowa();

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}