import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    private static final String GOOD_NUMBERS = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    private static final String CORRECTLY_NUMBERS = "+38 ($1) $2 $3-$4";
    private static Map<String, String> map = new TreeMap<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        while(true) {
            System.out.println("\nВведите имя и номер телефона.\n" +
                    "Для просмотра записанных данных введите команду \"Лист\" \n");
            String input = scanner.nextLine().trim();

            if (input.toLowerCase().equalsIgnoreCase("Лист")) {
                list();
            } else if (input.matches("[А-яЁё]+")) {
                addAll(input);
            } else if (input.matches("\\d+")) {
                addNumer(input);
            } else {
                System.out.println("Данная команда не найдена!\n");
            }
        }
    }

    public static void addAll(String name) {
        if(map.containsKey(name)){
            System.out.println("Имя " + name + " уже есть! Введи другое имя.");
            return;
        }
        System.out.println("К имени " + name + " напишите номер телефона");
        boolean check = false;
        do {
            String number = scanner.nextLine().trim();
            if (map.containsValue(number)) {
                System.out.println("Номер " + number + " уже занят, посторите попытку!");
            } else {
                check = true;
                checkNumber(number);
                map.put(name,number);
                newNameAndNumber(name,number);
            }
        } while(!check);
    }


    public static void addNumer (String number) {
        if(map.containsValue(number)){
            System.out.println("Номер " + number + " уже занят, повторите попытку с другим номером!");
            return;
        }
        checkNumber(number);
        System.out.println("К номеру " + number + " добавьте имя");
        boolean check = false;
        do {
            String name = scanner.nextLine().trim();
            if (map.containsKey(name)) {
                System.out.println("Имя " + name + " уже есть! Введи другое имя.");
            } else {
                map.put(name, number);
                newNameAndNumber(name, number);
                check = true;
            }
        } while (!check);
    }

    private static String checkNumber(String number) {
        number = number.replaceAll("\\D+","");
        if(number.length() > 11 || number.length() < 9 ) {
            System.out.println("Номер не верный!");
            return null;
        } else if(number.length() == 11) {
            number = number.substring(1);
        }
        return number.replaceAll(GOOD_NUMBERS, CORRECTLY_NUMBERS);
    }

    public static void list() {
        if(map.isEmpty()) {
            System.out.println("Список пуст!");
            return;
        }
        for (Map.Entry<String, String> res : map.entrySet()) {
            System.out.println("Имя " + res.getKey() + " -> Номер " + res.getValue());
        }
    }

    public static void newNameAndNumber(String name, String number) {
        System.out.println("Добавлено новые данные, имя: " + name + " и номер: " + number + "\n");
    }
}