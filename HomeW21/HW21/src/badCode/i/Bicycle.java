package badCode.i;

public class Bicycle implements
        Startable,
        Stopable,
        Acceleratable,
        Brakeble{
    @Override
    public void start() {
        // запустить велосипед
    }

    @Override
    public void stop() {
        // остановить велосипед
    }

    @Override
    public void accelerate() {
        // ускорить велосипед
    }

    @Override
    public void brake() {
        // замедлить велосипед
    }
}
