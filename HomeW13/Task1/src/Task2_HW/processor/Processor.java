package Task2_HW.processor;

public class Processor {
    private Frequency frequency;
    private CoreCount coreCount;
    private Creater creater;
    private double weight;

    public Processor(Frequency frequency, CoreCount coreCount, Creater creater, double weight) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.creater = creater;
        this.weight = weight;
    }

    public Frequency getFrequency() {
        return frequency;
    }
    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public CoreCount getCoreCount() {
        return coreCount;
    }
    public void setCoreCount(CoreCount coreCount) {
        this.coreCount = coreCount;
    }

    public Creater getCreater() {
        return creater;
    }
    public void setCreater(Creater creater) {
        this.creater = creater;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", coreCount=" + coreCount +
                ", creater=" + creater +
                ", weight=" + weight +
                '}';
    }
}


