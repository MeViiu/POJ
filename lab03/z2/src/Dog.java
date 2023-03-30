public class Dog {
    public String breed;
    public int age;
    public String color;

    public Dog(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public void bark() {
        System.out.println("Woof woof!");
    }

    public void sleep() {
        System.out.println("Zzzz...");
    }
}