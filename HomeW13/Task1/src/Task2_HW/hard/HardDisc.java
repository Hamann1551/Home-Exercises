package Task2_HW.hard;

public class HardDisc {
    private HardDiscType type;
    private int volume;
    private double weight;

    public HardDisc(HardDiscType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public HardDiscType getType() {
        return type;
    }
    public void setType(HardDiscType type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HardDisc{" +
                "type=" + type +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
