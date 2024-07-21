package badCode.i;

public class Car implements
        Startable,
        Stopable,
        Acceleratable,
        Brakeble,
        Refueble,
        Honkable{
    @Override
    public void start() {
        // запустить автомобиль
    }

    @Override
    public void stop() {
        // остановить автомобиль
    }

    @Override
    public void accelerate() {
        // ускорить автомобиль
    }

    @Override
    public void brake() {
        // замедлить автомобиль
    }

    @Override
    public void refuel() {
        // заправить автомобиль
    }

    @Override
    public void honk() {
        // затрубить
    }
}
