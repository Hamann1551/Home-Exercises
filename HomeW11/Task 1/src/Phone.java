
public class Phone {
    String number;
    String model;
    double weight;
    static String fromIsPhone;

    public Phone(){

    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        receiveCall(name, null);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит абонент по имени: " + name + " номер: " + (number != null ? number : " Номер не известен."));
    }
}
