import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    private static final String GOOD_NUBERS = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    private static final String CORRETLY_NUMBERS = "+38 ($1) $2 $3-$4";
    private static Set<String> numbers = new TreeSet<>();

    public static void main(String[] args) {
        String info = "Доступные комнады:\n" +
                "Добавить номер\n" +
                "Печать\n" +
                "Выход";
        System.out.println(info + "\n");
        while(true) {
            System.out.println("Введите команду или номер телефона ");
            String input = new Scanner(System.in).nextLine();

            if (input.toLowerCase().equalsIgnoreCase("печать")) {
                print();
            } else if(input.toLowerCase().equalsIgnoreCase("выход")) {
                System.out.println("До свидания!");
                return;
            } else {
                correcltyNum(input);
            }
        }
    }

    public static void add(String num) {
        if(numbers.contains(num)) {
            System.out.println("Такой номер уже есть в базе");
            return;
        }
        numbers.add(num);
        System.out.println("Номер " + num + " успешно добавлен!");

    }

    public static void print() {
        if(numbers.isEmpty()) {
            System.out.println("Список пуст!");
            return;
        }

        for (String num : numbers) {
            String formattedNum = num.replaceAll(GOOD_NUBERS, CORRETLY_NUMBERS);
            System.out.println(formattedNum);
        }
    }

    public static void correcltyNum(String num) {
        num.replaceAll("\\D+", "");
        if(num.length() > 11 || num.length() < 9) {
            System.out.println("Это не номер!");
            return;
        } else if(num.length() == 11){
            num = num.substring(1);
        }
        add(num);
    }
}