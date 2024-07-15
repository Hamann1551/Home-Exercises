package Task2_HW.keyboard;

public class Keyboard {
    private KeyboardType type;
    private Illuminate illuminate;
    private double weight;

    public Keyboard(KeyboardType type, Illuminate illuminate, double weight) {
        this.type = type;
        this.illuminate = illuminate;
        this.weight = weight;
    }

    public KeyboardType getType(){
        return type;
    }
    public void setType(KeyboardType type) {
        this.type = type;
    }

    public Illuminate getIlluminate(){
        return illuminate;
    }
    public void setIlluminate(Illuminate illuminate){
        this.illuminate = illuminate;
    }

    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "type=" + type +
                ", illuminate=" + illuminate +
                ", weight=" + weight +
                '}';
    }
}
