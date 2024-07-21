public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(37.50, 5, "Bob");
        dog.walk();
        dog.move();

        Duck duck = new Duck(10.250,2,"Donald");
        duck.walk();
        duck.move();
    }
}
