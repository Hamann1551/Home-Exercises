public class Main {
    public static void main(String[] args) {
        Phone samsung = new Phone("+38 68 121 01 86", "A 55", 187.7);
        samsung.receiveCall("Kirill");

        Phone apple = new Phone("123455", "Apple", 123);

        Phone.fromIsPhone = "China";
        System.out.println(Phone.fromIsPhone);
        System.out.println(Phone.fromIsPhone);
    }
}
