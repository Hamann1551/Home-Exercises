public class Dog extends Animals{

    public Dog() {
    }

    public Dog(double weight, int age, String name) {
        super(weight, age, name);
    }

    public void move() {
        System.out.println("Собака по кличке " + super.getName() + ", бежит по земле");
    }
}
