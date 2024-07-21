public class Main {
    public static void main(String[] args) {
        Remove controller = new Remove();
        Flute flute = new Flute();
        Guitar guitar = new Guitar();
        Piano piano = new Piano();

        controller.sound(flute);
        controller.sound(guitar);
        controller.sound(piano);
    }
}