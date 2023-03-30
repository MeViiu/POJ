public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Labrador", 2, "Golden");
        System.out.println(myDog.breed);
        System.out.println( myDog.age );
        System.out.println( myDog.color);
        myDog.bark();
        myDog.sleep();
    }
}
