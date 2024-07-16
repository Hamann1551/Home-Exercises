
public class Main {
    public static void main(String[] args) {
        String alf = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        for(int i = 0; i < alf.length(); i++) {
            System.out.println(alf.toUpperCase().charAt(i) + "-" + (int)alf.charAt(i));
        }
    }
}