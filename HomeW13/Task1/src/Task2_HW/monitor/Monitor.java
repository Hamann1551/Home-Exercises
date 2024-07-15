package Task2_HW.monitor;

public class Monitor {
    private double diagonal;
    private MonitorType type;
    private double weight;

    public Monitor(double diagonal, MonitorType type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public MonitorType getType() {
        return type;
    }
    public void setType(MonitorType type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "diagonal=" + diagonal +
                ", type=" + type +
                ", weight=" + weight +
                '}';
    }
}
