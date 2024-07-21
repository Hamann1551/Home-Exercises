public class Main {
    public static void main(String[] args) {
        // Интерфейсы для общего понятия
        RemoveController removeController = new RemoveController();
        Fen fen = new Fen();
        Lamp lamp = new Lamp();
        TV tv = new TV();

        removeController.powerOn(fen);
        removeController.powerOff(tv);
    }
}
