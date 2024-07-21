public class Duck extends Animals{
    public Duck() {
    }

    public Duck(double weight, int age, String name) {
        super(weight, age, name);
    }

    @Override
    public void move() {
        System.out.println("Утка по кличке " + super.getName() + ", летит в облаках");
    }
}
