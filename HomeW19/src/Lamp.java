public class Lamp implements Device {
    @Override
    public void turnOn() {
        System.out.println("Lamp is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Lamp is off");
    }
}
