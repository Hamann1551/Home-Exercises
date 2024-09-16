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

/**
 or
 import java.util.*;

 public class Main {
 private static Map<String,String> phoneBook = new HashMap<>();
 public static void main(String[] args) {
 while(true){
 System.out.print("Добрый день, введите имя: ");
 String nameOrNumber = new Scanner(System.in).nextLine();
 if (nameOrNumber.equalsIgnoreCase("LIST")) {
 printAll();
 } else if(nameOrNumber.matches("[0-9]+")) {
 addNumberOne(nameOrNumber);
 } else if (nameOrNumber.equalsIgnoreCase("EXIT")){
 System.out.println("До свидания!");
 return;
 } else {
 addName(nameOrNumber);
 }
 }
 }

 public static void addName(String name) {
 name = checkCorrectName(name);
 System.out.print("Для имени " + name + " введите номер телефона: ");
 String number = new Scanner(System.in).nextLine();
 checkCorrectNumber(number);
 addNewContact(name,number);
 }

 public static String checkCorrectName(String name){
 while(!name.matches("[А-я]+") || phoneBook.containsKey(name)) {
 if(!name.matches("[А-я]+")){
 System.out.println("Ведённое имя некорректное! Повторите ввод.");
 } else if (phoneBook.containsKey(name)) {
 System.out.println("Имя " + name + " уже занято с номером " + phoneBook.get(name));
 }
 System.out.print("Введите корректное имя: ");
 name = new Scanner(System.in).nextLine();
 }
 return name;
 }

 public static void addNumberOne(String number){
 number = checkCorrectNumber(number);
 System.out.print("Для номера " + number + " введите имя: ");
 String name = new Scanner(System.in).nextLine();
 checkCorrectName(name);
 addNewContact(name,number);
 }

 public static String checkCorrectNumber(String number){
 while (number.length() < 10 || number.length() > 12 || phoneBook.containsValue(number)){
 if(number.length() < 10 || number.length() > 12) {
 System.out.println("Номер телефона введён некорретно! Повторите ввод.");
 } else if(phoneBook.containsValue(number)) {
 System.out.println("Номер " + number + " уже есть у другого абонента.");
 }
 System.out.print("Введите номер корректно: ");
 number = new Scanner(System.in).nextLine();
 }
 return number;
 }

 public static void addNewContact(String name, String number){
 System.out.println("Добавлен новый контакт " + name + " " + number);
 phoneBook.put(name, number);
 }

 public static void printAll(){
 for(Map.Entry<String,String> entry : phoneBook.entrySet()){
 System.out.println("Имя: " + entry.getKey() + ", с номером телефона: " + entry.getValue());
 }
 }
 }
 */